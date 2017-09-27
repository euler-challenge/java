package org.shanerx.euler.prob1;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        
        while (n < 1000) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println(sum);
    }
}
