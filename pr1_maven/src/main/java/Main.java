import org.apache.commons.math3.fraction.Fraction;

public class Main {
    public static void main(String args[])
    {
        Fraction f1 = new Fraction(12,24);
        Fraction f2 = new Fraction (34, 67);
        Fraction answ = f1.add(f2);
        System.out.println("First fraction: "+f1);
        System.out.println("Second Fraction: "+f2);
        System.out.println("Add two fractions: "+answ);
    }
}
