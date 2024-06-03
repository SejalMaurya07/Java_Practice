import java.util.Scanner;

public class problem21 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number1");
        int num1=input.nextInt();
        System.out.println("enter number2");
        int num2=input.nextInt();
        int result= num1 & num2;
        System.out.println(result);
    }
}
