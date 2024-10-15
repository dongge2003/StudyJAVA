package com.Knowledge.ObjectOriented;

//knowledge就是个类
public class Konwledge {
    public static void main(String[] args) {
        /*
        类和对像:
            类(设计图):是对象的共同特征的描述
            对象:真实存在的具体东西
        在java中,必须先设计类,才能获得对象
         */

        /*//创建手机的对象:
        Phone p = new Phone();
        //给Phone这个对象的成员变量赋值:
        p.brand = "小米";
        p.price = 8999;

        System.out.println(p.brand);
        System.out.println(p.price);
        //调用Phone这个对象的方法:
        p.call();
        p.playgame();*/

        //类名的首字母建议大写,需要见名知意
        //一个java文件中可以定义多个class类,且只能一个类是public修饰,而且public修饰的类目笔村成为代码文件名.
        //实际开发中建议一个文件定义一个class类
        //成员变量的完整定义格式是:修饰符 数据类型 变量名称 = 初始化值;一般无指定初始化值的,存在默认值




        /*
        封装:
            1.例如:人画圆,有两个对象,人和圆
            但是 人画圆这一行为是 人的 还是 圆的 行为?

            对象代表什么,就得封装对应的数据,并提供数据对应的行为

            画圆需要圆的半径 ,而圆的半径属于 圆 这个对象的,所以人画圆属于 圆这个对象的


            2.人关门 - 那人关门这一行为属于 哪个对象?
            属于门的 , 人只提供了作用力 ,这个门 在人提供完作用力之后就 自己关上了
            所以人关门 属于门这个对象

            3.张三 砍了 李四 - 那李四死了 这又属于哪个对象呢?
            属于 李四 因为张三只是拿刀砍了他 , 而李四是自己死亡的
            法律也一样:张三行凶 导致 李四的死亡 ,李四是自己死的

         */




        /*
        private关键字:
        1.权限修饰符
        2.可以修饰成员(成员变量和成员方法)
        3.被private修饰的成员只能在本类中可以访问
            在创建了 Student 对象后:
            给了两个属性 String name; int age;
            但是age 年龄不可能为负值啊;

            所以要用private修饰,并且构造方法只要不满足条件不能赋值进去
            只要年龄符合实际年龄1-120 就可以赋值
            所以要写一个方法来进行赋值和获取值
            get***();
            set**();
            public void setage(int a){
                if(a < 0 && a > 150){
                 System.out.println("无效的年龄");
                }
                 else {
                      age = a;
                  }
              }
              public int getage(){
                  return age;
            }

            注意:
                如果没有定义构造方法,系统会给出一个默认的无参数构造方法
                如果定义了构造方法,系统将不在提供默认的构造方法


        */

        //用private修饰后:
        /*Student s1 = new Student();
        s1.age = 18;
        s1.name = "lishi";
        error 报错 不能赋值
        */

        //写了方法之后:
        /*Student s1 = new Student();
        s1.setname("dong");
        s1.setage(18);

        System.out.println(s1.getname());//dong
        System.out.println(s1.getage());//18*/




        /*
        this:
            在构造方法来进行赋值和获取值时:
            public void setname(String n){
                name = n;
               }
            public void setage(int a){
                age = a;
            }

            方法接受的参数不能见名知意
            但如果起相同的名字:
            private String name;
            private int age = 30;成员变量

            public void setname(String name){
                name = name;
            }
            public void setage(int age){
                int age = 10;局部变量
                sout(age);
            }

            //就会和private String name的这个name重复

            这时会按照就近原则的:
            sout(age)会用离他最近的变量 局部变量age= 10;而不会用 成员变量age = 30;
            而加上this后就会直接用成员变量的age = 30
            sout(age)30

            所以方法可以写成:
            public void setname(String name){
                this.name = name;
            }


         */




        /*
        标准的javaBean类
            1.类名见名知意
            2.成员变量用private修饰
            3.提供至少两个构造方法:
                .无参数方法
                .带全部参数的构造方法
            4.成员方法:
                .提供每一个成员变量对应的set***();get***();
                .如果还有其他行为,也要写上


        public class Student {
            private String name;
            private int age;

            //无参数
            public Student(){

            }
            //全部参数
            public Student(String name , int age){
                this.name = name;
                this.age = age;
            }

            public void setname(String name){
                this.name = name;
            }
            public String getname(){
                return name;
            }

            public void setage(int age){
                if(age < 0 && age > 150){
                    System.out.println("无效的年龄");
                }
                else {
                    this.age = age;
                }
            }
            public int getage(){
                return age;
            }

           }

         */





        /*
        
         */

    }
}
