# Airline Management System

The Airline Management System is a Java-based application designed to manage various aspects of an airline operation, including flights, employees, passengers, airplanes, airports, and databases. It provides functionalities to handle bookings, scheduling, and administration tasks related to airline operations.

## Features

- **Flight Management**: Allows the creation, modification, and deletion of flights. Each flight includes information such as departure and arrival times, airline, destination, and available seats.
- **Employee Management**: Provides functionalities to manage airline employees, including pilots, cabin crew, and ground staff. Employees can be added, removed, or updated with relevant information such as name, position, and contact details.
- **Passenger Management**: Enables the management of passenger details, including booking information, contact details, and special requirements.
- **Airplane Management**: Allows the management of airplanes used in airline operations. Information such as airplane model, seating capacity, and maintenance status can be tracked.
- **Airport Management**: Provides functionalities to manage airport details, including location, facilities, and operational status.
- **Database Interaction**: Supports interaction with databases to store and retrieve information related to flights, employees, passengers, airplanes, and airports.

## Components

The project consists of the following components:

1. **Flight**: Represents a flight entity with attributes such as flight number, departure time, arrival time, airline, destination, and available seats.
2. **FlightController**: Manages operations related to flights, such as adding, updating, and deleting flights.
3. **Employee**: Represents an employee working for the airline, with attributes such as name, position, and contact details.
4. **EmployeeController**: Manages operations related to employees, including adding, updating, and removing employee records.
5. **Passenger**: Represents a passenger traveling on a flight, with attributes such as name, contact details, and booking information.
6. **PassengerController**: Manages operations related to passengers, including booking, updating, and canceling reservations.
7. **Airplane**: Represents an airplane used for airline operations, with attributes such as model, seating capacity, and maintenance status.
8. **AirplaneController**: Manages operations related to airplanes, including adding new airplanes, updating details, and removing airplanes from service.
9. **Airport**: Represents an airport location, with attributes such as name, location, facilities, and operational status.
10. **AirportController**: Manages operations related to airports, including adding new airports, updating details, and marking airports as active or inactive.
11. **Database**: Handles interaction with databases to store and retrieve data related to flights, employees, passengers, airplanes, and airports.
12. **Main**: Contains the main entry point for the application, where various functionalities are demonstrated and tested.

## Usage

To use the Airline Management System:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Build the project and resolve any dependencies.
4. Run the `Main` class to start the application.
5. Follow the on-screen instructions to interact with different components of the system.

## Dependencies

The project relies on the following dependencies:

- **Java Development Kit (JDK)**: Provides the necessary tools and libraries for Java development.
- **Database Connector Library**: A library for connecting to and interacting with databases (e.g., JDBC for Java Database Connectivity).
- **JUnit (Optional)**: A testing framework for unit testing Java code. Required if running unit tests for the project.
