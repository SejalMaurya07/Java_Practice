import java.util.Scanner;

public class problem33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("This is the code to print the pattern");
        System.out.println("Enter the value of  i");
        int row=input.nextInt();
        System.out.println("Enter the value of j");
        int column= input.nextInt();
        pattern7(row,column);
    }

    //pattern to print square
    public static void pattern(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //pattern to print hollow square
    public static void pattern2(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || j==1 || i==row || j==column){
                    System.out.print("*\t");
                }
               else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    // pattern to print half pyramid
    public static void pattern3(int row,int column){
        for(int i=1; i<=row;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
            System.out.println(" ");
        }
    }

    public static void pattern4(int row,int column){
        for(int i=row; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void pattern5(int row,int column){
        for(int i=1; i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern6(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int row,int column){
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
