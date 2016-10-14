/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author nokid4249
 */
public class Car {
    //initializes the car parts 
    String carMake, carModel, carTimeTravel, carBulletProof, carTurboBoost;
    String carPrice;
    String carYear;

    public Car() {
        //states the default car parts
        carPrice = "0";
        carTurboBoost = "No";
        carBulletProof = "No";
        carTimeTravel = "No";
        carYear = "0";
        carMake = "Default";
        carModel = "Default Model";
    }

    public Car(String price, String boost, String proof, String time, String year, String make, String model) {
        //initializes a constructor for the car parts
        carPrice = price;
        carTurboBoost = boost;
        carBulletProof = proof;
        carTimeTravel = time;
        carYear = year;
        carMake = make;
        carModel = model;
    }

    public String toString() {
        //this method displays all the car parts
        String output = "Price: " + carPrice + "\n";
        output += "Turbo Boost?: " + carTurboBoost + "\n";
        output += "Bullet Proof?: " + carBulletProof + "\n";
        output += "Time Travel?: " + carTimeTravel + "\n";
        output += "Year Made: " + carYear + "\n";
        output += "Car Make: " + carMake + "\n";
        output += "Car Model: " + carModel + "\n";
        //when everything is outputed, return it
        return output;
    }
}
