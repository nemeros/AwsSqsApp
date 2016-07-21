package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.pojo.OrderPojo;

@Service
public class SqsService {
	
	private final QueueMessagingTemplate queueMessagingTemplate;
	
	@Autowired
	public SqsService(AmazonSQS amazonSqs){
		this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSqs);
	}
	
	
	public void send(OrderPojo order){

		this.queueMessagingTemplate.convertAndSend("OrderQueue", order);
	}
}
