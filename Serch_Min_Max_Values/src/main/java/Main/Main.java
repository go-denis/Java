package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int ran = random.nextInt(100);
            list.add(ran);
            System.out.println(" "+ ran );
        }

        int min = list.get(0);
        int max = list.get(0);

        // минимальное
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        // максимальное
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Min: "+min+" Max: "+max);

    }
}
