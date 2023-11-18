package PatikaStore;

public abstract class Product extends StoreObject{
    public double price;
    public double discount;
    public Manufacturer manufacturer;
    public int inventory;
    public Product(int id, String name, double price, double discount, Manufacturer manufacturer, int inventory) {
        this.setId(id);
        this.setName(name);
        this.price = price;
        this.discount = discount;
        this.manufacturer = manufacturer;
        this.inventory = inventory;
    }
    
}
