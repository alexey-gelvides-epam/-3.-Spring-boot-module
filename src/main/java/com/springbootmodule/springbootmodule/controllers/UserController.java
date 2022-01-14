package com.springbootmodule.springbootmodule.controllers;

import com.springbootmodule.springbootmodule.entity.Guest;
import com.springbootmodule.springbootmodule.services.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final GuestService guestService;

    @GetMapping("all-users/page/{page}/users/{user}")
    public List<Guest> getUsers(@PathVariable int page,
                                @PathVariable int user){
        return guestService.getAllUsers(page, user);
    }

    @GetMapping("user/{id}")
    public Guest getUser(@PathVariable long id) {
        return guestService.getUser(id);
    }

    @PostMapping("add-new-user")
    public String successAddUser(@RequestBody Guest guest){
        guestService.saveUser(guest);
        return "success-adding-user";
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        guestService.deleteUser(id);
        return "success-delete-user";
    }

    @PutMapping("edit/{id}")
    public String successEditUser(@PathVariable("id") long id,
                                  @RequestBody Guest guest){
        guestService.editUser(id, guest);
        return "success-edit-user";
    }
}
