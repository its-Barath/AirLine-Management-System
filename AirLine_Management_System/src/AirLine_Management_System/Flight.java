package AirLine_Management_System;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight {
    private int id;
    private Airplane airplane;
    private Airport origin;
    private Airport destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private boolean delayed = false;
    private int bookedEconomy = 0;
    private int bookedBusiness = 0;
    private Employee[] stuff = new Employee[10];
    private Passenger[] passengers;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd::HH:mm:ss");

    public Flight() {
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
        int totalCapacity = airplane.getBusinessCapacity() + airplane.getEconomyCapacity();
        this.passengers = new Passenger[totalCapacity];
    }

    public Airport getOriginAirport() {
        return this.origin;
    }

    public void setOriginAirport(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestinationAirport() {
        return this.destination;
    }

    public void setDestinationAirport(Airport destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isDelayed() {
        return this.delayed;
    }

    public void delay() {
        this.delayed = true;
    }

    public int getBookedEconomy() {
        return this.bookedEconomy;
    }

    public void setBookedEconomy(int bookedEconomy) {
        this.bookedEconomy = bookedEconomy;
    }

    public int getBookedBusiness() {
        return this.bookedBusiness;
    }

    public void setBookedBusiness(int bookedBusiness) {
        this.bookedBusiness = bookedBusiness;
    }

    public Employee[] getStuff() {
        return this.stuff;
    }

    public void setStuff(Employee[] stuff) {
        this.stuff = stuff;
    }

    public Passenger[] getPassengers() {
        return this.passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void print() {
        System.out.print(this.id + "\t");
        System.out.print(this.airplane.getModel() + "\t\t");
        if (this.origin.getCity().length() < 8) {
            System.out.print(this.origin.getCity() + "\t\t");
        } else {
            System.out.print(this.origin.getCity() + "\t");
        }

        System.out.print(this.destination.getCity() + "\t\t");
        System.out.print(this.formatter.format(this.departureTime) + "\t");
        System.out.print(this.formatter.format(this.arrivalTime) + "\t");
        if (this.delayed) {
            System.out.print("delayed\t\t");
        } else {
            System.out.print("estimated\t");
        }

        int availableE = this.airplane.getEconomyCapacity() - this.bookedEconomy;
        System.out.print(availableE + "\t\t\t");
        int availableB = this.airplane.getBusinessCapacity() - this.bookedBusiness;
        System.out.print(availableB);
        System.out.println();
    }
}
