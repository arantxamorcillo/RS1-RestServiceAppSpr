package com.example.restservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    List<User> userList;



    @GetMapping("/user")
    public List getUserList(){
        System.out.println(userList);
        return  userList;
    }

    @GetMapping("/user/{id}")
    public String user(@PathVariable int id){

        System.out.println(userList);
        for (User user : userList) {
            System.out.println((user.getId()));
            if (user.getId() == id ) {
                return  user.toString();
            }
        }
        return null;
    }

    @PostMapping("/post")
    public User user(@RequestBody User user){
        userList.add(user);
        return user;
    }

    @PutMapping("/put")
    public String user(@RequestParam int id,String content) {
        for (User user : userList) {
            if (user.getId() == id) {
                user.setContent(content);
                return "List update" + userList;
            }
        }
        return "user for id= " + id + " not found";
    }

    }

