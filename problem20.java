import java.util.Scanner;

public class problem20 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age to see in which category you are?");
        int age=input.nextInt();
        if(age<=13 && age>0){
            System.out.println("you are a child");
        } else if (age>13 && age<=20) {
            System.out.println("You are a teenage");
        } else if (age>20 && age<=60) {
            System.out.println("You are adult");
        }
        else if(age>60){
            System.out.println(" you are senior citizen");
        }

    }
}
