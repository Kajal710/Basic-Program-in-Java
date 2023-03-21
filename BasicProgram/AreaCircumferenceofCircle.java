import java.util.Scanner;

class AreaCircumferenceofCircle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of circle:");
        double r=sc.nextInt();
        double Area=3.14*r*r;
        double circum=2*3.14*r;
        System.out.println("Area of Circle is:"+Area);
        System.out.println("Circumference of circle is:"+circum);
        sc.close();
    }
}