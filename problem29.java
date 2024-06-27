import java.util.Scanner;

public class problem29 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to reverse that number");
        int num=input.nextInt();
        int reversenum=reverse(num);
        System.out.println(reversenum);

    }

    public static int reverse(int num){
      int newnumber=0;
      while(num>0){

          int rem=num%10;
          newnumber=newnumber*10+rem;
          num=num/10;

      }
        return newnumber;

    }
}

