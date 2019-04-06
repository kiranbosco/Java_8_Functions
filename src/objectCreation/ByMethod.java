package objectCreation;

public class ByMethod {

    int id;
    String name;

   public void createMethod(int id ,String name){
        id=id;
        name = name;
       System.out.println(id + " " + name);

   }
    public static void main(String[] args) {
        ByMethod byMethod = new ByMethod();
        byMethod.createMethod(10, "kiran");

   }


}
