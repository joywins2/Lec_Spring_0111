package org.joy.service;

import java.util.List;

import org.joy.domain.User;

/**
 * Created by LittleXuan on 2015/10/17.
 */
public interface IUserService {
   User getUserById(int userId);

   User getUserByUserName(String userName);

   List<User> getAllUser();

   Boolean addUser(User user);

   Boolean deleteUser(Integer id);

   Boolean updateUser(User user);
}
