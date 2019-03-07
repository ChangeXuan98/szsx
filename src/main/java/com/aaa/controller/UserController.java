package com.aaa.controller;

import com.aaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/2 16:46
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     *fileName:UserController
     *description:
     *author:zz
     *createTime:2019/3/2 16:46
     */

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/select")
    public List selectUserController(){
        return userService.selectUser();
    }
}
