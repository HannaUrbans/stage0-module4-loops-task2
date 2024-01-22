package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void printEvenNumbers(int printTillInclusive) {
        int a=0;
int result;
        while (a<=printTillInclusive)
        {result=a;
        if(result%2==0)
        {System.out.println(result);}
        a++;}
    }
    public static void main (String[]args)
    {int printTillInclusive=5;
        printEvenNumbers(printTillInclusive);}
}
