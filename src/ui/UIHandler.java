package ui;

import model.Admin;
import service.AirlineService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UIHandler {
    Scanner scanner=new Scanner(System.in);
    AirlineService airlineService=new AirlineService();
    public UIHandler(){
        System.out.println(artWork);
    }
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
                   
                                                                      ++++++++++++++++ Welcome to Airlines System ++++++++++++++++
                """;
      void displayArtWork(int number){
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

    void displayArtWork2(int number) {
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

    void menu() {
        System.out.println("\n\t\t\t\t\t ============MENU============");
        System.out.println("\t\t\t\t\t 1-> Log In");
        System.out.println("\t\t\t\t\t 2-> Sign Up");
        System.out.println("\t\t\t\t\t 3-> Admin panel");
        System.out.println("\t\t\t\t\t 4-> Exit");
        System.out.print("\t\t\t\t\t Enter your choice: ");
    }
    void passengerMenu(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t======PASSENGER MENU======\n");
        System.out.println("\t\t\t\t\t 1-> Display flight schedule");
        System.out.println("\t\t\t\t\t 2-> Book a flight");
        System.out.println("\t\t\t\t\t 3-> View booked flights");
        System.out.println("\t\t\t\t\t 4-> Cancel a flight");
        System.out.println("\t\t\t\t\t 5-> View wallet balance");
        System.out.println("\t\t\t\t\t 6-> Recharge wallet");
        System.out.println("\t\t\t\t\t 7-> Logout");
        System.out.print("Enter your choice: ");
    }

    void createPassengr(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String newPhoneNumber = scanner.nextLine();
        System.out.print("Enter your full name: ");
        String newFullName = scanner.nextLine();
        System.out.print("Enter your password: ");
        String newPassword = scanner.nextLine();
        System.out.print("Enter your address: ");
        String newAddress = scanner.nextLine();
        System.out.print("Enter wallet amount: ");
        double newWallet = scanner.nextDouble();
        scanner.nextLine();
        airlineService.createPassengerAcc(newPhoneNumber, newFullName, newPassword, newAddress, newWallet);
        System.out.println("\nYour account has been created successfully!\nPlease login to continue.\n");
    }
    void adminMenu(){
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t======ADMIN PANEL======\n");
        System.out.println("\t\t\t\t\t 1-> Add flight");
        System.out.println("\t\t\t\t\t 2-> Remove flight");
        System.out.println("\t\t\t\t\t 3-> Display flight schedule");
        System.out.println("\t\t\t\t\t 4-> Display Registered Passengers");
        System.out.println("\t\t\t\t\t 5-> Logout");
        System.out.print("Choose option: ");
    }
    void passenger(Scanner scanner){
        while (true) {
            passengerMenu();
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                displayArtWork2(choice);
                if (choice == 1) {
                    System.out.println();
                    airlineService.viewFlights();
                } else if (choice == 2) {
                    if (airlineService.viewFlights()){
                        System.out.print("Enter flight ID you want to book: \n");
                        String bTicketNumber = scanner.next();
                        airlineService.bookTicket(bTicketNumber);
                    }
                } else if (choice==3) {
                    airlineService.viewBookedFlights(airlineService.currentPassenger);
                } else if (choice == 4) {
                    if (airlineService.viewBookedFlights(airlineService.currentPassenger)) {
                        System.out.print("\n\nEnter flight ID you want to cancel: ");
                        String cTicketNumber = scanner.next();
                        airlineService.cancelTicket(cTicketNumber);
                    }
                } else if (choice == 5) {
                    System.out.println("\nYour wallet balance: " + airlineService.currentPassenger.getWallet() + "$\n");
                } else if (choice == 6) {
                    System.out.print("Enter the amount you want to recharge: ");
                    double walletNumber = scanner.nextDouble();
                    airlineService.currentPassenger.rechargeWallet(walletNumber);
                } else if (choice == 7) {
                    break;
                } else {
                    System.out.println("\nNumber must be between 1 and 6!\n");
                }
            } else {
                System.out.println("\nYou should enter an Integer number!\n");
                scanner.next();
            }
        }
    }
    void admin(Scanner scanner){
        while (true) {
            adminMenu();
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
                    airlineService.addFlight(newFlightId,newOrigin,newDestination,newDepartureTime,newArrivalTime,newCapacity,newPrice);
                } else if (adminChoice==2) {
                    if (airlineService.viewFlights()){
                        System.out.print("\nEnter the flight ID you want to remove: ");
                        String id = scanner.next();
                        airlineService.removeFlight(id);
                    }
                } else if (adminChoice == 3) {
                    airlineService.viewFlights();
                } else if (adminChoice == 4) {
                    System.out.println(airlineService.viewRegisteredPassengers());
                } else if (adminChoice==5) {
                    break;
                } else {
                    System.out.println("\nNumber must be between 1 and 5!\n");
                }

            } else {
                System.out.println("\nYou should enter an Integer number!\n");
                scanner.next();
            }

        }
    }
    public void start(){
        while (true) {
            menu();
            int listNumber;
            try {
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
            displayArtWork(listNumber);
            if (listNumber == 1) {
                System.out.print("Enter your phone number: ");
                String ph = scanner.next();
                System.out.print("Enter your password: ");
                String p = scanner.next();
                if (airlineService.passengerLogin(ph, p)) {
                    System.out.println("\nWelcome " + airlineService.currentPassenger.getFullName() + "\n");
                    passenger(scanner);
                } else {
                    System.out.println("\nPhone number and/or password are/is incorrect\n");
                }
            } else if (listNumber == 2) {
                createPassengr(scanner);
            } else if (listNumber == 3) {
                System.out.print("Enter your phone number: ");
                String adminPh = scanner.next();
                System.out.print("Enter your password: ");
                String adminP = scanner.next();
                Admin admin=new Admin(adminPh,adminP);
                if (admin.adminLogin(adminPh, adminP)) {
                    admin(scanner);
                } else {
                    System.out.println("\nPhone number and/or password are/is incorrect\n");
                }

            } else {
                break;
            }
        }
    }
}
