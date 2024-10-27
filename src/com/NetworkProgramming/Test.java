package com.NetworkProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        /*
        网络编程:
            计算机根计算机之间通过网络进行数据传输

            软件架构: B/S(浏览器/服务器)    C/S(客户端/服务器)

            网络编程三要素:
                IP: 设备在网络中的地址,是唯一的标识
                端口号: 应用程序在设备中的唯一标识
                协议: 数据在网络中数据传输的规则,常见的协议有UDP,TCP,http,https,ftp...
         */

        /*
        IP:
            全称: Internet Protocol, 是互联网协议地址,也称IP地址
            是分配给上网设备的数字标签


            IPv4:
                采用32地址长度,分成4组(如: 192.168.1.1) - 点分十进表示法
            IPv6:
                采用地址128长度,分成8组(如: 2001:0db8:85a3:0000:0000:8a2e:0370:7334) - 冒分十六进制表示法


            IPv4地址的分类:
                公网地址(万维网使用)和私有地址(局域网使用)
                私有地址的范围:(192.168.0.0) ~ (192.168.255.255)

            特殊的IP地址:
                (127.0.0.1) 也可以是localhost - 是回送地址,也称本地回环地址,也称本地IP,永远只会寻找当前所在本机
         */

        //获取InetAddress对象
        InetAddress ip = InetAddress.getByName("dong");

        System.out.println(ip.getHostAddress());//192.168.137.1
        System.out.println(ip.getHostName());//dong
        System.out.println("----------------------------");



        /*
        端口号:
            应用程序在设备中唯一标识符

            端口号: 有两个字节表示的整数, 取值范围: 0 ~ 65535
                其中0 ~ 1023之间的端口号用于一些知名的网络服务或应用
                注意:一个端口号只能被一个应用程序使用
         */



        /*
        协议:
            计算网络中,连接和通信的规则被称为网络通信协议

            UDP协议:
                用户数据协议(User Datagram Protocol)
                UDP是面向无连接通信协议
                速度快,有大小限制一次最多发送64k,数据不安全,易丢失数据

            TCP协议:
                传输控制协议TCP(Transmission Control Protocol)
                TCP协议是面向连接的通信协议
                速度慢,没有大小限制,数据安全
         */

    }
}
