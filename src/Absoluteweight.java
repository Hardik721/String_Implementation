import java.util.Scanner;

public class Absoluteweight {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        String str = object.nextLine();
        int sumofupperweight = 0;
        int sumoflowerweight = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                sumofupperweight = sumofupperweight + (int) character;
            } else if (character >= 'a' && character <= 'z') {
                sumoflowerweight = sumoflowerweight + (int) character;
            }
        }
        int absoluteWeight = sumofupperweight - sumoflowerweight;
        if (absoluteWeight >= 0) {
            System.out.println(absoluteWeight);


        }
    }
}
