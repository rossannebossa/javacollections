package Collections;

import java.util.List;
import java.util.ArrayList;

public class UpperBound {
    
    public static double sum(List<? extends Number>list){
        double sum = 0;
        for(Number n: list){
            sum += n.doubleValue();
        }
        return sum;
    }
    
    public static void main (String [] args){
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(7);
        
        double sum = sum(ints);
        System.out.println("Sum of numbers: "+sum);
    }
}
