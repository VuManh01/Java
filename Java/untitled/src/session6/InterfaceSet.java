package session6;

import java.util.HashSet;
import java.util.Set;

public class InterfaceSet{
    public static void main(String[] args) {
        // Khởi tạo một tập hợp (Set) các số nguyên duy nhất
        Set<Integer> numberSet = new HashSet<>();

        // Thêm các số nguyên vào tập hợp
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(10); // Phần tử này sẽ không được thêm vào vì tập hợp Set không chứa phần tử trùng lặp

        // Duyệt qua tập hợp và in ra màn hình
        System.out.println("Tập hợp các số nguyên duy nhất:");
        for (int num : numberSet) {
            System.out.println(num);
        }
    }
}

