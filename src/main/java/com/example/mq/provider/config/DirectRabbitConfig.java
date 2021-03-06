//package com.example.mq.provider.config;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author :
// * @CreateTime : 2019/9/3
// * @Description : 如果已经在消费者端配置当前配置信息 则无需再次配置 直接调用即可
// **/
//@Configuration
//public class DirectRabbitConfig {
//
//    //队列 起名：TestDirectQueue
//    @Bean
//    public Queue TestDirectQueue() {
//        return new Queue("TestDirectQueue",true);  //true 是否持久
//    }
//
//    //Direct交换机 起名：TestDirectExchange
//    @Bean
//    DirectExchange TestDirectExchange() {
//        return new DirectExchange("TestDirectExchange");
//    }
//
//    //绑定  将队列和交换机绑定, 并设置用于匹配键：TestDirectRouting
//    @Bean
//    Binding bindingDirect() {
//        return BindingBuilder.bind(TestDirectQueue()).to(TestDirectExchange()).with("TestDirectRouting");
//    }
//
//    //没给它做任何绑定配置操作,用于验证：消息推送到server，找到交换机了，但是没找到队列 GET/TestMessageAck
//    @Bean
//    DirectExchange lonelyDirectExchange() {
//        return new DirectExchange("lonelyDirectExchange");
//    }
//}
