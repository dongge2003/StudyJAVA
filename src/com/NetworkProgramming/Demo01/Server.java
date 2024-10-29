package com.NetworkProgramming.Demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)throws IOException {
        int Port = 28424;

        ServerSocket ss = new ServerSocket(Port);

        //监听
        Socket s = ss.accept();
        System.out.println("客户端已连接：" + s.getInetAddress());

        DataInputStream dis = new DataInputStream(s.getInputStream());

        String fileName = dis.readUTF();//读取文件名

        //创建文件
        File file = new File("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\NetworkProgramming\\Demo01\\" + fileName);

        //读取文件内容
        FileOutputStream fos = new FileOutputStream(file);
        byte[] buffer = new byte[4096];
        int len = 0;
        while ((len = dis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        System.out.println("文件接受完成");


        fos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
