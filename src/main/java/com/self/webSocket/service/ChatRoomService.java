package com.self.webSocket.service;

import com.self.webSocket.entity.ChatRoom;
import com.self.webSocket.repository.ChatRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    public ChatRoomService(ChatRoomRepository chatRoomRepository) {
        this.chatRoomRepository = chatRoomRepository;
    }

    public ChatRoom createChatRoom(ChatRoom chatRoom) throws Exception {
        if(isRoomVerified(chatRoom.getRoomId())){
            return chatRoomRepository.save(chatRoom);
        }else {
            throw new Exception("채팅방이 존재하지 않습니다.");
        }
    }
    public List<ChatRoom> getAllChatRoomsOrderedByCreatedAtDesc() {
        return chatRoomRepository.findAllByOrderByCreatedAtDesc();
    }
    public Optional<ChatRoom> getChatRoomById(long roomId) {
        return chatRoomRepository.findByRoomId(roomId);
    }

    public boolean isRoomVerified(long roomId) throws Exception {
        Optional<ChatRoom> chatRoom = chatRoomRepository.findByRoomId(roomId);
        return chatRoom.isPresent();
    }
}
