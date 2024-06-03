import javax.swing.*;
import java.util.Scanner;

public class problem22 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number whose table you want to print");
        int num=input.nextInt();
        System.out.println("Using For Loop");
        table1(num);
        System.out.println("Using While Loop");
        table2(num);

    }
     public static void table1(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
     }

     public static void table2(int num){
        int j=1;
        while(j<=10){
            System.out.println(num+"*"+j+"="+(num*j));
            j++;
        }
     }

}
