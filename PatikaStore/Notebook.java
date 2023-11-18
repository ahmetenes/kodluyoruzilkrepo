package PatikaStore;

public class Notebook extends Product {
    public double screenWidth;
    public int memory;
    public int ram;
    
    public Notebook(int id, String name, double price, double discount, Manufacturer manufacturer, int inventory,
            double screenWidth, int memory, int ram) {
        super(id, name, price, discount, manufacturer, inventory);
        this.screenWidth = screenWidth;
        this.memory = memory;
        this.ram = ram;
    }


    @Override
    public int compareTo(StoreObject o) {
        return Integer.compare(this.getId(),o.getId());
    }
    
}
