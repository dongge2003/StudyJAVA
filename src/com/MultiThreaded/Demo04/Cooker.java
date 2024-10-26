package com.MultiThreaded.Demo04;

public class Cooker extends Thread implements Util{
    @Override
    public void run() {
        while(true){
            try {
                String str = "面条";
                getQueue.put(str);
                System.out.println(Thread.currentThread().getName() + "做" + str);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
