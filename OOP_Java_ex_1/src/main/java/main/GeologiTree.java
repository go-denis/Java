package main;

import java.util.ArrayList;

public class GeologiTree implements GeologiInterface{
    protected ArrayList<NoteBook> tree = new ArrayList<>();

    public ArrayList<NoteBook> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    @Override
    public void appendPerentChild(Human parent, Human children) {
        tree.add(new NoteBook(parent, Relationship.parent, children));
        tree.add(new NoteBook(children, Relationship.children, parent));
    }

    // связь муж - жена
    @Override
    public void appendVifeHusbent(Human vife, Human husbent) {
        tree.add(new NoteBook(vife, Relationship.vife, husbent));
        tree.add(new NoteBook(husbent, Relationship.husbent, vife));
    }
}
