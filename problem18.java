import java.util.Scanner;

public class problem18 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("enter year to find the leap year");
        int year=input.nextInt();
        int rem=year%4;
        if(rem==0){
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
    }
}
