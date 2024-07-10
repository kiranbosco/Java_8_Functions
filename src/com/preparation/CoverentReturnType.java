package com.preparation;
public class CoverentReturnType {

    //    Both class methods have different return type but it is method overriding.
//    This is known as covariant return type.
    public CoverentReturnType get() {
        return this.get();
    }
}
class CoverentReturnTypeInfor extends  CoverentReturnType{

    public CoverentReturnTypeInfor get(){
        return this.get();
    }
    void message(){
        System.out.println("Coverent Retrun type overridden");
    }

    public static void main(String[] args) {
        new CoverentReturnTypeInfor().message();
    }
}
