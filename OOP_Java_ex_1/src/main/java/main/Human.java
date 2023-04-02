package main;

public class Human implements HumonInteface{
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

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }
    @Override
    public String getFullName() {
        return fullName;
    }
    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public Integer getAge() {
        return age;
    }
    @Override
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
}
