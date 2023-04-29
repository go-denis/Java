package Main;

import java.util.ArrayList;


public class Govorilnica implements CreatePhone{

    private ArrayList<Phone> ListPhones;
    @Override
    public ArrayList<Phone> create(ArrayList<Phone> phone){
        ArrayList<Phone> ListPhones = new ArrayList<>();

        Phone nokia = new Phone("Nokia","3234", 36,10000);
        Phone sumsung = new Phone("sumsung","ASD", 36,10000);
        Phone xiaomi = new Phone("xiaomi","ewe", 36,10000);
        Phone huawei = new Phone("huawei","VVV", 36,10000);

        ListPhones.add(nokia);
        ListPhones.add(sumsung);
        ListPhones.add(xiaomi);
        ListPhones.add(huawei);

        return ListPhones;

    }

    @Override
    public ArrayList<Phone> sell(ArrayList<Phone> ListPhones){
        ArrayList<Phone> tempList = new ArrayList<>();


        for (Phone phone: ListPhones){
            if(!"sumsung".equals(phone.getTitle())){
                ListPhones.add(phone);
            }
        }
        ListPhones.clear();
        tempList.addAll(tempList);
        return tempList;
    }

    /*
    @Override
    public ArrayList<Phone> addPhone(ArrayList<Phone> ListPhones){

        Phone phone = new Phone();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название производителя: ");
        String title = sc.next();

        System.out.println("Введите модель телефона");
        String model = sc.next();

        System.out.println("Введите разрешение экрана телефона: ");
        String displaySize = sc.next();

        System.out.println("Введите размер аккумулятоора телефона");
        Integer sizeAkb = Integer.valueOf(sc.next());

        phone.add(title, model, displaySize, sizeAkb);
        sc.close();
        return ListPhones;
    }
     */
}
