package Collections;

public class ArrayList {

    public static void main(String[] args) {
        
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Haim");
        names.add("Wolf Alice");
        names.add("Ling Tosite Sigure");
        
        for(String n : names){
            System.out.println(n);
        }
    }
}
