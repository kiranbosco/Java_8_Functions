package com.preparation;

public class SingleToneDesingPattern {

    // private constructor
    //static instance
    private static SingleToneDesingPattern instance;

    //private constructor
    private SingleToneDesingPattern() {
    }

    //public instance
    public static final SingleToneDesingPattern getInstance() {
        if (instance == null) {
            return instance = new SingleToneDesingPattern();
        }
        return instance;
    }

    public static void main(String[] args) {
    }
}
