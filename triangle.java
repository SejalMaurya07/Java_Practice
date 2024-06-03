import java.util.Scanner;

public class triangle{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter base of the triangle:");
        double base=input.nextInt();
        System.out.println("enter height of the triangle:");
        double height=input.nextInt();
        double area=(0.5*base*height);
        System.out.println("area of the triangle is :"+area);

    }
}