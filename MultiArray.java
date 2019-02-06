package Collections;

import java.util.*;

public class MultiArray {
    
    public static void main (String [] args){
        String fruits [][] = {{"Apple" ,"Pear", "Orange"},{"Strawberry","Watermelon","Melon"},{"Kiwi","Blueberry"}};
        
        for(int row=0;row<fruits.length;row++){
            Arrays.sort(fruits[row]);
            
            for(int col=0;col<fruits[row].length; col++){
                System.out.println(fruits[row][col] + "\t");
            }
        }        
    }
}
