package com.ecom.service;

import com.ecom.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser (UserDto userDto);

    UserDto updateUser(String email, UserDto userDto);

    UserDto getUserById(String id);

    UserDto getUserByEmail(String email);

    UserDto getUserByUsernamePassword(String userName, String password);

    List<UserDto> getAllUsers();

    boolean deleteUserByEmail(String email);
}
