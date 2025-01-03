package com.IO.SerializeTheStream;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
        序列化流/对象操作输出流:
            可以把java中的 对象 写到本地文件中

            构造方法:
                public ObjectOutPutStream(OutputStream out)                 把基本流包装成高级流
            成员方法:
                public final void writeObject(Object obj)                   把对象序列化(写出)到文
         */

//        //创建对象
//        Student s1 = new Student("张三",21);
//        //创建序列化对象
//        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\SerializeTheStream\\Object.txt"));
//        //写入数据
//        objectOutput.writeObject(s1);
//        //关闭流
//        objectOutput.close();
        //�� sr !com.IO.SerializeTheStream.Student)mV0�� b I ageL namet Ljava/lang/String;xp   t 张三

        /*
        Exception in thread "main" java.io.NotSerializableException: com.IO.SerializeTheStream
        序列化流的小细节:
            使用对象输出流保存到文件中时会出现NotSerializableException异常
            解决方法:
                需要让javabean类实现Serializable接口
         */
        System.out.println("------------------------------");






        /*
        反序列化流/对象操作输入流:
            可以把文件中的对象 读取到 程序中

            构造方法:
                public ObjectInputStream(InputStream out)                 把基本流包装成高级流
            成员方法:
                public Object readObject()                              把序列化到本地文件中的对象,读取到程序中来
         */

//        //创建反序列化对象
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\SerializeTheStream\\Object.txt"));
//
//        //读取数据
//        //Object object = objectInputStream.readObject();
//        Student s2 = (Student) objectInputStream.readObject();
//
//        //关闭流
//        objectInputStream.close();
//
//        System.out.println(s2);


        /*
        细节1:

        如此时在写入完成后在Student类中多添加一个属性  private String address;
        那就会报错: Exception in thread "main" java.io.InvalidClassException: com.IO.SerializeTheStream
        .Student; local class incompatible: stream classdesc serialVersionUID = 8852372058291277006, local class serialVersionUID = 1

        在底层,java会通过 序列化的类中的对象中的属性(属性,成员方法,构造方法...) 生成一个版本号写入也写入文件中
        原因: 文件中的版本号和Javabean中的版本号不匹配

        可以在Javabean类中手动添加一个版本号
        private static final long serialVersionUID = 1L;//版本号

        此时在序列化,然后修改Javabean中的属性,在反序列化也不会报错了

         */




        /*
        细节2:
            如果在Javabean中有个别属性不想序列化到本地文件中去()
            就要加上关键字transient
            如:private transient String address;
         */

//        Student s3 = new Student("赵4",21,"北京市1环","男");
//        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\SerializeTheStream\\Object.txt"));
//        objectOutput.writeObject(s3);
//        objectOutput.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\SerializeTheStream\\Object.txt"));
//        Student s4 = (Student) objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println(s4);//Student [name=赵4, age=21, address=null, sex=男]
        //这样就没写进去
        System.out.println("------------------------------");





        /*
        如果要写入多个对象,并且读取,如果不知道文件中写了几个对象,多次调用反序列化就会报出异常
        所以一般写入多个对象时用集合写进去ArrayList

         */
        //例如:
        Student test1 = new Student("小丽",22,"新疆","女");
        Student test2 = new Student("小华",21,"湖南","男");
        Student test3 = new Student("小美",18,"广州","女");

        ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\SerializeTheStream\\MoreObject.txt"));
        ObjectInputStream r = new ObjectInputStream(new FileInputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\SerializeTheStream\\MoreObject.txt"));

//        //法1:
//        w.writeObject(test1);
//        w.writeObject(test2);
//        w.writeObject(test3);
//        //写入3个对象
//
//        System.out.println((Student)r.readObject());
//        System.out.println((Student)r.readObject());
//        System.out.println((Student)r.readObject());
//        //读取3个
//
//        //System.out.println((Student)r.readObject());
//        //在读取第4个对象的时候报出异常Exception in thread "main" java.io.EOFException,所以不好控制,更不用说,如果不知道写入了几个对象
        System.out.println("_________________________");


        //法2:
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(test1);
        studentList.add(test2);
        studentList.add(test3);

        w.writeObject(studentList);

        ArrayList<Student> list = (ArrayList<Student>) r.readObject();
        for (Student student : list) {
            System.out.println(student);
        }


        r.close();
        w.close();
    }
}
