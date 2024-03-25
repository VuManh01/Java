package session3.lab4;

public class Main {
    public static void main(){
        Car c = new LuxuryCar();
        //We can not use c.service()
        //But we can use downcasing to use
        ((LuxuryCar) c).service();
    }
}
