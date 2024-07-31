public class array9merge{
    public static void main(String args[]){
        System.out.println("Welcome here! You can merge the only two sorted array. Your array must be sorted .");
        int arr1[]=display.fillarray();
        display.display1(arr1);
        int arr2[]=display.fillarray();
        display.display1(arr2);
        mergesort(arr1,arr2);
        int newarray[]= mergesort(arr1,arr2);
        System.out.println("The sorted merge array");
        display.display1(newarray);

    }

    public static int[] mergesort(int arr1[],int arr2[]){
        int size=arr1.length+arr2.length;
        int newarray[]=new int[size];

        int i=0,j=0,k=0;
        while(i< arr1.length||j<arr2.length)
        {
            if(j==arr2.length||(i<arr1.length && arr1[i]<arr2[j])){
                newarray[k]=arr1[i];
                i++;
                k++;
            }
            else{
                newarray[k]=arr2[j];
                j++;
                k++;
            }
        }


        return newarray;
    }
}
