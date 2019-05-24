package io.github.grajeev.blocking_api_demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("message")
public @Data class Message {

    @Id
    private long id;
    private String content;
    private String title;
    private String language;

}
