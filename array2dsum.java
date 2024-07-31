import java.util.Scanner;

public class array2dsum {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome here to find out the sum and average of the 2d array");
        System.out.println("Enter the size of the row :");
        int rows=input.nextInt();
        System.out.println("Enter the size of the columns :");
        int columns=input.nextInt();
        int arr[][]= display.filltwofarray(rows,columns);
        display.display2(arr,rows,columns);
        int sum=sum(arr,rows,columns);
        System.out.println("The sum of the array is : "+sum);
        float average=average(sum,arr,rows,columns);
        System.out.println(average);
    }

    public static int sum(int arr[][],int rows,int columns){
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum=sum+arr[i][j];
            }
        }
        return sum;
    }

    public static float average(int sum,int arr[][],int rows,int columns){

        if(sum==0){
            return 0;
        }
        else {
            float average;
            int n = rows * columns;
            average = sum / n;
            return average;
        }
    }
}
