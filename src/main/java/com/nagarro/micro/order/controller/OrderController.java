package com.nagarro.micro.order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.micro.order.model.Order;
import com.nagarro.micro.order.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order/{id}")
	public ResponseEntity<List<Order>> getOrders(@PathVariable(value="id") long userId){
		logger.info("Getting order data ...");
		return new ResponseEntity<List<Order>>(orderService.getOrderByUserId(userId), HttpStatus.OK);
	}

}
