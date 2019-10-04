import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        String str = object.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.print("chars:\t");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "\t");
        }
    }
}