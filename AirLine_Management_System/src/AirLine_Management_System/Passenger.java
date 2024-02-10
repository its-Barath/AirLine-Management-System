package AirLine_Management_System;

public class Passenger {
    private int id;
    private String firstName;
    private String lastName;
    private String Tel;
    private String email;

    public Passenger() {
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

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getTel() {
        return this.Tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void print() {
        System.out.println("id: " + this.getId());
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Tel: " + this.getTel());
        System.out.println("Email: " + this.getEmail());
        System.out.println();
    }
}
