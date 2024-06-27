import java.util.Scanner;

public class problem27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number1");
        int first=input.nextInt();
        System.out.println("Enter number2");
        int second=input.nextInt();
        System.out.println("this is the gcd :" + (gcd(first,second)));

    }

    public static int gcd(int first,int second){
        int gcd=1;
        int leastnum=least(first,second);
        for(int i=2;i<=leastnum;i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int least(int first,int second){
        if(first<=second){
            return first;
        }
        else{
            return second;
        }
    }
}

