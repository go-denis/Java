package Years;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год 'Например: 2020': ");
        int year = sc.nextInt();

        checkYear(year);

    }

    private static void checkYear(Integer year) {

        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + "год. не високосный");
        else{
            System.out.println(year + "год. високосный");
        }

    }


}
