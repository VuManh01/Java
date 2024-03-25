package session2;
public class Person {
    private String name;
    private int bornYear;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, int bornYear, String phoneNumber) {
        this.name = name;
        this.bornYear = bornYear;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return this.name + this.phoneNumber + this.bornYear;
    }

}
