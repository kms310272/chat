package com.self.webSocket.entity;

import com.self.webSocket.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageId;
    private String message;
    @ManyToOne
    private Member sender;
    @ManyToOne
    private ChatRoom chatRoom;
}
