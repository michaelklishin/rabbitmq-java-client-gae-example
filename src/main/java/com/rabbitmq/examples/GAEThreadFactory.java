package com.rabbitmq.examples;

import com.google.appengine.api.ThreadManager;
import com.rabbitmq.client.ThreadFactory;

/**
 * {@link com.rabbitmq.client.ThreadFactory} implementation that uses
 * Google App Engine's {@link com.google.appengine.api.ThreadManager} to instantiate
 * new threads independent from request lifecycle.
 */
public class GAEThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r, String threadName) {
        return newThread(r);
    }

    @Override
    public Thread newThread(Runnable r) {
        return ThreadManager.createBackgroundThread(r);
    }
}
