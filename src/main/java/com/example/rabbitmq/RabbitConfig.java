package com.example.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title:RabbitConfig<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/3/9
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue() {
        return new Queue("ch1");
    }
}
