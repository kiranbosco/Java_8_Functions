package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OverComeConcurentModifcationException {

    public static void main(String[] args) {

        ConcurrentHashMap <String, String> map = new ConcurrentHashMap<>();
        map.put("name", "kiran");
        map.put("designation", "SoftwareEngineer");
        map.put("Location", "Banglore");

        for(Map.Entry<String , String> entry : map.entrySet()){
           String s = entry.getKey();
           String ss = entry.getValue();
            System.out.println(s + " " + ss);

            map.put("sal" ,"50000");
        }
    }
}
