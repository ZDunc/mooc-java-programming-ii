import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> list = storage.get(unit);
        list.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> list = storage.get(storageUnit);
        
        if (list == null)
            return new ArrayList<>();

        return list;
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> list = storage.get(storageUnit);

        if (list == null)
            return;
        else if(list.size() == 1)
            storage.remove(storageUnit);
        else
            list.remove(list.size() - 1);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();

        for (String unit : storage.keySet()) {
            if (!list.contains(unit))
                list.add(unit);
        }

        return list;
    }
}
