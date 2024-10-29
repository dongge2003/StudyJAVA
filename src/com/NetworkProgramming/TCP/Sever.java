package com.NetworkProgramming.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {
        //TCP协议: 接受数据

        //创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(23542);

        //监听客户端
        Socket accept = serverSocket.accept();

        //用IO流接收数据
        InputStream inputStream = accept.getInputStream();
        //接受中文乱码,可以用字符转换流,再用缓冲流提高速度
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //关闭资源
        serverSocket.close();
    }
}
