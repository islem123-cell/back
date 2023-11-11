package com.example.chatIslem.kafka;

import com.example.chatIslem.DTOs.request.NotificationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.chatIslem.services.chat.MessageService;
import com.example.chatIslem.models.chat.Messages;

public class KafkaMessageConsumer {
	
	
	  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageConsumer.class);

	    @KafkaListener(topics="kafkachat", groupId="myGroup")
		public void consume(Messages msgContent) {
			LOGGER.info(String.format("Json message received -> %s", msgContent.toString()));
	        MessageService.saveMessage(msgContent);

		}
	@KafkaListener(topics="kafkachat", groupId="myGroup")
	public void consume(NotificationDto msgContent) {
		LOGGER.info(String.format("Json message received -> %s", msgContent.getContent()));


	}
	

}

