package com.example.rabbitmq;

/**
 * <p>Title:Receiver<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/3/9
 */
//@Component
//@RabbitListener(queues = "ch1")
public class Receiver {
//    @RabbitHandler
    public void process(String ch1) {
        System.out.println("Receiver: " + ch1);
    }
}
