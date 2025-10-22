package Barang;
import java.util.ArrayList;

public class User {
    private String name;
    private double saldo;
    ArrayList<Order>order = new ArrayList<Order>();

    User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void isiSaldo(double jumlah){
        if(jumlah >= 50000){
            saldo += jumlah;
            System.out.println(getName() + " Saldo berhasil diisi sejumlah Rp" + jumlah);
        }else{
            System.out.println(getName() + " Pengisian saldo gagal. Jumlah minimal pengisian saldo adalah Rp50000");
        }
    }

    public void minSaldo(double jumlah){
        if(jumlah > saldo){
            System.out.println("Pembayaran gagal. Saldo tidak mencukupi");
        }else{
            saldo -= jumlah;
            System.out.println("Pembayaran berhasil. Sisa saldo = Rp" + getSaldo());
        }
    }

    public double getSaldo(){
        return saldo;
    }

    void addToOrder(Barang product, int amount){
        if(product.getStock() < amount){
            System.out.println("Stock " + product.getName() + " tidak mencukupi");
        }
        order.add(new Order(product, amount));
    }

    void payOrder(Bank bank){
        int totalPrice = 0;
        int totalBarang = 0;
        Barang barang = null;
        System.out.println("Nota " + getName());
        System.out.println("Bank: " + bank.getName());
        if(bank.isActive()){
            System.out.println("Diskon bank: " + bank.getBankDiscount() + "%");
            for (Order ord : order){
                ord.printNota();
                totalBarang += ord.getAmount();
                totalPrice += ord.getTotalPrice();
                barang = ord.getBarang();
            }
            System.out.println("Total belanja sebelum diskon: " + totalPrice);
            System.out.println("Total belanja setelah diskon: " + (totalPrice - totalPrice * bank.getBankDiscount()/100));
            minSaldo(totalPrice - totalPrice * bank.getBankDiscount()/100);
            if(getSaldo() < totalPrice){
                return;
            }
            barang.reduceStock(totalBarang);
            System.out.println();
        }else{
            System.out.println("Pembayaran tidak dapat diproses karena bank tidak aktif.");
            System.out.println();
        }
    }
}
