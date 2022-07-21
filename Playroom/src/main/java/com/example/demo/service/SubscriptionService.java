package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subscription;
import com.example.demo.repository.SubscriptionRepo;

@Service
public class SubscriptionService {
	@Autowired
	private SubscriptionRepo sub_repo;

	public List<Subscription> getAll() {
		return sub_repo.findAll();

	}

	public void add(Subscription subscription) {
		sub_repo.save(subscription);
	}

	public void delete(Long id) {

	}

	@SuppressWarnings("deprecation")
	public void update(Long id, Subscription subscription) {
		Subscription updatesub = new Subscription();
		updatesub = sub_repo.getById(id);
		updatesub.setPrice(subscription.getPrice());
		updatesub.setPlan(subscription.getPlan());
		sub_repo.save(updatesub);
	}
}
