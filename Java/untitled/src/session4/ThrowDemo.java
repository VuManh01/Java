package session4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    public static void validate(){
        try{
            //noi code
            int age = inputAge();
            if (age < 18){
                throw new ArithmeticException("Your age not validate");
            }else {
                System.out.println("Your age is validate");
            }
        }catch (InputMismatchException e){
            System.out.println("Input age not valid!!!");
        }
    }
    public static int inputAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age: ");
        int age = scanner.nextInt();
        return age;
    }
}
