package session5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IntegerArrayDemo integerArrayDemo = new IntegerArrayDemo();
        System.out.println("How many element of array: ");
        int size = sc.nextInt();
        int intArray[] = new int[size];
        //Pass an array to function
        integerArrayDemo.createArray(intArray);
        //Show before sort
        integerArrayDemo.show(intArray);
        System.out.println("Length of array: " + intArray.length);
        System.out.println("Value of index 3: " + intArray[3]);
        //Sort
        integerArrayDemo.ascSort(intArray);
        //Show after sort
        integerArrayDemo.show(intArray);
        System.out.println("Length of array: " + intArray.length);
        stringArrayDemo();
    }
    static void stringArrayDemo(){
        String stringArray[] = new String[5];
        stringArray[0] = "Adu";
        stringArray[1] = "Adu1";
        stringArray[2] = "Adu2";
        stringArray[3] = "Adu3";
        stringArray[4] = "Adu4";
        for (int i = 0; i < stringArray.length; i++){
            System.out.println("String array at: " + stringArray[i]);
        }
    }
}
