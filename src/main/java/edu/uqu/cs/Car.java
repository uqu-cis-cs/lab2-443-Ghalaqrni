package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Car{

    /************ Part 1 **************/
    private String model ;
    private boolean inOutGarage ;

    /**
     * Decalre all instance variables 
     * model of type String
     * inOutGarage of type boolean
     * Make sure they are all private
     * Syntax:
     * private dataType name;
     *
     */

    /************ Part 2 **************/
    public void Car (){
        this.model= "";
        this.inOutGarage = false;
    }
    /**
     * Define a default constructor and set 
     * all instance variables to their default values
     * model ="";
     * inOutGarage =false;
     * Syntax:
     * public className (){
     *      //body
     * }
     */

    /************ Part 3 **************/
    public String getmodel(){

        return this.model;
    }
    public boolean getInOutGarage(){

        return this.inOutGarage;
    }

    /**
     * Define all getter methods below
     * for each instance variable
     * Syntax:
     * public dataType getInstanceVariableName (){
     *      return this.InstanceVariableName;
     * }
     */


    /************ Part 4 **************/
    public void setmodel (String m){
        this.model= m;
    }
    public void setInOutGarage (boolean g){
        this.inOutGarage= g;
    }
    /**
     * Define all setter methods below
     * for each instance variable
     * public void setInstanceVariableName (parameter){
     *      this.InstanceVariableName= parameter;
     * }
     *
     */


    /************ Part 5 **************/
    public void moveCarOut(){
        inOutGarage = false ;
    }
    public void moveCarIn(){
        inOutGarage = true ;
    }
    
    /**
     * Implement the following two methods
     * moveCarOut() to set the inOutGarage flag to false;
     * moveCarIn() to set the inOutGarage flag to true;
     *
     */
    


}