package com.IO.ConversionStream.Demo02;

import java.io.*;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws IOException {
        //将本地文件的GBK编码类型的文本文件 转成 UTF-8
        //D:\CODE\java\javase\test\src\com\IO\ConversionStream\Demo02\GBK-UTF.txt

        String FilePath = "D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\ConversionStream\\Demo02\\GBK-UTF.txt";
        String targetFilePath = "D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\ConversionStream\\Demo02\\UTF-8-Converted.txt";
        String originCharSet = "GBK";
        String newCharSet = "UTF-8";

        EncodingConversion(FilePath, targetFilePath, originCharSet, newCharSet);



    }

    public static void EncodingConversion(String FilePath, String targetFilePath, String originCharSet, String newCharSet) throws IOException {
        FileReader fileReader = new FileReader(FilePath, Charset.forName(originCharSet));
        FileWriter fileWriter = new FileWriter(targetFilePath, Charset.forName(newCharSet));

        int ch;
        while ((ch = fileReader.read()) != -1){
            fileWriter.write(ch);
        }
        fileWriter.close();
        fileReader.close();



    }
}
