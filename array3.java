import java.util.Scanner;

public class array3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arr[]=ArrayUtility.arrayfil();
        System.out.println("Enter the number whose occurence you want to find");
        int num=input.nextInt();
        int occ=findocc(arr,num);
        System.out.println("The number is occured " +occ+ " times in the array");
    }

    public static int findocc(int arr[],int num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count=count+1;
            }
        }
        return count;
    }
}
