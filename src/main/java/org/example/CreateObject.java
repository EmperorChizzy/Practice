package org.example;

public class CreateObject {
    int x=5;

    public static void main(String[] args) {
        CreateObject fish1 = new CreateObject() ; //CREATING Object 1
        CreateObject fish2 = new CreateObject() ;  //CREATING Object 2
        System.out.println(fish1.x + ":" + fish2.x);//fish1.x was used to access the attribute x of Main class
    }
}
//********Modify Attribute*********//
class ModifyAttribute {
    int x; //assigning attribute

    public static void main(String[] args) {
        ModifyAttribute fish1 = new ModifyAttribute(); // objects fish
        ModifyAttribute fish2 = new ModifyAttribute(); // objects fish
        fish1.x = 35; //modifying attribute
        fish2.x =63;
        System.out.println(fish1.x + ":" + fish2.x);//fish1.x was used to access the attribute x of Main class
    }
}
//********final keyword to attribute*********//

class FinalAttribute {
    final int x = 10; //assigning attribute

    public static void main(String[] args) {
        FinalAttribute fish1 = new FinalAttribute(); // objects fish
        FinalAttribute fish2 = new FinalAttribute(); // objects fish
        //fish1.x = 35; //modifying attribute //this assignment does not work because
        //fish2.x =63;  // of the keyword final in the initial assignment
        System.out.println(fish1.x + ":" + fish2.x);//fish1.x was used to access the attribute x of Main class
    }
}

//********Multiple Attributes creation*********//

class MultipleAttributes {
     int age = 60; //assigning attribute
    String fName = "Fred";
    String lName = "Carlos";

    public static void main(String[] args) {
        MultipleAttributes myObj = new MultipleAttributes(); // objects

        myObj.fName = "Lucy"; //modifying attribute
        System.out.println("Name:" + " " + myObj.fName + " " + myObj.lName);
        System.out.println(myObj.age);
    }
}
