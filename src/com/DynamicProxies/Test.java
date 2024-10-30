package com.DynamicProxies;

public class Test {
    public static void main(String[] args) {
        /*
        动态代理:
            无侵入的给代码增加功能
         */

        BigStar star = new BigStar("杨超越");
        Star starProxy = ProxyUtil.createProxy(star);

        String str = starProxy.sing("好日子");
        System.out.println(str);
        /*
        准备收钱,20万
        null正在唱好日子
        谢谢
         */
    }
}
