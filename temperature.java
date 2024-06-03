import java.util.Scanner;

public class temperature {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter temperature in celsius");
        double fer=input.nextInt();
        double temp=((fer-32)*5)/9;

        System.out.println("tempature in celsius"+temp);

    }
}
