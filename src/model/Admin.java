package model;

public class Admin {
    private final String phonenumber;
    private final String password;
 public Admin(String phonenumber,String password){
     this.phonenumber=phonenumber;
     this.password=password;
 }
    public String getPhonenumber() {
        return this.phonenumber;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean adminLogin(String phonenumber, String password) {
        return getPhonenumber().equals(phonenumber) && getPassword().equals(password);
    }
}
