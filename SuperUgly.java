
public class SuperUgly {

	public static void main(String... args){
     int[]  primes = new int[]{1,2,3,5,7,9,11,13};
     nthSuperUglyNumber(5, primes);
	}
	public static int nthSuperUglyNumber(int n, int[] primes) {
		int[] ugly = new int[n];
	    int[] idx = new int[primes.length];

	    ugly[0] = 1;
	    for (int i = 1; i < n; i++) {
	        //find next
	        ugly[i] = Integer.MAX_VALUE;
	        for (int j = 0; j < primes.length; j++)
	            ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);

	        //slip duplicate
	        for (int j = 0; j < primes.length; j++) {
	            while (primes[j] * ugly[idx[j]] <= ugly[i]) idx[j]++;
	        }
	    }

	    return ugly[n - 1];
	}
}
