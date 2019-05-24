package io.github.grajeev.blocking_api_demo.repository;


import io.github.grajeev.blocking_api_demo.model.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepository  extends CrudRepository<Message,Long> {


}
