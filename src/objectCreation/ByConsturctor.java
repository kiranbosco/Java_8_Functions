package objectCreation;

public class ByConsturctor {

    int id;
    String name;

    ByConsturctor(int id , String name){

        this.id = id;
        this.name = name;
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        ByConsturctor byConsturctor = new ByConsturctor(10 ,"kiran");;

    }
}
