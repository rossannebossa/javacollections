package Collections;

public class LinkedList {

    public static void main(String[] args) {
        java.util.LinkedList<Integer> nums = new java.util.LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(0,5);
        nums.add(3,7);
        
        for(Integer n : nums){
            System.out.println(n);
        }
        
        //ADD TO LIST
        java.util.LinkedList<Object> nums2 = new java.util.LinkedList<>(nums);
        nums2.add(1,"Black");
        nums2.removeLast();
        nums2.addFirst("White");
        
        System.out.println(nums2);        
    }
}
