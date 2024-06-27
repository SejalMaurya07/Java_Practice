import java.util.Scanner;

public class problem30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number that how many fibbonacci series you want to find : ");
        int num=input.nextInt();
        System.out.println("Here the fibbonacci series");
        fibbo(num);
    }
    public static void fibbo(int num){
        int num1=0;
        int num2=1;
        int num3;

        if (num == 0) {
            System.out.println("0");

        } else if (num == 1) {
            System.out.println("0");
        } else {
            System.out.print("0");
            System.out.print(" 1");
            for (int i = 1; i <= num - 2; i++) {
                num3 = num1 + num2;
                System.out.print(" "+num3);
                num1 = num2;
                num2 = num3;


            }
        }
    }
}
