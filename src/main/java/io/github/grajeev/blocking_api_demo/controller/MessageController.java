package io.github.grajeev.blocking_api_demo.controller;

import io.github.grajeev.blocking_api_demo.model.Message;
import io.github.grajeev.blocking_api_demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @PostMapping
    public Message add(@RequestBody Message message) {
        return messageRepository.save(message);
    }

    @GetMapping("/message/{id}")
    public Message getById (@PathVariable("id") Long id) {
        Optional<Message> messageOptional = messageRepository.findById(id);
        if (messageOptional.isPresent())
            return messageOptional.get();
        else
            return null;
    }
}
