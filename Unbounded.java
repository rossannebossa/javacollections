package Collections;

import java.util.List;
import java.util.ArrayList;

public class Unbounded {

    public static void printData(List<?> list) {
        for(Object obj: list){
            System.out.println(obj + "");
        }
    }
    
    public static void main (String [] args){
        List<String> names = new ArrayList<>();
        names.add("Perry");
        names.add("Ferb");
        
        printData(names);
    }
}
