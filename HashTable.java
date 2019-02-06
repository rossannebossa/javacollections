package Collections;

import java.util.*;

public class HashTable {

    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String s;
        double bal;
        
        balance.put("Courtney", new Double(3434.34));
        balance.put("Alana", new Double(123.23));
        balance.put("Daisy", new Double(1378.00));
        
        names = balance.keys();
        
        while(names.hasMoreElements()){
            s = (String) names.nextElement();
            System.out.println(s + ": " +balance.get(s));
        }
        
        bal = ((Double)balance.get("Alana")).doubleValue();
        balance.put("Alana", new Double(bal + 1000.77));
        System.out.println("Alana's New Balance: "+balance.get("Alana"));
    }
}
