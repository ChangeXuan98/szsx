package com.aaa.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/2 16:34
 * @Description:
 */
@Repository
public interface UserDao {
    /**
     *fileName:UserDao
     *description:
     *author:zz
     *createTime:2019/3/2 16:34
     */
    public List selectUser();
}
