package session6;

import java.util.HashMap;
import java.util.Map;

public class InterfaceMap {
    public static void main(String[] args) {
        // Khởi tạo một map (Map) để lưu trữ thông tin với cặp key-value
        Map<String, Integer> ageMap = new HashMap<>();

        // Thêm thông tin vào map
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Alice", 27); // Ghi đè giá trị của key "Alice" thành 27

        // Truy cập thông tin trong map
        System.out.println("Tuổi của Alice là: " + ageMap.get("Alice"));
        System.out.println("Tuổi của Bob là: " + ageMap.get("Bob"));

        // Duyệt qua các cặp key-value trong map và in ra màn hình
        System.out.println("Danh sách các cặp key-value trong map:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
