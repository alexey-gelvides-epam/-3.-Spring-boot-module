package com.springbootmodule.springbootmodule.controllers;

import com.springbootmodule.springbootmodule.entity.Permission;
import com.springbootmodule.springbootmodule.entity.Visitor;
import com.springbootmodule.springbootmodule.services.VisitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final VisitorService visitorService;

    @GetMapping("all-users/page/{page}/users/{user}")
    public List<Visitor> getUsers(@PathVariable int page,
                                  @PathVariable int user){
        return visitorService.getAllUsers(page, user);
    }

    @GetMapping("user/{id}")
    public Visitor getUser(@PathVariable long id) {
        return visitorService.getUser(id);
    }

    @PostMapping("add-new-user")
    public String successAddUser(@RequestBody Visitor visitor){
        visitorService.saveUser(visitor);
        return "success-adding-user";
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        visitorService.deleteUser(id);
        return "success-delete-user";
    }

    @PutMapping("edit/{id}")
    public String successEditUser(@PathVariable("id") long id,
                                  @RequestBody Visitor visitor){
        visitorService.editUser(id, visitor);
        return "success-edit-user";
    }
}
