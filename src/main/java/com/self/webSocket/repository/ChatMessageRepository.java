package com.self.webSocket.repository;

import com.self.webSocket.entity.ChatRoom;
import com.self.webSocket.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findAllByChatRoom(ChatRoom chatRoom);
}
