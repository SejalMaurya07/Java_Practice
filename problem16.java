import java.util.Scanner;

public class problem16 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to check even and odd");
        int num=input.nextInt();
        int rem;
        rem=num%2;
        if(rem==0){
            System.out.println("This is even number as it is completely divisible by 2");
        }
        else{
            System.out.println("This is odd number");
        }
    }
}
