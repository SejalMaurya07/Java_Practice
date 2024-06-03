import java.util.Scanner;
public class interest {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter principle amount");
        double pa= input.nextDouble();
        System.out.println("enter time");
        double time = input.nextDouble();
        System.out.println("enter rate");
        double rate= input.nextDouble();
        double SI=(pa*time*rate)/100;
        System.out.println("Simple Interest :"+SI);
    }

}
