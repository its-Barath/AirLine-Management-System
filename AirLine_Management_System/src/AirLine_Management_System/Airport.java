package AirLine_Management_System;

public class Airport {
    private int id;
    private String city;

    public Airport() {
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void print() {
        System.out.println(this.id + "\t" + this.city);
    }
}
