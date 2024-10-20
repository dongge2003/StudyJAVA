package com.IO.BufferStream.Demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
        控制软件运行次数:
            前3次免费运行(输出第 i 次运行次软件)
            3次后提示请充值会员使用

            D:\CODE\java\javase\StudyJava\src\com\IO\BufferStream\Demo01\NumberOfRuns.txt
         */


        String NumberRunPath = "D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\BufferStream\\Demo01\\NumberOfRuns.txt";

        //InitNumberOfRuns(NumberRunPath);//重置次数
        run(NumberRunPath);


    }

    public static void run(String NumberRunPath) throws Exception {
        int cont = ReadeNumberOfRun(NumberRunPath);
        if (cont >= 3) {
            System.out.println("请充值会员使用");
            return;
        } else {
            NumberOfRunsAdd(NumberRunPath);
            System.out.println("运行了" + (cont + 1) + "次");
        }
    }

    //读取
    public static int ReadeNumberOfRun(String NumberRunPath)throws Exception{
        FileReader fr = new FileReader(NumberRunPath);

        char[] tmp = new char[1024];
        int num;
        String result = null;
        while((num = fr.read(tmp)) != -1){
            result = new String(tmp, 0, num);
        }
        fr.close();

        return Integer.parseInt(result);
    }

    //增加次数
    public static void NumberOfRunsAdd(String NumberRunPath)throws Exception{
        int runNumber = ReadeNumberOfRun(NumberRunPath) + 1;

        FileWriter fw = new FileWriter(NumberRunPath);

        String write = Integer.toString(runNumber);

        fw.write(write);
        fw.close();
    }

    //初始化
    public static int InitNumberOfRuns(String NumberRunPath)throws Exception {
        FileWriter fw = new FileWriter(NumberRunPath);
        String init = "0";
        fw.write(init);
        fw.close();

        return 0;
    }
}
