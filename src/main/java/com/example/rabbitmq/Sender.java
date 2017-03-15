package com.example.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>Title:Sender<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/3/9
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send()
    {
        String context = "hello " + new Date();
        System.out.println("Sender: " + context);
        rabbitTemplate.convertAndSend("ch1", 1);
    }
}
