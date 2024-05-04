package session6;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) {
        // Khởi tạo một danh sách (List) các số nguyên
        List<Integer> numberList = new ArrayList<>();

        // Thêm các số nguyên vào danh sách
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        // Duyệt qua danh sách và in ra màn hình
        System.out.println("Danh sách các số nguyên:");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }
    }
}
