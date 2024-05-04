package session4;
//Custom exception
//Ngoai le do nguoi dung dinh nghia
public class AgeCheckingExc extends Exception{
    //đây là phương thức tự định nghĩa
    public AgeCheckingExc(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Loi nhap vo tuoi: " + super.getMessage();
    }
}
