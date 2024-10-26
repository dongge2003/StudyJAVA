package com.MultiThreaded.Demo04;

import java.util.concurrent.ArrayBlockingQueue;

public interface Util {
    ArrayBlockingQueue<String> getQueue = new ArrayBlockingQueue<>(100);
}
