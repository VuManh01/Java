package session6;

import java.util.LinkedList;
import java.util.Queue;

public class InterfaceQueue {
    public static void main(String[] args) {
        // Khởi tạo một hàng đợi (Queue) sử dụng LinkedList
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi (enqueue)
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // In ra phần tử đầu tiên trong hàng đợi
        System.out.println("Phần tử đầu tiên trong hàng đợi: " + queue.peek());

        // Lấy phần tử đầu tiên ra khỏi hàng đợi (dequeue)
        String firstElement = queue.poll();
        System.out.println("Phần tử đầu tiên đã được lấy ra: " + firstElement);

        // Duyệt qua các phần tử còn lại trong hàng đợi và in ra màn hình
        System.out.println("Các phần tử còn lại trong hàng đợi:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
