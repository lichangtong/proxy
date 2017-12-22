package net.rabbitmq.producer;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class TestCustomer {
    public final static String QUEUE_NAME = "rabbitMQ.test";
    private final static String exchange = "exchange";

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = null;
        Channel channel = null;
        try {
            //创建连接工厂
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername("adminmq");
            factory.setPassword("adminmq");
            factory.setVirtualHost("/");
            factory.setPort(AMQP.PROTOCOL.PORT);
            factory.setHost("127.0.0.1");
            connection = factory.newConnection();
            channel = connection.createChannel();
            channel.basicQos(1);
            //channel.exchangeDeclare(exchange, BuiltinExchangeType.DIRECT);
            //声明要关注的队列
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);


            System.out.println("Customer Waiting Received messages");
            //DefaultConsumer类实现了Consumer接口，通过传入一个频道，
            // 告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery

            //final Channel finalChannel = channel;
//            Consumer consumer = new DefaultConsumer(finalChannel) {
//                @Override
//                public void handleDelivery(String consumerTag, Envelope envelope,
//                                           AMQP.BasicProperties properties, byte[] body)
//                        throws IOException {
//                    String message = new String(body, "UTF-8");
//                    System.out.println("Customer Received '" + message + "'");
//                    finalChannel.basicAck(envelope.getDeliveryTag(), false);
//                    System.out.println("Customer Waiting Received messages 自动回复队列应答 -- RabbitMQ中的消息确认机制 ");
//                }
//            };
//            while(true) {
//                Consumer consumer = new DefaultConsumer(channel) {
//                    @Override
//                    public void handleDelivery(String consumerTag, Envelope envelope,
//                                               AMQP.BasicProperties properties, byte[] body)
//                            throws IOException {
//                        String message = new String(body, "UTF-8");
//                        System.out.println("Customer Received '" + message + "'");
//                        this.getChannel().basicAck(envelope.getDeliveryTag(), false);
//                        System.out.println("Customer Waiting Received messages 自动回复队列应答 -- RabbitMQ中的消息确认机制 ");
//                    }
//                    //自动回复队列应答 -- RabbitMQ中的消息确认机制
//
//
//                    //channel.basicConsume(QUEUE_NAME, true, consumer);
//                    //关闭通道和连接
//                };
//                boolean autoAck = false;
//                //消息消费完成确认
//                channel.basicConsume(QUEUE_NAME, autoAck, consumer);
//            }
            boolean autoAck = false;
//                //消息消费完成确认
            channel.basicConsume(QUEUE_NAME, autoAck, new DefaultConsumer(channel) {

                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String routingKey = envelope.getRoutingKey();
                    String contentType = properties.getContentType();
                    long deliveryTag = envelope.getDeliveryTag();
                    // (process the message components here ...)
                    System.out.println(new String(body)+"----------------------");
                    getChannel().basicAck(deliveryTag, false);
                }
            });


        } catch (Exception e) {
            e.printStackTrace();

        } finally {
//            channel.close();
//            connection.close();
        }
    }
}
