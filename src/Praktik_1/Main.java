package Praktik_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Хатико", 8);

        String name = dog.get_name();
        int age = dog.get_age();

        System.out.println("Имя: " + name + "\n" + "Возраст: " + age + "\n");

        dog.set_name("Барсик");
        dog.set_age(10);

        name = dog.get_name();
        age = dog.get_age();

        System.out.println("Имя: " + name + "\n" + "Возраст: " + age);

        String dog_info = dog.toString();
        System.out.println("\n" + dog_info);

    }
}