package com.example.redi_swagger.controller;

import com.example.redi_swagger.models.User;
import com.example.redi_swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getUserData() {
        System.out.println("getUserData ADD");

        return new ResponseEntity<>(userService.getDatas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserDataById(@PathVariable("id") String id) {
        System.out.println("getUserDataById ADD" + id);
        return new ResponseEntity<>(userService.getData(Integer.parseInt(id)), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<User> getUserDataById(@RequestBody User userData) {
        System.out.println("INSIDE ADD");
        return new ResponseEntity<>(userService.addUser(userData), HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> getUserDataById(@PathVariable("id") int id) {
        System.out.println("DElete ADD");
        return new ResponseEntity<>(userService.delete(id), HttpStatus.ACCEPTED);
    }
}
