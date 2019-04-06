package wrapper;

public class StringToInteger {
    public static void main(String[] args) {

        String num ="50000";
        int s = Integer.valueOf(num);
        System.out.println(s);




        for(int i=1;i<=10;i++){
            if(i==5){

         //    break;  // until its brak
                continue;  //using continue statement
            }
            System.out.println(i);
        }
    }

}
