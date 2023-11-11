package com.example.chatIslem.services.chat;

import java.util.List;

import com.example.chatIslem.models.chat.Messages;


public interface MessageService {


    Messages getMessageById(String id);

    List<Messages> getAllMessages();

  List<Messages> getMessagesBySenderId(String senderId);

   List<Messages> getMessagesByRecipientId(String recipientId);



    static void saveMessage(Messages msgContent) {
        MessageService messageService;
        MessageService.saveMessage(msgContent); // Enregistrement dans MongoDB

    }

    

}