package com.cisco.master.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@Autowired
	private OrderDao orderDao;
	@GetMapping("/orders")
	public List<Order> fetchOrders(){
		System.out.println("inside the order handeler");
		return orderDao.getOrders();
	}

}
