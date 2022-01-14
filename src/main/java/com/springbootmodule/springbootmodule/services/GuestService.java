package com.springbootmodule.springbootmodule.services;

import com.springbootmodule.springbootmodule.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    GuestRepository guestRepository;

    public List<Guest> getAllUsers(int page, int countEntity){
        Pageable pageableUser = PageRequest.of(page - 1,countEntity);
        return guestRepository.findAll(pageableUser).stream().toList();
    }

    public Guest getUser(long id){
        var user = guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return user;
    }

    public void saveUser(Guest guest){
        guestRepository.save(guest);
    }

    public void deleteUser(long id){
        guestRepository.deleteById(id);
    }

    public void editUser(long id, Guest guest){
        var oldUser = guestRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Not found exception"));
        oldUser.setName(guest.getName())
                .setLastName(guest.getLastName())
                .setPhone(guest.getPhone());
        guestRepository.save(oldUser);
    }
}
