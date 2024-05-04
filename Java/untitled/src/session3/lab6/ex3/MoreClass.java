package session3.lab6.ex3;

public class MoreClass {
    public static void main(String[] args){
        Object obj1 = new Object();
        System.out.println(obj1);

        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(obj2);
    }
}
// obj1 không có phương thức toString , vì vậy sẽ in ra 1 chuỗi kí tự là java.lang.Object@6acbcfc0
//trong đó java.lang.Object là tên lớp và 6acbcfc0 là địa chỉ của bộ nhớ
// obj2 có phương thức toString nên có thể in ra chi tiết thay vì chuỗi mặc định như obj1
