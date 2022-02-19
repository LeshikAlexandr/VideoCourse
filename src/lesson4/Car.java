package lesson4;

public class Car {

    String color = "red";
    String engine = "V6";

}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "V8";
        System.out.println("Color: " + car1.color);
        System.out.println("Engine: " + car1.engine);
    }
}
