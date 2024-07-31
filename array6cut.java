import java.util.Scanner;

public class array6cut {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to coding world");
        System.out.println("This is delete of specific element from the array");
        int arr[]=display.fillarray();
        display.display1(arr);
        System.out.println(" ");
        System.out.println("Enter the element which you want to delete : ");
        int delnum=input.nextInt();
        int newsize=ocuur(arr,delnum);
        System.out.println("The occurence of the target number is : "+newsize );
       int cutarr[]= cut(arr,delnum,newsize);
        System.out.println("Here is the new array after deleting the items : ");
       display.display1(cutarr);

    }

    public static int ocuur(int arr[],int delnum){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==delnum){
                j++;
            }
        }
        return j;
    }

    public static int[] cut(int arr[],int delnum,int newsize){

        int size1=arr.length-newsize;
        int arr3[] = new int[size1];
        int i=0,j=0;
        while(i<size1){
         if(arr[j]!=delnum){
             arr3[i]=arr[j];
             i++;
         }
         j++;
     }
     return arr3;
    }
}
