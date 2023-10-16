/*
* what it does it checks for the <variable> instanceof <classname>.
* if the variable is from extended class or reference type of class shows true
* is hierarchy is inverted then it shows true or false. basically test if under him or over him
* or is an instance at al
*/


import java.util.Scanner;
class test extends instance_of{

}


 class instance_of{
    public static void main(String[] args) {
        test t = new test();
        instance_of m = new instance_of();
        System.out.println(t instanceof test);
        System.out.println(m instanceof test);
        System.out.println(t instanceof instance_of);

    }
}