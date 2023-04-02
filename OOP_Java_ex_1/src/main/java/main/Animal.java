package main;

public abstract class Animal {
    public Integer height;
    public String color;
    public void jump(Integer height){
       this.height = height;
    }

    public void setColor(String color){
        this.color =  color;
    }

    public abstract void run();
}
