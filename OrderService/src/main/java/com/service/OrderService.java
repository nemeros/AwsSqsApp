package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.OrderPojo;

@RestController
public class OrderService {

	@Autowired
	private SqsService sqs;
	
	@RequestMapping(value="api/order", consumes="application/json", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void pushOrder(@RequestBody(required=true) OrderPojo order){
		System.out.println("Service received : " + order.toString());
		sqs.send(order);
	}
}
