package com.javadevsguide.springframework.di.service;

import org.springframework.stereotype.Service;

@Service("SmsService")
public class SmsService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("SMS" + message);
	}

}
