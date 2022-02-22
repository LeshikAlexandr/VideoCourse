package lesson4;

public class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;

        System.out.println("Color of car: " + color + ", engine of car: " + engine);
    }

}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("black", "V8");

        Car car2 = new Car("white", "V6");
    }
}
