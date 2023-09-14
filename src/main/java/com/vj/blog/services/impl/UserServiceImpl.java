package com.vj.blog.services.impl;

import java.util.List;

import com.vj.blog.entities.User;
import com.vj.blog.payloads.UserDto;
import com.vj.blog.repositories.UserRepo;
import com.vj.blog.services.UserService;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    
    public UserDto createUser (UserDto user) {

        return null;
    }

    @Override
    public UserDto updateUser (UserDto user, Integer userId) {

        return null;
    }

    @Override
    public UserDto getUserById (Integer userId) {

        return null;
    }

    @Override
    public List <UserDto> getAllUsers () {

        return null;
    }

    @Override
    public void deleteUser (Integer userId) {

    }

    private User dtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        user.setPassword(userDto.getPassword());
        return user;
    }

    public UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setAbout(user.getAbout());
        userDto.setPassword(user.getPassword());
        return userDto;
    }
}
