import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the Number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.print("Number is Positive");
        }
        else{
            System.out.print("Number is Negative");
        }
        sc.close();
    }
    
}
