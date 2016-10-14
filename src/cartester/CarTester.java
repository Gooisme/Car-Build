/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

import java.util.Scanner;

/**
 *
 * @author nokid4249
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializes the scanner for car parts
        Scanner in = new Scanner(System.in);
        //Sets the first two cars up
        Car car1 = new Car("400000", "Super Boost", "Bullet-proof", "No Time Travel", "2014", "Knowledge Mobeels", "Super Frog", 0);
        Car car2 = new Car("2", "No Boost", "Not Bullet-proof", "No Time Travel", "1878", "Dingus Drivers", "Doofus Car",0);
        //Gets the input for all the car parts
        System.out.println("CUSTOM CAR CREATION \nWhat is the price? (Enter a number ex. 1, 2, 5)");
        String carPriceWord = in.nextLine();
        System.out.println("\nIs there Turbo Boost?");
        String boostWord = in.nextLine();
        System.out.println("\nIs it bullet Proof?");
        String proofWord = in.nextLine();
        System.out.println("\nDoes it have Time Travel Abilities?");
        String travelWord = in.nextLine();
        System.out.println("\nWhat year was it made? (enter a year number ex. 1998)");
        String yearWord = in.nextLine();
        System.out.println("\nWhat is the company that made it?");
        String makeWord = in.nextLine();
        System.out.println("\nWhat is the name of the car?");
        String modelWord = in.nextLine();
        System.out.println("Would you like it to beep?(1= yes, 0= no)");
        int beepBeep = in.nextInt();
        
        //sets the car parts to car3
        Car car3 = new Car(carPriceWord, boostWord, proofWord, travelWord, yearWord, makeWord, modelWord,beepBeep);
        //outputs cars
        System.out.println(car1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(car2.toString());
        System.out.println("---------------------------------------------");
        System.out.println(car3.toString());
        System.out.println("---------------------------------------------");
    }

}
