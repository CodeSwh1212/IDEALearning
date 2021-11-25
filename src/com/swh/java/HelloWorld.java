package com.swh.java;

import java.util.ArrayList;

public class HelloWorld {

    //prsf
    private static final int INT = 0;
    //psf
    public static final int i = 0;
    //psfi
    //psfs
    public static void main(String[] args) {//psvm
        System.out.println("helloworld");
        System.out.println();//sout
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("HelloWorld.main");//soutm方法名
        int num=10;
        System.out.println("num = " + num);//soutv变量名  就近原则

        //fori 生成for循环
        for (int i = 0; i <10 ; i++) {
            
        }
        //iter  增强for循环
        for (String arg : args) {
            
        }
        //list.for 列表循环遍历
        ArrayList list = new ArrayList();

        for (Object o : list) {
            
        }
        //list.fori 从头到尾
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }


    }

}
