package com.IO.OutInputStream.Demo03;

import javax.crypto.Cipher; // 用于加密和解密的类
import javax.crypto.spec.SecretKeySpec; // 将字节数组转换为密钥的类
import java.util.Base64; // 用于Base64编码和解码的类

public class AES {
    public static void main(String[] args) throws Exception {
        /*
        AES加密算法(对称式加密算法)
            对称式加密算法,即加密与解密共用一个秘钥
            非对称式加密算法,有公钥和私钥
         */



        // 要加密的字符串
        String input = "Hello世界";

        // AES 密钥，必须是16字节长度
        String key = "1234567890123456";

        // 调用加密方法
        String encrypted = encrypt(input, key);
        // 打印加密后的结果
        System.out.println("加密后: " + encrypted);

        // 调用解密方法
        String decrypted = decrypt(encrypted, key);
        // 打印解密后的结果
        System.out.println("解密后: " + decrypted);
    }

    // AES加密方法
    public static String encrypt(String data, String key) throws Exception {
        // 创建一个SecretKeySpec对象，将密钥转换为AES所需的格式
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        // 获取AES加密/解密实例
        Cipher cipher = Cipher.getInstance("AES");

        // 初始化加密模式，传入密钥
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // 执行加密操作，将输入数据加密为字节数组，使用UTF-8编码
        byte[] encryptedBytes = cipher.doFinal(data.getBytes("UTF-8"));

        // 将加密后的字节数组使用Base64编码成字符串，方便传输和存储
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // AES解密方法
    public static String decrypt(String encryptedData, String key) throws Exception {
        // 创建一个SecretKeySpec对象，将密钥转换为AES所需的格式
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        // 获取AES加密/解密实例
        Cipher cipher = Cipher.getInstance("AES");

        // 初始化解密模式，传入密钥
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // 执行解密操作，首先使用Base64解码，然后将其解密为原始字节数据
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));

        // 将解密后的字节数组使用UTF-8编码转换为字符串并返回
        return new String(decryptedBytes, "UTF-8");
    }
}
