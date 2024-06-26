import java.util.Scanner;

public class problem26 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number to find the LCM");
        int first=input.nextInt();
        System.out.println("enter number to find the LCM");
        int second=input.nextInt();
        System.out.println("this is the LCM of the number "+(lcm(first,second)));
    }

    public static int lcm(int first,int second){

        for(int i=1;i<=second;i++){
            int factor=i*first;
            if(factor%second==0) {
                return factor;
            }
        }
       return 0;
    }
}
