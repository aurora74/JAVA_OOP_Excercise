public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * abc.
     * @return String
     */
    @Override
    public String getInfo() {
        return String.format("Car:\n"
                        + "\tBrand: %s\n" + "\tModel: %s\n"
                        + "\tRegistration Number: %s\n"
                        + "\tNumber of Doors: %d\n" + "\tBelongs to %s - %s",
                super.brand, super.model, super.registrationNumber,
                numberOfDoors, owner.getName(), owner.getAddress());
    }
}
