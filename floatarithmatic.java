import java.util.Scanner;

public class floatarithmatic {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter double number1");
        double num1=input.nextDouble();
        System.out.println("Enter double number2");
        double num2=input.nextDouble();
        double mul=num2*num1;
        System.out.println(mul);
    }
}
