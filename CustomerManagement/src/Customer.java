/*Identify the core classes/enums involved
        1. Customer class (core class)
        state  : customer id(int) ,first name, last name (string),email(string),password(string),
        registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
        idGenerator : static
Must generate customer ids automatically : auto increment)
        PK(UID) : email*/


import java.time.LocalDate;

public class Customer {

    private int customerid;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private double registrationAmt;
    private String dob;
    private String plan;

    public Customer(int customerid, String first_name, String last_name,
                    String email, String password, double registrationAmt, String dob, String plan) {
        this.customerid = customerid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.registrationAmt = registrationAmt;
        this.dob = dob;
        this.plan = plan;
    }

    public int getCustomerid() {
        return customerid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getRegistrationAmt() {
        return registrationAmt;
    }

    public String getDob() {
        return dob;
    }

    public String getPlan() {
        return plan;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistrationAmt(double registrationAmt) {
        this.registrationAmt = registrationAmt;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registrationAmt=" + registrationAmt +
                ", dob='" + dob + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}


