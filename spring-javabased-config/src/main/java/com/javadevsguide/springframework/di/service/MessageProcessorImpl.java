package com.javadevsguide.springframework.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {

	private MessageService messageService;

	@Autowired
	public MessageProcessorImpl(MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
