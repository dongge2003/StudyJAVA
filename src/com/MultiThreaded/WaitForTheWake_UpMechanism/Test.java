package com.MultiThreaded.WaitForTheWake_UpMechanism;

public class Test {
    public static void main(String[] args) {
        /*
        等待唤醒机制(生产消费):
            消费者: 消费数据
            生产者: 生产数据

            核心思想: 利用第三者控制线程的执行

            常见方法:
                void wait()                     当前线程等待,直到被其他线程唤醒
                void notify()                   随机唤醒单个线程
                void notifyAll()                唤醒所有线程

            在Demo03中演示了
         */


        /*
        等待唤醒机制(阻塞队列):
            消费者:take
            生产者:put

            put数据时:放不进去,会等着,也叫做阻塞
            take数据时:取出第一个数据时,取不到会等着,也叫做阻塞

            阻塞队列的继承结构:
                接口: Iterable, Collection, Queue, BlockingQueue

                实现类: ArrayBlockingQueue - 底层是数组,有界
                        LinkedBlockingQueue - 底层是链表,无界(但不是真的无界,最大值为int的最大值)
         */
    }
}
