package Collections;

public class GenericClass<T> {

    private T t;
    
    public T get(){
        return this.t;
    }
    
    public void set (T t1){
        this.t=t1;
    }
    
    public static void main (String [] args){
        GenericClass<String> type = new GenericClass<>();
        type.set("Justin");
        
        GenericClass type1 = new GenericClass();
        type1.set("Justin");
        type1.set(36); 
    }
}
