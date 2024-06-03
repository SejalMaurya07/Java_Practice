import java.util.Scanner;

public class problem17 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        System.out.println("Enter the third number");
        int num3=input.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("num1 is grestest among all three number");
        } else if (num2>num1&&num2>num3) {
            System.out.println("num2 is grestest among all three number");
        }
        else{
            System.out.println("num3 is grestest among all three number");
        }
    }
}
