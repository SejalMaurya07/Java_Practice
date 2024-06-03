import java.util.Scanner;

public class problem23 {


    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int num = input.nextInt();
        oddsum(num);
        System.out.println("The sum of the numbers till "+num+" is : "+oddsum(num));;
    }

    public static int oddsum(int num){
        int sum=0;
        for(int i=1;i<=num;i=i+2){
          sum=sum+i  ;
        }
        return sum;
    }


}
