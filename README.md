# <center>  java

---

## <center>目录
- [  java](#--java)
  - [目录](#目录)
  - [java基础语法](#java基础语法)
    - [注释](#注释)
    - [字面量](#字面量)
    - [数据类型](#数据类型)
    - [变量](#变量)
    - [算数运算符](#算数运算符)
    - [转换](#转换)
    - [常量优化机制](#常量优化机制)
    - [循环语句](#循环语句)
      - [for循环](#for循环)
      - [while循环](#while循环)
      - [do while循环](#do-while循环)
    - [选择语句](#选择语句)
      - [if else](#if-else)
      - [if elseif else](#if-elseif-else)
      - [switch](#switch)
    - [数组](#数组)
    - [方法(函数)](#方法函数)
    - [方法重载 - 同一个类中定义多个方法之间的关系](#方法重载---同一个类中定义多个方法之间的关系)
  - [类和对像](#类和对像)
    - [封装](#封装)
    - [private关键字](#private关键字)
    - [this](#this)
    - [标准的javaBean类](#标准的javabean类)
  - [String](#string)
    - [String类](#string类)
    - [StringBuilder类](#stringbuilder类)
    - [链式编程](#链式编程)
    - [StringJoiner](#stringjoiner)
  - [ArrayList](#arraylist)
  - [面向对象进阶](#面向对象进阶)
    - [static](#static)
    - [继承](#继承)
    - [就近原则](#就近原则)
    - [@overdrive](#overdrive)
    - [多态](#多态)
    - [包](#包)
    - [final](#final)
    - [权限修饰符](#权限修饰符)
    - [代码块](#代码块)
    - [抽象类和抽象方法](#抽象类和抽象方法)
    - [接口](#接口)
    - [内部类](#内部类)

---

## java基础语法  

### 注释  

```java
//1.单行注释

/*
 2.多行注释
*

/*
 * 3.文档注释
 */
```

---

### 字面量  

```java
//1.字符串字面量
System.out.print("HelloWorld");
System.out.println(印一段话")
//2.整数字面量
System.out.print(100);
System.out.print(-874)
//3.小数字面量
System.out.println(11);
System.out.println(345)
//4.字符字面量
System.out.print('A');
System.out.print('a')
//5.布尔字面量
System.out.print(true);
System.out.println(1< 5);*/
```  

---

### 数据类型  

```java
1.基本数据类型:
    数值型:
        整数:byte(1short(2),i(4),long(8)
        浮点数:flo(4),double(8)
        字符:char(2- java中cha两个字节是用的是Unico编码
    非数值型:
        布尔:boole(1)
2.引用数据类型:
    类:class
    字符串:string
    接口:interface
    数组:[]
```

---

### 变量  

变量 - 存储的数据可以改变
变量的定义:**数据类型 变量名 = 变量值;**

---

### 算数运算符  

```java
+ 加
- 减
* 乘
/ 除
% 取余
```

---

### 转换  

隐式转换 - 把一个表示范围小的数值或者变量赋值给另一个表示数据范围大的变量
强制转换 - 把一个表示范围大的数值或者变量赋值给另一个表示数据范围小的变量
格式:**数据类型 变量名 = (目标数据类型)(数值或变量);**  

```java
int a = 10;
        double b = 13.14;
        System.out.println(a + b);

        //int c = a + b;    error
        //double c = a + b;

        short s = 10;
        int i = 20;
        int j = s + i;

        short ss = (short)(s + i);//强制转换*/
```

---

### 常量优化机制  

```java
short s = 1;
        //s = s + 1;//1默认是int类型的,但s是short类型的,所以这里需要强制转换
        s = (short) (s + 1);*/
```

---

### 循环语句

#### for循环

```java
for(int i = 0 ; i < 100 ; i++){
    System.out.println(i);
}
```  

#### while循环

```java
int i = 1;
while (i < 100){
    System.out.println(i);
    i++;
}
```

#### do while循环

```java
int i = 1;
do{
    System.out.println(i);
    i++;
}
while (i < 100);
```

---

### 选择语句

#### if else

```java
int i = 1;
if(i == 1){
    System.out.printf("成立");
}
else{
    System.out.printf("不成立");
}
```

#### if elseif else

```java
int x = 30;

if( x == 10 ){
    System.out.print("Value of X is 10");
}else if( x == 20 ){
    System.out.print("Value of X is 20");
}else if( x == 30 ){
    System.out.print("Value of X is 30");
}else{
    System.out.print("这是 else 语句");
}
```


#### switch

```java
Scanner sc = new Scanner(System.in);//从键盘接受数据
    switch (sc.nextInt()){
        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星期三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        case 5:
            System.out.println("星期五");
            break;
        case 6:
            System.out.println("星期六");
            break;
        case 7:
            System.out.println("星期天");
            break;
        default:
            System.out.println("选择错误");
            break;
    }
```

---

### 数组

定义数组:
**数据类型[] 数组名 = new 数据类型[数组的长度];**
在创建的时候,由我们自己指定数组的长度,由虚拟机给出默认的初始值

```java
String[] arr = new String[30];
        arr[0] = "zhang";
        arr[1] = "lisi";
        System.out.println(arr[0]);//zhang
        System.out.println(arr[1]);//lisi
        System.out.println(arr[2]);//null*/
```

默认初始化规律:
**整数类型:默认初始化为0**
**小数类型:默认初始化为0.0**
**字符数类型:默认初始化为"/u0000" - 空格**
**布尔类型:默认初始化为false**
**引用数据类型:默认初始化为null**

```java
//数组的声明:
/int[] arr = new int[3];
//数组的初始化:
//标准版:
int[] arr2 = new int[]{1,2,3};
//简化格式:
int[] arr3 = {1,2,3};
for(int i = 0;i < 3;i++){
    System.out.println(arr3[i]);
}
```

---

### 方法(函数)

* 方法注意事项:
    1. 不能嵌套使用,比如在main方法里创建其他方法
    2. 如果返回值为void,可以省略return,也可以单独写return ;,后面不加数据

```java
int m = max(10, 20);
System.out.println(m);
```

---

### 方法重载 - 同一个类中定义多个方法之间的关系

* 多个方法在同一个类中
* 多个方法具有相同的方法名
* 多个方法的参数不相同,类型或者数量不同

```java
int s1 = sum(10,20);
double s2 = sum(0.16 ,8.9532);
int s3 = sum(56 ,89,94);
double s4 = sum(3.15 ,5.69 ,89.5);
System.out.println(s1);//30
System.out.println(s2);//9.1132
System.out.println(s3);//239
System.out.println(s4);//98.34
```  

* 调用方法的时候,java虚拟机会通过参数的不同来区分同名的方法   

* 方法重载的好处:
>让调用者不用记太多的方法名
>调用方法时,jvm会根据参数列表匹配对应的方法  

---

## 类和对像

* 类(设计图):是对象的共同特征的描述
* 对象:真实存在的具体东西
**在java中,必须先设计类,才能获得对象**

```java
//创建手机的对象:
Phone p = new Phone();
//给Phone这个对象的成员变量赋值:
p.brand = "小米";
p.price = 8999
System.out.println(p.brand);
System.out.println(p.price);
//调用Phone这个对象的方法:
p.call();
p.playgame();        
```

**类名的首字母建议大写,需要见名知意**
* 一个java文件中可以定义多个class类,且只能一个类是public修而且public修饰的类目笔村成为代码文件名.
* 实际开发中建议一个文件定义一个class类
* 成员变量的完整定义格式是:
  ``修饰符 数据类型 变量名称 = 初始化一般无指定初始化值的,存在默认``

### 封装

>1.例如:人画圆,有两个对象,人和圆
但是 人画圆这一行为是 人的 还是 圆的 行为?
对象代表什么,就得封装对应的数据,并提供数据对应的行为
画圆需要圆的半径 ,而圆的半径属于 圆 这个对象的,所以人画圆属于 圆这个对象的

>2.人关门 - 那人关门这一行为属于 哪个对象?
属于门的 , 人只提供了作用力 ,这个门 在人提供完作用力之后就 自己关上了
所以人关门 属于门这个对象

>3.张三 砍了 李四 - 那李四死了 这又属于哪个对象呢?
属于 李四 因为张三只是拿刀砍了他 , 而李四是自己死亡的
法律也一样:张三行凶 导致 李四的死亡 ,李四是自己死的

---

### private关键字

1. 权限修饰符
2. 可以修饰成员(成员变量和成员方法)
3. 被private修饰的成员只能在本类中可以访问
    >在创建了 Student 对象后:
    给了两个属性 String name; int age;
    但是age 年龄不可能为负值啊
    所以要用private修饰,并且构造方法只要不满足条件不能赋值进去
    只要年龄符合实际年龄1-120 就可以赋值
    所以要写一个方法来进行赋值和获取值

```java
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
```

==注意:==
**如果没有定义构造方法,系统会给出一个默认的无参数构造方法**
**如果定义了构造方法,系统将不在提供默认的构造方法**

```java
 //用private修饰后:
Student s1 = new Student();
s1.age = 18;
s1.name = "lishi";
//error 报错 不能赋值

//写了方法之后:
Student s1 = new Student();
s1.setname("dong");
s1.setage(18)
System.out.println(s1.getname());//dong
System.out.println(s1.getage());//18
```

---

### this

```java
在构造方法来进行赋值和获取值时:
public void setname(String n){
    name = n;
}
public void setage(int a){
    age = a;
//方法接受的参数不能见名知意
//但如果起相同的名字:
private String name;
private int age = 30;成员
public void setname(String name){
    name = name;
}
public void setage(int age){
    int age = 10;局部变量
    sout(age);
//就会和private String name的这个name
//这时会按照就近原则的:
//sout(age)会用离他最近的变量 局部变量age= 10;而不会用 成员变量age = 30;
//而加上this后就会直接用成员变量的age = 30
//sout(age)
//所以方法可以写成:
public void setname(String name){
    this.name = name;
}
```

---

### 标准的javaBean类

1. 类名见名知意
2. 成员变量用private修饰
3. 提供至少两个构造方法:
    * 无参数方法
    * 带全部参数的构造方法
4. 成员方法:
    * 提供每一个成员变量对应的set***();get***();
    * 如果还有其他行为,也要写上

```java
public class Student {
    private String name;
    private int age
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
```

---

## String

```java
//1.使用直接赋值的方式获取一个字符串对象
String s1 = "abc";
System.out.println(s1)
//2.使用new的方式来获取一个字符串对象
//空参构造: 可以获取一个空白的字符串对象
String s2 = new String();
System.out.println("@" + s2 + "!");//@  !:s2的值为空' '(空格
//有参构造:
//传递一个字符串,根据传递的字符串内容创建一个字符串对象
String s3 = new String("abc");
System.out.println(s3);//ab
//传递一个字符串数组,根据字符串数组的内容再创建一个新的字符串对象
//需求:要修改字符串的内容  abc 变成 qbc
//先把abc 变成{abc}字符串 在修改qbc
char[] arr = {'a','b','c','d'};
String s4 = new String(arr);
System.out.println(s3);//abc
//创建一个字符数组,根据字节数的内容再创建一个新的字符串对象
//应用场景,在网络中传输的数据都是字节信息
//我们要把字节信息进行转换,转成字符串,就要用到这个了
byte[] arrby = {97,98,99,100,101};
String s5 = new String(arrby);
System.out.println(s5);//abcde*/
```

### String类

```java
//比较字符串
//boolean equals(要比较的字符串) 不忽略大小写
//boolean equalsIgnoreCase(要比较的字符串)  忽略大小写得比较
String s1 = "abc";
String s2 = "abc";
System.out.println(s1 == s2);//tru
String s3 = new String("abc");
String s4 = "abc";
System.out.println(s3 == s4);//false

//==号:
//    如果比较 基本数据类型(int double ..)比的是 数据值
//    如果比较 是引用数据类型比的是 地址
//    而String s1 = "abc";
//    而String s2 = "abc";
//    这种直接赋值的 如果在 串池中 有"abc" 则s2也用s1的地址
 
String s1 = "abc";
String s2 = "ABC";
String s3 = new String("abc");
String s4 = "fallg";

//不忽略大小写 - equals
boolean r1 = s1.equals(s2);
System.out.println(r1);//fals
boolean r2 = s1.equals(s3);
System.out.println(r2);//tru
boolean r3 = s1.equals(s4);
System.out.println(r3);//fals
boolean r4 = s3.equals(s4);
System.out.println(r4);//false

//忽略大小写 -
* boolean r1 = s1.equalsIgnoreCase(s2);
System.out.println(r1);//true

//如果用键盘录入一个abc和abc用==号会判断相等吗
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = "abc";
if(s1 == s2){
    System.out.println("相等");
}else {
    System.out.println("不想等");
}
//结果是不想等,所以两个的地址不同*

//字符
//字符串遍历:
//public char charAt(int index); 根据索引返回字符串 (跟数组的索引一样从0开始)
//public int length(); 返回字符串的长度
    //数组的长度: 数组名.length - 属性
    //字符串的长度: 字符串对象.length() - 方
//字符串截取:
    //**.substring()
String s = "dongjiancheng";
//d o n g j i a n c h  e  n  g
//0 1 2 3 4 5 6 7 8 9 10 11 12
String dong = s.substring(0,4);
System.out.println(dong);
String jian = s.substring(4,8);
System.out.println(jian);
String cheng = s.substring(8,s.length());
System.out.println(cheng);
```

---

### StringBuilder类

```java
//public StringBuilder append(任意类型) - 添加数据,并返回对象本身
//public StringBuilder reverse() - 反转容器中的内容
//public int length() - 返回长度(字符出现的个数)
//public String toString() - 通过toString()就可以实现把StringBuilder转String

/*//创建对象
*//*StringBuilder sb = new StringBuilder();
Knowledge k1 = new Knowledge();
System.out.println(sb);//而这个没地址
System.out.println(k1);//com.test.String.Knowledge@7b23ec81*//
StringBuilder sb = new StringBuilder("abc");
System.out.println(sb);//ab

//添加元素
sb.append(1);
sb.append(3.14);
sb.append('a');
sb.append("dong");
System.out.println(sb);//abc13.14adon

//反转
sb.reverse();
System.out.println(sb);//gnoda41.31cb

//获取长度
int len = sb.length();
System.out.println(len);//1

//通过toString()就可以实现把StringBuilder转换成String类
String str = sb.toString();//这样就变成了字符串
String out = str.substring(3,5);//就可以
```

---

### 链式编程

当我们在调用一个方法的时候,不需要用变量接受他的结果,可以继续调用其他方法

```java
StringBuilder sb = new StringBuilder();
int len = sb.append(1).append(3.14).append("ajgljaljgs").reverse().length();

//这里在这个容器中加入1 3.14 ahgahgl 然后反转 然后计算大小 赋值给 len
System.out.println(len);
```

---

### StringJoiner

```java
//public StringJoiner (间隔符号) - 创建一个StringJoiner对象,指定拼接时的间隔符号
//public StingJoiner(间隔符号,开始符号,结束符号) - 创建一个StringJoiner对象拼接时的间隔符号

//成员方法:
public StringJoiner add() - 添加数据,并返回对象本身
public int length() - 返回长度
public String toString() - 返

//拼接1000000个字符串
StringBuilder sb = new StringBuilder();
for(int i = 0 ; i < 1000000 ; i++){
    sb.append("abc");
}
System.out.println(sb);*/

//但是要拼接时加条件就复杂了,麻烦所
//创建对象
StringJoiner sj = new StringJoiner(",","[","]");

//添加内容
String str = sj.add("abc").add("xyz").toString();
System.out.println(str);//[abc,xyz]
```

---

## ArrayList

* 集合
  * 长度: 数组的长度是固定的,而集合的长度是可变的
  * 存储类型: 数组可以存基本数据类型,引用数据类型
  * ==集合可以存引用数据类型,但基本数据型要变成 - > 包装类==
    ``ArrayList<E> - 类 - java.util``
    **<E>存储的数据类型**
* 创建集合的对象:
  * <>泛型 限定集合中存储的数据类型  

==JDK7:之前是这样写的==  
    ``ArrayList<String> list = new ArrayList<String();``
    * 只能存String这样的字符串  

==JDK7之后的版本==  

```java
ArrayList<String> list = new ArrayList<>();
/System.out.println(list);//[] - 内容为空,
//这个类型在底层做了处理
//打印对象不是地址值,而是集合中的数据内容
//在展示时会用[]对数据进行包裹
```

* 方法:
    * 增:``boolean add(E e)`` - 添加元素,返回值表示是否添加成功
    * 删1:``boolean removeL(E e)`` - 删除指定元素,返回值便是是否* 删除成功
    * 删2:``E removeL(int index)`` - 删除指定索引的元素,返回被删* 除的元素
    * 改:``E set(int index , E e)`` - 修改指定索引的元素,返回原* 来的元素
    * 查1:``E get(int index)`` - 获取指定索引元素
    * 查2:``int size()`` - 集合的长度,也就是集合中元素的个数

```java
//增加元素
list.add("aaa");
System.out.println(list);//[aaa]
list.add("bbb");
list.add("ccc");
list.add("ddd");
System.out.println(list);//[aaa, bbb, ccc, ddd

//删除元素
list.remove("aaa");
System.out.println(list);//[bbb, ccc, ddd
list.remove(2);
System.out.println(list);//[bbb, ccc

//修改元素
list.set(0,"aaa");
System.out.println(list);//[aaa, ccc

//查找元素
String str = list.get(1);
System.out.println(str);//ccc
int sz = list.size();
System.out.println(sz);//2
```

基本数据类型对应包装类:
**byte - Byte**
**short - Short**
**char - Character**
**int - Integer**
**long - Long**
**float - Float**
**double - Double**
**boolean - Boolean**

```java
//创建集合
ArrayList<Integer> list = new ArrayList<>();

//Integer: int 的包装类 -Intege
//添加元素
list.add(1);
list.add(2);
list.add(3);
list.add(4)

//遍历集合
//System.out.println(list);//[1,2,3,4
System.out.print("[");
for (int i = 0; i < list.size(); i++) {
    if(i == list.size() - 1){
        System.out.print(list.get(i));
    }else {
        System.out.print(list.get(i) + ",");
    }
}
System.out.print("]");
//[1,2,3,4]

//创建自定义类型元素 - Student
ArrayList<Student> list = new ArrayList<>()
Student s1 = new Student("zhangsan",18);
Student s2 = new Student("lisi",20);
Student s3 = new Student("dongjiancheng",60);

list.add(s1);
list.add(s2);
list.add(s3);
System.out.println(list);
//[com.Knowledge.ArrayList.Student@6acbcfc0,
// com.Knowledge.ArrayList.Student@5f184fc6,
// com.Knowledge.ArrayList.Student@3feba861]

//遍历
for (int i = 0; i < list.size(); i++) {
    Student stu = list.get(i);
    System.out.println("第" + i + "个:" + "姓名:" + stu.getName() + "年龄:" + stu.getAge());
}
//第0个:姓名:zhangsan年龄:18
//第1个:姓名:lisi年龄:20
//第2个:姓名:dongjiancheng年龄:60
```

---

## 面向对象进阶

### static

**static - 静态变量 - 修饰符 - 可以修饰成员方法 - 成员变量**

```java

//创建一个学生对象
private String name;
private int age;
 */
//创建学生对象
student s1 = new student();
s1.setName("zhangsan");
s1.setAge(18);
//s1.show()
student s2 = new student();
s2.setName("lisi");
s2.setAge(23);
//s2.show()

//现在加一个老师的姓名要给老师赋值
s1.teacherName = "李老师";
s2.teacherName = "李老师";
s2.show();
s1.show();

//但是现实是,一个班的学生共享一个老师
//只要在student类中public String techername; 加上 static修饰 public static Strintechername;
//这个成员变量就会被共享,赋值一次就行
//设置静态成员变量:类名.成员变量 = "";就行
student.techername = "李老师";
s1.show();//zhangsan18李老师
s2.show();//lisi23李老师
```

**被static修饰的变量叫静态变量**
>特点:
>1. 被该类中所有对象共享
>1. 不属于对象属于类
>2. 随之类的加载而加载,优先于对象存在

**被static修饰的方法叫静态方法:**
>特点:
>1. 多用于测试类和工具类中
>2. javabean类很少会用

* 工具类:
  * javabean类: 涌来描述一类事物的类,比如student,car...
  * 测试类: 用来检查其他类是否书写正常,带有main方法的类,是程序的入口  
  * 工具类: 不是用来描述一类事物的类,而是帮我们做一些事情的类
    >工具类要见名知意
私有化构造方法
方法都定义成静态的
-就是一些方法的集合,如定义一个math类,里面有加.减.乘.除4个方法
如``public static int add(int a , int b){
    return a + b;
}``
这样在其他类中就可以直接``math.add(a , b);``
这样调用了,更方便

* static注意事项:
    **静态方法只能访问静态的变量和静态方法**
    **非静态方法 可以 访问静态变量或者静态方法 ,也可以访问非静态的成员变量和非静态成员法**
    **静态方法中是没有this关键字的**

---

### 继承  

**面向对象的三大概念:封装,继承,多态**  

* 继承:  - 类和类的父子概念
>比如定义三个类,person,student,teacher studentteacher类都属于是person,
所以可以说person类是student和teacher类的爸爸,只在person类中定义过的,student和teacher就不用定义了这就叫继承
* 用extends - 关键字 - 可以让一个类和另一个类建立继关系
``public class Student extends Person{}``
* Student称为子类(派生类),Person被称为父类(基类或者类)
* 使用继承的好处:
    * 可以把多个子类中重复的代码抽取到父类中,提升代码的复用性
    * 子类可以在父类的基础上,增加其他的功能,使子类更强大
* 继承的特点:
    * java只支持单继承,不支持多继承,但是支持多层继承
    * 单继承:一个子类只能只能继承一个父类
    * 多层继承:
       >子类A继承父类B,父类B 可以继承 父类C
            则子类A与C是 间接父类关系
            子类A与B是 直接父类关系

**每一个类都直接或者间接的继承于 Object**  

| ### | 非私有 | private |
| --- | --- | --- |
| 构造方法 | 不能 | 不能 |
| 成员变量 | 能 | 能 |
| 成员方法 | 能 | 不能 |

```java
student s1 = new student();
s1.age = 12;
s1.name = "zhangsan";
s1.people()
teacher t1 = new teacher();
t1.age = 34;
t1.name = "lilaoshi";
t1.people();*/
//当父类的成员变量用private修饰后字类就无法访问了
//就会报错age name 在 com.Knowledge.ObjectOientedAdvanced.Personprivate 访问控制
```

* 继承中:构造方法的访问特点
  1. 父类中的构造方法不会被子类继承
  2. 子类中所有的构造方法默认先访问父类中的无参构造,再执行自己
* 如何调用父类的构造方法:
  1. 子类构造方法的第一行默认嗾使:super(), 不写也存在,且必须在第一行
  2. 如果想调用父类有参构造,必须手动写super进行调用

```java
public class FU {
    String name;
    int age
    //空参构造
    public FU()
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
//这样子类的有参构造会先调用父类的有参构造,然后再传回来
```

---

### 就近原则

就近原则:谁谁离我进,我就用谁

* 如果不加关键字:就是谁近先用谁
* this :访问同类中的
* supper:访问父类中的

```java
//父类
public class Fu {
String name = "FU";

//子类
public class Zi extends Fu{
String name = "ZI";
public void zishou(){
String name = "zishou";
System.out.println(name);//---zishou---
 System.out.println(this.name);//---ZI---
 System.out.println(super.name);//---FU---
```

---

### @overdrive

* @overdrive - 对父类的方法进行重写
    > 子类如果继承了父类的方法,如果想对其重写
    只要在上方加上@overdrive就可以了

```java
@Override
public void eat(){
    System.out.println("吃剩饭");
}
```
   就可以了
* 重写的要求:
   1. 重写方法的名称 ,形参,返回值必须要和父类的一致
   2. 子类重写父类的方法时,访问权限必须大于等于父类,
   3. 子类重写父类方法时,返回值类型子类必须小于等于父类
   4. 建议:重写的方法尽量和父类保持一致
   5. 只有被添加到虚方法表的方法猜能被重写
        - 被private修饰的...
        - 被static修饰的...
        - 被final修饰的...

---

### 多态

* 多态 - 同类型的对象,变现出的不同形态
**表现形式:父类类型 对象名称 = 子类对象;**
* 前提条件:
    >1.有继承或者实现关系  
    2.有父类引用指向子类对象     
    3.有方法重写
---
* 多态调用成员的特点:
    * 成员变量调用:
        >1. **编译看左边,运行也看左边**
        >>编译看左边:java编译代码的时候,会看左边父类中有没有这个变量,如果有,编译成功,如果没有编译失败
        运行也看左边:java代码运行的时候,实际获取的就是左边父类中成员变量的值
        >2. **成员方法调用:编译看左边,运行看右边**
                >>编译看左边:java编译代码的时候,会看左边父类中有没有这个方法,如果有,编译成功,如果没有编译失败
                运行也看左边:java代码运行的时候,实际运行的是子类中的方法  

        >比如:Person p = new Student();
        调用成员变量的时候,p 属于 Person 所以会从 父类 中的成员变量中找 , 就跟Student p = new Student();会从Student 中找一样
        但在调用成员方法的时候,有于把Person的虚方法表也继承下来了,所以是会调用父类的虚方法,但是子类把虚方法表给@Overdive重写了所以调用的是他自己的
    * 多态的优势:
    >1. 在多态形式下,右边对象可以实现解耦合,便于扩展和维护
            如:原 - Person p = new Student();
                    p.show();
              修改:直接Person p = new Teacher(); - 改成另一个类就行了
              此时的p.show就会调用Teacher的方法
    >2. 定义方法的时候,使用父类作为参数,可以接受所以子类的对象,体现多态的扩展性与便利
    * 多态的劣势:
    > 1. 不能调用子类的特有功能
            因为多态调用方法的时候要遵循编译看左边,运行看右边
            但父类中没有子类特有的方法,所以会把偶从
      * 多态劣势解决方法:
            强制转换就行了
            Person p = new Student();
            Student s = (Student) p;//强制转换
            转换的时候用instanceof关键字进行判断
            p instanceof Student - 判断p能不能转换成Student类型 能(返回true) 不能(返回false)

---

### 包

* 包就是文件夹,用来管理各种不同功能的java类,方便后期代码维护
* 包名的规则:公司域名反写 + 包的作用 , 其余全部英文小写 ,见名知意.
* 使用其他类时,需要使用全类名

**全类名 = 包名 + 类名**

* 使用其他类了的规则:
    >1.使用同一个包中的类时,不需要导包
    >2.使用java.lang包中的类时,不需要导包
    >3.其他情况都要导包
    >4.如果同时使用两个包中的同类名,需要用全类名

---

### final

* final - 最终的
* final方法:表示该方法时最终方法,不能被重写
* final类:表示该类时最终类,不能被继承
* final变量:叫做常量,只能被赋值一次

```java
public static void main(String[] args) {
        final int a = 10;
        System.out.println(a); 
        //a = 100;错误只能赋值一次  
    }
```

* 常量的命名规范:
    >1.单个单词:全部大写
    >2.多个单词:全部大写,单词之间用下划线隔开
* 细节
    > final修饰的变量是基本类型:那么变量存储的数据值不能发生改变
    > final修饰的变量是引用类型:那么变量存储的地址值不能发生改变,对象内部可以变

---

### 权限修饰符

* 权限修饰符
    >用来控制一个成员能被访问到的范围
    >可以修饰成员变量,方法,构造方法,内部类.
* 有4种权限修饰符
**private < 空着不写(缺省/默认) < protected < public**

| 修饰符 | 同一个类 | 同一个包中其他类 | 不同包下的子类 | 不同包下的无关类 |
| --- | :---: | :---: | :---: | :---: |
| private | # |  |  |  |
| 空着不写 | # | # |  |  |
| protected | # | # | # |  |
| public | # | # | # | # |

* 权限修饰符的使用规则
  * 成员变量私有
  * 方法公开  
  * 特例:如果方法中的代码是抽取其他方法中共性代码,这个方法一般也私有'

---

### 代码块

* 局部代码块
  
```java
public static void main(){
    //代码块开始
    {
        int a = 10;
        System.out.println(a);
    }
    //当代码块结束时,变量的生命周期结束,从内存中消失
}
```

* 构造代码块
    1. 写在成员位置的代码块
    2. 作用:可以把多个构造方法中的代码方法中重复的代码抽取出来
    3. 执行时机:我们在创建本类对象的时候会先执行构造代码块再执行构造方法

* 静态代码块
    > 格式:static{}
    > 特点:需要通过static关键字修饰,随着类的加载而加载,并且自动触发,**只执行一次**
    > 使用场景:在类加载的时候,做一些数据初始化的时候使用

```java
 User user = new User();
    //比如在有用户注册登录的模块时可以使用
    //静态代码块开始
    static{
        User("admin","123456");
    }
    //静态代码块结束
    //这样就初始化了一个账户
    //admin 123456
```

---

### 抽象类和抽象方法

* 抽象方法:
  * 将**共性**的行为(方法)抽取到父类之后
  * 由于每一个子类执行的内容是不一样的
  * 所以,在父类中不能确定具体的方法体.
  * 该方法就可以定义为抽象方法
* 抽象类
  * 如果一个类中存在抽象方法,那么该类就必须声明为抽象类  
*  
* 抽象方法定义格式:
``public abstract 返回值类型 方法名(参数列表);``
* 抽象类的定义格式:
``public abstract class 类名{}``

* 注意事项:
  * 抽象类不能实例化
  * 抽象类中不一定有抽像方法,有抽象方法的类一定是抽象类
  * 可以有构造方法
  * 抽象的子类
    1. 要么重写抽象类中的所有抽象方法
    2. 要么是抽象类

```java
//这是抽象类(父类)
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //抽象方法
    public abstract void Eat();

    //具体方法
    public void Drink(){
        System.out.println("喝水");
    }
}


//这是子类1
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat(){
        System.out.println("狗吃骨头");
    }
}

//子类2
public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat(){
        System.out.println("羊吃草");
    }
}

//测试

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Eat();//狗吃骨头
        d.Drink();//喝水
        Frog f = new Frog();
        f.Eat();//青蛙吃虫子
        f.Drink();//喝水
        Sheep s = new Sheep();
        s.Eat();//羊吃草
        s.Drink();//喝水
    }
}
```

* 抽象类的意义就是为其提供标准

---

### 接口

**接口就是一种规则,是对行为的抽象**

> 假如有有3种动物兔子,青蛙,狗
> 但是狗和青蛙会游泳,而兔子不会
> 但是又要定义一个Animal类(父类),3个动物都要继承这个父类,
> 但是游泳这个方法兔子是不能继承的,所以就有了接口
> 只要定义一个接口类
> 青蛙和狗接入了这个接口,就继承了游泳的方法,
> 而兔子没接入,兔子没有这个方法  

* 定义一个接口:
  * 接口用关键字interface来定义
  * ``public interface 接口名字{}``
* 如何使用:
  * 接口不能实例化
  * 
  * 接口和类之间是实现关系,通过implements关键字表示
  * ``public class 类名 implements 接口名{}``
  * 
  * 接口的子类(实现类)
    * 1. 要么重写接口中所有抽象方法
    * 2. 要么是抽象类
* 注意:
  * 1. 接口和类之间是实现关现关系,可以单实现,也可以多实现
  * ``public class 类名 implements 接口名1 , 接口名2 , .... {}``
  * 2. 实现类还可以继承一个类的同时实现多个接口
  * ``public class 类名 extends 父类 implements 接口名1 , 接口名2 , .... {}``

```java
//接口的定义
public interface swim {
    //接口抽象方法
    public abstract void swim();
}

public class Frog extends Animal implements swim{
    //extends Animal - 继承Animal
    //implements swim - 接入swim接口
    
    public Frog(){

    }
    public Frog(String name , int age){
        super(name,age);
    }

    //重写接口
    @Override
    public void swim(){
        System.out.println("青蛙会游泳");
    }
}

//测试
public static void main(String[] args) {
    Frog f = new Frog();
    f.swim();//青蛙会游泳

}
```

* 接口成员的特点
  * 成员变量
    * 1. 只能是常量
    * 2. 默认修饰符:``public static final``
  * 构造方法
    * 没有
  * 成员方法
    * 值能是抽象方法
    * 默认修饰符:``public abstract``
  * ==JDK7以前==:接口只能定义抽象方法
  * ==JDK8的新特性==:接口可以定义有方法体的方法
  * ==JKD9的新特性==:接口可以  
* 接口和类之间的关系
  * 类和类的关系
    >继承关系,只能单继承,不能多继承,但是可以多层继承
  * 类和接口的关系
    >实现关系,可以单实现,也可以多实现,还可以在继承一个类的同时实现多个接口
  * 接口和接口的关系
    >继承关系,可以单继承,也可以多继承

* JDK8开始接口新增的方法
  * JDK7以前:接口只能定义抽象方法
  * JDK8新特性:接口可以定义有方法体的方法.(默认,静态)
  * JDK9的新特性:接口可以定义私有方法

* JDK8以后接口中新增的方法
  * 允许在接口中定义默认方法,需要使用``static``修饰
    >作用:解决接口升级的问题
  * 接口中**默认方法**的定义格式
    * 格式:``public default 返回值类型 方法名(参数列表){ }``
    * 范例:``public default void show() { }``
  * 接口中默认方法的注意事项
    * 默认方法不是抽象方法,所以不强制被重写,但是如果被重写,重写的时候去掉``default``关键字
    * ``public``可以省略,``static``不能省略
    * 如果实现了多个接口,多个接口中存在相同名字的默认方法,子类就必须对该方法进行重写
    * 静态方法只能通过接口名调用,不能通过实现类名或者对象名调用
* JDK9新增的方法
  * 几口中私有方法的定义格式:
    * 格式:``private 返回值类型 方法名(参数列表){ }``
    * 范例:``private void show``
    * 格式2:``private static 返回值类型 方法名(参数列表){ } ``
    * 范例2:``private static void method(){ }``
* 适配器适配模式
  * 简单理解就是各种套路
  * **解决了接口与接口实现类之间的矛盾问题**
---

### 内部类
* 类的五大成员
  * >属性,方法,构造方法,代码块,内部类
* 什么是内部类?
  * 在一个类的里面,再定义一个类.
```java
//举例:在A类的内部定义B类,B类就被称为内部类
public class Outer{//外部类
    public class Inner{//内部类

    }
}

public class Test {//外部其他类
    public static void main(String[] args){

    }
}
```

* 为什么要学习内部类?
  * >需求:写一个javaBean类描述汽车
   属性:汽车的平牌,车龄,颜色,发动机平牌,发动机转速,发动机马力,发动机使用年限
   
```java
public class Car{
    String carName;
    int carAge;
    int carColor;
    //此时发动机可以单独写个类
    class Engine{//内部类
        String engineName;
        int engineAge;
        double engineHorsepower;
        int engineSpeed;
    }
}
```
* 内部类
  * 内部类的访问特点
    * 内部类可以直接访问外部类的成员,包括私有
    * 外部类要访问内部类的成员,必须创建对象
* 内部类的分类
    * 1. 成员内部类
```java
public class Out {
    int age = 3;
    class In {
        public void show(){
            Out o = new Out();
            System.out.println(o.age);
        }       
    }

}

public static void main(String[] args) {
        Out.In oIn = new Out().new In();//通过这种方式获取成员内部类的对象
        oIn.show();
           
}
```
```java
public class Outer {
    private int a = 10;

    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            Outer out = new Outer();
            System.out.println(out.a);//10
            System.out.println(Outer.this.a);//10
            System.out.println(this.a);//20
            System.out.println(a);//30

        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.Inner oin = new Outer().new Inner();
        oin.show();
    }
}
```
  * 2. 静态内部类
    * 静态内部类只能访问外部的静态变量和静态方法,如果想访问非静态的需要创建对象
    * 创建静态内部类对象的格式:``外部类名.内部类名 对象名 = new 外部类名.内部类名();``
    * 调用符静态方法格式:先创建对象
    * 调用静态方法的格式:``外部类名.内部类名.方法名();``
```java
//创建方法
public class Car{//外部类
    String name;
    int age;

    static class Engine{//静态内部类
        String engineName;
        int engineAge;
    }
}
```
```java

```
  * 3. 局部内部类
```java


```
  * 4. 匿名内部类
```java


```
