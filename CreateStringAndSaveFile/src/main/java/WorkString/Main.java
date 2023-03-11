package WorkString;

import java.io.*;
public class Main {
    public static void main(String[] args){

        //Записываем в файл
        writeFile(createString());

    }

    //Записываем в файл
    private static void writeFile(StringBuilder text){
        System.out.println(text);
        try(FileWriter writer = new FileWriter("файл для записи.txt", false))
        {
            // запись всей строки
            writer.write(String.valueOf(text));
            // запись по символам
            //writer.append('\n');
            //writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    //Генерируем строку
    private static StringBuilder createString() {
        StringBuilder genstring = new StringBuilder("1 - TEST");

        for (int i = 2; i <= 100; i++) {
            genstring.append("\n"+i+" - TEST");
        }

        return genstring;
    }
}
