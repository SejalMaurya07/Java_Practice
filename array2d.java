import java.util.Scanner;

public class array2d{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome here to search an element in two dimensional array !");
        System.out.println("Enter the size of the row :");
        int rows=input.nextInt();
        System.out.println("Enter the size of the columns :");
        int columns=input.nextInt();
       int arr[][]= display.filltwofarray(rows,columns);
        display.display2(arr,rows,columns);
        System.out.println("Enter the target element which you want to find : ");
        int target=input.nextInt();
        boolean ans=search(arr,target);
        if(ans){
            System.out.println("Element is present here!");
        }
        else {
            System.out.println("Sorry !Element is not present here .");
        }
    }

    public static boolean search(int arr[][],int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }

        return false;
    }
}
