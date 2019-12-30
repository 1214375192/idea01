package cn.thb.dao;

import cn.thb.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    public List<User> list();

    @Select("select * from user where id = #{id}")
    public User findById(@Param("id") int id);
    
    @Update("update user set username=#{user.username},password=#{user.password} where id=#{user.id}")
    public Integer edit(@Param("user") User user);

    @Delete("delete from user where id=#{user.id}")
    public Integer delete(@Param("user")User user);

}
