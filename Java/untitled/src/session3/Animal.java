package session3;
//lớp này có thể chứa 1 hoặc nhiều phương thức abstract

public abstract class Animal {
    private String name;
    public Animal(){
        //Gan gia tri mac dinh cho name
//        this.name = "Tom";
        this.name = this.getAnimalName();
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //abstract: Đây là lớp trừu tượng -> có thể được sửa ở lớp con
    //Lớp con định nghĩa lại hành vi mà nó muốn
    //Thể hiện tính chất đa hình
    //Không chứa mã(code) bên trong
    //Nó phải thuộc về 1 lớp Abstract
    public abstract String getAnimalName();
}
