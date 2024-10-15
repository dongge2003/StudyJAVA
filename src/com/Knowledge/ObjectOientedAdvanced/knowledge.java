package com.Knowledge.ObjectOientedAdvanced;

public class knowledge {
    public static void main(String[] args) {
        /*
        static - 静态变量 - 修饰符 - 可以修饰成员方法 - 成员变量
        创建一个学生对象
        private String name;
        private int age;
         */
        /*//创建学生对象
        student s1 = new student();
        s1.setName("zhangsan");
        s1.setAge(18);
        //s1.show();

        student s2 = new student();
        s2.setName("lisi");
        s2.setAge(23);
        //s2.show();

        //现在加一个老师的姓名要给老师赋值
        //s1.techername = "李老师";
        //s2.techername = "李老师";
        //s2.show();
        //s1.show();
        //但是现实是,一个班的学生共享一个老师
        //只要在student类中public String techername; 加上 static修饰 public static String techername;
        //这个成员变量就会被共享,赋值一次就行了

        //设置静态成员变量:类名.成员变量 = "";就行
        student.techername = "李老师";
        s1.show();//zhangsan18李老师
        s2.show();//lisi23李老师*/



        /*
        static
            被static修饰的变量叫静态变量:
                特点:1.被该类中所有对象共享
                    2.不属于对象属于类
                    3.随之类的加载而加载,优先于对象存在
            被static修饰的方法叫静态方法:
                 特点:1.多用于测试类和工具类中
                    2.javabean类很少会用
         */





        /*
        工具类:
            javabean类: 涌来描述一类事物的类,比如student,car...
            测试类: 用来检查其他类是否书写正常,带有main方法的类,是程序的入口
            工具类: 不是用来描述一类事物的类,而是帮我们做一些事情的类767
                工具类要见名知意 math arr
                私有化构造方法
                方法都定义成静态的
                -就是一些方法的集合,如定义一个math类,里面有加.减.乘.除4个方法
                如public static int add(int a , int b){
                    return a + b;
                }

                这样在其他类中就可以直接math.add(a , b);
                这样调用了,更方便
         */



        /*
        static注意事项:
            静态方法只能访问静态的变量和静态方法
            非静态方法 可以 访问静态变量或者静态方法 ,也可以访问非静态的成员变量和非静态的成员方法
            静态方法中是没有this关键字的
         */





        /*
        继承:  - 类和类的父子概念
            面向对象的三大概念:封装,继承,多态
        比如定义三个类,person,student,teacher student和teacher类都属于是person,
        所以可以说person类是student和teacher类的爸爸,只要在person类中定义过的,student和teacher就不用定义了,这就叫继承

        用extends - 关键字 - 可以让一个类和另一个类建立继承关系
        public class Student extends Person{}
        Student称为子类(派生类),Person被称为父类(基类或者超类)

        使用继承的好处:
                可以把多个子类中重复的代码抽取到父类中,提升代码的复用性
                子类可以在父类的基础上,增加其他的功能,使子类更强大

        继承的特点:
            java只支持单继承,不支持多继承,但是支持多层继承
            单继承:一个子类只能只能继承一个父类
            多层继承:子类A继承父类B,父类B 可以继承 父类C
            则子类A与C是 间接父类关系
            子类A与B是 直接父类关系

            每一个类都直接或者间接的继承于 Object


        构造方法 - 非私有(不能) - private(不能)
        成员变量 - 非私有(能)   - private(能)
        成员方法 - 非私有(能)   - private(不能)


         */
        //
        /*student s1 = new student();
        s1.age = 12;
        s1.name = "zhangsan";
        s1.people();

        teacher t1 = new teacher();
        t1.age = 34;
        t1.name = "lilaoshi";
        t1.people();*/

        //当父类的成员变量用private修饰后字类就无法访问了
        //就会报错age name 在 com.Knowledge.ObjectOientedAdvanced.Person 中是 private 访问控制





        /*就近原则:谁谁离我进,我就用谁
            如果不加关键字:就是谁近先用谁
            this :访问同类中的
            supper:访问父类中的

            //父类
            public class Fu {
            String name = "FU";
            }

            //子类
            public class Zi extends Fu{
            String name = "ZI";
             public void zishou(){
             String name = "zishou";
            System.out.println(name);//---zishou---
             System.out.println(this.name);//---ZI---
             System.out.println(super.name);//---FU---
                }
            }

        */




        /*
        @overdrive - 对父类的方法进行重写
        子类如果继承了父类的方法,如果想对其重写
        只要在上方加上@overdrive
            @Override
            public void eat(){
            System.out.println("吃剩饭");
            }
       就可以了

       重写的要求:
       1.重写方法的名称 ,形参,返回值必须要和父类的一致
       2.子类重写父类的方法时,访问权限必须大于等于父类,
       3.子类重写父类方法时,返回值类型子类必须小于等于父类
       4.建议:重写的方法尽量和父类保持一致
       5.只有被添加到虚方法表的方法猜能被重写
            -被private修饰的...
            -被static修饰的...
            -被final修饰的...
         */












        /*
        继承中:构造方法的访问特点
            1.父类中的构造方法不会被子类继承
            2.子类中所有的构造方法默认先访问父类中的无参构造,再执行自己

        如何调用父类的构造方法:
            1.子类构造方法的第一行默认嗾使:super(), 不写也存在,且必须在第一行
            2.如果想调用父类有参构造,必须手动写super进行调用

         */

        /*
        public class FU {
            String name;
            int age;

            //空参构造
            public FU(){

            }
            //有参构造
            public FU(String name , int age){
                this.name = name;
                this.age = age;
            }
        }

        public class ZI extends FU {
            //空参构造
            public ZI() {
                //先要写父类的空参构造
                super();
                System.out.println("子类空参构造");
            }
            public ZI(String name , int age){
                super(name,age);
            }

        }

        这样子类的有参构造会先调用父类的有参构造,然后再传回来
         */





        /*
        多态 - 同类型的对象,变现出的不同形态
            表现形式:父类类型 对象名称 = 子类对象;
            前提条件:1.有继承或者实现关系  2.有父类引用指向子类对象     3.有方法重写

        多态调用成员的特点:
            成员变量调用:编译看左边,运行也看左边
                编译看左边:java编译代码的时候,会看左边父类中有没有这个变量,如果有,编译成功,如果没有编译失败
                运行也看左边:java代码运行的时候,实际获取的就是左边父类中成员变量的值

            成员方法调用:编译看左边,运行看右边
                编译看左边:java编译代码的时候,会看左边父类中有没有这个方法,如果有,编译成功,如果没有编译失败
                运行也看左边:java代码运行的时候,实际运行的是子类中的方法

        比如:Person p = new Student();
        调用成员变量的时候,p 属于 Person 所以会从 父类 中的成员变量中找 , 就跟Student p = new Student();会从Student 中找一样
        但在调用成员方法的时候,有于把Person的虚方法表也继承下来了,所以是会调用父类的虚方法,但是子类把虚方法表给@Overdive重写了所以调用的是他自己的

        多态的优势:
            1.在多态形式下,右边对象可以实现解耦合,便于扩展和维护
            如:原 - Person p = new Student();
                    p.show();
              修改:直接Person p = new Teacher(); - 改成另一个类就行了
              此时的p.show就会调用Teacher的方法
            2.定义方法的时候,使用父类作为参数,可以接受所以子类的对象,体现多态的扩展性与便利

         多态的劣势:
            1.不能调用子类的特有功能
            因为多态调用方法的时候要遵循编译看左边,运行看右边
            但父类中没有子类特有的方法,所以会把偶从
         多态劣势解决方法:
            强制转换就行了
            Person p = new Student();
            Student s = (Student) p;//强制转换
            转换的时候用instanceof关键字进行判断
            p instanceof Student - 判断p能不能转换成Student类型 能(返回true) 不能(返回false)



         */





        /*
        包:
        包就是文件夹,用来管理各种不同功能的java类,方便后期代码维护
           包名的规则:公司域名反写 + 包的作用 , 其余全部英文小写 ,见名知意.

        使用其他类时,需要使用全类名
        全类名 = 包名 + 类名
        使用其他累了的规则:
            1.使用同一个包中的类时,不需要导包
            2.使用java.lang包中的类时,不需要导包
            3.其他情况都要导包
            4.如果同时使用两个包中的同类名,需要用全类名
         */




        /*
        final - 最终的
                final方法:表示该方法时最终方法,不能被重写

                final类:表示该类时最终类,不能被继承

                final变量:叫做常量,只能被赋值一次
                    常量的命名规范:
                        1.单个单词:全部大写
                        2.多个单词:全部大写,单词之间用下划线隔开
                细节:
                    1.final修饰的变量是基本类型:那么变量存储的数据值不能发生改变
                    2.final修饰的变量是引用类型:那么变量存储的地址值不能发生改变,对象内部可以改变
         */






        /*
        权限修饰符
            1.用来控制一个成员能被访问到的范围
            2.可以修饰成员变量,方法,构造方法,内部类.

        有4种权限修饰符
            private < 空着不写(缺省/默认) < protected < public

            修饰符     同一个类    同一个包中其他类    不同包下的子类     不同包下的无关类
            private     ###
            空着不写     ###         ###
            protected   ###         ###                 ###
            public      ###         ###                 ###                 ###


         */

        System.out.println("中文乱码");




    }
}

