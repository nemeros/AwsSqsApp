package com.listener;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

import com.pojo.OrderPojo;

@Service
public class OrderListener {

	@SqsListener(value="OrderQueue")
	public void consume(OrderPojo order){
		System.out.println("Nouveau Message : " + order.toString());
	}
}
