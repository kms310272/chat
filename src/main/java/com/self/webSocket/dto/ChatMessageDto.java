package com.self.webSocket.dto;

import com.self.webSocket.entity.ChatRoom;
import com.self.webSocket.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatMessageDto {
    @Getter
    @NoArgsConstructor
    public static class ChatMessageRequestDto {
        private String message;
        private long memberId;
        private long roomId;

    }

    @Getter
    @AllArgsConstructor
    public static class ChatMessageResponseDto{
        private long messageId;
        private String message;
        private long memberId;
        private long roomId;
        private String createdDate;
        private String modifiedDate;
    }
}
