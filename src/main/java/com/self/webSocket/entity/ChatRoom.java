package com.self.webSocket.entity;

import com.self.webSocket.audit.Auditable;
import com.self.webSocket.dto.ChaRoomDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ChatRoom extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;

    private String roomName;

    @Builder
    public ChatRoom(String roomName) {
        this.roomName = roomName;
    }

    public Long update(ChaRoomDto.ChatRoomRequestDto requestDto) {
        this.roomName = requestDto.getRoomName();
        return this.roomId;
    }
}
