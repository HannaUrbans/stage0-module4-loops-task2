package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        if (power<0)
        {System.out.println("too much power");}
        else {
            int a = 2;
            int i = 0;
            int result;
            while (i <= power) {
                result = (int) Math.pow(a, i);
                System.out.println(result);
                i++;
            }
        }
    }
    public static void main (String []args)
    {int power=0;
    printPower(power);}
}
