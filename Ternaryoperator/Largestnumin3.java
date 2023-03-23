import java.util.Scanner;

public class Largestnumin3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largestnum=(a>b?((a>c)?a:c):((b>c)?b:c));
        System.out.print("Largest Number:"+largestnum);
        sc.close();
    }
    
}
