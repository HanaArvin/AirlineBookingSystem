import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public static void savePassengers(List<Passenger> passengers, String filename) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            for (Passenger p : passengers) {
                StringBuilder booked = new StringBuilder();
                for (int i = 0; i < p.getBookedFlights().size(); i++) {
                    booked.append(p.getBookedFlights().get(i));
                    if (i < p.getBookedFlights().size() - 1) {
                        booked.append(";");
                    }
                }
                String line = p.getPhoneNumber() + "," +
                        p.getPassword() + "," +
                        p.getFullName() + "," +
                        p.getAddress() + "," +
                        p.getWallet() + "," +
                        booked.toString() + "\n";

                writer.write(line);
            }
        } catch (IOException e) {
            System.out.println("Error saving passengers: " + e.getMessage());
        }
    }
    public static void saveFlights(List<Flight> flights, String filename) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            for (Flight f : flights) {
                String line = f.getFlightId() + "," +
                        f.getOrigin() + "," +
                        f.getDestination() + "," +
                        f.getDepartureTime() + "," +
                        f.getArrivalTime() + "," +
                        f.getCapacity() + "," +
                        f.getAvailableSeats() + "," +
                        f.getPrice() + "\n";

                writer.write(line);
            }
        } catch (IOException e) {
            System.out.println("Error saving flights: " + e.getMessage());
        }
    }

    public static List<Passenger> loadPassengers(String filename) {
        List<Passenger> passengers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length >= 6) {
                    String phone = parts[0];
                    String password = parts[1];
                    String fullName = parts[2];
                    String address = parts[3];
                    String city = parts[4];
                    double wallet = Double.parseDouble(parts[5]);
                    String fullAddress = address + ", " + city;
                    Passenger p = new Passenger(phone, password, fullName, fullAddress, wallet);
                    if (parts.length >= 7 && !parts[6].isEmpty()) {
                        String[] booked = parts[6].split(";");
                        for (String flightId : booked) {
                            p.getBookedFlights().add(flightId);
                        }
                    }

                    passengers.add(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading passengers: " + e.getMessage());
        }
        return passengers;
    }

    public static List<Flight> loadFlights(String filename) {
        List<Flight> flights = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length >= 8) {
                    String flightId = parts[0];
                    String origin = parts[1];
                    String destination = parts[2];
                    String departureTime = parts[3];
                    String arrivalTime = parts[4];
                    int capacity = Integer.parseInt(parts[5]);
                    int availableSeats = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Flight f = new Flight(flightId, origin, destination, departureTime, arrivalTime, capacity, price);
                    f.setAvailableSeats(availableSeats);
                    flights.add(f);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading flights: " + e.getMessage());
        }
        return flights;
    }


}

