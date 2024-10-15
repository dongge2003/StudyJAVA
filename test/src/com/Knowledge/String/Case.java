package com.Knowledge.String;

public class Case {
    public static void main(String[] args) {
        /*
        已知正确的用户名和密码,实现模拟登录,给三次机会
        admin
        dongjiancheng
         */
        /*String user = "admin";
        String passkey = "dongjiancheng";

        Scanner sc = new  Scanner(System.in);

        for (int i = 0 ; i < 4;i++){
            if(i == 3){
                System.out.println("已超过次数");
            }
            else {
                System.out.printf("请输入用户名:>");
                String inputuser = sc.nextLine();
                System.out.printf("请输入密码:>");
                String inputpasskey = sc.nextLine();

                if(user.equals(inputuser) && passkey.equals(inputpasskey)){
                    System.out.println("密码输入正确");
                    break;
                }
                else {
                    System.out.println("账户或者密码错误");
                }
            }
        }*/





        /*
            字符串的遍历,输出每一个字符,和长度
         */
        /*Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cont = 0;
        for(int i = 0;i < s.length();i++){
            System.out.println(s.charAt(i));
            cont++;
        }
        System.out.println("字符串长度为:" + cont);
*/




        /*
        输入一串字符串,判断大写有几个,小写有几个,数组有几个
         */
        /*Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int bigStr = 0;
        int smallStr = 0;
        int num = 0;

        //A-Z:65 - 90  ; a-z:97 - 122  ; 0-9:48 - 57
        char fors;
        for(int i = 0;i < s.length();i++){
            fors = s.charAt(i);
            if(fors >= 65 && fors <= 90){
                bigStr++;
            }
            else if(fors >= 97 && fors <= 122){
                smallStr++;
            }
            else {
                num++;
            }
        }
        System.out.println("大写有:" + bigStr + "小写有:" + smallStr + "数字有:" + num);*/




        /*
         字符串的拼接,遍历一个数组,把他拼接成一个字符串
         {1,2,3,4}
         [1234]
         */
        /*int arr[] = {1,2,3,4};
        String str = "[";

        for (int i = 0 ; i < arr.length ;i++){
            str += arr[i];
        }
        str += "]";
        System.out.println(str);*/




        /*
        字符串反转,输入abc,输出cba
         */
        /*Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String out = "";

        for(int i = input.length() ; i > 0 ; i--){
            out += input.charAt(i-1);//小心越界
        }
        System.out.println("倒转后:" + out);*/





        /*
            金额转换:
            输入:2345
            输出:零百零拾万贰千三佰四拾俉圆
             百 万 千 佰 拾 圆
         */
/*        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入金额:>");
        String input = sc.nextLine();

        String arr[] = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

        String out = "";
        for(int i = 0 ; i < input.length() ; i++){
            switch (input.charAt(i)){
                case '0':
                    out += arr[0];
                    break;
                case '1':
                    out += arr[1];
                    break;
                case '2':
                    out += arr[2];
                    break;
                case '3':
                    out += arr[3];
                    break;
                case '4':
                    out += arr[4];
                    break;
                case '5':
                    out += arr[5];
                    break;
                case '6':
                    out += arr[6];
                    break;
                case '7':
                    out += arr[7];
                    break;
                case '8':
                    out += arr[8];
                    break;
                case '9':
                    out += arr[9];
                    break;
            }
        }

        String ping = "";
        for(int i = 0 ; i < 6 - out.length() ; i++){
            ping += arr[0];
        }
        ping += out;
        System.out.printf("%c 百 %c 万 %c 千 %c 百 %c 拾 %c 圆",ping.charAt(0),
        ping.charAt(1) , ping.charAt(2),ping.charAt(3),ping.charAt(4),
        ping.charAt(5));*/




        /*
        手机号码屏蔽 135 **** 7628
         */
        /*Scanner sc = new Scanner(System.in);
        String tele = sc.nextLine();
        if(tele.length() != 11){
            System.out.println("号码错误");
        }
        else {
            String qin = tele.substring(0,3);
            String hou = tele.substring(7,tele.length());
            String mid = "****";
            String result = "";
            result = qin + " " + mid + " " + hou;
            System.out.println(result);
        }*/




        /*
        省份证号码信息提取
        411 627 20030606 4813
        生日:
        性别:
        //A-Z:65 - 90  ; a-z:97 - 122  ; 0-9:48 - 57

         */
        /*Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();


        String birthdayYear = id.substring(6,10);
        String birthdayMon = id.substring(10,12);
        String birthdayDay = id.substring(12,14);
        System.out.println("生日:" + birthdayYear + birthdayMon + birthdayDay);

        char sex = id.charAt(16);

        if((int)sex % 2 != 0) {
            System.out.println("性别:男");
        }
        else {
            System.out.println("性别:女");
        }*/




        /*
        判断一串字符串是不是回文字符串
        112211 是
        12344321 是
        123432 不是
         */
        /*Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //
        StringBuilder sb = new StringBuilder(input);
        String end = sb.reverse().toString();//链式编程,先反转在转换成String类
        if(input.equals(end)){
            System.out.println("是回文字符串");
        }
        else {
            System.out.println("不是回文字符串");
        }*/





        /*

         */
    }
}
