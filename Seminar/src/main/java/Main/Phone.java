package Main;

import java.util.Objects;

public class Phone {

    private String title;
    private String model;
    private double displaySize;
    private int quantytyAkb;

    public Phone(String title, String model, double displaySize, int quantytyAkb){
        this.title = title;
        this.model = model;
        this.displaySize = displaySize;
        this.quantytyAkb = quantytyAkb;
    }

    public String getTitle(){
        return title;
    }

    public String getModel(){
        return model;
    }

    public double getDisplaySize(){
        return displaySize;
    }

    public  int getQuantytyAkb(){
        return quantytyAkb;
    }

    @Override
    public String toString(){
        return "Phone{"+
                "Title: '" + title +'\'' +
                ",Model: '"  + model +'\'' +
                "Display: '" + displaySize + '\''+
                "AKB: '" + quantytyAkb + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return Double.compare(phone.displaySize, displaySize) == 0 && quantytyAkb == phone.quantytyAkb && title.equals(phone.title) && model.equals(phone.model);

    }

    @Override
    public int hashCode(){
        return Objects.hash(title,model,displaySize,quantytyAkb);
    }

}
