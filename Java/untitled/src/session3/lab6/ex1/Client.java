package session3.lab6.ex1;

public class Client {
    public Client() {
        //To Do:
    }

    public void doUnChecked(String value){
        //Can phai check exception, neu khong --> bug
        int result = canThrowUncheckedException(value);
        System.out.println("result="+result);
    }

    private int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }
//canThrowUncheckedException ném ra một unchecked exception vì nó không khai báo bất kỳ checked exception nào bằng từ khóa throws.
    public void doChecked(){
        try{
            //Buoc phai check exceptions o day! Khong cach nao khac
            canThrowCheckedException();
            System.out.println("OK");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    private int canThrowCheckedException() throws Exception{
        throw new Exception("Failure");
    }
}
//Phương thức canThrowCheckedException ném ra một checked exception vì nó khai báo rằng nó có thể ném ra một Exception bằng từ khóa throws.
//Việc bắt lớp Ngoại lệ chung không được khuyến khích vì nó bắt được tất cả các ngoại lệ, bao gồm cả các ngoại lệ và lỗi không được kiểm tra. Điều này có thể dẫn đến việc che giấu các lỗi nghiêm trọng hoặc các trường hợp ngoại lệ không mong muốn không nên phát hiện và xử lý ở cấp độ đó.
//Tốt hơn là nên nắm bắt các ngoại lệ cụ thể hoặc ít nhất là nắm bắt các ngoại lệ đã kiểm tra dự kiến sẽ được mã ném ra. Điều này cho phép xử lý ngoại lệ có mục tiêu tốt hơn và kiểm soát tốt hơn luồng chương trình.
//Việc nắm bắt các ngoại lệ cụ thể cũng làm cho mã dễ đọc và dễ bảo trì hơn vì nó hiển thị rõ ràng những ngoại lệ nào đang được xử lý và cách chúng được xử lý.
