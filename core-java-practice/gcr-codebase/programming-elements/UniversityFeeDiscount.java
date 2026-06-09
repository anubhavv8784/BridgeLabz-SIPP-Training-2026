// UniversityFeeDiscount calculates the discounted fee with a 10% discount on INR 125000
public class UniversityFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        int discountPercent = 10;

        double discountAmount = (discountPercent / 100.0) * fee;
        double finalDiscountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee);
    }
}
