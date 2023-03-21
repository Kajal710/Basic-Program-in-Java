import java.util.Scanner;

/*WAP to enter the electricity Units and Calculate the Bill 
 accoring to the Following Conditions.
 <= 100 units charge 40ps per unit
 Next 200 units charge 50rps per unit
 >300n units charge 60 per unit..
 */
public class Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Units:");
        int unit=sc.nextInt();
        double bill=0;
        if(unit<=100){
            bill=unit*40;
        }
        if(unit>100 && unit<=300){
           bill=40+(unit-100)*50;

        }
        if(unit>300){
            bill=140+(unit-300)*60;
        }
        System.out.print(bill);
        sc.close();
    }
}
