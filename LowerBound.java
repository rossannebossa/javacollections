package Collections;

import java.util.List;
import java.util.ArrayList;

public class LowerBound {

    public static void addIntegers(List<? super Integer> list) {
        list.add(new Integer(50));
        list.add(new Integer(52));
        list.add(new Integer(54));
    }
    
    public static void main (String [] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(44);
        nums.add(46);
        nums.add(48);
        
        addIntegers(nums);
        
        System.out.println(nums);
    }
}
