import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String str;
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите како-нибудь число: ");
        int xx = iScanner.nextInt();
        str = "Денис";

        System.out.println("Hello World " + str + xx);
        iScanner.close();

        char ch = 1;
        System.out.println(Character.isDigit(ch));
        for (int i = 0; i < args.length; i++) {

        }
    }
}
