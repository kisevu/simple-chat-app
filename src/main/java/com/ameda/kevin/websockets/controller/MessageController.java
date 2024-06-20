package com.ameda.kevin.websockets.controller;/*
*
@author ameda
@project websockets
@
*
*/

import com.ameda.kevin.websockets.model.MessageModel;
import com.ameda.kevin.websockets.storage.UserStorage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public MessageController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @MessageMapping("/chat/{to}")
    public void sendMessage(@DestinationVariable String to, MessageModel message){
        System.out.println("handling send message: "+message+" to: "+to);
        boolean isExists = UserStorage.getInstance().getUsers().contains(to);
        if(isExists){
            simpMessagingTemplate.convertAndSend("/topic/message"+to,message);
        }
    }
}
