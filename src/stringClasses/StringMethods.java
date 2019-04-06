package stringClasses;

public class StringMethods {
    public static void main(String[] args) {

        //CharAt () this method will be return the index of char Value

        String s = "kiran kumar purini";
        char ch = s.charAt(4);
        System.out.println(ch);

        //StringIndexOutOfBoundsException with charAt()
/*
        String s1 = "kiran kumar purini";
        char ch1 =s1.charAt(40);
        System.out.println(ch1); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 40
*/
        //  charAt Length

        String s2 = "purini kiran kumar";
        int ch2 = s2.length();
        System.out.println(s2.charAt(0));

        // subString  this method will be conver the one string to another string in java

        String s3 = "purini";
        String s4 = s3.substring(2, 4);
        System.out.println(s3.substring(2));

        // contain method() this method will check the wether the given context is there or not
        // in the list of object it will be return boolean value

        String s5 = "What dou you know about me";
        boolean s6 = s5.contains("me");
        System.out.println(s6);

// Contains using if condition

        String s7 = "Jesus you are with us ";
        if (s7.contains("Jesus")) {
            System.out.println("He is always be with us");
        } else {
            System.out.println("Na");
        }

        // Joins() this method will be add some thing in ur context exemple show here

        String s8 = String.join("_", "Hello", "_", "how are you");
        System.out.println(s8);

        String s9 = String.join("_", "purini", "_", "heemaja");
        System.out.println(s9);

        //equals method() this method will be comparing tow string values wethere the content are same or not

        String s10 = "kiran";
        String s11 = "kiran";
        String s13 = "kirankumar";
        boolean s12 = s10.equals(s11);
        boolean s14 = s11.equals(s13);
        System.out.println(s14);
        System.out.println(s12);

        // equalsIgnoreCase method this method will be checking the content only wether its upper case or lowercase not an issue here
        String s15 = "vijay";
        String s16 = "Vijay";
        boolean s17 = s15.equalsIgnoreCase(s16);
        System.out.println(s17);

        // same example useing if condition

        String s18 = "Charan";  // because here s18 is the capital words s19 is smal letters thats resion
        String s19 = "charan";
        if (s18.equals(s19)) {
            System.out.println("I found the Result");
        } else {
            System.out.println("sorry");
        }
// same example using the eqals iggnoreCase

        String s20 = "Charan";  // because here s18 is the capital words s19 is smal letters thats resion
        String s21 = "charan";
        if (s20.equalsIgnoreCase(s21)) {
            System.out.println("I found the Result");
        } else {
            System.out.println("sorry");
        }

        // isEmpty method will check the wether the object is empty or consist the some value
        String s22 = "";
        boolean s23 = s22.isEmpty();
        System.out.println(s23);

        String s24 = "I am not Empty";
        boolean s25 = s24.isEmpty();
        System.out.println(s25 + " --------------");

        // here check the length and isEmpty method()

        String s26 = "";
        String s27 = "";
        if (s26.length() == 0 && s27.isEmpty()) {
            System.out.println("Both condition are true");
        } else {
            System.out.println("sorry ur rong");
        }

        // here check the length and isEmpty method()

        String s28 = "";
        String s29 = "Jesus";
        if (s29.isEmpty() || s28.length() == 0) {
            System.out.println("one condition is fail");
        } else {
            System.out.println("else block");
        }

        String s30 = "Jesus";
        if (s30.isEmpty()) {
            System.out.println("Object contains");
        } else {
            System.out.println("empty block");
        }

        // Concatination of string methods()

        String s31 = "kiran ";
        String s32 = "kumar";
        String s33 = s31.concat(s32);
        System.out.println(s33);

        // using here + operator we can cuse any one either concatMethos or + operator
        String s34 = "vijay ";
        String s35 = "kumar";
        String s36 = s34 + s35;
        System.out.println(s36);

        String s37 = "kpurini04";
        String s40 = "@";
        String s38 = "gmail.com";
        String s39 = s37.concat(s40.concat(s38));
        System.out.println(s39);

        // String charactor replace() this method will be replace the specific charactor in java
        String s41 = "Hello javA how r u";
        String s42 = s41.replace('A', 'a');
        System.out.println(s42);

        String s43 = "Hello javA how r u";
        String s44 = s41.replace("Hello javA how r u", "Hello kiran how are you man dont warry god is with you");
        System.out.println(s44);

        //split method is split the words where you want to split the words look at here exemple

        String s45 = "java is a good platform for new generations it will be give more fetures to next generations";
        String[] s46 = s45.split("\\ ");
        for (String w : s46) {
            System.out.println(w);
        }

        /*intern method() :- this method return repracentions of conanical repracentation of string if it is
        created new key word its extra copy of object it is return from heap memory
    */
        String s47 = "Hello";
        String s48 = new String("Hello");
        String s49 = s47.intern();
        System.out.println(s49);
        System.out.println(s49 == s48);

        // Index() it will be return the index of char value

        String s50 = "this is the index of value";
        int s51 = s50.indexOf("index");
        int s52 = s50.indexOf("index", 13);
        System.out.println(s51 + " " + s52);

        //LowerCase method

        String s53 = "JESUS";
        String s54 = s53.toLowerCase();
        System.out.println(s54);

        // ToUperCase

        String s55 = "mother mery pray for us";
        String s56 = s55.toUpperCase();
        System.out.println(s56);

        // trim method()

        String s57 = "   kiran  kumar  ";
        String s58 = s57.trim();
        System.out.println(s58);

        // convert String to character array
        //  by using toCharArray

        String s59 ="kiran";
        char[] s60 =s59.toCharArray();
        for(int i=s60.length-1;i>=0;i--){
            System.out.print(s60[i]);
        }
    }

    }

