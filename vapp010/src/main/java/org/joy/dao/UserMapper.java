package org.joy.dao;

import org.apache.ibatis.annotations.Param;
import org.joy.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectUserByUserId(@Param("userId") Integer userId);

    User selectUserByName(@Param("userName") String userName);

    List<User> selectAllUser();

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);



}