package session3.lab5.p1;

public class TaxManager {
    private static final int MAX = 100;
    private Taxpayer[] list = new Taxpayer[MAX];
    private int count = 0;
    public boolean addTaxpayer(Taxpayer taxpayer){
        if (count >= MAX){
            return false;
        }
        list[count++] = taxpayer;
        return true;
    }
    public double getTax(){
        double sum = 0;
        for (int i = 0; i < count; i++){
            //Method pay is polymorphic because we do not know exact object is instance of which class
            sum += list[i].pay();
        }
        return sum;
    }
}
