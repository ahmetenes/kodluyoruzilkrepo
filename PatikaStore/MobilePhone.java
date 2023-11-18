package PatikaStore;

public class MobilePhone extends Product{
    public String color;
    public double screenWidth;
    public int memory;
    public int ram;
    public int camera;
    public int battery;
    public MobilePhone(int id, String name, double price, double discount,Manufacturer manufacturerId, int inventory,
            String color, double screenWidth, int memory, int ram,int camera,int battery) {
        super(id, name, price, discount,manufacturerId, inventory);
        this.color = color;
        this.screenWidth = screenWidth;
        this.memory = memory;
        this.ram = ram;
        this.battery = battery;
        this.camera = camera;
    }
    @Override
    public int compareTo(StoreObject o) {
        
        return Integer.compare(this.getId(),o.getId());

    }

}
