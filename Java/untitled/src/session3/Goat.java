package session3;

public class Goat extends Animal{
    private int age;
    private int height;

    public Goat(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public Goat(String name, int age, int height) {
        super(name);
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getAnimalName() {
        return "Goat";
    }
}
