package objectCreation;

public class TypesOfObjectCreations {

    /* There are three ways to create the objects
    1. byUsing Initilize reference varable
    2 . by Method()
    3 . by constructor
    */
 // this is teh Initilize the reference type

    int id;
    String name;
    public static void main(String[] args) {

        TypesOfObjectCreations types = new TypesOfObjectCreations();
        types.id =121;
        types.name ="kiran";
        System.out.println(types.id  + " " + types.name);

    }
}
