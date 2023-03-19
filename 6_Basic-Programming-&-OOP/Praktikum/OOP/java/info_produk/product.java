package info_produk;

public class product {

    private String nama;
    private String deskripsi;
    private double harga;
    private int stock;

    // Constructor
    public product(String name, String description, double price, int stock) {
        this.nama = name;
        this.deskripsi = description;
        this.harga = price;
        this.stock = stock;
    }

    // Setter methods
    public void setName(String name) {
        this.nama = name;
    }

    public void setDescription(String description) {
        this.deskripsi = description;
    }

    public void setPrice(double price) {
        this.harga = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Getter methods
    public String getName() {
        return nama;
    }

    public String getDescription() {
        return deskripsi;
    }

    public double getPrice() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    // Method to display product information
    public void getInfo() {
        System.out.println("INFO PRODUK");
        System.out.println("Nama Produk: " + getName());
        System.out.println("Deskripsi: " + getDescription());
        System.out.println("Harga: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("===");
        System.out.println("===");
    }

    // Main method for testing
    public static void main(String[] args) {
        product p = new product("Kopi", "Kopi susu", 8000, 6);
        p.getInfo();
        product q = new product("Teh", "Teh Manis", 5000, 10);
        q.getInfo();
        product r = new product("Roti", "Roti Tawar", 7000, 16);
        r.getInfo();

    }
}
