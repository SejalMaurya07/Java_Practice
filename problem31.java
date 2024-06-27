import java.util.Scanner;

public class problem31 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not");
        int num=input.nextInt();
        int sum=armstrong(num);
        if(sum==num){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }

    }
    public static int armstrong(int num){
        int sum=0;
        while(num>0){

            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;

        }
        return sum;
    }
}
