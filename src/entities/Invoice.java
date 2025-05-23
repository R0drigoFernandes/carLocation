package entities;

public class Invoice {
    public double basicPayment;
    public double tax;

    public Invoice() {
        super();
    }
    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }
    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    
    
    public double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}
