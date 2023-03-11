package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//3. Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
public class Main {
    public static void main(String[] args){
        ArrayList<String> listOfStrings = new ArrayList<String>();
        Random random = new Random();

        //Генерируем рандомные значения
        for (int i = 0; i < 30; i++) {
            int num = random.nextInt(10);
            listOfStrings.add(String.valueOf(num));

            for (int j = 0; j < 2; j++) {
                String world = generateRandomWord(10);
                listOfStrings.add(String.valueOf(world));
            }

        }
        //Вывод списка на экран
        for (Iterator<String> iterator = listOfStrings.iterator(); iterator.hasNext();) {
            String number = iterator.next();
            System.out.println(number);

            //Поиск целых чисел в массиве
            try {
             int umber = Integer.parseInt(number);
             if (umber % 1 == 0){
                iterator.remove();
            }
            }catch (NumberFormatException e){

            }

        }

        //Вывод на экран получившегося массива
        System.out.println("Новый массив: ");
        for (String st: listOfStrings) {
            System.out.println(st);
        }

    }

    static  String generateRandomWord(int wordLength) {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) { // For each letter in the word
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

}
