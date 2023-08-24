package ABC.src.BankBazaar;


import java.util.ArrayList;

public abstract class BankBazaar extends Customer {

    public BankBazaar() {
        super();
    }

    ArrayList<String> bUser = new ArrayList<>();
    ArrayList<Long> bA_no = new ArrayList<>();
    ArrayList<String> bPwd = new ArrayList<>();

    public BankBazaar(long aadharNum, String cName) {
        super(aadharNum, cName);
    }

    public abstract void loanCategory();

    public abstract void cardCategory();

}
