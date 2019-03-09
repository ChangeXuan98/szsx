package com.aaa.service;

import com.aaa.util.JedisUtil;
import com.aaa.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/2 16:44
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private  UserDao userDao;
    @Override
    public List<Map> selectUser() {
            return (List<Map>) userDao.selectUser();
    }
}
