package session3;

public class Dog extends Animal {
    private int age;
    private int height;

    public Dog(String name, int age, int height) {
        //Gọi tới constructor của lớp Animal, giá trị của field trong lớp cha sẽ đc gán
        //constructor public Animal(String name) sẽ được gọi và gán giá trị
        super(name);
        //Sau đó giá trị feild trong lớp con mới đc gán

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

    @Override // Thực hiện triển khai phương thức abstract
    public String getAnimalName() {
        return "Dog";
    }
}
