package day02;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double width;
        double height;

        System.out.print("Kérem az első téglalap szélességét: ");
        width = sc.nextDouble();
        //sc.nextLine();
        System.out.print("Kérem az első téglalap magasságát: ");
        height = sc.nextDouble();
        sc.nextLine();
        Rectangle rectangle1 = new Rectangle(width, height);

        System.out.print("Kérem az első téglalap szélességét: ");
        width = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem az első téglalap magasságát: ");
        height = sc.nextDouble();
        sc.nextLine();
        Rectangle rectangle2 = new Rectangle(width, height);

        System.out.println("Az első téglalap területe: ");
        System.out.println(rectangle1.getWidth() + " * " + rectangle1.getHeight() + " = " + rectangle1.calculateArea());
        System.out.println(rectangle2.getWidth() + " * " + rectangle2.getHeight() + " = " + rectangle2.calculateArea());
    }
}
