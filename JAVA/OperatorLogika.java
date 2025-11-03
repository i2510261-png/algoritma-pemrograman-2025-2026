public class OperatorLogika {
    
    public static void main(String[] args) {
        
        boolean a,b,c;

        // Operator Logika OR (||)
        System.out.println("\n--- OR (||) ---");
        
        a = true;
        b = true;
        c = (a || b);
        System.out.println("a = true, b = true");
        System.out.println("a || b = " + c);
        
        a = true;
        b = false;
        c = (a || b);
        System.out.println("a = true, b = false");
        System.out.println("a || b = " + c);
        
        a = false;
        b = true;
        c = (a || b);
        System.out.println("a = false, b = true");
        System.out.println("a || b = " + c);
        
        a = false;
        b = false;
        c = (a || b);
        System.out.println("a = false, b = false");
        System.out.println("a || b = " + c);
        
        
        // Operator Logika AND (&&)
        System.out.println("\n--- AND (&&) ---");
        
        a = true;
        b = true;
        c = (a && b);
        System.out.println("a = true, b = true");
        System.out.println("a && b = " + c);
        
        a = true;
        b = false;
        c = (a && b);
        System.out.println("a = true, b = false");
        System.out.println("a && b = " + c);
        
        a = false;
        b = true;
        c = (a && b);
        System.out.println("a = false, b = true");
        System.out.println("a && b = " + c);
        
        a = false;
        b = false;
        c = (a && b);
        System.out.println("a = false, b = false");
        System.out.println("a && b = " + c);

        
        // Operator Logika XOR (^)
        System.out.println("\n--- XOR (^) ---");
        
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println("a = true, b = true");
        System.out.println("a ^ b = " + c);
        
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println("a = true, b = false");
        System.out.println("a ^ b = " + c);
        
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println("a = false, b = true");
        System.out.println("a ^ b = " + c);
        
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println("a = false, b = false");
        System.out.println("a ^ b = " + c);


        // Operator Logika NOT (!)
        System.out.println("\n--- NOT (!) ---");
        
        a = true;
        b = !a;
        System.out.println("a = true");
        System.out.println("!a = " + b);
        
        a = false;
        b = !a;
        System.out.println("a = false");
        System.out.println("!a = " + b);
        
    }
}
