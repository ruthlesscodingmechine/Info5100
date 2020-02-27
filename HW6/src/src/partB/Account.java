package src.partB;
public class Account {
    protected String FirstName;
    protected String LastName;
    protected double CurBalance;

    public Account(String fname, String lname, double curbalance){
        FirstName = fname;
        LastName = lname;
        CurBalance = curbalance;
    }
    public String getAcctType(){
        return this.getClass().getName();
    }
    public double DebitTransaction(double debitAmount){
        CurBalance -= debitAmount;
        return CurBalance;
    }
    public double CreditTransaction(double creditAmount){
        CurBalance += creditAmount;
        return CurBalance;
    }
    @Override
    public String toString(){
        return "Account name: " + FirstName + " " + LastName + ", Account Type: " + getAcctType() + ", Balance: " + String.format("$%.2f", CurBalance);
    }
}

