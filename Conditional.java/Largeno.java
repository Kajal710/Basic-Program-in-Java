import java.util.Scanner;

class Largeno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a=sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();
        if(a>b){
            System.out.print("First Number is largest");
        }
        else{
            System.out.println("Second Number is Largest");
        }
        sc.close();
    }
}