import java.util.*;

public class LogicBuilding {

    //________________________________________1. Count Digits_______________________________________________
    // Counts how many digits of N evenly divide N.
    public static int countDigits(int n) {
        int count = 0;
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    //_______________________________4. GCD or HCF (Euclidean Algorithm)_________________________________________
    public static int findGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return (a == 0) ? b : a;
    }



    // ________________________________________7. Check Prime__________________________________________________
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("1. Count Digits (12): " + countDigits(12)); // 1 and 2 divide 12 -> Output: 2
        System.out.println("4. GCD (12, 18): " + findGCD(12, 18)); // Output: 6
        System.out.println("7. Is Prime (17): " + isPrime(17)); // Output: true
    }
}
