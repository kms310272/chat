package com.self.webSocket.service;

import com.self.webSocket.entity.ChatMessage;
import com.self.webSocket.entity.ChatRoom;
import com.self.webSocket.entity.Member;
import com.self.webSocket.repository.ChatMessageRepository;
import com.self.webSocket.repository.ChatRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatMessageService {
    private final ChatMessageRepository messageRepository;
    private final ChatRoomRepository chatRoomRepository;


    public ChatMessageService(ChatMessageRepository messageRepository, ChatRoomRepository chatRoomRepository) {
        this.messageRepository = messageRepository;
        this.chatRoomRepository = chatRoomRepository;
    }
    public ChatMessage creatMessage(ChatMessage message, ChatRoom chatRoom) throws Exception {
        if(verifyChatRoom(chatRoom.getRoomId())){
            return messageRepository.save(message);
        }else {
            throw new Exception("채팅룸이 존재 하지 않습니다.");
        }
    }
    public List<ChatMessage> getChatMessages(ChatRoom chatRoom){
        return messageRepository.findAllByChatRoom(chatRoom);
    }
    public void deleteMessage(ChatMessage message, Member member) {

    }
    public boolean verifyChatRoom(long roomId) throws Exception {
        Optional<ChatRoom> optionalChatRoom = chatRoomRepository.findByRoomId(roomId);
        return optionalChatRoom.isPresent();
    }
}
