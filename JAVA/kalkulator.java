import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        // a. Statis
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan nomor1: ");
        int nomor1 = Input.nextInt();
        System.out.print("Masukkan nomor2: ");
        int nomor2 = Input.nextInt();
        System.out.println(nomor1 + nomor2);
        System.out.println(nomor1 * nomor2);

        // b. Dinamis
        char operator;
        double nomor3, nomor4;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Operator (+ - * / %): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan nomor1 = ");
        nomor3 = input.nextDouble();

        System.out.print("Masukkan nomor2 = ");
        nomor4 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+':
                System.out.println(nomor3 + nomor4);
                break;
            case '-':
                System.out.println(nomor3 - nomor4);
                break;
            case '*':
                System.out.println(nomor3 * nomor4);
                break;
            case '/':
                System.out.println(nomor3 / nomor4);
                break;
            case '%':
                System.out.println(nomor3 % nomor4);
                break;
        }
    }
}