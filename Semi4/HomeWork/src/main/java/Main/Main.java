package Main;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    /*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.*/

        public static void main(String[] args) {
            LinkedList<String> inputLinkedList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            String srtFromCons;
            System.out.println("Введите значение для строки.\nДля переворацивания строк введите 'print'");

            while (!(srtFromCons = scanner.nextLine()).equals("print"))
                inputLinkedList.addFirst(srtFromCons);
            scanner.close();
            System.out.println("LinkedList: " + inputLinkedList.toString());

        }

}
