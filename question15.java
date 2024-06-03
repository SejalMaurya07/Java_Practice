import java.util.Scanner;

public class question15 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to check positive,negative,zero");
        float num=input.nextFloat();

        if(num>0){
            System.out.println("This is positive number");
        }
        else if (num<0) {
            System.out.println("This is negative number");
        }
        else {
            System.out.println("This is zero");
        }
    }
}
