package Main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Govorilnica shop = new Govorilnica();
        ArrayList<Phone> ListPhones = new ArrayList<>();
        shop.create(ListPhones);

        for (Phone temp: ListPhones) {
            System.out.println(temp.toString());
        }

    }
}
