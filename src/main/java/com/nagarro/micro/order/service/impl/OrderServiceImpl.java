package com.nagarro.micro.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nagarro.micro.order.model.Order;
import com.nagarro.micro.order.service.OrderService;

@Service("OrderService")
public class OrderServiceImpl implements OrderService{
	
	Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);


	@Override
	public List<Order> getOrderByUserId(long userId) {
		Order order1=new Order();
		order1.setOrderId(1L);
		order1.setOrderAmount(250);
		order1.setOrderDate("14-Apr-2020");
		
		Order order2=new Order();
		order2.setOrderId(2L);
		order2.setOrderAmount(450);
		order2.setOrderDate("15-Apr-2020");
		
		logger.info("Get orders");
		
		List<Order> orders=new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		return orders;
	}

}
