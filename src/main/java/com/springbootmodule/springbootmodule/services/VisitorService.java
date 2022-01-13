package com.springbootmodule.springbootmodule.services;

import com.springbootmodule.springbootmodule.entity.Visitor;
import com.springbootmodule.springbootmodule.entity.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {
    @Autowired
    VisitorRepository visitorRepository;

    public List<Visitor> getAllUsers(int page, int countEntity){
        Pageable pageableUser = PageRequest.of(page - 1,countEntity);
        return visitorRepository.findAll(pageableUser).stream().toList();
    }

    public Visitor getUser(long id){
        var user = visitorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return user;
    }

    public void saveUser(Visitor visitor){
        visitorRepository.save(visitor);
    }

    public void deleteUser(long id){
        visitorRepository.deleteById(id);
    }

    public void editUser(long id, Visitor visitor){
        var oldUser = visitorRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Not found exception"));
        oldUser.setName(visitor.getName())
                .setLastName(visitor.getLastName())
                .setPhone(visitor.getPhone());
        visitorRepository.save(oldUser);
    }
}
