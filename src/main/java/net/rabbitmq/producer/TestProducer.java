package net.rabbitmq.producer;

import com.rabbitmq.client.*;

public class TestProducer {
    public final static String QUEUE_NAME = "rabbitMQ.test";
    private final static String exchange = "exchange";
    public static void main(String[] args) {

        try {
            //创建连接工厂
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername("adminmq");
            factory.setPassword("adminmq");
//            factory.setVirtualHost(ConnectionFactory.DEFAULT_VHOST);
//            factory.setPort(AMQP.PROTOCOL.PORT);
//            factory.setHost("127.0.0.1");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
           //channel.exchangeDeclare(exchange, BuiltinExchangeType.DIRECT);
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);


            String message = "Hello RabbitMQ====================";
            //发送消息到队列中
            int i=2000;
            while(i<3000) {
               // message=message+i;
                channel.basicPublish("", QUEUE_NAME, null, (message+i).getBytes("UTF-8"));
                System.out.println("Producer Send +'" + message + i+ "'");
                i++;
            }
            //关闭通道和连接
            channel.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
