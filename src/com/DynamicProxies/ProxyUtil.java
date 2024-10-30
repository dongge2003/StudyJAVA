package com.DynamicProxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar){
        /*
           newProxyInstance(ClassLoader Loader,
                Class<?>[] interfaces,
                InvocationHandler h)

                参数1.用于指定一个类的加载器
                参数2.指定生成的代理长什么样子,也就是有哪些方法
         */

        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("sing")){
                            System.out.println("准备收钱,20万");
                        } else if(method.getName().equals("dance")){
                            System.out.println("准备场地");
                        }
                        return method.invoke(bigStar, args);
                    }
                });

        return starProxy;
    }
}
