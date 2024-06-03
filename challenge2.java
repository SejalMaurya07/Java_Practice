import java.util.Scanner;
public class challenge2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number1 ");
        int num1= input.nextInt();
        System.out.println("Enter number2");
        int num2= input.nextInt();
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int rem=num1%num2;
        System.out.println("submittion of the number is: "+sum);
        System.out.println("subtraction of the number is: "+sub);
        System.out.println("multiplication of the number is: "+mul);
        System.out.println("division of the number is: "+div);
        System.out.println("division of the number is: "+rem);
    }
}
