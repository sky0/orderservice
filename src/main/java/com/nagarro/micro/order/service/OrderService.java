package com.nagarro.micro.order.service;

import java.util.List;

import com.nagarro.micro.order.model.Order;

public interface OrderService {
	
	public List<Order> getOrderByUserId(long userId);

}
