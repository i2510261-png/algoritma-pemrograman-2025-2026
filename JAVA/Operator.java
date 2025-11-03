public class OperatorLogika {
    public static void main(String[] args) {
        // Operator Logika
boolean a, b, c;

System.out.println("\n=== OR (||) ===");
a = true;
b = true;
c = (a | b);
System.out.println("a + " + " || " + "b + " + " = " + c);

a = true;
b = false;
c = (a | b);
System.out.println("a + " + " || " + "b + " + " = " + c);

a = false;
b = true;
c = (a | b);
System.out.println("a + " + " || " + "b + " + " = " + c);

a = false;
b = false;
c = (a | b);
System.out.println("a + " + " || " + "b + " + " = " + c);

// ---

System.out.println("\n=== AND (&&) ===");
a = true;
b = true;
c = (a && b);
System.out.println("a + " + " && " + "b + " = " + c);

a = true;
b = false;
c = (a && b);
System.out.println("a + " + " && " + "b + " = " + c);

a = false;
b = true;
c = (a && b);
System.out.println("a + " + " && " + "b + " = " + c);

a = false;
b = false;
c = (a && b);
System.out.println("a + " + " && " + "b + " + " = " + c);

// ---

System.out.println("\n=== XOR (^) ===");
a = true;
b = true;
c = (a ^ b);
System.out.println("a + " + " ^ " + "b + " + " = " + c);

a = true;
b = false;
c = (a ^ b);
System.out.println("a + " + " ^ " + "b + " + " = " + c);

a = false;
b = true;
c = (a ^ b);
System.out.println("a + " + " ^ " + "b + " + " = " + c);

a = false;
b = false;
c = (a ^ b);
System.out.println("a + " + " ^ " + "b + " + " = " + c);

// ---

System.out.println("\n=== NOT (!) ===");
a = true;
b = !a;
System.out.println("a + " + " ! " + "b + " + " = " + b);

a = false;
b = !a;
System.out.println("a + " + " ! " + "b + " + " = " + b);