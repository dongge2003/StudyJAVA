package com.NetworkProgramming.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议: 发送数据

        //创建Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 23542);

        //发送数据
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("你好".getBytes());

        //关闭资源
        os.close();

    }
}
