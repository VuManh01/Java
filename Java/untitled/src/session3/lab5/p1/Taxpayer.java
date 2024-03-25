package session3.lab5.p1;

public abstract class Taxpayer {
    private String id;
    public String getId(){
        return id;
    }
    public abstract double pay();
}
