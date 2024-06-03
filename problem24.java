import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter the number whose factorial you want to calculate : ");
        int num= input.nextInt();
        System.out.println("The factorial of the number " +num+ " is :"+(facto(num)));

    }
    public static int facto(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
