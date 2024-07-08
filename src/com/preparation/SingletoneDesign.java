package com.preparation;

public class SingletoneDesign {

    public void test(){
        int a =5;
        int b=10;
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        SingleToneDesingPattern desingPattern = SingleToneDesingPattern.getInstance();

        System.out.println(desingPattern.hashCode());

        SingleToneDesingPattern desingPattern1 = SingleToneDesingPattern.getInstance();
        System.out.println(desingPattern1.hashCode());
    }
}
