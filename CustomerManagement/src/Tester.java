import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("\t\tWelcome To The Management System: ");
        boolean bool = false;
        Map<String,Customer> custList = new HashMap<>();
        try(Scanner sc = new Scanner(System.in)){
            while (!bool) {

                System.out.println("Please Enter Your Choice: ");
                System.out.println("1. Signup Customer \n2. SignIn Customer \n" +
                                    "3. Change Password \n4. List All Custom");
                switch(sc.nextInt()){
                    case 1:
                        System.out.println("Enter Customer Details: ");
                        System.out.println("customerid,first_name," +
                                "email,password,registrationAmt,dob,plan");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 0:
                        break;
                }


            }
        }catch (Exception e){

        }
    }
}
