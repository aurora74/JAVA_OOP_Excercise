public class Main {
    public static void main(String[] args) {

        Person person = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");

        Car car = new Car("Mercedes-Benz", "S400", "30A - 888.88", person, 4);

        Vehicle m1 = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", person, false);


        person.addVehicle(car);
        person.addVehicle(m1);

        System.out.println(person.getVehiclesInfo());
        // System.out.println(person2.getVehiclesInfo());
    }
}