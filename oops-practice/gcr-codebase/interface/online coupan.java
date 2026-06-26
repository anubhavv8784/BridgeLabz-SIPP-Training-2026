
interface CouponValidator {
    boolean validateCoupon(String code);
    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}
class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code) &&
               code.startsWith("DISC");
    }
    public static void main(String[] args) {
        String[] coupons = {
            "DISC10",
            "DISC50",
            "ABC12",
            "DISC12345",
            "D10",
            "DISCOUNT100"
        };
        ShoppingCart cart = new ShoppingCart();
        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}