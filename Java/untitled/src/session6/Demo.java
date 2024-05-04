package session6;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // Khởi tạo một danh sách (List) các số nguyên
        List<Integer> numberList = new ArrayList<>();

        // Thêm các số nguyên vào danh sách
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        // Duyệt qua các phần tử trong danh sách và in ra màn hình
        System.out.println("Các số trong danh sách:");
        for (Integer number : numberList) {
            System.out.println(number);
        }
    }
}
