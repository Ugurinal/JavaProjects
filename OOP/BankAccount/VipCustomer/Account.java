/**
 * Created by UGURINAL
 * 7/23/2019
 * 1:41 PM
 **/


public class Account {
    private String customerName;
    private String number;
    private String email;
    private String phone;
    private double balance;

    public Account(){
        this("Default name","123456789","Default e-mail","XXX-XXX-XXXX",50);
        System.out.println("Empty constructor called.");
    }

    public Account(String customerName, String number, String email, String phone, double balance){
        System.out.println("Constructor with parameters called...");
        this.customerName = customerName;
        this.number = number;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    public void setAccountNumber(String number){
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(""+depositAmount+"$ added to "+this.customerName +"'s balance. New balance = "+this.balance+"$");
    }

    public void withdrawal(double withdrawalAmount){
        if(withdrawalAmount == 0){
            System.out.println("Invalid value... You can not withdraw 0$.");
        }else if(withdrawalAmount > balance){
            System.out.println("Insufficient fund. "+"You have only "+this.balance+"$.");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+"$ processed. "+this.customerName +"'s remaining balance = "+this.balance+"$.");
        }

    }

    public void getFullInformation(){
        System.out.println("Customer Name = "+this.customerName);
        System.out.println("Account number = "+this.number);
        System.out.println("E-mail = "+this.email);
        System.out.println("Phone number = "+this.phone);
        System.out.println("Balance = "+this.balance);
        System.out.println();
    }

}
