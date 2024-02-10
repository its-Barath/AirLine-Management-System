package AirLine_Management_System;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String Tel;
    private double salary;
    private String position;

    public Employee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getTel() {
        return this.Tel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaray() {
        return this.salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void print() {
        System.out.println("id: " + this.id);
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Tel: " + this.Tel);
        System.out.println("Salary: " + this.salary);
        System.out.println("Position: " + this.position);
        System.out.println();
    }
}
