package Praktik_1;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void set_age(int age) {
        this.age = age;
    }
    public void set_name(String name) {
        this.name = name;
    }
    public String get_name(){
        return name;
    }
    public int get_age() {
        return age;
    }

    public String toString(){
        return "Имя: " + this.name + "\n" + "Возраст: " + this.age + "\n";
    }

}
