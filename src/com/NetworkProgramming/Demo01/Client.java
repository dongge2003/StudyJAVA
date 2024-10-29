package com.NetworkProgramming.Demo01;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws IOException {
        String IP = "127.0.0.1";
        int Port = 28424;

        String FileePath = "D:\\新建文件夹\\别错过(DJ阿卓版) - 程佳佳.mp3";
        File file = new File(FileePath);
        String FileName = file.getName();
        System.out.println(FileName);

        Socket sc = new Socket(IP, Port);
        System.out.println("已连接到服务器：" + IP);

        DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
        dos.writeUTF(FileName);//发送文件名
        dos.flush();

        //发送文件内容
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[4096];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            dos.write(buffer, 0, len);
        }
        System.out.println("文件发送完成");


        fis.close();
        dos.close();
        sc.close();
    }
}
