import java.util.Random;

class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}
class B2 extends A{
    B2(){
//        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B2 b=new B2();


        Random random = new Random();

        System.out.println(random.nextInt(100000));


        String str ="sujatha";
       for(int i=0; i<str.length()-1;i++) {
            if(i%2==0) {
                System.out.println(i);

            }
        }

    }
}
