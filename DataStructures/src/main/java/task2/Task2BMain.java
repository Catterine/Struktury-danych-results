package task2;

import java.util.Arrays;

public class Task2BMain {
	public static void main(String[] args) {
		double[] tab = {0, 66.3, 1, 10.5, 100.55, 0, -100.8};

		System.out.println(Arrays.toString(tab));
		System.out.println(max(tab));
	}

	private static double max(double[] tab) {
		if (tab == null || tab.length < 1) {
			throw new IllegalArgumentException("The array must contain at least one element");
		}

		double max = tab[0];

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}

		return max;
	}
}
