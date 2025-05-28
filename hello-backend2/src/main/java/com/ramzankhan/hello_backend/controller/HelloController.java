package com.ramzankhan.hello_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramzankhan.hello_backend.entity.Message;
import com.ramzankhan.hello_backend.repository.MessageRepository;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@Autowired
	private MessageRepository messageRepository;
	
	@GetMapping("/hello")
	public String hello() {
	    return "Hello from Spring Boot!";
	}
	
	@PostMapping("/post")
    public String postHello(@RequestBody String body) {
		Message message = new Message();
		message.setContent(body);
		messageRepository.save(message);
        return "Saved message to DB!";
    }
	
	@GetMapping("/messages")
	public List<Message> getMessages() {
		return messageRepository.findAll();
	}
	
}
