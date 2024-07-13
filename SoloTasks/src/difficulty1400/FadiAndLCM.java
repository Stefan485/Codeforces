package difficulty1400;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FadiAndLCM {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        long n = reader.nextLong();
        PriorityQueue<Pair> factors = divisors(n);

        reader.close();
        System.out.println(factors.poll());
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static PriorityQueue<Pair> divisors(long n) {
        long root = (long) Math.sqrt(n);
        PriorityQueue<Pair> divs = new PriorityQueue<>();
        divs.add(new Pair(1, n));
        for (long i = 2; i <= root; i++) {
            if (n % i == 0) {
                long tmp = n / i;
                if ((i * tmp) / gcd(i, tmp) == n) {
                    divs.add(new Pair(i, tmp));
                    
                }
            }
        }

        return divs;
    }

    static class Pair implements Comparable<Pair>{
        long a;
        long b;

        public Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            
            long res = Math.max(a, b) - Math.max(o.a, o.b);
            if (res < 0) {
                return -1;
            } else if (res > 0) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return a + " " + b;
        }
    }
}
