/*Identify the core classes/enums involved
        1. Customer class (core class)
        state  : customer id(int) ,first name, last name (string),email(string),password(string),
        registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
        idGenerator : static
Must generate customer ids automatically : auto increment)
        PK(UID) : email*/


public class Customer {

    private int customerid;
    private String first_name;

    private String email;
    private String password;
    private double registrationAmt;
    private String dob;
    ServicePlan plan;

    public Customer(int customerid, String first_name,
                    String email, String password, double registrationAmt, String dob, ServicePlan plan) {
        this.customerid = customerid;
        this.first_name = first_name;
//        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.registrationAmt = registrationAmt;
        this.dob = dob;
        this.plan = plan;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", first_name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registrationAmt=" + registrationAmt +
                ", dob='" + dob + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}


