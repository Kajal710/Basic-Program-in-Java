import java.util.Scanner;

/* WAP to enter the three subject marks of a Student and
 calculate the total and percentage According to the percentage
 print the Suitable Grade-
  <50 --> fail
  >=50 and <60 -->D Grade
  >=60 and <70 -->C Grade
  =>70 and <80 -->B Grade
  >80 -->A Grade
 */
public class Grading {
    public static void main(String[] args) {
        System.out.print("Enter the Marks of First Subject:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter the Marks of Second Subject:");
        int b=sc.nextInt();
        System.out.print("Enter the Marks of Third Subject:");
        int c=sc.nextInt();
        int per=a+b+c/3;
        if(per<50){
            System.out.print("Fail");
        }
        if(per>=50&&per<60){
            System.out.print("D Grade");
        }
        if(per>=60&&per<70){
            System.out.print("C Grade");
        }
        if(per>=70&&per<80){
            System.out.print("B Grade");
        }
        if(per>80){
            System.out.print("A Grade");
        }
        sc.close();
    }
    
}
