package Barang;

public class Bank {
    private int id;
    private String name;
    private boolean active = true;
    private int bankDiscount = 0;

    public Bank(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setBankDiscount(int discount){
        bankDiscount = discount;
    }

    public int getBankDiscount(){
        return bankDiscount;
    }

    public void activate(){
        this.active = true;
    }

    public void deactivate(){
        this.active = false;
    }

    public boolean isActive(){
        return active;
    }
}
