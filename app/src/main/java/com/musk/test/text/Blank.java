package com.musk.test.text;

/**
 * 判断字符串是否包含空格
 */
public class Blank {

    public static void main(String[]args){
        String test="abcdef";
        System.out.println("====check_blank:"+checkBlank1(test));
    }

    private static int checkBlank1(String str) {
        return str.lastIndexOf(" ");
    }
}
