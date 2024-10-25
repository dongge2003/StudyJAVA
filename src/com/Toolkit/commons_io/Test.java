package com.Toolkit.commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        commons-io 是 apache 开源基金组织提供的一组有关IO操作的开源工具包
        作用: 提高io流的开发效率
         */

        //例如:用工具包里的方法复制文件夹
        File src = new File("C:\\Users\\dong\\Desktop\\commons-io-2.17.0");
        File dest = new File("C:\\Users\\dong\\Desktop\\copy");

        FileUtils.copyDirectory(src, dest);
    }
}
