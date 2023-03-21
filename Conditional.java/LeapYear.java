import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0||(n%4==0 && n%100==0)){
            System.out.print("Leap Year..");
        }
        else{
            System.out.print("Not a Leap Year..");
        }
        sc.close();
    }
    
}
