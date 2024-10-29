package com.NetworkProgramming.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        /*
        UDP协议:
            接受数据
         */

        //创建DatagramSocket对象

        DatagramSocket ds = new DatagramSocket(10086);

        //接受数据包
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        //receive()该方法是阻塞的
        //程序会在这死等
        //等待发送端发送消息
        System.out.println("测试接受前:");
        ds.receive(dp);
        System.out.println("测试接受后:");

        //解析数据包
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("从" + ds.getInetAddress() + "这台电脑" + dp.getPort() + "的端口发送的数据: " + msg);




    }
}
