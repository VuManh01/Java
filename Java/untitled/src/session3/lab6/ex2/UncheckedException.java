package session3.lab6.ex2;

public class UncheckedException {
    //Constructor for objects of class session2.Client
    public UncheckedException(){
        //To Do:
    }

    public static void main(String[] args ){
        int i, n = 2;
        int a[] = new int[n];
        //Declare Scanner Object named input
        java.util.Scanner input = new java.util.Scanner(System.in);

        for (i = 0; i <= n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = input.nextInt();
        }
    }
}
// có 3 lỗi xảy ra . 1 là đã khai báo mảng a với 2 phần tử , nếu truy cập quá phần tử sẽ gây ra lỗi
// 2 là phương thức input chưa được khai báo trong thư viện nên chương trình không biên dịch được phương thức này
// 3 là nếu nhập vào 1 kí tự khác số nguyên , chương trình sẽ bị lỗi
