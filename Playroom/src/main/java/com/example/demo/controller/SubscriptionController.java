package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Subscription;
import com.example.demo.service.SubscriptionService;

@RestController
public class SubscriptionController {
	
	@Autowired
    private SubscriptionService subscribe_service;

    @GetMapping("/getAllSubscription")
    public List<Subscription> getAllSubscription() {
        return subscribe_service.getAll();
    }

    @PostMapping("/addSubscription")
    public void add(@RequestBody Subscription subscription) {
        subscribe_service.add(subscription);

    }

    @DeleteMapping("/DeleteSubscription")
    public void delete(@PathVariable("id") Long id) {
        subscribe_service.delete(id);
    }

    @PutMapping("/updateSubscription/{id}")
    public void update(@PathVariable Long id, @RequestBody Subscription subscription) {
        subscribe_service.update(id, subscription);
    }
}
