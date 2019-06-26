package com.aisino.service;

import com.aisino.dao.UserDao;
import com.aisino.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: HuYi.Zhang
 * @create: 2018-05-20 11:52
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryById(Long id){
        return userDao.selectByPrimaryKey(id);
    }

    @Transactional
    public void insert(User user) {
        userDao.insert(user);
    }

    @Transactional
    public void deleteById(Long id){
        userDao.deleteByPrimaryKey(id);
    }

    public List<User> queryAll() {
        return userDao.selectAll();
    }
}