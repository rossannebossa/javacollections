package Collections;

public class GenericMethod {
    
    public static <T> boolean isEqual(GenericClass<T> g1, GenericClass<T> g2){
        return g1.get().equals(g2.get());
    }
    
    public static void main (String [] args){
        GenericClass<String> g1 = new GenericClass<>();
        g1.set("Katy");
        
        GenericClass<String> g2 = new GenericClass<>();
        g2.set("Katy");
        
        boolean isEqual = GenericMethod.isEqual(g1, g2);
    }
}
