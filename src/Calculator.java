import java.util.Scanner;

public class Calculator extends Phone {
    public void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();

        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();

        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void shared() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();

        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
