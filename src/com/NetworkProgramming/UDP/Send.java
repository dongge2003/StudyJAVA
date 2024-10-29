package com.NetworkProgramming.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Send {
    public static void main(String[] args) throws IOException {
        /*
        UDP协议:
            发送数据
         */


        //创建DatagramSocket对象
        //空参构造:系统会随机的使用可用的端口发送
        //有参构造:指定端口发送
        DatagramSocket ds = new DatagramSocket();

        //打包数据
        String str = "hello world";
        byte[] bytes = str.getBytes();
        DatagramPacket data = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("127.0.0.1", 10086));

        //发送数据
        ds.send(data);

        //关闭资源
        ds.close();




    }
}
