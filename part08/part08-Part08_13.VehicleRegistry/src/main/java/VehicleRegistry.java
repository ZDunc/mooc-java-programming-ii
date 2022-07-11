import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.put(licensePlate, owner) == null)
            return true;

        return false; // if there is an existing key, put() replaces owner value
    }                 // with new owner, returns OLD value (old owner)

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.remove(licensePlate) == null)
            return false;

        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate key : registry.keySet())
            System.out.println(key);
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner: registry.values()) {
            if (! owners.contains(owner))
                owners.add(owner);
        }

        for (String owner : owners)
            System.out.println(owner);
    }
}
