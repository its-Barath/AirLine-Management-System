package AirLine_Management_System;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AirportsController {
    public AirportsController() {
    }

    public static void AddNewAirport(Database database, Scanner s) throws SQLException {
        System.out.println("Enter city: ");
        String city = s.next();
        ArrayList<Airport> airports = getAllAirports(database);
        int id;
        if (airports.size() != 0) {
            id = ((Airport)airports.get(airports.size() - 1)).getID() + 1;
        } else {
            id = 0;
        }

        Airport airport = new Airport();
        airport.setID(id);
        airport.setCity(city);
        String insert = "INSERT INTO `airports`(`id`, `city`) VALUES ('" + airport.getID() + "','" + airport.getCity() + "');";
        database.getStatement().execute(insert);
        System.out.println("Airport added successfully!");
    }

    public static ArrayList<Airport> getAllAirports(Database database) throws SQLException {
        ArrayList<Airport> airports = new ArrayList();
        String select = "SELECT * FROM `airports`;";
        ResultSet rs = database.getStatement().executeQuery(select);

        while(rs.next()) {
            Airport a = new Airport();
            a.setID(rs.getInt("id"));
            a.setCity(rs.getString("city"));
            airports.add(a);
        }

        return airports;
    }

    public static void PrintAllAirports(Database database) throws SQLException {
        System.out.println("----------------");
        System.out.println("id\tcity");
        Iterator var2 = getAllAirports(database).iterator();

        while(var2.hasNext()) {
            Airport a = (Airport)var2.next();
            a.print();
        }

        System.out.println("----------------");
    }


    public static Airport getAirport(Database database, int id) throws SQLException {
        Airport airport = new Airport();
        String select = "SELECT `id`, `city` FROM `airports` WHERE `id` = " + id + " ;";
        ResultSet rs = database.getStatement().executeQuery(select);
        rs.next();
        airport.setID(rs.getInt("id"));
        airport.setCity(rs.getString("city"));
        return airport;
    }

    public static void DeleteAirport(Database database, Scanner s) throws SQLException {
        System.out.println("Enter airport id (int): \n(-1 to print all airports)");
        int id = s.nextInt();
        if (id == -1) {
            PrintAllAirports(database);
            System.out.println("Enter airport id (int): ");
            id = s.nextInt();
        }

        String delete = "DELETE FROM `airports` WHERE `id` = " + id + " ;";
        database.getStatement().execute(delete);
        System.out.println("Airport deleted successfully!");
    }
}
