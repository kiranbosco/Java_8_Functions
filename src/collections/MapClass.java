package collections;
import java.util.*;

public class MapClass {

       // conver the map to set in java
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"kiran");
        map.put(2,"viajay");
        map.put(3,"sujatha");
        map.put(4,"seshamma");
        map.put(5,"ramanaiah");

        Set<Integer> set = new HashSet<>(map.keySet());
        set.forEach(key -> {
            System.out.println(key);
        });

        Set<String> val = new HashSet<>(map.values());
        val.forEach(va -> {
            System.out.println(va);
        });
    }
}
