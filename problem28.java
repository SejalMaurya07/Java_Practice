import java.util.Scanner;

public class problem28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to prime checker");
        System.out.println("enter the number to check whether it is prime or not");
        int num=input.nextInt();
        boolean isboolean=prime(num);
        if(isboolean){
            System.out.println("the number is prime number");
        }
        else{
            System.out.println("The number is not a prime number");
        }
    }

    public static boolean prime(int num){

        for(int i=2;i<num;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
