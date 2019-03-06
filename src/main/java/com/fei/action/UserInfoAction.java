package com.fei.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("username")
public class UserInfoAction {

    @RequestMapping("userDetail")
    public ModelAndView userDetailAction(String username,Integer userType) throws Exception{
        //System.out.println(username+"---"+userType);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username",username);
        if (userType==1){
            modelAndView.setViewName("studentdetail.html");
        }else if(userType==2){
            modelAndView.setViewName("teacherdetail.html");
        }else{
            throw new Exception("传错了...");
        }
        return  modelAndView;
    }
}
