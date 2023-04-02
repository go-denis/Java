package main;

public class Cat extends Animal{

    public void Animal(){
        run();
        jump(100);
        setColor("black");
    }
    @Override
    public void run() {
        System.out.println("Кот побежал!");
    }
}
