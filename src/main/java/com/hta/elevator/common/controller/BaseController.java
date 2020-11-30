package com.hta.elevator.common.controller;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.bean.Code;
import com.hta.elevator.common.bean.Response;
import com.hta.elevator.common.domain.Log;
import com.hta.elevator.common.service.BaseService;
import com.hta.elevator.common.util.ExcelUtil;
import com.hta.elevator.common.util.FileUtils;
import com.hta.elevator.controller.account.AccountController;
import com.hta.elevator.support.factory.LogTaskFactory;
import com.hta.elevator.support.manager.LogExeManager;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * 基础控制器层
 * 
 * @param <T>
 */
public class BaseController<T> {
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	@Value("${elevator.download.url}")
    public String downloadUrl;
	@Autowired
	BaseService<T> baseService;
	
	@ApiOperation(value = "list", notes = "<br>@description: <b>查询列表</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "GET")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@GetMapping("/list")
	@ResponseBody
	public Response selectListOrPage(T record,HttpServletRequest request) {
		EntityOperator attr = null;
		try {
			attr = record.getClass().getAnnotation(EntityOperator.class);
			logger.info("查询"+ attr.operatorNaem()+"列表>> {}",new Log().setIp(request.getRemoteAddr()).setParam(record));
			List<T> list = baseService.selectListOrPage(record);
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),1, attr.operatorNaem() + "列表查询"));
			return new Response().Success(Code.QUERY_SUCCESS,Code.QUERY_SUCCESS.getMsg()).addData("data", list);
		} catch (Exception e) {
			// TODO: handle exception
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),0, attr.operatorNaem() + "列表查询"));
			return new Response().Success(Code.QUERY_FAIL,Code.QUERY_FAIL.getMsg());
		}
	}
	@ApiOperation(value = "selectByPrimaryKey", notes = "<br>@description: <b>查询单个</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "GET")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@GetMapping("/{id}")
	@ResponseBody
	public Response selectByPrimaryKey(T record,@PathVariable Integer id,HttpServletRequest request) {
		try {
			EntityOperator attr = record.getClass().getAnnotation(EntityOperator.class);
			logger.info("根据ID查询"+ attr.operatorNaem()+">> {}",new Log().setIp(request.getRemoteAddr()).setParam(record.toString()));
			T t = baseService.selectByPrimaryKey(id);
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),1, "根据ID查询" + attr.operatorNaem()));
			return new Response().Success(Code.QUERY_SUCCESS,Code.QUERY_SUCCESS.getMsg()).addData("data", t);
		} catch (Exception e) {
			// TODO: handle exception
			return new Response().Success(Code.QUERY_FAIL,Code.QUERY_FAIL.getMsg());
		}
	}
	@ApiOperation(value = "add", notes = "<br>@description: <b>添加</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "POST")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@PostMapping("/add")
	@ResponseBody
	public Response add(T record,HttpServletRequest request) {
		EntityOperator attr = record.getClass().getAnnotation(EntityOperator.class);
		try {
			logger.info("添加"+ attr.operatorNaem()+">> {}",new Log().setIp(request.getRemoteAddr()).setParam(record.toString()));
			int count = baseService.insertSelective(record);
			if(count > 0) {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),1, attr.operatorNaem() + "添加"));
				logger.info("添加"+ attr.operatorNaem()+"成功");
				return new Response().Success(Code.ADD_SUCCESS,Code.ADD_SUCCESS.getMsg());
			}else {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),0, attr.operatorNaem() + "添加"));
				logger.info("添加"+ attr.operatorNaem()+"失败");
				return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
			}
		} catch (Exception e) {
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),0, attr.operatorNaem() + "添加"));
			// TODO: handle exception
			logger.error("添加"+ attr.operatorNaem()+"失败");
			return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
		}
	}
	
	@ApiOperation(value = "upd", notes = "<br>@description: <b>修改</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "PUT")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@PutMapping("/upd")
	@ResponseBody
	public Response upd(T record,HttpServletRequest request) {
		EntityOperator attr = record.getClass().getAnnotation(EntityOperator.class);
		try {
			logger.info("修改"+ attr.operatorNaem()+">> {}",new Log().setIp(request.getRemoteAddr()).setParam(record.toString()));
			int count = baseService.insertSelective(record);
			if(count > 0) {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),1, attr.operatorNaem() + "添加"));
				logger.info("修改"+ attr.operatorNaem()+"成功");
				return new Response().Success(Code.ADD_SUCCESS,Code.ADD_SUCCESS.getMsg());
			}else {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),0, attr.operatorNaem() + "添加"));
				logger.info("修改"+ attr.operatorNaem()+"失败");
				return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
			}
		} catch (Exception e) {
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),0, attr.operatorNaem() + "添加"));
			// TODO: handle exception
			logger.error("修改"+ attr.operatorNaem()+"失败");
			return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
		}
	}
	
	@ApiOperation(value = "del", notes = "<br>@description: <b>根据ID删除</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "DELETE")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@DeleteMapping("/{id}")
	@ResponseBody
	public Response del(T record,@PathVariable Integer id,HttpServletRequest request) {
		EntityOperator attr = record.getClass().getAnnotation(EntityOperator.class);
		try {
			logger.info("根据ID删除<"+ attr.operatorNaem()+">> {}",new Log().setIp(request.getRemoteAddr()).setParam(record.toString()));
			int count = baseService.deleteByPrimaryKey(id);
			if(count > 0) {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),  1, attr.operatorNaem() + "添加"));
				logger.info("根据ID删除<"+ attr.operatorNaem()+"成功");
				return new Response().Success(Code.ADD_SUCCESS,Code.ADD_SUCCESS.getMsg());
			}else {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),  0, attr.operatorNaem() + "添加"));
				logger.info("根据ID删除<"+ attr.operatorNaem()+"失败");
				return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
			}
		} catch (Exception e) {
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),  0, attr.operatorNaem() + "添加"));
			// TODO: handle exception
			logger.error("根据ID删除<"+ attr.operatorNaem()+"失败");
			return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
		}
	}
	
	@ApiOperation(value = "batchdel", notes = "<br>@description: <b>根据ID批量删除（ID之间以英文逗号隔开）</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "DELETE")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@DeleteMapping("/batch/{ids}")
	@ResponseBody
	public Response batchdel(T record,@PathVariable String ids,HttpServletRequest request) {
		EntityOperator attr = record.getClass().getAnnotation(EntityOperator.class);
		try {
			logger.info("根据ID批量删除<"+ attr.operatorNaem()+">> {}",new Log().setIp(request.getRemoteAddr()).setParam(record.toString()));
			int count = baseService.batchDeleteByIds(ids.split(","));
			if(count > 0) {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),  1, attr.operatorNaem() + "添加"));
				logger.info("根据ID批量删除<"+ attr.operatorNaem()+"成功");
				return new Response().Success(Code.ADD_SUCCESS,Code.ADD_SUCCESS.getMsg());
			}else {
				LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),  0, attr.operatorNaem() + "添加"));
				logger.info("根据ID批量删除<"+ attr.operatorNaem()+"失败");
				return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
			}
		} catch (Exception e) {
			LogExeManager.getInstance().executeLogTask(LogTaskFactory.operateLog( 1, request.getRequestURI(), request.getMethod(),  0, attr.operatorNaem() + "添加"));
			// TODO: handle exception
			logger.error("根据ID批量删除<"+ attr.operatorNaem()+"失败");
			return new Response().Success(Code.ADD_FAIL,Code.ADD_FAIL.getMsg());
		}
	}
	/**
     * 通用下载请求
     * 
     * @param fileName 文件名称
     * @param delete 是否删除
     */
    @GetMapping("common/download")
    public void fileDownload(String fileName, Boolean delete, HttpServletResponse response, HttpServletRequest request)
    {
        String realFileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("_") + 1);
        try
        {
            String filePath = downloadUrl +  fileName;
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition",
                    "attachment;fileName=" + setFileDownloadHeader(request, realFileName));
            FileUtils.writeBytes(filePath, response.getOutputStream());
            if (delete)
            {
                FileUtils.deleteFile(filePath);
            }
        }
        catch (Exception e)
        {
            logger.info("下载文件失败<< {}",e);
        }
    }
    public String setFileDownloadHeader(HttpServletRequest request, String fileName) throws UnsupportedEncodingException
    {
        final String agent = request.getHeader("USER-AGENT");
        String filename = fileName;
        if (agent.contains("MSIE"))
        {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        }
        else if (agent.contains("Firefox"))
        {
            // 火狐浏览器
            filename = new String(fileName.getBytes(), "ISO8859-1");
        }
        else if (agent.contains("Chrome"))
        {
            // google浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        else
        {
            // 其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
    @ApiOperation(value = "export", notes = "<br>@description: <b>Excel导出</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "POST")
    @ApiResponses(@ApiResponse(code = 0,message ="回调参数：只有code和msg,无具体数据result"))
    @PostMapping("/export")
    @ResponseBody
    public Response export(T record,HttpServletRequest request){
    	EntityOperator attr = record.getClass().getAnnotation(EntityOperator.class);
    	List<T> resultList = baseService.selectListOrPage(record);
		ExcelUtil<T> util = new ExcelUtil<T>( (Class<T>) record.getClass());
		return util.exportExcel(resultList, attr.operatorNaem());
    }
}
