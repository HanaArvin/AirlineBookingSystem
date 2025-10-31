# Airline Booking System

A simple Java-based Airline Management System that allows passengers to view flights, book or cancel tickets, manage wallet balance, and lets the admin manage flights and view passengers.

<img width="1564" height="732" alt="Screenshot 2025-10-31 023437" src="https://github.com/user-attachments/assets/edb60542-4a1c-47b5-8d18-49bd1a4b8064" />



## Requirements 

• **Java JDK 17** (or later) installed on your system  
• **IntelliJ IDEA** (or any other Java IDE) for running and editing the project  



## Features

### • Sign Up

Allows new passengers to register by providing their phone number, full name, password, address, and initial wallet balance. After registration, users can log in and access all passenger features.

<img width="1522" height="791" alt="Screenshot 2025-10-31 032721" src="https://github.com/user-attachments/assets/bba0dc0c-cdb8-4544-b479-e90f42646883" />

---

### • Log In

Allows registered passengers to access their accounts by entering their phone number and password. Once logged in, passengers can view flights, book or cancel tickets, check wallet balance, and manage their bookings.

<img width="1584" height="809" alt="Screenshot 2025-10-31 034430" src="https://github.com/user-attachments/assets/9dc72564-3006-46eb-b187-91f79ea2cb93" />



### • Flight Schedule

Passengers can see a list of all available flights, including flight ID, origin, destination, departure and arrival times, price, available seats, and total capacity. Passengers can use this information to choose flights to book.

<img width="1804" height="738" alt="Screenshot 2025-10-31 035022" src="https://github.com/user-attachments/assets/08895ef2-13c3-42d6-91c0-d74fd98e738e" />



### • Book Flight

Allows passengers to book a flight from the available flights list. Passengers must have enough wallet balance and the flight must have available seats. Once booked, the ticket is added to the passenger’s booked flights and the wallet balance is updated.



### • Cancel Flight

Passengers can cancel any of their booked flights. Upon cancellation, the flight’s available seats increase and the ticket price is refunded to the passenger’s wallet.



### • Wallet Management

Passengers can check their current wallet balance and recharge it with a desired amount. Wallet balance is used for booking flights and updated automatically after bookings or cancellations.

---

### • Admin Panel

Allows the admin to log in and manage flights and passengers. Admin can add or remove flights and view all registered passengers.

<img width="1631" height="751" alt="Screenshot 2025-10-31 033331" src="https://github.com/user-attachments/assets/003c0c2f-6318-43ca-9502-fb4a142d550e" />



### • Add Flight

Allows the admin to add a new flight by entering details such as flight ID, origin, destination, departure and arrival times, capacity, and price.



### • Remove Flight

Allows the admin to remove an existing flight. If any passengers have booked the flight, their wallet is refunded automatically.



### • Display Flight Schedule & Registered Passengers

The admin can view all flights and all registered passengers with their details (full name, phone number, address, wallet balance, and booked flights).
