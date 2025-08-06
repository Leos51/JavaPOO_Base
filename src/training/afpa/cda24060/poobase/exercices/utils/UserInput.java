package training.afpa.cda24060.poobase.exercices.utils;

import java.util.Scanner;

public class UserInput {

    public static String inputStringValue(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextLine();
    }
    public static int inputIntValue(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextInt();
    }

    public static double inputDoubleValue(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextDouble();
    }
}
