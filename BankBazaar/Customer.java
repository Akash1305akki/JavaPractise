package ABC.src.BankBazaar;

public abstract class Customer {
    private long aadharNum;
    private String cName;

    public Customer() {
    }

    public Customer(long aadharNum, String cName) {
        this.aadharNum = aadharNum;
        this.cName = cName;
    }

    public long getAadharNum() {
        return aadharNum;
    }

    public void setAadharNum(long aadharNum) {
        this.aadharNum = aadharNum;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public abstract void citizenship();
}
