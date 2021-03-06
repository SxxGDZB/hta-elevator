package com.hta.elevator.support.factory;

import java.util.Date;

import com.hta.elevator.domain.AuthAccountLog;
import com.hta.elevator.domain.AuthOperationLog;

/**
 *   日志对象工厂
 * @author tomsun28
 * @date 9:50 2018/4/22
 */
public class LogFactory {

    private LogFactory() {

    }

    public static AuthAccountLog createAccountLog(Integer userId,String logName, String ip, Integer succeed, String message) {
        AuthAccountLog accountLog = new AuthAccountLog();
        accountLog.setUserId(userId);
        accountLog.setLogName(logName);
        accountLog.setIp(ip);
        accountLog.setSucceed(succeed);
        accountLog.setMessage(message);
        accountLog.setCreateTime(new Date());
        return accountLog;
    }

    public static AuthOperationLog createOperationLog(Integer userId,String logName,String api, String method, Integer succeed, String message) {
        AuthOperationLog operationLog = new AuthOperationLog();
        operationLog.setUserId(userId);
        operationLog.setLogName(logName);
        operationLog.setApi(api);
        operationLog.setMethod(method);
        operationLog.setSucceed(succeed);
        operationLog.setMessage(message);
        operationLog.setCreateTime(new Date());
        return operationLog;
    }
}
