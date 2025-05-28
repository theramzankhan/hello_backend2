package com.ramzankhan.hello_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramzankhan.hello_backend.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
