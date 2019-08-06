package co.grandcircus.bill_inheritance;

public class TippableBill extends Bill {

    private double tip;

    public TippableBill() {
	super();
    }

    public TippableBill(double subtotal, double taxRate, double tip) {
	super(subtotal, taxRate);
	this.tip = tip;
    }

    public double getTip() {
	return tip;
    }

    public void setTip(double tip) {
	this.tip = tip;
    }

    @Override
    public double calcTotal() {
	return super.calcTotal() + tip;
    }


}
