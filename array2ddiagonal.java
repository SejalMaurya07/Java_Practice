import java.util.Scanner;

public class array2ddiagonal {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome hree to find the sum of two diagonal element of the square matrix!");
        System.out.println("Enter the size of the rows");
        int rows=input.nextInt();
        System.out.println("Enter the size of the columns");
        int columns=input.nextInt();
        int arr[][]=display.filltwofarray(rows,columns);
        display.display2(arr,rows,columns);
        int suml=sumofleftdiagonal(arr,rows,columns);
        System.out.println("The sum of left diagonal is :"+suml);
        int sumr=sumofrightdiagonal(arr,rows,columns);
        System.out.println("The sum of the right diagonal is :"+sumr);
        int sum=digonalsum(arr,suml,sumr);
        System.out.println("The sum of the diagonal element is :"+sum);
    }

    public static int digonalsum(int arr[][],int suml,int sumr){
        int sum=suml+sumr;
        System.out.println(arr.length);
        if(arr.length%2!=0){
            int ind=arr.length/2;
            sum=sum-arr[ind][ind];
        }

        return sum;
    }


    public static int sumofleftdiagonal(int arr[][],int rows, int columns){
        int suml=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j) {
                    suml = suml + arr[i][j];
                }
            }
        }
        return suml;
    }

    public static int sumofrightdiagonal(int arr[][],int rows, int columns){
       int sumr=0;
       for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               if(i+j==rows-1){
                   sumr=sumr+arr[i][j];
               }
           }
       }
        return sumr;
    }

}
