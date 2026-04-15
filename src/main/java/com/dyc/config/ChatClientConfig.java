package com.dyc.config;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {


    @Bean
    public ChatClient deepSeekChatClient(ChatClient.Builder builder) {
        return builder.build();
    }
}