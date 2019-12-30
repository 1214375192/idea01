package cn.thb.service.impl;

import cn.thb.dao.IUserDao;
import cn.thb.pojo.User;
import cn.thb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    public List<User> listAll() {
        return userDao.list();
    }

    public User findById(int id) {
        return userDao.findById(id);
    }

    public Integer update(User user) {
        return userDao.edit(user);
    }
    public Integer delete(User user)
    {
        return userDao.delete(user);
    }
}
