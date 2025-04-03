class Car {
    String name;
    int topSpeed;

   
    Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return "Car Name: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
       
        Car car1 = new Car("tractor",100);
        Car car2 = new Car("swift", 200);
        Car car3 = new Car("zen", 100);
        Car car4 = new Car("BMWm5", 300);
        Car car5 = new Car("fanti", 80);

        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}