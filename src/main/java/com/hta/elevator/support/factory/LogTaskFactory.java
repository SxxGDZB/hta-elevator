package com.hta.elevator.support.factory;

import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hta.elevator.domain.AuthAccountLog;
import com.hta.elevator.domain.AuthOperationLog;
import com.hta.elevator.mapper.AuthAccountLogMapper;
import com.hta.elevator.mapper.AuthOperationLogMapper;
import com.hta.elevator.support.SpringContextHolder;

/**
 * 日志操作任务工厂
 *
 * @author tomsun28
 * @date 9:44 2018/4/22
 */
public class LogTaskFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogTaskFactory.class);
    private static AuthOperationLogMapper operationLogMapper = SpringContextHolder.getBean(AuthOperationLogMapper.class);
    private static AuthAccountLogMapper accountLogMapper = SpringContextHolder.getBean(AuthAccountLogMapper.class);

    private LogTaskFactory() {

    }

    public static TimerTask loginLog(Integer userId, String ip, Integer succeed, String message) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    AuthAccountLog accountLog = LogFactory.createAccountLog(userId, "用户登录日志", ip, succeed, message);
                    accountLogMapper.insertSelective(accountLog);
                } catch (Exception e) {
                    LOGGER.error("写入用户登录日志异常", e.getCause().getMessage());
                }
            }
        };
    }

    public static TimerTask exitLog(Integer userId, String ip, Integer succeed, String message) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    AuthAccountLog accountLog = LogFactory.createAccountLog(userId, "用户退出日志", ip, succeed, message);
                    accountLogMapper.insertSelective(accountLog);
                } catch (Exception e) {
                    LOGGER.error("写入用户退出日志异常", e.getCause().getMessage());
                }
            }
        };
    }

    public static TimerTask registerLog(Integer userId, String ip, Integer succeed, String message) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    AuthAccountLog accountLog = LogFactory.createAccountLog(userId, "用户注册日志", ip, succeed, message);
                    accountLogMapper.insertSelective(accountLog);
                } catch (Exception e) {
                    LOGGER.error("写入用户注册日志异常", e.getCause().getMessage());
                }
            }
        };
    }

    public static TimerTask bussinssLog(Integer userId, String api, String method, Integer succeed, String message) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    AuthOperationLog operationLog = LogFactory.createOperationLog(userId, "业务操作日志", api, method, succeed, message);
                    operationLogMapper.insertSelective(operationLog);
                } catch (Exception e) {
                    LOGGER.error("写入业务操作日志异常", e.getCause().getMessage());
                }
            }
        };
    }

    public static TimerTask exceptionLog(Integer userId, String api, String method, Integer succeed, String message) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    AuthOperationLog exceptionLog = LogFactory.createOperationLog(userId, "业务异常日志", api, method, succeed, message);
                    operationLogMapper.insertSelective(exceptionLog);
                } catch (Exception e) {
                    LOGGER.error("写入业务异常日志异常", e.getCause().getMessage());
                }
            }
        };
    }

    public static TimerTask operateLog(Integer userId, String api, String method, Integer succeed, String message) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    AuthOperationLog exceptionLog = LogFactory.createOperationLog(userId, "操作日志", api, method, succeed, message);
                    operationLogMapper.insertSelective(exceptionLog);
                } catch (Exception e) {
                    LOGGER.error("写入业务异常日志异常", e.getCause().getMessage());
                }
            }
        };
    }
}
