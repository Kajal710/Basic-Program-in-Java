import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a=sc.nextInt();
        System.out.print("Enter the second Number:");
        int b=sc.nextInt();
        int c=a*b;
        System.out.print("Product is:"+c);
        sc.close();
    }
    
}
