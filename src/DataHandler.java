import java.util.ArrayList;
import java.util.List;

public class DataHandler {
    private static List<Passenger> allPassengers=new ArrayList<>();
    private static List<Flight> allFlights=new ArrayList<>();
    public static Passenger currentPassenger=null;

    public static void setAllPassengers(List<Passenger> allPassengers) {
        DataHandler.allPassengers = allPassengers;
    }

    public static void setAllFlights(List<Flight> allFlights) {
        DataHandler.allFlights = allFlights;
    }

    public static void displayArtWork(int number){
        String artWork="";
        if (number==1){
            artWork= """
                    
                    888      .d88888b.   .d8888b.  8888888 888b    888\s
                    888     d88P" "Y88b d88P  Y88b   888   8888b   888\s
                    888     888     888 888    888   888   88888b  888\s
                    888     888     888 888          888   888Y88b 888\s
                    888     888     888 888  88888   888   888 Y88b888\s
                    888     888     888 888    888   888   888  Y88888\s
                    888     Y88b. .d88P Y88b  d88P   888   888   Y8888\s
                    88888888 "Y88888P"   "Y8888P88 8888888 888    Y888\s
                    """;

        } else if (number==2) {
            artWork= """
                     
                     .d8888b. 8888888 .d8888b.  888b    888 888     888 8888888b. \s
                    d88P  Y88b  888  d88P  Y88b 8888b   888 888     888 888   Y88b\s
                    Y88b.       888  888    888 88888b  888 888     888 888    888\s
                     "Y888b.    888  888        888Y88b 888 888     888 888   d88P\s
                        "Y88b.  888  888  88888 888 Y88b888 888     888 8888888P" \s
                          "888  888  888    888 888  Y88888 888     888 888       \s
                    Y88b  d88P  888  Y88b  d88P 888   Y8888 Y88b. .d88P 888       \s
                     "Y8888P" 8888888 "Y8888P88 888    Y888  "Y88888P"  888       \s
                    """;
        } else if (number==3) {
            artWork= """
                           
                           d8888 8888888b.  888b     d888 8888888 888b    888     888      .d88888b.   .d8888b.  8888888 888b    888\s
                          d88888 888  "Y88b 8888b   d8888   888   8888b   888     888     d88P" "Y88b d88P  Y88b   888   8888b   888\s
                         d88P888 888    888 88888b.d88888   888   88888b  888     888     888     888 888    888   888   88888b  888\s
                        d88P 888 888    888 888Y88888P888   888   888Y88b 888     888     888     888 888          888   888Y88b 888\s
                       d88P  888 888    888 888 Y888P 888   888   888 Y88b888     888     888     888 888  88888   888   888 Y88b888\s
                      d88P   888 888    888 888  Y8P  888   888   888  Y88888     888     888     888 888    888   888   888  Y88888\s
                     d8888888888 888  .d88P 888   "   888   888   888   Y8888     888     Y88b. .d88P Y88b  d88P   888   888   Y8888\s
                    d88P     888 8888888P"  888       888 8888888 888    Y888     88888888 "Y88888P"   "Y8888P88 8888888 888    Y888\s
                   
                    
                    """;
        }
        System.out.println(artWork);
    }

