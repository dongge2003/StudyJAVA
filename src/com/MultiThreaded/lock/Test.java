package com.MultiThreaded.lock;

public class Test {
    public static void main(String[] args) {
        /*
        同步方法:
            就是把synchronized关键字加到方法上(在Demo01中sell2类展示)

            格式: 修饰符 synchronized 返回值类型 方法名(方法参数){方法体}
            特点1:同步方法时锁住方法体所有的代码
            特点2:锁对象不能自己指定
                锁对象: 静态:当前类的字节码文件对象
                        非静态:this
         */



        /*
        lock锁:
            可以手动的开锁,解锁(在Demo01中sell3类展示)

            方法:
                lock()  加锁
                unlock()  释放锁
         */



        /*
        死锁问题:
            死锁是一个错误(在Demo02中展示)

            由于锁之间相互等待，线程都无法完成，导致死锁。
            程序会在此处卡住，因为线程都在等待对方的锁。
         */


    }
}
