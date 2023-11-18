package PatikaStore;

public class Manufacturer extends StoreObject{
    
    public Manufacturer(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    @Override
    public int compareTo(StoreObject o) {
        return this.getName().compareTo(o.getName());
    }

    
    
}
