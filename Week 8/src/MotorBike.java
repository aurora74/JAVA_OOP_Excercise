public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * abc.
     * @return String
     */
    @Override
    public String getInfo() {
        return String.format("Motor Bike:\n"
                        + "\tBrand: %s\n" + "\tModel: %s\n"
                        + "\tRegistration Number: %s\n"
                        + "\tHas Side Car: %b\n" + "\tBelongs to %s - %s",
                super.brand, super.model, super.registrationNumber,
                hasSidecar, owner.getName(), owner.getAddress());
    }
}

