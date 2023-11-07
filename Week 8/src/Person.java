import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    private String address;

    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * abc.
     * @param registrationNumber abc
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                return;
            }
        }
    }

    /**
     * abc.
     * @return String
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }

        StringBuilder sb = new StringBuilder(name + " has:\n\n");
        for (Vehicle vehicle : vehicleList) {
            sb.append(vehicle.getInfo()).append("\n");
        }

        return sb.toString();
    }
}
