import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int barry[]=ArrayUtility.arrayfil();
        long sum1=sum(barry);
        double ans=avg(barry,sum1);
        System.out.println(" The sum of the number is : " +sum1);
        System.out.println("The average of the number is " +ans);

    }



     public static long sum(int arr[]) {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i];
         }
         return sum;
     }

     public static double avg(int arr[],long sum1){
           double avg=sum1/arr.length;
           return avg;
        }


}
