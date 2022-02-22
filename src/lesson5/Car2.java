package lesson5;

public class Car2 {

    String color;
    String engine;
    int speed;

    int gas(int acceleration) {
        speed += acceleration;
        return speed;
    }

    int brake(int slowdown) {
        speed -= slowdown;
        return speed;
    }

    void showInfo() {
        System.out.println("Color - " + color + ", motor - " + engine + ", speed - " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gas(20);
        c1.showInfo();
        c1.brake(80);
        c1.showInfo();
    }
}
