package main;

import java.util.ArrayList;

public class GeologiTree {
    private ArrayList<NoteBook> tree = new ArrayList<>();

    public ArrayList<NoteBook> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Human parent, Human children) {
        tree.add(new NoteBook(parent, Relationship.parent, children));
        tree.add(new NoteBook(children, Relationship.children, parent));
    }

    // связь муж - жена
    public void appendVifeHusbent(Human vife, Human husbent) {
        tree.add(new NoteBook(vife, Relationship.vife, husbent));
        tree.add(new NoteBook(husbent, Relationship.husbent, vife));
    }
}
