import java.util.Scanner;

public class problem25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number whose sum of digit you want to find : ");
        int num=input.nextInt();
        System.out.println("The sum of the digit is : "+(sumofdigit(num)));

    }
    public static int sumofdigit(int num){
        int rem=0;
        while(num>0) {
            rem=rem+(num%10);
            num=num/10;
        }
        return rem;
    }
}
