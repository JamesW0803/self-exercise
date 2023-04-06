import java.util.Scanner;

public class Main {
    //i will not do the loop again ngl hhhh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle: ");
        double firstSide = sc.nextDouble();

        System.out.println("Enter the length of the second side of the triangle: ");
        double secSide = sc.nextDouble();

        System.out.println("Enter the length of the third side of the triangle: ");
        double thirdSide = sc.nextDouble();

        if (thirdSide == Math.sqrt(Math.pow(firstSide, 2)) + Math.pow(secSide, 2)){
            System.out.println("The triangle is a right-angled triangle. ");
        }
        else if ((firstSide == secSide) || (firstSide == thirdSide) || (secSide == thirdSide)){
            System.out.println("The triangle is a isoceles triangle. ");
        }
        else if ((firstSide == secSide) && (firstSide == thirdSide) && (secSide == thirdSide)){
            System.out.println("The triangle is an equilateral triangle. ");
        }
        else{
            System.out.println("The triangle is an unknown type triangle. ");
        }
    }
}