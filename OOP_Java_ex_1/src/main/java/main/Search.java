package main;

import java.util.ArrayList;
import java.util.Scanner;
public class Search {

    ArrayList<String> result = new ArrayList<>();
    ArrayList<NoteBook> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Search(GeologiTree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Human p, Relationship re) {
        for (NoteBook nb : tree) {
            if (nb.p1.fullName == p.fullName && nb.re == re) {
                result.add(nb.p2.fullName);
            }
        }
        return result;
    }

    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (NoteBook nb : tree) {

            if (nb.p1.age <= age && !resultAge.contains(nb.p1.fullName)) {
                resultAge.add(nb.p1.fullName);
            }
        }
        return resultAge;
    }
}
