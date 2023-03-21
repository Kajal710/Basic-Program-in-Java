import java.util.Scanner;

public class Divisibleby7ornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        if(n%7==0){
            System.out.print("yehhhh!!! Number is Divisible by 7...");
        }
        else{
            System.out.print("Oopss!! not Divisible by 7...");
        }
        sc.close();
    }
    
}
