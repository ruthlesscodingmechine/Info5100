package src.partB;

public class CheckingAccount extends Account{
    // static data members
    static private double MinBalance = 100;
    static private double Fee = 10;

    public CheckingAccount(String fname, String lname, double cb){
        super(fname, lname, cb);
    }
    public double DebitTransaction(double debitAmount){
        super.DebitTransaction(debitAmount);
        if(CurBalance < this.MinBalance) this.ChargeFee();
        return CurBalance;
    }
    public double CreditTransaction(double creditAmount){
        super.CreditTransaction(creditAmount);
        if(CurBalance < this.MinBalance) this.ChargeFee();
        return CurBalance;
    }
    private void ChargeFee(){
        this.CurBalance -= this.Fee;
    }

}


// NO instance data members

// methods

//
//
// WRITE YOUR CODE FOR ALL METHODS
//

