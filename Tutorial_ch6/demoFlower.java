package Tutorial_ch6;
import java.util.Scanner;
public class demoFlower {
    public static void main(String[] args) {
       //Create a program that tests the class Flower described
        // in the previous question, as follow:

        //1.	Create an object named flower1 of type Flower.
        Flower flower1 = new Flower();
        //2.	Display the name and price of flower1.
        flower1.print();
        //3.	Prompt the user to enter name and price for flower1.
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter name and price : ");

        flower1.setFlower(kbd.next(),kbd.nextDouble());

        //4.	Create an object named flower2 of type Flower.

        //5.	Display the name and price of flower2.
        //6.	Prompt the user to enter name and price for flower2.
        System.out.println("Enter name and price for flower 2: ");
        Flower flower2= new Flower(kbd.next(),kbd.nextDouble());
        //7.	Use get method to display NumberOfFlowers
        System.out.println(Flower.getNumberOfFlowers());
        System.out.println(flower1.getNumberOfFlowers());//not best
        System.out.println(flower2.getNumberOfFlowers());//not best
    }//main
}//class
