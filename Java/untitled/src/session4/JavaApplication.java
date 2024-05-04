package session4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication {
    //Khối lệnh try catch finally
    //try{
    // code có thể ném ra ngoại lệ
    // }catch(Exception_class_name e){
    //code xử lỹ ngoại lệ
    // }finally{
    //code trong khối này luôn được thực thi
    // }

    //Một số phương thức (method) của lớp Exception
    //getMessage(): trả về 1 message cụ thể về exception đã xảy ra
    //getCause(): trả về nguyên nhân xảy ra exception
    //toString(): trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
    //printStackTrace(): in ra kết quả của phương thức toString cùng với stack trace đến System.err
    //fillInStackTrace(): Làm đầy stack trace của đối tượng Throwable bằng stack trace hiện tại
    //sau throw là 1 hoặc nhiều instance
    //không thể throw nhiều exceptions


    //Throw và Throws
    //Từ khoá throw trong java được sử dụng để ném ra 1 ngoại lệ (exception) cụ thể
    //Chúng ta có thể ném ra 2 ngoại lệ checked và unchecked trong java bằng throw
    //Throw chủ yếu được sử dụng để ném ra 1 ngoại lệ tuỳ chỉnh(ngoại lệ do người dùng định nghĩa)

    //Từ khoá Throws trong java được sử dụng để khi bạn không muốn phải xây dựng try catch bên trong 1 phương thức nào đó(đẩy trách nhiệm phải try catch này cho phương thức nào đó bên ngoài có gọi đến nó phải try catch giúp bạn)
    //Sau throws là 1 hoặc nhiều class
    //Có tể khai báo nhiều exceptions
    //ví dụ: public void methodName() throws IOException,SQLException{...}
    public static void main(String[] args) throws Exception {
//        ThrowDemo.validate();
//        ThrowsDemo.getAge();

        //Custom exception
        try{
            int age = inputAge();
            System.out.println("Tuoi da nhap: " + age);
        }catch (AgeCheckingExc e){
            System.out.println(e.getMessage());
        }
    }




    static int inputAge() throws AgeCheckingExc {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCheckingExc("uoi khong duoc nho hon 0");
        } catch (InputMismatchException e) {
            throw new AgeCheckingExc("Tuoi phai la so(number)");
        }
        return age;
    }

    public void main() {
    }
}
