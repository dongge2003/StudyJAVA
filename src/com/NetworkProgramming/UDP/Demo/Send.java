package com.NetworkProgramming.UDP.Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        /*
        UDP发送数据,数据来自键盘录入,直到发送886,才会停止
        UDP接受数据,用死循环接受
         */

        //发送端
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if("886".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();
            DatagramPacket dp =  new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10086);
            ds.send(dp);
        }

    }
}
