import java.util.Scanner;

public class cutstring {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String arr1[]=new String[10];
        String arr2[]=new String[10];
        String arr3[]=new String[10];
        System.out.println("enter size of complete string");
        int comp=input.nextInt();
        System.out.println("enter size of cut string");
        int cut1=input.nextInt();

        for(int i=0;i<comp;i++){
            System.out.print("Enter the alphabet of the string :" );
            String let=input.next();
            arr1[i]=let;
        }
        for(int i=0;i<cut1;i++){
            System.out.print("Enter the alphabet of the string which you want to cut:" );
            String let=input.next();
            arr2[i]=let;
        }

        cut(arr1,arr2,arr3,comp,cut1);

    }

    public static void cut(String arr1[],String arr2[],String arr3[],int comp,int cut1){
        System.out.println("hellow");
            int j=0;
            int i=0;
            while(j<cut1){
                if (arr1[i] != arr2[j]) {
                            arr3[i]=arr1[i];
                            System.out.println("hello1");
                        i++;
                }
                j++;
        }
        for(int k=0;k<arr3.length;k++){
            System.out.println(arr3[k]);
        }
    }

}
