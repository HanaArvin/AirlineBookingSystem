import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataHandler.setAllPassengers(FileHandler.loadPassengers("passengers.txt"));
        DataHandler.setAllFlights(FileHandler.loadFlights("flights.txt"));
        String artWork = """
                
                                                                                       |
                                                                                 --====|====--
                                                                                       | \s
                
                                                                                   .-""\"""-.\s
                                                                                 .'_________'.\s
                                                                                /_/_|__|__|_\\_\\
                                                                               ;'-._       _.-';
                                                          ,--------------------|    `-. .-'    |--------------------,
                                                           ``""--..__    ___   ;       '       ;   ___    __..--""``
                                                                     `"-// \\\\.._\\             /_..// \\\\-"`
                                                                        \\\\_//    '._       _.'    \\\\_//
                                                                         `"`        ``---``        `"`
                """;
        System.out.println(artWork);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t++++++++++++++++WELCOME TO AIRLINES SYSTEM++++++++++++++++");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n\t\t\t\t\t ============MENU============");
            System.out.println("\n\t\t\t\t\t 1-> Login\n\t\t\t\t\t 2-> Create an account\n\t\t\t\t\t 3-> Admin panel\n\t\t\t\t\t 4-> Exit");
            System.out.println("\t\t\t\t\t Enter your choice: ");
            int listNumber;
            try {
                System.out.print("\t\t\t\t\t ");
                listNumber = scanner.nextInt();
                if (listNumber < 1 || listNumber > 4) {
                    System.out.println("\t\t\t\t\t Number must be between 1 and 4\n");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\t\t\t\t\t You should enter an Integer number\n");
                scanner.next();
                continue;
            }
            System.out.println();
            DataHandler.displayArtWork(listNumber);
            if (listNumber == 1) {
                System.out.print("Enter your phone number: ");
                String ph = scanner.next();
                System.out.print("Enter your password: ");
                String p = scanner.next();
                if (DataHandler.passengerLogin(ph, p)) {
                    System.out.println("\nWelcome " + DataHandler.currentPassenger.getFullName() + "\n");
                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t======PASSENGER MENU======\n\t\t\t\t\t 1-> View the flight schedule\n\t\t\t\t\t 2-> Book a flight\n\t\t\t\t\t 3-> View booked flights\n\t\t\t\t\t 4-> Cancel a flight\n\t\t\t\t\t 5-> View wallet balance\n\t\t\t\t\t 6-> Recharge wallet\n\t\t\t\t\t 7-> Logout\n");
                        System.out.print("Enter your choice: ");
                        if (scanner.hasNextInt()) {
                            int choice = scanner.nextInt();
                            DataHandler.displayArtWork2(choice);
                            if (choice == 1) {
                                System.out.println();
                                DataHandler.viewFlights();
                            } else if (choice == 2) {
                                if (DataHandler.viewFlights()){
                                    System.out.print("Enter flight ID you want to book: \n");
                                    String bTicketNumber = scanner.next();
                                    DataHandler.bookTicket(bTicketNumber);
                                }
                            } else if (choice==3) {
                                DataHandler.viewBookedFlights(DataHandler.currentPassenger);
                            } else if (choice == 4) {
                                if (DataHandler.viewBookedFlights(DataHandler.currentPassenger)) {
                                    System.out.print("\n\nEnter flight ID you want to cancel: ");
                                    String cTicketNumber = scanner.next();
                                    DataHandler.cancelTicket(cTicketNumber);
                                }
                            } else if (choice == 5) {
                                System.out.println("\nYour wallet balance: " + DataHandler.currentPassenger.getWallet() + "$\n");
                            } else if (choice == 6) {
                                System.out.print("Enter the amount you want to recharge: ");
                                double walletNumber = scanner.nextDouble();
                                DataHandler.rechargeWallet(walletNumber);
                            } else if (choice == 7) {
                                loggedIn = false;
                            } else {
                                System.out.println("\nNumber must be between 1 and 6!\n");
                            }
                        } else {
                            System.out.println("\nYou should enter an Integer number!\n");
                            scanner.next();
                        }
                    }

                } else {
                    System.out.println("\nPhone number and/or password are/is incorrect\n");
                }
            } else if (listNumber == 2) {
                scanner.nextLine();
                System.out.print("Enter your phone number: ");
                String newPhoneNumber = scanner.nextLine();
                System.out.print("Enter your full name: ");
                String newFullName = scanner.nextLine();
                System.out.print("Enter your password: ");
                String newPassword = scanner.nextLine();
                System.out.print("Enter your address: ");
                String newAddress=scanner.nextLine();
                System.out.print("Enter wallet amount: ");
                double newWallet = scanner.nextDouble();
                scanner.nextLine();
                DataHandler.createPassengerAcc(newPhoneNumber, newFullName, newPassword,newAddress, newWallet);
                System.out.println("\nYour account has been created successfully!\nPlease login to continue.\n");

            } else if (listNumber == 3) {
                System.out.print("Enter your phone number: ");
                String adminPh = scanner.next();
                System.out.print("Enter your password: ");
                String adminP = scanner.next();
                if (DataHandler.adminLogin(adminPh, adminP)) {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t======ADMIN PANEL======\n\t\t\t\t\t 1-> Add flight\n\t\t\t\t\t 2-> Remove flight\n\t\t\t\t\t 3-> View all flights\n\t\t\t\t\t 4-> View Registered Passengers\n\t\t\t\t\t 5-> Logout\n");
                        System.out.print("Choose option: ");
                        if (scanner.hasNextInt()) {
                            int adminChoice = scanner.nextInt();
                            if (adminChoice==1){
                                scanner.nextLine();
                                System.out.print("Enter flight ID: ");
                                String newFlightId=scanner.nextLine();
                                System.out.print("Enter origin: ");
                                String newOrigin=scanner.nextLine();
                                System.out.print("Enter destination: ");
                                String newDestination=scanner.nextLine();
                                System.out.print("Enter departureTime: ");
                                String newDepartureTime=scanner.nextLine();
                                System.out.print("Enter arrivalTime: ");
                                String newArrivalTime=scanner.nextLine();
                                System.out.print("Enter capacity: ");
                                int newCapacity=scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter price: ");
                                double newPrice=scanner.nextDouble();
                                scanner.nextLine();
                                DataHandler.addFlight(newFlightId,newOrigin,newDestination,newDepartureTime,newArrivalTime,newCapacity,newPrice);
                            } else if (adminChoice==2) {
                                if (DataHandler.viewFlights()){
                                    System.out.print("\nEnter the flight ID you want to remove: ");
                                    String arnumber = scanner.next();
                                    DataHandler.removeFlight(arnumber);
                                }
                            } else if (adminChoice == 3) {
                                DataHandler.viewFlights();
                            } else if (adminChoice == 4) {
                                System.out.println(DataHandler.viewRegisteredPassengers());
                            } else if (adminChoice==5) {
                                flag=false;
                            } else {
                                System.out.println("\nNumber must be between 1 and 5!\n");
                            }

                        } else {
                            System.out.println("\nYou should enter an Integer number!\n");
                            scanner.next();
                        }

                    }
                } else {
                    System.out.println("\nPhone number and/or password are/is incorrect\n");
                }

            } else {
                break;
            }
        }
        scanner.close();
    }
}