import java.util.Scanner;

public class lec1 {
    public static void main(String args[]){
      Scanner input=new Scanner(System.in);

      System.out.println("Enter number 1");
        int num1=input.nextInt();

        System.out.println("Enter number 2");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of the number is :" +sum);
    }
}
