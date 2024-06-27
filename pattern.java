import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        pattern3();
    }

    public static void pattern1(){
        int num=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+1 +"\t");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern2(){
        int num=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){

                if( num==0){
                    System.out.print("1\t");
                    num=num-1;
                }
                else{
                    System.out.print("0\t");
                    num=num+1;
                }
            }
            System.out.println();
        }
    }

    public static void pattern3(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1\t");
                }
                else{
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}
