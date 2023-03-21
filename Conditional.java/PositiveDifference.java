import java.util.Scanner;

public class PositiveDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a=sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();
        int diff;
        if(a>b){
            diff=a-b;
            
        }
        else{
            diff=b-a;
        }
        System.out.print("Positive Difference is:"+diff);
        sc.close();
    }
    
}
