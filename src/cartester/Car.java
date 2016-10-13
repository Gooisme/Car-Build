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

    String carMake, carModel, carTimeTravel, carBulletProof, carTurboBoost;
    double carPrice;
    int carYear;

    public Car() {
        carPrice = 0;
        carTurboBoost = "No";
        carBulletProof = "No";
        carTimeTravel = "No";
        carYear = 0;
        carMake = "Default";
        carModel = "Default Model";
    }

    public Car(double price, String boost, String proof, String time, int year, String make, String model) {
        carPrice = price;
        carTurboBoost = boost;
        carBulletProof = proof;
        carTimeTravel = time;
        carYear = year;
        carMake = make;
        carModel = model;
    }

    public String toString() {
        String output = "Price: " + carPrice + "\n";
        output += "Turbo Boost?: " + carTurboBoost + "\n";
        output += "Bullet Proof?: " + carBulletProof + "\n";
        output += "Time Travel?: " + carTimeTravel + "\n";
        output += "Year Made: " + carYear + "\n";
        output += "Car Make: " + carMake + "\n";
        output += "Car Model: " + carModel + "\n";
        return output;
    }
}
