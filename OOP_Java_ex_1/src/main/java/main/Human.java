package main;

public class Human {
    public Integer passport;
    public String fullName;
    public Integer age;
    public String gender;

    //По идее тут лучше использовать интерфейс
    public Human(Integer passport, String fullName, Integer age, String gender){
        this.passport = passport;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
