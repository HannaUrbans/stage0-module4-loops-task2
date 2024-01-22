package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int beginning = 2;
        while (beginning <= printToInclusive) {
            boolean isPrime = true;
                int i = 2;
                while (i <= Math.sqrt(beginning)) {
                    if (beginning % i == 0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }

            if (isPrime) {
                System.out.print(beginning+"\n");
            }
            beginning++;
        }}
        public static void main (String[]args){
            int printToInclusive = 33;
            printPrimeNumbers(printToInclusive);
        }

    }