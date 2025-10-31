package service;

import model.Flight;
import model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class AirlineService {
    private List<Passenger> allPassengers = new ArrayList<>();
    private List<Flight> allFlights = new ArrayList<>();
    public Passenger currentPassenger = null;

    public boolean passengerLogin(String phonenumber, String password) {
        for (int i = 0; i < allPassengers.size(); i++) {
            if (allPassengers.get(i).checkUp(phonenumber, password)) {
                currentPassenger = allPassengers.get(i);
                return true;
            }
        }
        return false;
    }

    public void createPassengerAcc(String phoneNumber, String fullName, String password, String address, double wallet) {
        Passenger temp = new Passenger(phoneNumber, password, fullName, address, wallet);
        allPassengers.add(temp);
    }

    public boolean viewFlights() {
        if (allFlights.isEmpty()) {
            System.out.println("\nNo flights are currently available.\n");
            return false;

        } else {
            System.out.println("+-----+------------+---------------+---------------+-----------------------+-----------------------+-----------+------------------+-----------+");
            System.out.printf("| %-3s | %-10s | %-13s | %-13s | %-21s | %-21s | %-9s | %-16s | %-9s |%n",
                    "No", "Flight ID", "From", "To", "Departure time", "Arrival time", "Price", "Available seats", "Capacity");
            System.out.println("+=====+============+===============+===============+=======================+=======================+===========+==================+===========+");
            for (int i = 0; i < allFlights.size(); i++) {
                Flight f = allFlights.get(i);
                System.out.printf("| %-3d | %-10s | %-13s | %-13s | %-21s | %-21s | %-9s | %-16s | %-9s |%n",
                        (i + 1),
                        f.getFlightId(),
                        f.getOrigin(),
                        f.getDestination(),
                        f.getDepartureTime(),
                        f.getArrivalTime(),
                        f.getPrice() + "$",
                        f.getAvailableSeats(),
                        f.getCapacity()
                );
                System.out.println("+-----+------------+---------------+---------------+-----------------------+-----------------------+-----------+------------------+-----------+");
            }
            return true;
        }
    }

    public void bookTicket(String flightId) {
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getFlightId().equals(flightId)) {
                if (allFlights.get(i).getAvailableSeats() > 0) {
                    if (currentPassenger.getWallet() >= allFlights.get(i).getPrice()) {
                        System.out.println("\nTicket booked successfully!");
                        allFlights.get(i).setAvailableSeats(allFlights.get(i).getAvailableSeats() - 1);
                        currentPassenger.setWallet(currentPassenger.getWallet() - allFlights.get(i).getPrice());
                        currentPassenger.getBookedFlights().add(flightId);
                        return;
                    } else {
                        System.out.println("\nYou don't have enough balance.");
                        return;
                    }
                } else {
                    System.out.println("This flight has no capacity.");
                    return;

                }
            }

        }
        System.out.println("\nNo flight found with this ID");
    }

    public void cancelTicket(String flightId) {
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getFlightId().equals(flightId)) {
                if (currentPassenger.getBookedFlights().contains(flightId)) {
                    System.out.println("\nTicket canceled successfully!");
                    allFlights.get(i).setAvailableSeats(allFlights.get(i).getAvailableSeats() + 1);
                    currentPassenger.setWallet(currentPassenger.getWallet() + allFlights.get(i).getPrice());
                    currentPassenger.getBookedFlights().remove(flightId);
                    return;
                } else {
                    System.out.println("You don’t have a ticket for this flight!");
                    return;
                }
            }
        }
        System.out.println("No flight found with this ID!");
    }

    public void addFlight(String flightId, String origin, String destination, String departureTime, String arrivalTime, int capacity, double price) {
        Flight temp = new Flight(flightId, origin, destination, departureTime, arrivalTime, capacity, price);
        allFlights.add(temp);
        System.out.println("\nFlight added successfully!");
    }

    public void removeFlight(String flightId) {
        if (!allFlights.isEmpty()) {
            boolean flag = true;
            for (int i = 0; i < allFlights.size(); i++) {
                if (allFlights.get(i).getFlightId().equals(flightId)) {
                    for (int j = 0; j < allPassengers.size(); j++) {
                        if (allPassengers.get(j).getBookedFlights().contains(flightId)) {
                            allPassengers.get(j).setWallet(allPassengers.get(j).getWallet() + allFlights.get(i).getPrice());
                            allPassengers.get(j).getBookedFlights().remove(flightId);
                        }
                    }
                    System.out.println("\nFlight has been successfully removed.\n\nFlight ID      : " + allFlights.get(i).getFlightId() + "\nFrom           : " + allFlights.get(i).getOrigin() + "\nTo             : " + allFlights.get(i).getDestination() + "\nDeparture Time : " + allFlights.get(i).getDepartureTime() + "\nArrival Time   : " + allFlights.get(i).getArrivalTime());
                    allFlights.remove(i);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("\nFlight not found.");
            }

        }
    }

    public String viewRegisteredPassengers() {
        System.out.println();
        if (allPassengers.isEmpty()) {
            return "\nNo passengers have registered yet.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < allPassengers.size(); i++) {
            Passenger p = allPassengers.get(i);
            sb.append("Passenger ").append(i + 1).append("\n");
            sb.append("Full Name     : ").append(p.getFullName()).append("\n");
            sb.append("Phone         : ").append(p.getPhoneNumber()).append("\n");
            sb.append("Address       : ").append(p.getAddress()).append("\n");
            sb.append("Wallet        : ").append(p.getWallet()).append("$\n");
            if (p.getBookedFlights().isEmpty()) {
                sb.append("Booked Flights: None\n");
            } else {
                sb.append("Booked Flights:\n");
                for (int j = 0; j < p.getBookedFlights().size(); j++) {
                    sb.append("   - ").append(p.getBookedFlights().get(j)).append("\n");
                }
            }
            if (i < allPassengers.size() - 1) {
                sb.append("--------------------------------------\n");
            }
        }
        return sb.toString();
    }

    public boolean viewBookedFlights(Passenger passenger) {
        System.out.println("\n");
        if (passenger.getBookedFlights().isEmpty()) {
            System.out.println("You have no booked flights.");
            return false;
        }
        System.out.println("Your booked flights:\n");
        for (int i = 0; i < passenger.getBookedFlights().size(); i++) {
            String bookedId = passenger.getBookedFlights().get(i);
            for (int j = 0; j < allFlights.size(); j++) {
                if (allFlights.get(j).getFlightId().equals(bookedId)) {
                    Flight f = allFlights.get(j);
                    System.out.printf(" - %-10s | %-13s -> %-13s | Departure: %-21s | Arrival: %-21s | Price: %-9f$\n",
                            f.getFlightId(),
                            f.getOrigin(),
                            f.getDestination(),
                            f.getDepartureTime(),
                            f.getArrivalTime(),
                            f.getPrice()
                    );
                }
            }
        }
        return true;
    }
}
