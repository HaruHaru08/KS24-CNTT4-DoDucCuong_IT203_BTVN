package Session10.Bai3;

public class Main {
    public static void main(String[] args) {

        Animal duck = new Duck("Vịt trời");
        Animal fish = new Fish("Cá chép");

        ((Swimmable) duck).swim();
        ((Flyable) duck).fly();

        ((Swimmable) fish).swim();
    }
}

