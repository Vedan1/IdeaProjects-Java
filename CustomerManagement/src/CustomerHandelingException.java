import java.util.Map;

public class CustomerHandelingException extends Exception{


    public static void checkDuplicates(String email, Map<String,Customer> custMap) throws CustomerValidation{
        if(custMap.containsKey(email)){
            System.out.println("Error");
            throw new CustomerValidation("Duplicate Found!");
        }
    }
    public static ServicePlan checkPlan(String plans) throws IllegalArgumentException{
        return ServicePlan.valueOf(plans.toUpperCase());
    }
    public static Customer validateAll(int customerid, String first_name,
                                       String email, String password, double registrationAmt,
                                       String dob, String plan, Map<String,Customer> custList)throws CustomerValidation,IllegalArgumentException{
        checkDuplicates(email,custList);
        ServicePlan p = checkPlan(plan);
        return new Customer(customerid,first_name,email,password,registrationAmt,dob,p);

    }

}