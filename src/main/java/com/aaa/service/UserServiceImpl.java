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
    private JedisUtil jedisDao;
    @Autowired
    private  UserDao userDao;
    @Override
    public List<Map> selectUser() {
        Object userList = jedisDao.getObject("userList");
        if (userList!=null){
            System.out.println("从缓存中获取");
            return (List<Map>) userList;
        }else{
            List<Map> list  = userDao.selectUser();
            System.out.println("从数据库中查-----");
            jedisDao.putObject("userList", list);
            jedisDao.putObject("userList1", list);
            jedisDao.putObject("userList2", list);
            jedisDao.putObject("userList3", list);
            jedisDao.putObject("userList4", list);
            jedisDao.putObject("userList5", list);
            jedisDao.putObject("userList6", list);
            jedisDao.putObject("userList7", list);
            jedisDao.putObject("userList8", list);
            jedisDao.putObject("userList9", list);
            jedisDao.putObject("userList10", list);
            jedisDao.putObject("userList11", list);
            jedisDao.putObject("userList12", list);
            jedisDao.putObject("userList13", list);
            jedisDao.putObject("userList14", list);
            jedisDao.putObject("userList15", list);
            jedisDao.putObject("userList16", list);
            jedisDao.putObject("userList17", list);
            jedisDao.putObject("userList18", list);
            jedisDao.putObject("userList19", list);
            return list;
        }
    }
}
