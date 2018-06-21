package com.github.xiaour.api_scanner.ctrl;

import com.github.xiaour.api_scanner.dto.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author: Xiaour
 * @Description:
 * @Date: 2018/5/30 13:59
 */
@RestController
@RequestMapping({"/test"})
public class TestCtrl {


    @RequestMapping(value="/getName",method =RequestMethod.POST)
    public String getName(String name, Integer age, Integer sex, String subject, BigDecimal cost){
        return " {\"code\":0,\"data\":“”,\"message\":\"getName调用成功\"}";
    }

    @RequestMapping(value="/getSchool",method ={RequestMethod.POST,RequestMethod.GET})
    public String getSchool(String name){
        return " {\"code\":0,\"data\":“”,\"message\":\"getSchool调用成功\"}";
    }

    @RequestMapping(value="/getUser",method ={RequestMethod.POST,RequestMethod.GET})
    public String getUser(UserInfo user){
        return " {\"code\":0,\"data\":“”,\"message\":\"getUser调用成功\"}";
    }


}