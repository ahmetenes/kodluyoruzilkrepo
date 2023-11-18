package PatikaStore;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PatikaStore {
    public static MyTreeSet<Manufacturer> brands = new MyTreeSet<Manufacturer>();
    static {
        brands.add(new Manufacturer(1, "Samsung"));
        brands.add(new Manufacturer(2, "Lenovo"));
        brands.add(new Manufacturer(3, "Apple"));
        brands.add(new Manufacturer(4, "Huawei"));
        brands.add(new Manufacturer(5, "Casper"));
        brands.add(new Manufacturer(6, "Asus"));
        brands.add(new Manufacturer(7, "HP"));
        brands.add(new Manufacturer(8, "Xiaomi"));
        brands.add(new Manufacturer(9, "Monster"));
    }

    public static void main(String[] args) {
        MyTreeSet<MobilePhone> phones = new MyTreeSet<>();

        MyTreeSet<Notebook> notebooks = new MyTreeSet<>();
        //(int id, String name, double price, double discount, Manufacturer manufacturer, int inventory,int screenWidth, int memory, int ram)

        Scanner scanner = new Scanner(System.in);
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        while (true) {
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    for (Notebook notebook : notebooks) {
                        System.out.printf("| %d  | %-29s | %8s TL | %-9s | %9s | %9s | %9s |\n",
                        notebook.getId(),notebook.getName(),Double.toString(notebook.price),notebook.manufacturer.getName(),notebook.memory,notebook.screenWidth,notebook.ram);
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    System.out.println("1 - Notebook Ekle ");
                    System.out.println("2 - Notebook Sil");
                    System.out.println("0 - Çıkış Yap");
                    System.out.print("Tercihiniz : ");
                    int subchoise = Integer.parseInt(scanner.nextLine());
                    switch (subchoise) {
                        case 1:
                            System.out.println("Id: ");
                            int id = Integer.parseInt(scanner.nextLine());
                            System.out.println("Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Price: ");
                            double price = Double.parseDouble(scanner.nextLine());
                            System.out.println("Discount: ");
                            double discount = Double.parseDouble(scanner.nextLine());
                            System.out.println("ManufacturerId: ");
                            int manufacturerId = Integer.parseInt(scanner.nextLine());
                            System.out.println("Inventory Count: ");
                            int inventory = Integer.parseInt(scanner.nextLine());
                            System.out.println("ScreenWidth: ");
                            double screenWidth = Double.parseDouble(scanner.nextLine());
                            System.out.println("Memory: ");
                            int memory = Integer.parseInt(scanner.nextLine());
                            System.out.println("RAM: ");
                            int ram = Integer.parseInt(scanner.nextLine());
                            notebooks.add(new Notebook( id, name, price, discount, brands.getElement(manufacturerId), inventory, screenWidth, memory, ram));
                        break;
                        case 2:
                            System.out.println("Id of Notebook: ");
                            id = scanner.nextInt();
                            phones.removeElement(id);
                        break;
                        case 3:
                        break;
                        case 0:
                        break;
                    }
                    break;
                case 2:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------"
                    );
                    System.out.println("| ID | Ürün Adı                      | Fiyat       | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    for (MobilePhone phone : phones) {
                        System.out.printf("| %d  | %-29s | %8s TL | %-9s | %9s | %9s | %9s |\n",
                        phone.getId(),phone.getName(),Double.toString(phone.price),phone.manufacturer.getName(),phone.memory,phone.screenWidth,phone.ram);
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("1 - Cep Telefonu Ekle ");
                    System.out.println("2 - Cep Telefonu Sil");
                    System.out.println("0 - Çıkış Yap");
                    System.out.print("Tercihiniz : ");
                    subchoise = Integer.parseInt(scanner.nextLine());
                    switch (subchoise) {
                        case 1:
                            System.out.println("Id: ");
                            int id = Integer.parseInt(scanner.nextLine());
                            System.out.println("Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Price: ");
                            double price = Double.parseDouble(scanner.nextLine());
                            System.out.println("Discount: ");
                            double discount = Double.parseDouble(scanner.nextLine());
                            System.out.println("ManufacturerId: ");
                            int manufacturerId = Integer.parseInt(scanner.nextLine());
                            System.out.println("Inventory Count: ");
                            int inventory = Integer.parseInt(scanner.nextLine());
                            System.out.println("Color: ");
                            String color = scanner.nextLine();
                            System.out.println("ScreenWidth: ");
                            double screenWidth = Double.parseDouble(scanner.nextLine());
                            System.out.println("Memory: ");
                            int memory = Integer.parseInt(scanner.nextLine());
                            System.out.println("RAM: ");
                            int ram = Integer.parseInt(scanner.nextLine());
                            System.out.println("Camera: ");
                            int camera = Integer.parseInt(scanner.nextLine());
                            System.out.println("Battery: ");
                            int battery = Integer.parseInt(scanner.nextLine());
                            phones.add(new MobilePhone(id, name, price, discount,brands.getElement(manufacturerId), inventory, color, screenWidth, memory, ram,camera, battery));
                        break;
                        case 2:
                            System.out.println("Id of Phone: ");
                            id = Integer.parseInt(scanner.nextLine());
                            phones.removeElement(id);
                        break;
                        case 0:
                        break;
                    }
                    break;
                case 3:
                    System.out.println("\nMarkalarımız");
                    System.out.println("--------------");
                    for (Manufacturer manufacturer : brands) {
                        System.out.println(" - " + manufacturer.getName());
                    }
                    break;
                
                default:
                    return;
            }
        }
    }
}
