package org.example;

import java.sql.SQLOutput;

public class Car {        //Main class
    public void fullThrottle(){      //Method
        System.out.println("The car is going as fast as it can:");
    }
    public void speed( int maxSpeed){    //method
        System.out.println("Max speed is: " + maxSpeed );
    }

    public static void main(String[] args) { //main method
        Car myCar = new Car(); // create myCar object to access methods 
        myCar.fullThrottle();
        myCar.speed(200);
    }

}
//*************** creating a Constructor ***********************//
class ConstructorCrt{
    int x;
    public ConstructorCrt(){    //Constructor created
        x=5;
    }

    public static void main(String[] args) {
        ConstructorCrt myObj = new ConstructorCrt();
        System.out.println(myObj.x);
    }
}

//*************** creating a Constructor with parameter ***********************//

class ConstructP{
    int modelYear; String modelName;
    public ConstructP(int year, String name){
        modelName = name; modelYear = year;
    }

    public static void main(String[] args) {
        ConstructP myCar = new ConstructP(2023,"Mercedes C300");
        System.out.println(myCar.modelName + " Manufactured year is: " + myCar.modelYear);
    }

}