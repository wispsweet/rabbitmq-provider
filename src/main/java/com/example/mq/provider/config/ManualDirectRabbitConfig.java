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
// * User: YHC
// * Date: 2020/11/5
// * DESC: 如果已经在消费者端配置当前配置信息 则无需再次配置 直接调用即可
// */
//@Configuration
//public class ManualDirectRabbitConfig {
//    //队列 起名：TestManualDirectQueue
//    @Bean
//    public Queue TestManualDirectQueue() {
//        return new Queue("TestManualDirectQueue",true);
//    }
//
//    //Direct交换机 起名：TestManualDirectExchange
//    @Bean
//    DirectExchange TestManualDirectExchange() {
//        return new DirectExchange("TestManualDirectExchange");
//    }
//
//    //绑定  将队列和交换机绑定, 并设置用于匹配键：TestManualDirectRouting
//    @Bean
//    Binding bindingManualDirect() {
//        return BindingBuilder.bind(TestManualDirectQueue()).to(TestManualDirectExchange()).with("TestManualDirectRouting");
//    }
//}
