import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String str1 = str.replaceFirst("[aeiou]", "*");
        System.out.println(str1);

    }
}
