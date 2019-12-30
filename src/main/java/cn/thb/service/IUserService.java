package cn.thb.service;

import cn.thb.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUserService {
    public List<User> listAll();

    public User findById(int id);

    public Integer update(User user);

    public Integer delete(User user);
}
