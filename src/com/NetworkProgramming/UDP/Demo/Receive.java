package com.NetworkProgramming.UDP.Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        //接受端
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        while (true) {
            ds.receive(dp);
            System.out.println(new String(dp.getData(), 0, dp.getLength()));
        }

    }
}
