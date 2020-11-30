package com.hta.elevator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hta.elevator.common.bean.Code;
import com.hta.elevator.common.bean.Response;
import com.hta.elevator.common.controller.BaseController;
import com.hta.elevator.domain.ApiSecretKey;
import com.hta.elevator.service.ApiSecretKeyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
 * 微信秘钥 操作
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@Api(tags = "微信秘钥 操作")
@RequestMapping("/api/v2/apisecretkey")
public class ApiSecretKeyController extends BaseController<ApiSecretKey> 
{
	
	@Autowired
	private ApiSecretKeyService apiSecretKeyService;
	
	@ApiOperation(value = "info", notes = "<br>@description: <b>密钥详情</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "GET")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@GetMapping("/info")
	public Response info(@ApiParam(example = "",required = true) Integer userId,HttpServletRequest request) {
		ApiSecretKey apiSecretKey = null;
		try {
			apiSecretKey = apiSecretKeyService.selectByUserIdAndApi(userId);
			if(apiSecretKey == null) {
				return new Response().Fail(Code.QUERY_NULL,Code.QUERY_NULL.getMsg());
			}
			return new Response().Success(Code.QUERY_SUCCESS,Code.QUERY_SUCCESS.getMsg()).addData("data", apiSecretKey);
		} catch (Exception e) {
			// TODO: handle exception
			return new Response().Fail(Code.QUERY_FAIL,Code.QUERY_FAIL.getMsg());
		}
	}
	
	@ApiOperation(value = "create", notes = "<br>@description: <b>密钥创建</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "POST")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@PostMapping("/create")
	public Response create(@ApiParam(example = "",required = true) Integer userId,HttpServletRequest request) {
		ApiSecretKey apiSecretKey = null;
		try {
			return new Response().Success(Code.CREATE_SUCCESS,Code.CREATE_SUCCESS.getMsg()).addData("data", apiSecretKey);
		} catch (Exception e) {
			// TODO: handle exception
			return new Response().Fail(Code.CREATE_FAIL,Code.CREATE_FAIL.getMsg());
		}
	}
	
	@ApiOperation(value = "reset", notes = "<br>@description: <b>密钥重置</b></br>"
			+ "<br></br>" + "<br>@Date: <b>2019-12-30 10:33:36</b></br>", httpMethod = "PUT")
	@ApiResponses({ @ApiResponse(code = 0, message = "回调参数") })
	@PutMapping("/reset")
	public Response reset(@ApiParam(example = "",required = true) Integer userId,HttpServletRequest request) {
		ApiSecretKey apiSecretKey = null;
		try {
			return new Response().Success(Code.RESET_SUCCESS,Code.RESET_SUCCESS.getMsg()).addData("data", apiSecretKey);
		} catch (Exception e) {
			// TODO: handle exception
			return new Response().Fail(Code.RESET_FAIL,Code.RESET_FAIL.getMsg());
		}
	}
}
