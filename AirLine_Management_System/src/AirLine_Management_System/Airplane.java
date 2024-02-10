package AirLine_Management_System;
public class Airplane {
    private int id;
    private int EconomyCapacity;
    private int BusinessCapacity;
    private String model;

    public Airplane() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setEconomyCapacity(int EconomyCapacity) {
        this.EconomyCapacity = EconomyCapacity;
    }

    public int getEconomyCapacity() {
        return this.EconomyCapacity;
    }

    public void setBusinessCapacity(int BusinessCapacity) {
        this.BusinessCapacity = BusinessCapacity;
    }

    public int getBusinessCapacity() {
        return this.BusinessCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void print() {
        System.out.println("id: " + this.id);
        System.out.println("Economy Capacity: " + this.EconomyCapacity);
        System.out.println("Business Capacity: " + this.BusinessCapacity);
        System.out.println("Model: " + this.model);
        System.out.println();
    }
}
