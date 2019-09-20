package jbhembise.testauto.example2;

public class DiscountCalculator {

    private DiscountCalculator() {

    }

    /**
     * Calculate percentage of discount.
     * Between 500 and 1000 : 5%.
     * Between 1000 and 2000 : 10%.
     * After 2000 : 15%.
     *
     * @param quantity the amount of product ordered.
     * @return the discount percentage
     */
    public static int calculatePercentage(int quantity) {
        if (quantity >= 10 && quantity < 1000) {
            return 5;
        } else if (quantity >= 1000 && quantity < 2000) {
            return 10;
        } else if (quantity >= 2000) {
            return 15;
        }
        return 0;
    }
}
