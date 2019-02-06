package Collections;

public class HashSet {

    public static void main(String[] args) {
        java.util.HashSet<String> countries = new java.util.HashSet<>();
        countries.add("England");
        countries.add("Canada");
        countries.add("France");
        
        for(String c : countries){
            System.out.println(c);
        }
    }

}
