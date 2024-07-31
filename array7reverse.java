public class array7reverse {
    public static void main(String[] args) {
        System.out.println("Welcome Here ! You can reverse your array ");
        int arr[]=display.fillarray();
        System.out.println("This is your array : ");
        display.display1(arr);
        int newarr[]=reverse(arr);
        System.out.println(" ");
        System.out.println("Reverse of the given array : ");
        display.display1(newarr);


    }
    public static int[] reverse(int arr[]){
        int size=arr.length;
        int newarray[]=new int[size];
        for(int i=0;i<size;i++){
            newarray[i]=arr[size-i-1];
        }
        return newarray;
    }
}
