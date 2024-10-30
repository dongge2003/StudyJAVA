package com.Reflection;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        /*
        反射:
            反射允许对成员变量,成员方法,和构造方法的信息进行编程方法

            获取                                              解刨
            Class对象 - Class
            构造方法 - Constructor
            字段(成员变量) - Field
            成员方法 - Method
         */



        /*
        获取class对象的三种方式:
            1.Class.forName("全类名");
            2.类名.class
            3.对象.getClass();
         */

        //1.Class.forName("全类名");
        //全类名 = 包名 + 类名  如:com.Reflection.Student
        //常用
        Class class1 = Class.forName("com.Reflection.Student");

        //2.类名.class
        //通常当做参数,如锁对象
        Class class2 = Student.class;

        //3.对象.getClass();
        //需要创建对象来使用
        Class class3 = new Student().getClass();
        System.out.println(class1 == class2);//true
        System.out.println(class2 == class3);//true
        System.out.println("-------------------------------------");



        /*
        获取构造方法:
            Constructor<?>[] getConstructors();             获取所有公有构造方法
            Constructor<?>[] getDeclaredConstructors();     获取所有构造方法（包括私有和保护）
            Constructor<?> getConstructor();                获取单个公共的构造方法对象
            Constructor<?> getConstructor(int.class);       获取单个的构造方法对象

            T newInstance(Object... initargs);          根据指定构造方法创建对象
            setAccessible(boolean);                     设置为true,表示取消访问检查
         */

        Class c = Class.forName("com.Reflection.Student");

        //Constructor<?>[] getConstructors();             获取所有公有构造方法
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("_________________");

        //Constructor<?>[] getDeclaredConstructors();     获取所有构造方法（包括私有和保护）
        Constructor[] constructors2 = c.getDeclaredConstructors();
        for (Constructor constructor : constructors2) {
            System.out.println(constructor);
        }
        System.out.println("__________________");

        //Constructor<?> getConstructor();                获取单个公共的构造方法对象
        Constructor constructor3 = c.getDeclaredConstructor(String.class);
        System.out.println(constructor3);
        System.out.println("__________________");

        //Constructor<?> getConstructor(int.class);       获取单个的构造方法对象
        Constructor constructor4 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor4);
        System.out.println("__________________");


        //反射的作用:
        //1.获取权限
        System.out.println(constructor4 + "的权限为" + constructor4.getModifiers());//2
        //如IDEA的代码补全,在创建对象的时候就是通过获取权限的大小来提示代码的

        //2.通过私有的构造方法,创建对象
        //Student stu = (Student) constructor4.newInstance("张三", 22);
        //class com.Reflection.Test cannot access a member of class com.Reflection.Student with modifiers "private"
        //	at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:398)

        //因为构造方法是私有的,所以可以临时改变一下权限
        constructor4.setAccessible(true);
        Student stu = (Student) constructor4.newInstance("张三", 22);
        System.out.println(stu.toString());
        System.out.println("-----------------------------------");




        /*
        获取成员变量:
            Field[] getFields();                            获取所有公共的成员变量对象的数组
            Field[] getDeclaredFields();                    获取所有的成员变量对象的数组
            Field getField(String name);                    返回单个公共成员变量对象
            Field getDeclaredField(String name);            返回单个成员变量对象

            void set(Object obj, Object value)      赋值
            Object get(Object obj)                  获取值
         */

        Class f = Class.forName("com.Reflection.Student");

        //Field[] getFields();                            获取所有公共的成员变量对象的数组
        Field[] fields = f.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("____________________");

        //Field[] getDeclaredFields();                    获取所有的成员变量对象的数组
        Field[] fields2 = f.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }
        System.out.println("____________________");

        //Field getField(String name);                    返回单个公共成员变量对象
        Field field4 = f.getDeclaredField("name");
        System.out.println(field4);
        System.out.println("____________________");

        //Field getField(String name);                    返回单个公共成员变量对象
        Field field5 = f.getDeclaredField("age");
        System.out.println(field5);
        System.out.println("____________________");

        System.out.println(field5.getModifiers());//2  获取权限
        System.out.println(field5.getName());//age  获取名字
        System.out.println(field5.getType());//int  获取类型
        System.out.println("____________________");

        //获取成员变量记录的值
        Student stu2 = new Student("王五",28);
        Field name = f.getDeclaredField("name");
        name.setAccessible(true);
        String value = (String) name.get(stu2);
        System.out.println(value);
        System.out.println("____________________");

        //修改对象里面记录的值
        name.set(stu2,"王五改");
        System.out.println(stu2);//Student{name='王五改', age=28}
        System.out.println("-----------------------------------------");



        /*
        获取成员方法:
            Method[] getMethods()                                                       返回所有公共成员方法对象的数组(包括继承的)
            Method[] getDeclaredMethods()                                               放回所有成员方法对象的数组(不包括继承的)
            Method getMethod(String name, Class<T>... parameterTypes)                   返回单个公共成员方法对象
            Method getDeclaredMethod(String name, Class<T>... parameterTypes)           返回单个成员方法对象

            Object invoke(Object obj, Object args)          运行方法
            参数一:用obj调用该方法
            参数二:调用方法的传递的参数(没有就不写)
            返回值:方法的返回值(没有就不写)
         */

        Class m = Class.forName("com.Reflection.Student");
        //Method[] getMethods()                返回所有公共成员方法对象的数组(包括继承的)
        Method[] methods = m.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("____________________");

        //Method[] getDeclaredMethods()              放回所有成员方法对象的数组(不包括继承的)
        Method[] methods2 = m.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method);
        }
        System.out.println("____________________");

        //Method getMethod(String name, Class<T>... parameterTypes)        返回单个公共成员方法对象
        Method method3 = m.getMethod("test1", int.class);
        System.out.println(method3);
        System.out.println("____________________");

        //Method getDeclaredMethod(String name, Class<T>... parameterTypes)           返回单个成员方法对象
        Method method4 = m.getDeclaredMethod("eat", String.class,int.class);
        System.out.println(method4);
        System.out.println("____________________");



        System.out.println(method4.getName());//获取方法的名字
        System.out.println(method4.getModifiers());//获取方法的修饰符
        //获取方法抛出的异常
        Class[] exceptions = method4.getExceptionTypes();
        for (Class exception : exceptions) {
            System.out.println("异常:" + exception);
        }
        // 获取方法的形参
        Parameter[] parameters = method4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("形参:" + parameter);
        }
        System.out.println("____________________");


        //方法的运行
        Method M = m.getDeclaredMethod("eat", String.class,int.class);
        Student stu3 = new Student("张三",89);
        M.setAccessible(true);
        M.invoke(stu3,"汉堡",76);//运行方法
        Object result = M.invoke(stu3,"汉堡",76);//方法的返回值
        System.out.println(result);


    }
}
