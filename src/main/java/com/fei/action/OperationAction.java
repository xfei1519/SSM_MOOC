package com.fei.action;

import com.fei.domain.UserInfo;
import com.fei.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OperationAction {
    @Autowired
    private OperationService operationService;

    @RequestMapping("getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo(HttpServletRequest request) throws Exception{
        String  username = (String) request.getSession().getAttribute("username");
        System.out.println(username);
        UserInfo userInfo = operationService.getUserInfoByUsername(username);
        System.out.println(userInfo);
        return userInfo;
    }
}
