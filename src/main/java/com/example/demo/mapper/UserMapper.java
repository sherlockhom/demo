package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 查询用户
     * @param name
     * @param password
     * @return
     */
    User getUserInfo(@Param("name") String name,@Param("password") String password);
}
