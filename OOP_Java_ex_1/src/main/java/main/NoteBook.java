package main;

public class NoteBook {
    public NoteBook(Human p1, Relationship re, Human p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Human p1;
    Relationship re;
    Human p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}
