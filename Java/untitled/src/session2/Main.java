package session2;

import session2.Person;

public class Main {
    public static void main(String[] args){
        Person newName = new Person();
        newName.setName("Hai");
        newName.setBornYear(1998);
        newName.setPhoneNumber("123465789");

        Person truongGia = new Person("Binh",1954,"091234567");
        Person truongTung = new Person("Tung",1956,"090123456");
        Person noname;//Chua cap phat va khoi tao
        //Lay ten cua doi tuong getter
        truongGia.getName();
        truongGia.setName("new Name");
        System.out.println(truongGia);
    }
}