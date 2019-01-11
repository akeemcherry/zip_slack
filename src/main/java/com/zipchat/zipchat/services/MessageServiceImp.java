package com.zipchat.zipchat.services;

import com.zipchat.zipchat.model.ChatMessage;
import com.zipchat.zipchat.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImp implements MessageService {
    private MessageRepository messageRepository;

    @Autowired
    public MessageServiceImp(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @Override
    public List<ChatMessage> listAll() {
        List<ChatMessage> messages = new ArrayList<>();
        messageRepository.findAll().forEach(messages::add);
        return messages;
    }

    @Override
    public ChatMessage getById(Long id) {
        return messageRepository.findById(id).get();
    }

    @Override
    public ChatMessage saveOrUpdate(ChatMessage chatMessage) {
        messageRepository.save(chatMessage);
        return chatMessage;
    }

    @Override
    public void delete(Long id) {
        messageRepository.deleteById(id);
    }
}
