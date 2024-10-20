package com.Project.CPUusage;

public class Test {
    public static void main(String[] args)
    {
        // 获取当前可用的处理器核心数
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Starting CPU burn with " + cores + " threads.");

        // 创建并启动与核心数相同数量的线程
        for (int i = 0; i < cores; i++)
        {
            Thread burnThread = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    // 无限循环，占用CPU资源
                    while (true)
                    {
                        double value = Math.random() * Math.random();
                    }
                }
            });
            burnThread.start();
        }
    }
}
