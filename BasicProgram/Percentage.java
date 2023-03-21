import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of Subject 1:");
        int a=sc.nextInt();
        System.out.print("Enter the marks of Subject 2:");
        int b=sc.nextInt();
        System.out.print("Enter the marksb of Subject 3:");
        int c=sc.nextInt();
        int per=a+b+c/3;
        System.out.print("Percentage is:"+per+"%");
        sc.close();
       }
    
}
