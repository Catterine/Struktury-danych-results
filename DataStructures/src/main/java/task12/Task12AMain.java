package task12;

public class Task12AMain {
	public static void main(String[] args) {
		for (int i = 0; i <= 40; i++) {
			long t = System.currentTimeMillis();
			System.out.println(i + " => " + fib(i) + " => " + (System.currentTimeMillis() - t));
		}
	}

	private static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);
	}
}
