package Collections;

public class HashMap {

    public static void main(String[] args) {
        java.util.Map<String, Integer> list = new java.util.HashMap<>();
        list.put("Lana", 52);
        list.put("Lilly",43);
        list.put("Lenny", 50);
        
        System.out.println(list);
        
        java.util.Map<String, Integer> treeMap = new java.util.TreeMap<>(list);
        System.out.println(treeMap);
        
    }
}
