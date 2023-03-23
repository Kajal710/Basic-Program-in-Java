import java.util.Scanner;

class Largestnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the Second number:");
        int b=sc.nextInt();
        int largestno=(a>b)?a:b;
        System.out.print("Largest no is:"+largestno);
        sc.close();
    }
}