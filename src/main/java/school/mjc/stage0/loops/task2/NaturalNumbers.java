package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public static void naturalNumbersPrinter(int lastPrinted) {

        int a=0;
        while (a<=lastPrinted ){
            System.out.println(a);
            a++;}
    }
public static void main (String []args)
{int  lastPrinted =10;
naturalNumbersPrinter(lastPrinted);}
}
