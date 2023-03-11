package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;




//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random(10);
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(10));
        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0 && number != 0) {
                System.out.println("Это четное число: " + number);
                iterator.remove();
            }

        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
