/**
 * @id 010
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
package dsa.Math;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int n = 100; // Upper limit for prime numbers
        boolean[] isPrime = sieveOfEratosthenes(n);

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        // Initially assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        // Mark multiples of prime numbers as composite
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
}
