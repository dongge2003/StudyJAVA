package com.MultiThreaded.thread.Mythreaded;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
        多线程:
            线程: 线程是操作系统中能够进行运算调度的最小单位,它被包含在进程之中,是进程中的实际运作单位
            进程: 进程是程序的基本运行实体(一个软件就是一个进程)

            而多线程: 如在一个软件中同时运行多个功能


         并发和并行:
            并发: 在同一时刻,有多个指令在单个cpu上 交替 执行
            并行: 在同一时刻,有多个指令在单个cpu上 同时 执行
            cpu: 如2核4线程(如果只有4个线程就能并行, 如果有多个线程就用并发,随机交替运行)
         */

        /*
        多线程的实现方式:
            1.继承Thread类的方式进行实现
            2.实现Runnable接口的方式进行实现
            3.利用Callable接口和Future接口方式实现
         */




        /*
        多线程中常见的成员方法:
            String getName()                                返回此线程名称
            void setName()                                  设置此线程名称(构造方法也可以设置名字)
            static Thread currenThread()                    获取当前线程对象
            static void sleep(long time)                    让线程休眠指定时间,单位:毫秒
            setPriority(int newPriority)                    设置线程的优先级
            final int getPriority()                         获取线程的优先级
            final void setDaemon(boolean on)                设置为守护线程
            public static void yield()                      出让线程/礼让线程
            public static void join()                       插入线程/插队线程
         */

//        //String getName()   void setName()
//        MyThread myThread = new MyThread();
//        myThread.setName("线程");
//        System.out.println(myThread.getName());//线程
//        myThread.start();
        //如果要在构造方法中就能设置名字要自己写狗造方法,用supper关键字调用
        System.out.println("________________");

        //static Thread currenThread()
        System.out.println(Thread.currentThread().getName());//main
        //当jvm虚拟机启动时会自动创建多个线程
        //其中有个线程就叫main线程
        //它的作用就是去调用main方法的,并执行里面的代码
        System.out.println("________________");

        //static void sleep(long time)
        System.out.println("11111111111");
        //Thread.sleep(2000);//让main线程睡眠2秒钟
        System.out.println("22222222222");
        System.out.println("________________");

        //setPriority(int newPriority)  设置线程的优先级    final int getPriority()  获取线程的优先级
        /*
        线程的优先级:
        抢占式调度(随机), 非抢占式调度(一个一个来)
            java属于抢占式调度

            cpu线程会链接应用线程,然后执行,而优先级就是应用线程链接cpu线程的概率(java)
            优先级最低为0,最高为10,而如果没指定,默认为5
            优先级为10,并不意味着每次都在前面执行,只是概率大一点而已
         */
//        System.out.println(Thread.currentThread().getPriority());//main线程优先级为5
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        //大概率是线程1先执行完毕
        System.out.println("________________");

        //final void setDaemon(boolean on)  设置为守护线程
        /*
        守护线程:
            当其他的非守护线程结束时,守护线程也会结束
         */
//        MyThread t3 = new MyThread("非守护线程");
//        MyDaemonThread t4 = new MyDaemonThread("守护线程");
//        t4.setDaemon(true);//设置为守护线程
//        t3.start();
//        t4.start();
        //当非守护线程运行完毕时,守护线程还没运行完毕也结束了
        //运用场景: 如跟别人聊天时,如果正在传文件,把聊天窗口关闭了,那文件也没有必要传输了,则传文件可以设置为守护线程
        System.out.println("________________");

        //public static void yield()   出让线程/礼让线程
        /*
        让线程执行尽可能平均
         */
//        MyYieldThread t5 = new MyYieldThread("礼让线程1");
//        MyYieldThread t6 = new MyYieldThread("礼让线程2");
//        t5.start();
//        t6.start();
        System.out.println("________________");


        //public static void join()  插入线程/插队线程
        MyJoinThread tt = new MyJoinThread("插入线程");
        tt.start();
        tt.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main");//这是main线程
        }
        //先执行插入线程,再执行main线程




        /*
        线程的生命周期:
                                                                (阻塞等着)
                                                            没有执行资格没有执行权    ^
                            sleep方法结束其他阻塞方法结束 |                            |  sleep()或者其他阻塞方法
                                                        |                            |
                                                        <
                            start()                           (被其他线程抢走执行权)                    run()
            创建线程对象 --------------->  有执行资格,没执行权 <-----------------> 有执行资格有执行权 ----------------------> 线程死亡
                                                                (抢到执行权)
         */




        /*
        线程的安全问题:
            在package com.MultiThreaded.Demo01;这个包下,显示出了多线程的不安全
            此时就要加锁,在有线程执行代码块的时候,其他线程不能进来执行代码块,只有该线程执行完毕时,其他线程才能通过抢到执行权,执行代码块

            同步代码块:
                把操做共享的数据锁起来(在Demo01中sell类展示)

                格式:synchronized (锁){
                    操作共享数据的代码
                }

            特点1:锁默认打开,有一个线程进去了,锁自动关闭
            特点2:里面的代码全部执行完毕,线程出来,锁自动打开

            同步代码块的细节:
                锁的对象如果不是唯一的跟不锁没区别
         */



        /*
        线程的状态
            新建状态(NEW)               ------->        创建线程对象
            就绪状态(RUNNABLE)          ------->        start方法
            阻塞状态(BLOCKED)           ------->        无法获得锁对象
            等待状态(WAITING)           ------->        wait方法
            及时等待(TIMED_WAITING)     ------->        sleep方法
            结束状态(TERMINATED)        ------->        全部代码运行完毕
         */











    }
}

//标准线程
class myThread extends Thread {
    public myThread() {
    }
    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

//守护线程
class MyDaemonThread extends Thread {
    public MyDaemonThread() {
    }
    public MyDaemonThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

//礼让线程
class MyYieldThread extends Thread {
    public MyYieldThread() {
    }
    public MyYieldThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            yield();//运行完时礼让别的线程,尽可能平均
        }
    }
}

//插入线程
class MyJoinThread extends Thread {
    public MyJoinThread() {
    }
    public MyJoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +  " :插入");
        }
    }
}
