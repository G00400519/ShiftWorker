package ShiftWorker;

import java.util.Scanner;

public class ShiftWorker {

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        ShiftWorkerApp employee1 = new ShiftWorkerApp();

        System.out.println("Male/Female:");
        String gender = input.next();

        System.out.println("Shift:");

        System.out.println("Age:");
        String age = input.next();
    }
}
