package task12;

import java.util.HashMap;
import java.util.Map;

public class Task12BMain {
	private static Map<Long, Long> map = new HashMap<>();

	public static void main(String[] args) {
		for (int i = 0; i <= 90; i++) {
			long t = System.currentTimeMillis();
			System.out.println(i + " => " + fib(i) + " => " + (System.currentTimeMillis() - t));
		}
	}

	private static long fib(long n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		if (map.containsKey(n)) {
			return map.get(n);
		}

		long result = fib(n - 1) + fib(n - 2);

		map.put(n, result);

		return result;
	}
}
