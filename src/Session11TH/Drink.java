package Session11TH;

public abstract class Drink {
    String id;
    String name;
    double price;

    public Drink() {
    }

    public Drink(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    abstract double calculatePrice();
    void displayInfofo(){
        System.out.println("Mã Đồ uống: "+ id);
        System.out.println("Tên đồ uống: "+ name);
        System.out.println("Giá gốc: "+price);
    }
}
