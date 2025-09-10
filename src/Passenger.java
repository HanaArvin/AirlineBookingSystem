import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String phoneNumber;
    private String password;
    private String fullName;
    private String address;
    private double wallet;
    private List<String> bookedFlights = new ArrayList<>();

    public Passenger(String phoneNumber, String password, String fullName, String address, double wallet) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.wallet = wallet;
        this.bookedFlights = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<String> getBookedFlights() {
        return bookedFlights;
    }

    public boolean checkUp(String phoneNumber, String password) {
        return getPhoneNumber().equals(phoneNumber) && getPassword().equals(password);
    }

}
