package principla;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> list = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int qtd = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<qtd;i++){
            System.out.printf("Shape #%d data: \n", i+1);
            System.out.print("Rectangle or Circle (r, c)? ");
            char option = sc.nextLine().charAt(0);
            char lowerOption = Character.toLowerCase(option);
            System.out.print("Color (BLACK/BLUE/RED): ");

            //LE OQ O USUARIO DIGITOU E PEGAR O VALOR E TRANSFORMA PARA COLOR
            Color color = Color.valueOf(sc.nextLine().toUpperCase());

            switch (lowerOption){
                case 'r':
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    sc.nextLine();
                    list.add(new Rectangle(color, width, height));
                    break;
                case 'c':
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    sc.nextLine();
                    list.add(new Circle(color, radius));
                    break;
            }
        }

        System.out.println("\n\nShape areas: ");
        for (Shape s : list){
            System.out.println(s);
            System.out.println();
        }







        sc.close();
    }
}
