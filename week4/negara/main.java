package week4.negara;

public class main {
    public static void main(String[] args) {

        negara DataNegara = new negara();

        String[][] listNegara = DataNegara.getNegara();

        for (int i = 0; i < listNegara.length; i++) {
            System.out.println("Ibukota " + listNegara[i][0] + " adalah " + listNegara[i][1]);
        }
    }
}