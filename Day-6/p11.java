package day_6;

public class p11 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello");
		System.out.println("Original String: "+s);
        
        s.append(" World");
        System.out.println("After append: " + s); 
        
        
        s.insert(6, "Java ");
        System.out.println("After insert: " + s); 
        
       
        s.replace(0, 5, "Welcome");
        System.out.println("After replace: " + s); 
        
        s.delete(12,18);
        System.out.println("After Deletion: "+s);
        
        s.reverse();
        System.out.println("After reverse: " + s);
        
        

	}

}
