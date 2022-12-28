import java.util.Scanner;
import java.util.InputMismatchException;

public class MainApp {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculate = new Calculation();

    do {
      try {
        System.out.println("\n==========Calculator Shape Menu Program==========");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int pilihmenu = scanner.nextInt();
        switch (pilihmenu) {
          case 1: //square
            System.out.print("\nEnter the length of the side of the square : ");
            double side = scanner.nextDouble();
            calculate.setSquare(side);
            calculate.run();
            System.out.println("\nYour calculation result (square) : " + calculate.getSquare());
            break;
          case 2: //circle
            System.out.print("\nEnter the radius of the circle : ");
            double radius = scanner.nextDouble();
            calculate.setCircle(radius);
            calculate.run();
            System.out.println("\nYour calculation result (circle): " + calculate.getCircle());
            break;
          case 3: //trapezoid
            System.out.print("\n Insert the side of the base of the trapezoid :");
            double a = scanner.nextDouble();
            System.out.print("Enter the upper side of trapezoid : ");
            double b = scanner.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double t = scanner.nextDouble();
            calculate.setTrapezoid(a, b, t);
            calculate.run();
            System.out.println("\nYour calculation result (trapezoid): " + calculate.getTrapezoid());
            break;
          case 0: //exit
            System.out.println("\n=========Already Exit from This Program=========");
            break;
          default:
            System.out.println("\n Looks like you input wrong option! Option are not available in this menu. Please input based on menu ");
            continue;
            }
        repeat = false;
        } 

        catch (InputMismatchException e) {
        System.out.println("\n==========Error: Input must be a number==========");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }catch(Exception e) {
        System.out.println("Oops something went wrong");
    }
    } while (repeat);
    scanner.close();
  }
}