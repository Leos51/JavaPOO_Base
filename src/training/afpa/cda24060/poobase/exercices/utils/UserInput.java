package training.afpa.cda24060.poobase.exercices.utils;
import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);




    public static String inputStringValue(String msg) {
        System.out.print(msg);
        return input.nextLine();
    }
    public static int inputIntValue(String msg) {
        System.out.print(msg);
        return input.nextInt();
    }

    public static double inputDoubleValue(String msg) {
        System.out.print(msg);
        return input.nextDouble();
    }

    public static void closeScanner() {
        input.close();
    }

}
