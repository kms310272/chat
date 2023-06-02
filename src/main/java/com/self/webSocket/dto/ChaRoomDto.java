package com.self.webSocket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ChaRoomDto {
    @Getter
    @NoArgsConstructor
    public static class ChatRoomRequestDto{
        private String roomName;
    }

    @Getter
    @AllArgsConstructor
    public static class ChatRoomResponseDto {
        private Long roomId;
        private String roomName;
        private String createdDate;
        private String modifiedDate;
    }

}
