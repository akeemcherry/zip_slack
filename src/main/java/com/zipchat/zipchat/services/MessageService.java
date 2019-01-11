package com.zipchat.zipchat.services;

import com.zipchat.zipchat.model.ChatMessage;

import java.util.List;

public interface MessageService {
    List<ChatMessage> listAll();
    ChatMessage getById(Long id);
    ChatMessage saveOrUpdate(ChatMessage chatMessage);
    void delete(Long id);
}
