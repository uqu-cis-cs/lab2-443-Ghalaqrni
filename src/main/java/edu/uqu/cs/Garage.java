package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Garage{

    /************ Part 1 **************/

    private Car [] cars = new Car[3];
    /**
     * Decalre an instance variable named cars
     * as an array of Car type
     * it should be of size 3
     * Make sure its private
     * Syntax:
     * private classType [] varName = new classType[size];
     *
     */

    /************ Part 2 **************/
    public static int countCars = 0;
    /**
     * Decalre a static/class variable named countCars
     * Make sure its public
     * you could initialize it to 0
     * Syntax:
     * public dataType varName= value;
     *
     */

    /************ Part 3 **************/

    public Garage (){
      for(int i=0; i<cars.length; i++){
           cars[i]= new Car();
        }
     }
    /**
     * Define a default constructor to create
     * all the elements of cars
     * 
     * Use loop to create them as follows:
     * Syntax:
     * public className (){
     * 	   for(int i=0; i<arrayName.length; i++){
     *         arrayName[i]= new arrayClassName();
     *     }
     *}
     */

    /************ Part 4 **************/
    public void addCar(String model){
        boolean flag = false ;
        for(int i=0 ; i < countCars ; i++){
            if ( cars [0].getmodel().equals(model)){
                flag = true ;
                cars[i].moveCarIn();
            }
        }
        if (!flag){
            if (countCars<cars.length){
                Car c = new Car ();
                c.setmodel(model);
                cars[countCars].moveCarIn();
            }
            else {
                System.out.println("full garage ");
            }
        }
        

    }
    /**
     * Define addCar(String parameter) that adds a new car (by model) to the garage 
     * and set its flag to true; 
     * hint: you must check if the car has not been added before to the list of cars 
     * and it should be added to the car list by using the static variable countCars! 
     * also, change the status of the instance variable inOutGarage to true 
     * by calling method moveCarIn() of class Car
     * Don’t forget to increase countCars’s value by one
     * Note: method returns NO data
     * Syntax:
     * public void methodName(String m)
     */


    /************ Part 5 **************/
     public void moveOut(String model){
        
        for(int i =0 ; i<countCars;i++)
        {
            if (cars[i].getmodel().equals(model))
            {
          
                cars[i].moveCarOut();
            }
        }
  
    }
    /**
     * Define moveOut(String) that moves the car (by model) out of the garage; 
     * hint you must first search if the car is in the list of cars, 
     * then use moveCarOut () method of class Car
     * Note: method returns NO data
     * Syntax:
     * public void methodName(String m)
     *
     */



    /************ Part 6 **************/
     public void moveIn(String model){
      
        for(int i =0 ; i<countCars;i++)
        {
            if (cars[i].getmodel().equals(model))
            {
          
                cars[i].moveCarIn();
            }
        }
  
    }
    /**
     * Define moveOut(String) that moves the car (by model) into the garage; 
     * hint you must first search if the car is in the list of cars, 
     * then use moveCarIn () method of class Car;
     * Note: method returns NO data
     * Syntax:
     * public void methodName(String m)
     *
     */


    /************ Part 7 **************/
    
   public void listCars() {
        for (int i = 0; i < countCars; i++) {
            System.out.println("Car " + (i+1) + ": " + cars[i].getmodel());
        }
    } 
    /**
     * Define listCars() to display/list all the cars in the garage;
     * Note: method returns NO data
     * Hint: use loop and methods of class Car to access private data members
     * Syntax:
     * public void methodName(String m)
     *
     */



}