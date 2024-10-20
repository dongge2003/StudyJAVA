package com.IO.OutInputStream.Demo03;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

    private final static String key = "1234567890123456"; // AES 密钥，必须是16字节长度

    public static void main(String[] args) throws Exception {
        /*
        填充（Padding）的主要目的是为了让数据长度满足加密算法的块大小要求。
        块加密算法（如 AES、DES）要求输入的数据长度必须是固定的块大小（block size）
        例如 AES 的块大小是 16 字节。如果输入数据的长度不是块大小的整数倍，算法就无法处理剩余的部分，因此需要使用填充机制来补足数据。


        填充机制（Padding Scheme）用于处理加密算法中数据块不满的问题。
        对于块密码算法（如 AES），数据需要按固定长度的块进行加密和解密。在 AES 中，每个块的大小为 16 字节。
        如果要加密的数据长度不是 16 字节的倍数，就需要通过填充机制来补足数据，使其长度成为块大小的整数倍。
         */


        // MP3 文件路径
        String originalFilePath = "D:\\新建文件夹\\New Boy - 房东的猫.mp3";
        String encryptedFilePath = "C:\\Users\\dong\\Desktop\\加密文件.mp3";
        String decryptedFilePath = "C:\\Users\\dong\\Desktop\\解密文件.mp3";

        // 加密文件
        encryptFile(originalFilePath, encryptedFilePath, key);

        // 解密文件
        decryptFile(encryptedFilePath, decryptedFilePath, key);
    }

    // 加密文件
    public static void encryptFile(String inputFile, String outputFile, String key) throws Exception {
        // 使用字节流读取二进制文件
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        // 创建AES密钥
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        // 获取Cipher实例并初始化为加密模式
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // 读取文件并加密
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            byte[] output = cipher.update(buffer, 0, bytesRead);
            if (output != null) {
                fos.write(output);
            }
        }
        byte[] outputBytes = cipher.doFinal(); // 加密最后的块
        if (outputBytes != null) {
            fos.write(outputBytes);
        }

        // 关闭流
        fis.close();
        fos.close();
    }

    // 解密文件
    public static void decryptFile(String inputFile, String outputFile, String key) throws Exception {
        // 使用字节流读取二进制文件
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        // 创建AES密钥
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        // 获取Cipher实例并初始化为解密模式
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // 读取文件并解密
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            byte[] output = cipher.update(buffer, 0, bytesRead);
            if (output != null) {
                fos.write(output);
            }
        }
        byte[] outputBytes = cipher.doFinal(); // 解密最后的块
        if (outputBytes != null) {
            fos.write(outputBytes);
        }

        // 关闭流
        fis.close();
        fos.close();
    }
}
