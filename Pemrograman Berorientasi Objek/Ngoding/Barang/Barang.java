package Barang;

public class Barang {
    private String name;
    private int price;
    private int stock = 20;

    Barang(String name, int price){
        this.name = name;
        this.price = price;
    }

    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }

    int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void reduceStock(int amount){
        if (amount <= stock){
            stock = stock - amount;
        }else{
            System.out.println("Stock tidak mencukupi");
        }
    }
}
