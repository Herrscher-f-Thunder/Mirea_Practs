package Pract32;
import java.io.Serializable;

public class Customer extends Address implements Serializable {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Customer getMATURE_UNKNOWN_CUSTOMER() {
        return MATURE_UNKNOWN_CUSTOMER;
    }
    public void setMATURE_UNKNOWN_CUSTOMER(Customer MATURE_UNKNOWN_CUSTOMER) {
        this.MATURE_UNKNOWN_CUSTOMER = MATURE_UNKNOWN_CUSTOMER;
    }
    public Customer getNOT_MATURE_UNKNOWN_CUSTOMER() {
        return NOT_MATURE_UNKNOWN_CUSTOMER;
    }
    public void setNOT_MATURE_UNKNOWN_CUSTOMER(Customer NOT_MATURE_UNKNOWN_CUSTOMER) {
        this.NOT_MATURE_UNKNOWN_CUSTOMER = NOT_MATURE_UNKNOWN_CUSTOMER;
    }
}