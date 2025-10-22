package Barang;

public class Baju extends Barang {
    private String size;

    public Baju(String name, int price, String size){
        // ngambil constructor parent
        super(name, price);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    @Override
    public void setStock(int stock){
        // ngambil atribute/method parent
        super.setStock(stock);
    }

    @Override
    public void reduceStock(int amount){
        super.reduceStock(amount);
        System.out.println("Stock baju berkurang " + amount);
    }
}
