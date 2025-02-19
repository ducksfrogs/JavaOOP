//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.setMake("Proshe");
        car.setMake("Holden");
        car.setModel("Samsung");
        car.setColor("Blue");
        car.setDoors(5);

        System.out.println("car " + car.getMake() + " " + car.getModel() + " " + car.getColor());
        System.out.println("222");
        car.describeCar();

        Car car2 = new Car();

        car2.setMake("Honda");
        car2.setModel("Cadd");
        car2.setColor("Red");
    }
}