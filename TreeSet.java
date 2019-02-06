package Collections;

public class TreeSet {
    public static void main (String [] args){
        java.util.HashSet<String> countries = new java.util.HashSet<>();
        countries.add("England");
        countries.add("Canada");
        countries.add("France");
        
        java.util.TreeSet<String> list = new java.util.TreeSet<>(countries);
        System.out.println("First: "+list.first());
        System.out.println("Last: "+list.last());
        System.out.println("HeadSet: "+list.headSet("Canada"));       
    }
}
