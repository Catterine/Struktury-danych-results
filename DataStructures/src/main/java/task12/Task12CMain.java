package task12;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Task12CMain {
	private static Map<Long, BigInteger> map = new HashMap<>();

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			long t = System.currentTimeMillis();
			System.out.println(i + " => " + fib(i) + " => " + (System.currentTimeMillis() - t));
		}
	}

	private static BigInteger fib(long n) {
		if (n == 0) {
			return BigInteger.ZERO;
		}
		if (n == 1) {
			return BigInteger.ONE;
		}

		if (map.containsKey(n)) {
			return map.get(n);
		}

		BigInteger result = fib(n - 1).add(fib(n - 2));

		map.put(n, result);

		return result;
	}
}
