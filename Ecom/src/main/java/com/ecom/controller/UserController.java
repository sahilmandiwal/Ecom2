package com.ecom.controller;


import com.ecom.dto.ApiResponse;
import com.ecom.dto.UserDto;
import com.ecom.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ur")
public class UserController {
    @Autowired
    private UserService us;


    @PostMapping("/")
    ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {

        UserDto userDto1 = this.us.createUser(userDto);

        return new ResponseEntity<UserDto>(userDto, HttpStatus.CREATED);
    }


    @PutMapping("/")
    ResponseEntity<UserDto> updateUser(@PathVariable String email, @RequestBody UserDto userDto) {

        UserDto userDto1 = this.us.updateUser(email, userDto);

        return new ResponseEntity<UserDto>(userDto1, HttpStatus.OK);

    }


    @GetMapping("/userId/{userId}")
    ResponseEntity<UserDto> getUserById(@PathVariable String userId) {

        UserDto userDto1 = this.us.getUserById(userId);

        return new ResponseEntity<UserDto>(userDto1, HttpStatus.OK);

    }


    @GetMapping("/email/{email}")
    ResponseEntity<UserDto> getUserByEmail(@PathVariable String email) {

        UserDto userDto1 = this.us.getUserByEmail(email);

        return new ResponseEntity<UserDto>(userDto1, HttpStatus.OK);

    }


    @GetMapping("/emailandpassword/{email}/{password}")
    ResponseEntity<UserDto> getUserByEmailAndPassword(@PathVariable String email, @PathVariable String password) {

        UserDto userDto1 = this.us.getUserByUsernamePassword(email, password);

        return new ResponseEntity<UserDto>(userDto1, HttpStatus.OK);

    }


    @GetMapping("/allusers")
    ResponseEntity<List<UserDto>> getAllUser() {

        List<UserDto> userDto1 = this.us.getAllUsers();

        return new ResponseEntity<List<UserDto>>(userDto1, HttpStatus.OK);

    }


    @DeleteMapping("/{email}")
    ResponseEntity<ApiResponse> deleteUserByEmail(@PathVariable String email) {

        this.us.deleteUserByEmail(email);

        return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully", true, HttpStatus.OK), HttpStatus.OK);

    }
}
