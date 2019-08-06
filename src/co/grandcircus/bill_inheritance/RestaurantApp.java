package co.grandcircus.bill_inheritance;

public class RestaurantApp {

    public static void main(String[] args) {
	Bill bill1 = new Bill(15.80, 0.06);
	TippableBill bill2 = new TippableBill(8.50, 0.06, 2.00);

	pay(bill1);
	pay(bill2);
    }

    private static void pay(Bill bill) {
	System.out.println("Total: $" + bill.calcTotal());
    }

}
