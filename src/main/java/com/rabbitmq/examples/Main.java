package com.rabbitmq.examples;

import com.rabbitmq.client.ConnectionFactory;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory cf = new ConnectionFactory();
        cf.setThreadFactory(new GAEThreadFactory());
    }
}
