package Semi3;

import java.util.function.Predicate;
public class Lamda {
    public static void main(String[] args){
        MyValue val; //Обьявляем ссылку на интерфейс
        val = ()->9.6;
        System.out.println(val.getValue());

        Predicate<Integer> pred = (x) -> (x > 0);

        System.out.println(pred.test(-7));
    }

}
