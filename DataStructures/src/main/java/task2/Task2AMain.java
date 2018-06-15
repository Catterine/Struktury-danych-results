package task2;

public class Task2AMain {
	public static void main(String[] args) {

		// + 10 elementową tablicę, przechowującą liczby całkowite z wartościami domyślnymi
		int[] t1 = new int[10];
		int t1b[] = new int[10];
		int t1c [] = new int[10];
		int [] t1d = new int[10];

		// + tablica składająca się z 0 elementów
		int[] t2 = new int[0];
		int[] t2b = new int[]{};

		// + wskaźnik na tablicę przechowującą stringi
		String[] t3;
		String[] t3b = null;

		// + tablicę liczb zmiennoprzecinkowych, zainicjowaną 3 dowolnymi wartościami
		float[] t4 = {1.0F, 2, 3};
		double[] t4b = {1.0, 2, 3};
		double[] t4c = new double[]{1,2,3};

		// + tablicę wielowymiarową
		String[][] t5 = new String[10][];
		String[][] t5b = new String[][]{{"A"}, {"A", "B"}};
	}
}
