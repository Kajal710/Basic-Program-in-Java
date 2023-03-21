import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principal Amount:");
        double p=sc.nextInt();
        System.out.print("Enter the rate:");
        double r=sc.nextInt();
        System.out.print("Enter the Time:");
        double t=sc.nextInt();
        double SI=(p*r*t)/100;
        System.out.print("Simple Interest is:"+SI);
        sc.close();

    }
    
}
