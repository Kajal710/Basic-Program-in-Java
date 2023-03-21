import java.util.Scanner;

public class Smallestin3no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a=sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();
        System.out.print("Enter the Third Number:");
        int c=sc.nextInt();
        if(a<b && a<c){
            System.out.print("First Number is Small!!!");
        }
        else if(b<a && b<c){
            System.out.print("Second Number is Small!!!");
        }
        else if(c<a && c<b){
            System.out.print("Third Number is Small!!!");
        }
        sc.close();
    }
    
}
