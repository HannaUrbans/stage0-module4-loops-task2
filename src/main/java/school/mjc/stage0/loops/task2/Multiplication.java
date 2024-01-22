package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int a = 0;
        if (multiplyByAndToInclusive ==0)
        {}
        else if (multiplyByAndToInclusive >0)
        {
            while (a <= multiplyByAndToInclusive) {
                int result = a * multiplyByAndToInclusive;
                System.out.println(result);
                a++;
            }
        }
        else
        {
            while (a >= multiplyByAndToInclusive) {
                int result = a * multiplyByAndToInclusive;
                System.out.println(0-result);
                a--;
            }
        }

    }

    public static void main(String[] args) {
        int multiplyByAndToInclusive = 0;
        printMultiplied(multiplyByAndToInclusive);
    }
}
