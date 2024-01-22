package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int i = 1;
        int fact = 1;
        if (printToInclusive == 0) {
            fact = 1;
            System.out.println(fact);
        } else {
            System.out.println(1);
            while (i <= printToInclusive) {
                fact = fact * i;
                System.out.println(fact);
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int printToInclusive = 0;
        printFactorialRow(printToInclusive);
    }
}
