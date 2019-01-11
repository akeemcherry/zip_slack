package com.zipchat.zipchat.repositories;

import com.zipchat.zipchat.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessageRepository extends JpaRepository<ChatMessage, Long> {
//    @Query(value = "SELECT chat.content" +
//                    "FROM ChatMessage chat", nativeQuery = true)
//    public Iterable<ChatMessage> getAllMessages();
}
