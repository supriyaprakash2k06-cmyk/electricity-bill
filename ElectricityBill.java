public class ElectricityBill {

    public static double calculateBill(int units) {

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        }
        else if (units <= 300) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        }
        else {
            bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4);
        }

        return bill;
    }

    public static void main(String[] args) {

        int units = 350;

        double totalBill = calculateBill(units);

        System.out.println("Electricity Bill = Rs. " + totalBill);
    }
}