package Generics;

public class Main {
    public static void main(String[] args){
       /* Gen<Integer> num = new Gen<Integer>(88);
        num.showType();

        Gen<String> text = new Gen<String>("Hello Generic");
        text.showType();
        System.out.println(num.getOb());
        System.out.println(text.getOb());*/
        Gen<Integer, String> ob = new Gen<Integer, String>(84324,"Hello Generic");

        ob.showType();

        System.out.println(ob.getOb());
        System.out.println(ob.getOb2());

        Numeric<Integer> numeric = new Numeric<Integer>(542);

        System.out.println("Обратная величина numeric: " + numeric.getNum());
        System.out.println("Обратная величина numeric: " + numeric.getNum2());
    }
}
