import java.util.Scanner;

public class Totalweight {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        String str = object.nextLine();
        int sum = 0;
        for (int i = 0; i <= str.length(); i++) {
            char character = str.charAt(i);
            sum = sum + (int) character;
        }


    }
}