    public static void displayArtWork2(int number) {
        String artWork = "";
        if (number == 1) {
            artWork = """
                    
                    8888888888 888      8888888 .d8888b.  888    888 88888888888      .d8888b.   .d8888b.  888    888 8888888888 8888888b.  888     888 888      8888888888\s
                    888        888        888  d88P  Y88b 888    888     888         d88P  Y88b d88P  Y88b 888    888 888        888  "Y88b 888     888 888      888       \s
                    888        888        888  888    888 888    888     888         Y88b.      888    888 888    888 888        888    888 888     888 888      888       \s
                    8888888    888        888  888        8888888888     888          "Y888b.   888        8888888888 8888888    888    888 888     888 888      8888888   \s
                    888        888        888  888  88888 888    888     888             "Y88b. 888        888    888 888        888    888 888     888 888      888       \s
                    888        888        888  888    888 888    888     888               "888 888    888 888    888 888        888    888 888     888 888      888       \s
                    888        888        888  Y88b  d88P 888    888     888         Y88b  d88P Y88b  d88P 888    888 888        888  .d88P Y88b. .d88P 888      888       \s
                    888        88888888 8888888 "Y8888P88 888    888     888          "Y8888P"   "Y8888P"  888    888 8888888888 8888888P"   "Y88888P"  88888888 8888888888\s
                    """;
        } else if (number == 2) {
            artWork = """
                    
                    888888b.    .d88888b.   .d88888b.  888    d8P      8888888888 888      8888888 .d8888b.  888    888 88888888888\s
                    888  "88b  d88P" "Y88b d88P" "Y88b 888   d8P       888        888        888  d88P  Y88b 888    888     888    \s
                    888  .88P  888     888 888     888 888  d8P        888        888        888  888    888 888    888     888    \s
                    8888888K.  888     888 888     888 888d88K         8888888    888        888  888        8888888888     888    \s
                    888  "Y88b 888     888 888     888 8888888b        888        888        888  888  88888 888    888     888    \s
                    888    888 888     888 888     888 888  Y88b       888        888        888  888    888 888    888     888    \s
                    888   d88P Y88b. .d88P Y88b. .d88P 888   Y88b      888        888        888  Y88b  d88P 888    888     888    \s
                    8888888P"   "Y88888P"   "Y88888P"  888    Y88b     888        88888888 8888888 "Y8888P88 888    888     888    \s
                    """;
        } else if (number == 3) {
            artWork= """
                    
                    888888b.    .d88888b.   .d88888b.  888    d8P  8888888888 8888888b.      8888888888 888      8888888 .d8888b.  888    888 88888888888 .d8888b. \s
                    888  "88b  d88P" "Y88b d88P" "Y88b 888   d8P   888        888  "Y88b     888        888        888  d88P  Y88b 888    888     888    d88P  Y88b\s
                    888  .88P  888     888 888     888 888  d8P    888        888    888     888        888        888  888    888 888    888     888    Y88b.     \s
                    8888888K.  888     888 888     888 888d88K     8888888    888    888     8888888    888        888  888        8888888888     888     "Y888b.  \s
                    888  "Y88b 888     888 888     888 8888888b    888        888    888     888        888        888  888  88888 888    888     888        "Y88b.\s
                    888    888 888     888 888     888 888  Y88b   888        888    888     888        888        888  888    888 888    888     888          "888\s
                    888   d88P Y88b. .d88P Y88b. .d88P 888   Y88b  888        888  .d88P     888        888        888  Y88b  d88P 888    888     888    Y88b  d88P\s
                    8888888P"   "Y88888P"   "Y88888P"  888    Y88b 8888888888 8888888P"      888        88888888 8888888 "Y8888P88 888    888     888     "Y8888P" \s
                    """;
        } else if (number == 4) {
            artWork= """
                     
                     
                     
                     .d8888b.        d8888 888b    888  .d8888b.  8888888888 888          8888888888 888      8888888 .d8888b.  888    888 88888888888\s
                    d88P  Y88b      d88888 8888b   888 d88P  Y88b 888        888          888        888        888  d88P  Y88b 888    888     888    \s
                    888    888     d88P888 88888b  888 888    888 888        888          888        888        888  888    888 888    888     888    \s
                    888           d88P 888 888Y88b 888 888        8888888    888          8888888    888        888  888        8888888888     888    \s
                    888          d88P  888 888 Y88b888 888        888        888          888        888        888  888  88888 888    888     888    \s
                    888    888  d88P   888 888  Y88888 888    888 888        888          888        888        888  888    888 888    888     888    \s
                    Y88b  d88P d8888888888 888   Y8888 Y88b  d88P 888        888          888        888        888  Y88b  d88P 888    888     888    \s
                     "Y8888P" d88P     888 888    Y888  "Y8888P"  8888888888 88888888     888        88888888 8888888 "Y8888P88 888    888     888    \s
                    """;
        } else if (number == 5) {
            artWork= """
                    
                    888       888        d8888 888      888      8888888888 88888888888     888888b.         d8888 888             d8888 888b    888  .d8888b.  8888888888\s
                    888   o   888       d88888 888      888      888            888         888  "88b       d88888 888            d88888 8888b   888 d88P  Y88b 888       \s
                    888  d8b  888      d88P888 888      888      888            888         888  .88P      d88P888 888           d88P888 88888b  888 888    888 888       \s
                    888 d888b 888     d88P 888 888      888      8888888        888         8888888K.     d88P 888 888          d88P 888 888Y88b 888 888        8888888   \s
                    888d88888b888    d88P  888 888      888      888            888         888  "Y88b   d88P  888 888         d88P  888 888 Y88b888 888        888       \s
                    88888P Y88888   d88P   888 888      888      888            888         888    888  d88P   888 888        d88P   888 888  Y88888 888    888 888       \s
                    8888P   Y8888  d8888888888 888      888      888            888         888   d88P d8888888888 888       d8888888888 888   Y8888 Y88b  d88P 888       \s
                    888P     Y888 d88P     888 88888888 88888888 8888888888     888         8888888P" d88P     888 88888888 d88P     888 888    Y888  "Y8888P"  8888888888\s
                    """;
        } else if (number == 6) {
            artWork= """
                    
                    888       888        d8888 888      888      8888888888 88888888888     8888888b.  8888888888 .d8888b.  888    888        d8888 8888888b.   .d8888b.  8888888888\s
                    888   o   888       d88888 888      888      888            888         888   Y88b 888       d88P  Y88b 888    888       d88888 888   Y88b d88P  Y88b 888       \s
                    888  d8b  888      d88P888 888      888      888            888         888    888 888       888    888 888    888      d88P888 888    888 888    888 888       \s
                    888 d888b 888     d88P 888 888      888      8888888        888         888   d88P 8888888   888        8888888888     d88P 888 888   d88P 888        8888888   \s
                    888d88888b888    d88P  888 888      888      888            888         8888888P"  888       888        888    888    d88P  888 8888888P"  888  88888 888       \s
                    88888P Y88888   d88P   888 888      888      888            888         888 T88b   888       888    888 888    888   d88P   888 888 T88b   888    888 888       \s
                    8888P   Y8888  d8888888888 888      888      888            888         888  T88b  888       Y88b  d88P 888    888  d8888888888 888  T88b  Y88b  d88P 888       \s
                    888P     Y888 d88P     888 88888888 88888888 8888888888     888         888   T88b 8888888888 "Y8888P"  888    888 d88P     888 888   T88b  "Y8888P88 8888888888\s
                    """;
        }
        System.out.println(artWork);
    }

