import java.util.Scanner;

public class problem19 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your marks in percentage to find your grade");
        float marks=input.nextFloat();
        if(marks>=90){
            System.out.println("grade A");
        } else if (marks<89&&marks>=75) {
            System.out.println("Grade - B");
        } else if (marks>=60&& marks<76) {
            System.out.println("Grade - C");
        } else if (marks>=30 && marks<59) {
            System.out.println("Grade - D");
        } else if (marks<30) {
            System.out.println("Grade - F");
        }
        else{
            System.out.println("Please enter valid percentage");
        }
    }
}
