package com.self.webSocket.repository;

import com.self.webSocket.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
    List<ChatRoom> findAllByOrderByCreatedAtDesc();

    Optional<ChatRoom> findByRoomId(long roomId);
}
