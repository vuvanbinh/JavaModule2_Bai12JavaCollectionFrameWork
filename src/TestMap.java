import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new TreeMap<>();
        hasMap.put("Dai",18);
        hasMap.put("Than",17);
        hasMap.put("Chung",19);
        hasMap.put("Cuong",20);
        System.out.println(" Hien thi thong tin cua ban be :");
        System.out.println(hasMap +"\n");

        for (String key : hasMap.keySet()
             ) {
           Integer value = hasMap.get(key);
            System.out.println(key + "=" + value);
        }


        Map<String,Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println(" sap xep theo thu tu ");
        System.out.println(treeMap);

        Map<String , Integer> linkedHashMap = new LinkedHashMap<>
                (16, 0.75f,true);
        linkedHashMap.put("Dai",18);
        linkedHashMap.put("Than",19);
        linkedHashMap.put("Chung",20);
        linkedHashMap.put("Cuong",21);
        System.out.println("\n Tuoi cho "+ " Thanh la :  " +
                "" + linkedHashMap.get("Cuong"));
    }
}
