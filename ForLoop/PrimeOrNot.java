import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int ch=0;
        System.out.print("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
              ch=1; 
              break;
            }
        }
        if(ch==0)
            System.out.println("prime number");
             else{
            System.out.println("Not a prime number");
            }
            sc.close();
        }
        

    }
    

