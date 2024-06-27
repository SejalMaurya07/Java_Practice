import java.util.Scanner;

public class problem32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is palindrome or not");
        int num=input.nextInt();
        System.out.println(palindrome(num));
       int new1=palindrome(num);
       if(num==new1){
           System.out.println("The number is palindrome");
       }
       else{
           System.out.println("The number is not a palindrome");
       }

    }

    public static int palindrome(int num){
        int newnum=0;
        while(num>0){
            int rem=num%10;
            newnum=newnum*10+rem;
            num=num/10;

        }
        return newnum;
    }
}
