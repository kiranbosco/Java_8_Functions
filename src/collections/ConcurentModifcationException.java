package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurentModifcationException {

    /*
        once ur class has done iteration then u will be perform the operation in the map or list that time u will be get the
                concurentModication exception if u want to over come that type of exception ur class need to add the concurntHashMap
    */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "kiran");
        map.put("designation", "SoftwareEngineer");
        map.put("Location", "Banglore");


        for(Map.Entry<String,String> entry : map.entrySet()) {

            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + " " + val);
            map.put("sal" , " 50000");
        }

     /*   Iterator itr = map.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());*/

     /*   for (String str : map.values()) {
            System.out.println(str);
        }
*/

    }

}


