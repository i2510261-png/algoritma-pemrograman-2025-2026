 import java.util.Scanner;
 public class latihan2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jari-jari: ");
        double r = sc.nextDouble();  
        double luas = PI * r * r;
        System.out.println("luas lingkaran = " + luas);
  }
 }


