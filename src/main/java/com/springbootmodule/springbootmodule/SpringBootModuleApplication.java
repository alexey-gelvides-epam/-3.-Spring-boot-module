package com.springbootmodule.springbootmodule;

import com.springbootmodule.springbootmodule.entity.Visitor;
import com.springbootmodule.springbootmodule.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.stream.IntStream;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootModuleApplication implements CommandLineRunner {
    @Autowired
    private VisitorService visitorService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootModuleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");
        IntStream.range(1, 10)
                .forEach(i -> {
                    var visitor = new Visitor();
                    visitor.setName("UserName " + i)
                            .setLastName("UserLastName " + i)
                            .setPhone("UserPhone " + i);
                    visitorService.saveUser(visitor);
                });
    }
}
