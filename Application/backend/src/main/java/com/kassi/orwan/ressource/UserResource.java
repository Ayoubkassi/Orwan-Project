package com.kassi.orwan.ressource;


import com.kassi.orwan.model.Response;
import com.kassi.orwan.model.User;
import com.kassi.orwan.service.implementation.UserServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.time.LocalDateTime.now;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {
    private final UserServiceImpl userService;

    @GetMapping("/list")
    public ResponseEntity<Response> getUsers() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("users", userService.list(100)))
                        .message("users recieved")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }


    @PostMapping("/save")
    public ResponseEntity<Response> saveUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("user ", userService.create(user)))
                        .message("user created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }


    @PostMapping("/get/{id}")
    public ResponseEntity<Response> getUser(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("user ", userService.get(id)))
                        .message("user received")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteUser(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("user ", userService.delete(id)))
                        .message("user deleted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }


    @PostMapping("/login")
    public String login(@RequestBody String login) {
        System.out.println("login :" + login);
        String[] words = login.split(",");
        String email1 = words[0].split(":")[1].trim();
        String email = email1.substring(1,email1.length()-1);
        String pass = words[1].split(":")[1].trim();
        String password = pass.substring(1,pass.indexOf("}")-2).trim();


        System.out.println("pass"+password);

        //check if email and password exist same in our db
        List<User> users = (List<User>) userService.list(100);
        for(User user : users){
            if( user.getUsername().equals(email) && user.getPassword().equals(password)){
                return "hello";
            }
        }

       return null;



    }

}
