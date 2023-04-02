package main;

public class Main {
    public static void main(String[] args){
        Human Denis = new Human(111111, "Denis",23,"man" );
        Human Artur = new Human(111112, "Artur", 2,"man" );
        Human Nasty = new Human(111113, "Nasty", 22,"woman" );
        Human Ivan = new Human(111114, "Ivan", 1,"man" );

        GeologiTree gt = new GeologiTree();
        gt.appendPerentChild(Denis, Artur); // Denis родитель Artur
        gt.appendPerentChild(Nasty, Ivan); // Nasty родитель Ivan
        gt.appendVifeHusbent(Nasty, Denis); // Nasty жена Denis

        // Ищем детей Denis
        System.out.println("Дети Denis");
        System.out.println(new Search(gt).spend(Denis, Relationship.parent));
        // Ищем детей Nasty
        System.out.println("Дети Nasty");
        System.out.println(new Search(gt).spend(Nasty, Relationship.parent));

        // Ищем мужа Nasty (Чья жена Nasty?)
        System.out.println("Муж Nasty");
        System.out.println(new Search(gt).spend(Nasty, Relationship.vife));

        // Ищем людей определенного возраста
        System.out.println(new Search(gt).searchAge());

    }
}
