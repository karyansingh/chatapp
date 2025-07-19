package com.chat.app.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
