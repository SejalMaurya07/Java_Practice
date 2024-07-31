import java.util.Scanner;

public class display {
    public static void main(String[] args) {



    }

    public static int[] fillarray() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the size of the array : ");
        int size = input.nextInt();
        int arra[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array : ");
            int val = input.nextInt();
            arra[i] = val;
        }
        return arra;

    }
    public static void display1(int ar1[]){
        for(int i=0;i<ar1.length;i++){
            System.out.print(ar1[i]+" ");
        }
    }

    // TwoDimensional array filling
    public static int[][] filltwofarray(int rows,int columns){
        Scanner input=new Scanner(System.in);
        int twoarray[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the element of the array : ");
                int element=input.nextInt();
                twoarray[i][j]=element;
            }
            System.out.println("");
        }
        return twoarray;
    }


    // TwoDimensional array display
    public static void display2(int arr[][],int row,int column){

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }

}
