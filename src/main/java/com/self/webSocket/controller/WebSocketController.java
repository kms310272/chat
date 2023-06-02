package com.self.webSocket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class WebSocketController {
    @GetMapping("/chat")
    public String chatGet() {
        log.info("chat get");
        return "chat";
    }
}
