import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=input.nextInt();
        System.out.println("Enter num2");
        int num2=input.nextInt();
        System.out.println("numb1:"+num1+"\nnum2:"+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 :"+num1+"\nnum2:"+num2);

    }
}
