package session3;

public class AppName {
    public static void main(String[] args){
        Dog quick = new Dog("Quick",5,120);
        System.out.println("Name: " + quick.getName());
        System.out.println("Animal name: " + quick.getAnimalName());
        //Gọi các phương thức khác báo trên lớp Dog
        System.out.println("Age: " + quick.getAge());
        System.out.println("Height: " + quick.getHeight());

        System.out.println("=============");

        Cat meow = new Cat("Meow",1,12);
        System.out.println("Name: " + meow.getName());
        System.out.println("Animal name: " + meow.getAnimalName());
        //Gọi các phương thức khác báo trên lớp Cat
        System.out.println("Age: " + meow.getAge());
        System.out.println("Height: " + meow.getHeight());

        System.out.println("=============");

        Goat faker = new Goat("Faker",30,160);
        System.out.println("Name: " + faker.getName());
        System.out.println("Animal name: " + faker.getAnimalName());
        //Gọi các phương thức khác báo trên lớp Goat
        System.out.println("Age: " + faker.getAge());
        System.out.println("Height: " + faker.getHeight());

        //Thể hiện tính đa hình
        Dog quick2 = new PhuQuocDog("PQ Dog",3,130);
        System.out.println("Name: " + quick2.getName());
        System.out.println("Height: " + quick2.getHeight());
        System.out.println("Animal name: " + quick2.getAnimalName());
    }
}
