package com.Knowledge.String;

public class Knowledge {
    public static void main(String[] args) {
        /*//1.使用直接赋值的方式获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new的方式来获取一个字符串对象
        //空参构造: 可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");//@  !:s2的值为空' '(空格)

        //有参构造:
        //传递一个字符串,根据传递的字符串内容创建一个字符串对象
        String s3 = new String("abc");
        System.out.println(s3);//abc

        //传递一个字符串数组,根据字符串数组的内容再创建一个新的字符串对象
        //需求:要修改字符串的内容  abc 变成 qbc
        //先把abc 变成{abc}字符串 在修改qbc
        char[] arr = {'a','b','c','d'};
        String s4 = new String(arr);
        System.out.println(s3);//abcd

        //创建一个字符数组,根据字节数的内容再创建一个新的字符串对象
        //应用场景,在网络中传输的数据都是字节信息
        //我们要把字节信息进行转换,转成字符串,就要用到这个了
        byte[] arrby = {97,98,99,100,101};
        String s5 = new String(arrby);
        System.out.println(s5);//abcde*/




        //String类
        //比较字符串
            //boolean equals(要比较的字符串) 不忽略大小写
            //boolean equalsIgnoreCase(要比较的字符串)  忽略大小写得比较
        /*String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true

        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s3 == s4);//false*/
        /*
        ==号:
            如果比较 基本数据类型(int double ..)比的是 数据值
            如果比较 是引用数据类型比的是 地址值

            而String s1 = "abc";
            而String s2 = "abc";
            这种直接赋值的 如果在 串池中 有"abc" 则s2也用s1的地址
         */

        /*String s1 = "abc";
        String s2 = "ABC";
        String s3 = new String("abc");
        String s4 = "fallg";
*/
        //不忽略大小写 - equals
        /*boolean r1 = s1.equals(s2);
        System.out.println(r1);//false

        boolean r2 = s1.equals(s3);
        System.out.println(r2);//true

        boolean r3 = s1.equals(s4);
        System.out.println(r3);//false

        boolean r4 = s3.equals(s4);
        System.out.println(r4);//false*/


        //忽略大小写 -
       /* boolean r1 = s1.equalsIgnoreCase(s2);
        System.out.println(r1);//true*/


        /*//如果用键盘录入一个abc和abc用==号会判断相等吗
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "abc";
        if(s1 == s2){
            System.out.println("相等");
        }else {
            System.out.println("不想等");
        }
        //结果是不想等,所以两个的地址不同*/




        //字符串

        //字符串遍历:
        //public char charAt(int index); 根据索引返回字符串 (跟数组的索引一样从0开始)
        //public int length(); 返回字符串的长度
            //数组的长度: 数组名.length - 属性
            //字符串的长度: 字符串对象.length() - 方法


        //字符串截取:
            //**.substring()
        /*String s = "dongjiancheng";
        //d o n g j i a n c h  e  n  g
        //0 1 2 3 4 5 6 7 8 9 10 11 12
        String dong = s.substring(0,4);
        System.out.println(dong);
        String jian = s.substring(4,8);
        System.out.println(jian);
        String cheng = s.substring(8,s.length());
        System.out.println(cheng);*/




        //StringBuilder类
            //public StringBuilder append(任意类型) - 添加数据,并返回对象本身
            //public StringBuilder reverse() - 反转容器中的内容
            //public int length() - 返回长度(字符出现的个数)
            //public String toString() - 通过toString()就可以实现把StringBuilder转换成String

        /*//创建对象
        *//*StringBuilder sb = new StringBuilder();
        Knowledge k1 = new Knowledge();
        System.out.println(sb);//而这个没地址
        System.out.println(k1);//com.test.String.Knowledge@7b23ec81*//*

        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);//abc

        //添加元素
        sb.append(1);
        sb.append(3.14);
        sb.append('a');
        sb.append("dong");
        System.out.println(sb);//abc13.14adong

        //反转
        sb.reverse();
        System.out.println(sb);//gnoda41.31cba

        //获取长度
        int len = sb.length();
        System.out.println(len);//13

        //通过toString()就可以实现把StringBuilder转换成String类
        String str = sb.toString();//这样就变成了字符串
        String out = str.substring(3,5);//就可以用String类中的方法
        System.out.println(out);//da*/





        //链式编程:
        //当我们在调用一个方法的时候,不需要用变量接受他的结果,可以继续调用其他方法
        /*StringBuilder sb = new StringBuilder();
        int len = sb.append(1).append(3.14).append("ajgljaljgs").reverse().length();
        //这里在这个容器中加入1 3.14 ahgahgl 然后反转 然后计算大小 赋值给 len
        System.out.println(len);*/





        //StringJoiner
            //public StringJoiner (间隔符号) - 创建一个StringJoiner对象,指定拼接时的间隔符号
            //public StingJoiner(间隔符号,开始符号,结束符号) - 创建一个StringJoiner对象,指定拼接时的间隔符号
        //成员方法:
            //public StringJoiner add() - 添加数据,并返回对象本身
            //public int length() - 返回长度
            //public String toString() - 返回字符串


        //拼接1000000个字符串
        /*StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 1000000 ; i++){
            sb.append("abc");
        }
        System.out.println(sb);*/
        //但是要拼接时加条件就复杂了,麻烦所以

        /*//创建对象
        StringJoiner sj = new StringJoiner(",","[","]");

        //添加内容
        String str = sj.add("abc").add("xyz").toString();

        System.out.println(str);//[abc,xyz]*/






    }
}
