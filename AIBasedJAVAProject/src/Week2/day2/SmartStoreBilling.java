package Week2.day2;

public class SmartStoreBilling {

	public static void main(String[] args) {
		double[] prices = {800.00, 1000.00, 4999.00, 5000.00, 7000.00, 1200.00, 999.99, 250.00};
		int[] quantities = {1, 1, 1, 1, 1, 5, 1, 4};

		double[] expectedDiscountPercent = {0.0, 5.0, 5.0, 10.0, 10.0, 10.0, 0.0, 5.0};
		double[] expectedDiscountAmount = {0.00, 50.00, 249.95, 500.00, 700.00, 600.00, 0.00, 50.00};
		double[] expectedFinal = {800.00, 950.00, 4749.05, 4500.00, 6300.00, 5400.00, 999.99, 950.00};

		System.out.printf("%-3s %-10s %-5s %-11s %-18s %-29s %-19s %-17s %-6s%n",
				"#", "Price (Rs)", "Qty", "Total (Rs)", "Expected discount", "Expected discount amount (Rs)",
				"Expected final (Rs)", "Actual final (Rs)", "Pass?");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < prices.length; i++) {
			double total = prices[i] * quantities[i];
			double discountPercent = getDiscountPercentage(total);
			double actualDiscountAmount = (total * discountPercent) / 100;
			double actualFinal = total - actualDiscountAmount;

			boolean isPass = nearlyEqual(actualFinal, expectedFinal[i])
					&& nearlyEqual(discountPercent, expectedDiscountPercent[i])
					&& nearlyEqual(actualDiscountAmount, expectedDiscountAmount[i]);

			System.out.printf("%-3d %-10.2f %-5d %-11.2f %-18s %-29.2f %-19.2f %-17.2f %-6s%n",
					i + 1,
					prices[i],
					quantities[i],
					total,
					String.format("%.0f%%", expectedDiscountPercent[i]),
					expectedDiscountAmount[i],
					expectedFinal[i],
					actualFinal,
					isPass ? "Yes" : "No");
		}
	}

	private static double getDiscountPercentage(double totalAmount) {
		if (totalAmount >= 5000) {
			return 10.0;
		} else if (totalAmount >= 1000) {
			return 5.0;
		}
		return 0.0;
	}

	private static boolean nearlyEqual(double a, double b) {
		return Math.abs(a - b) < 0.0001;
	}
}