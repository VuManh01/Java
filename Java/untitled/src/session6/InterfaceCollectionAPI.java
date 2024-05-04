package session6;

import java.util.ArrayList;
import java.util.Collection;

public class InterfaceCollectionAPI {
    public static void main(String[] args) {
        // Giả lập dữ liệu từ API
        String apiResponse = "[{\"id\": 1, \"name\": \"John\"}, {\"id\": 2, \"name\": \"Alice\"}, {\"id\": 3, \"name\": \"Bob\"}]";

        // Tạo một Collection để lưu trữ dữ liệu từ API
        Collection<String> apiData = new ArrayList<>();

        // Giả định chuyển đổi dữ liệu từ API thành Collection
        String[] dataArray = apiResponse.split(",");
        for (String data : dataArray) {
            apiData.add(data);
        }

        // Duyệt qua dữ liệu từ API trong Collection và in ra màn hình
        System.out.println("Dữ liệu từ API:");
        for (String data : apiData) {
            System.out.println(data);
        }
    }
}

