package adityakm;

public class Bank_Account {
    private int acc_no;
    private double balance = 0.0;
    private String holder_name;
    private String address;
    private String phone_no;

    public Bank_Account(String holder_name, String address, String phone_no, int acc_no){
        this.holder_name = holder_name;
        this.address = address;
        this.phone_no = phone_no;
        this.acc_no = acc_no;
        System.out.println("Account Opened");
    }

    public Bank_Account(){
        this("", "", "", 000000);
    }

    public void setAcc_no(int acc_no){
        this.acc_no = acc_no;
    }
    public String depositSum(double sum){
        this.balance += sum;
        return (sum+" has been credited into your account. Current account balance is "+this.balance);
    }
    public String withdrawSum(double sum){
        if(sum <= balance) {
            this.balance -= sum;
            return (sum+" has been debited from your account. Current account balance is "+this.balance);
        }
        else {
            return ("Account Balance Insufficient");
        }
    }
    public void setHolder_name(String name){
        this.holder_name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhone_no(String phone_no){
        this.phone_no = phone_no;
    }
    public String getAccountDetails(){
        return ("Account Holder Name: "+this.holder_name+"\nAddress: "+this.address+"\nPhone Number: "+this.phone_no+"\nBalance: "+this.balance);
    }
}
