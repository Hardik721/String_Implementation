import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        String str = object.nextLine();
        int index = object.nextInt();
        String substring = str.substring(index);
        System.out.println(substring);



    }
}
