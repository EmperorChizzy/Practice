package org.example;

import com.sun.source.tree.BreakTree;

public class Main {
    static void myMethod() {
        System.out.println("printed");
    }
    public static void main(String[] args) {
        //calling the method multiple times will execute the number of times the method is called
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}
//********Multiple Method Calling with parameter*********//
 class Mark{
    static void myMethod(String fname){
        System.out.println("Ozuru "+ fname);
    }

    public static void main(String[] args) {
        myMethod("Chimene");
        myMethod("Budex");
        myMethod("Nk");


    }
}
// **********Multiple Parameter method call************//
    class Multiple{
        static void myMethod(String fname, int age, long number){
            System.out.println(fname + " is " + age + number);
        }

        public static void main(String[] args) {
            myMethod("Chimene ",30,8076776989l);
            myMethod("Fiona ",23,8032289678l);
        }
    }
    //***************Return Values in Methods***********************//

class Return{
    static String myMethod(String cName, int x){
        return   cName + " is " + x+" Years Old";

    }

    public static void main(String[] args) {
        System.out.println(myMethod("Ada", 4));
    }
}
//***************If...Else in Methods***********************//
class Condition{
    static void checkAge(int age){
        if(age<18) {
            System.out.println("Restricted Access - underage");
        }else{
            System.out.println("Access Granted - You are of age ");
        }
    }

    public static void main(String[] args) {
        checkAge(17);
    }
}
//***************Methods Overloading***********************//

class MethodOverload {
    static int plusMyMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMyMethodInt(double x, double y) {
        return x + y;
    }


    public static void main(String[] args) {
        int myNum1 = plusMyMethodInt(12, 65);
        double myNum2 = plusMyMethodInt(18.8, 24.9);
        System.out.println("Int:" + myNum1 + "\n" +"Float:" + myNum2);

    }
}
//*************** Recursion ***********************//
class RecursionCode{
    public static int sum(int k){
        if (k>0) {
            return k + sum(k - 1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
//*********** Recursion to add numbers btw 15 to 50 ***********************//
class RecursionAdd {
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start,end-1);
            }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = sum(5,50);
            System.out.println(result);
    }

}

//*********** Recursion to add numbers btw 15 to 50 Method 2***********************//