    public static boolean passengerLogin(String phonenumber, String password) {
        for (int i = 0; i < allPassengers.size(); i++) {
            if (allPassengers.get(i).checkUp(phonenumber, password)) {
                 currentPassenger = allPassengers.get(i);
                return true;
            }
        }
        return false;
    }

    public static void createPassengerAcc(String phoneNumber, String fullName, String password, String address, double wallet) {
        Passenger temp = new Passenger(phoneNumber, password, fullName, address, wallet);
        allPassengers.add(temp);
        FileHandler.savePassengers(allPassengers,"passengers.txt");
    }

    public  static boolean viewFlights(){
        if (allFlights.isEmpty()){
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

    public static void bookTicket(String flightId){
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getFlightId().equals(flightId)){
                if (allFlights.get(i).getAvailableSeats()>0){
                    if (currentPassenger.getWallet()>=allFlights.get(i).getPrice()){
                        System.out.println("\nTicket booked successfully!");
                        allFlights.get(i).setAvailableSeats(allFlights.get(i).getAvailableSeats() - 1);
                        currentPassenger.setWallet(currentPassenger.getWallet() - allFlights.get(i).getPrice());
                        currentPassenger.getBookedFlights().add(flightId);
                        FileHandler.savePassengers(allPassengers,"passengers.txt");
                        FileHandler.saveFlights(allFlights, "flights.txt");
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

    public static void rechargeWallet(double rechargeAmount){
        if (rechargeAmount<=0){
            System.out.println("\nPlease enter a positive number.");
            return;
        }
        currentPassenger.setWallet(currentPassenger.getWallet()+rechargeAmount);
        System.out.println("\nWallet recharged successfully.\n");
        FileHandler.savePassengers(allPassengers,"passengers.txt");

    }

    public static void cancelTicket(String flightId) {
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getFlightId().equals(flightId)) {
                if (currentPassenger.getBookedFlights().contains(flightId)) {
                    System.out.println("\nTicket canceled successfully!");
                    allFlights.get(i).setAvailableSeats(allFlights.get(i).getAvailableSeats() + 1);
                    currentPassenger.setWallet(currentPassenger.getWallet() + allFlights.get(i).getPrice());
                    currentPassenger.getBookedFlights().remove(flightId);
                    FileHandler.savePassengers(allPassengers,"passengers.txt");
                    FileHandler.saveFlights(allFlights, "flights.txt");
                    return;
                } else {
                    System.out.println("You don’t have a ticket for this flight!");
                    return;
                }
            }
        }
        System.out.println("No flight found with this ID!");
    }

    public static boolean adminLogin(String phonenumber,String password){
        return Admin.getPhonenumber().equals(phonenumber) && Admin.getPassword().equals(password);
    }

    public static void addFlight(String flightId,String origin,String destination,String departureTime,String arrivalTime,int capacity,double price ){
        Flight temp=new Flight(flightId,origin,destination,departureTime,arrivalTime,capacity,price);
        allFlights.add(temp);
        System.out.println("\nFlight added successfully!");
        FileHandler.saveFlights(allFlights, "flights.txt");
    }

    public static void removeFlight(String flightId) {
         if (!allFlights.isEmpty()){
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
                    FileHandler.saveFlights(allFlights, "flights.txt");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("\nFlight not found.");
            }

        }
    }

    public static String viewRegisteredPassengers(){
        System.out.println();
        if (allPassengers.isEmpty()){
            return "\nNo passengers have registered yet.";
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < allPassengers.size(); i++) {
            Passenger p= allPassengers.get(i);
            sb.append("Passenger ").append(i + 1).append("\n");
            sb.append("Full Name     : ").append(p.getFullName()).append("\n");
            sb.append("Phone         : ").append(p.getPhoneNumber()).append("\n");
            sb.append("Address       : ").append(p.getAddress()).append("\n");
            sb.append("Wallet        : ").append(p.getWallet()).append("$\n");
            if (p.getBookedFlights().isEmpty()){
                sb.append("Booked Flights: None\n");
            }else {
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

    public static boolean viewBookedFlights(Passenger passenger){
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
