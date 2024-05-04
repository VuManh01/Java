package session6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class InterfaceCollection {


        public static void main(String[] args) {
            // Khởi tạo một đối tượng Collection để lưu trữ chuỗi
            Collection<String> stringCollection = new ArrayList<>();

            // Thêm các chuỗi vào Collection
            stringCollection.add("Hello");
            stringCollection.add("World");
            stringCollection.add("Java");

            // Duyệt qua các phần tử trong Collection sử dụng Iterator
            Iterator<String> iterator = stringCollection.iterator();
            System.out.println("Các chuỗi trong Collection:");
            while(iterator.hasNext()) {
                String str = iterator.next();
                System.out.println(str);
            }
        }


}
