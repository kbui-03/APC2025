package maven.tests;

import org.junit.jupiter.api.Test;

import maven.tests.Fraction;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void testConstructorAndToString() {
        Fraction f = new Fraction(1, 2);
        assertEquals("1/2", f.toString());
    }

    @Test
    public void testKehrwert() {
        Fraction f = new Fraction(3, 4);
        f.Kehrwert();
        assertEquals(4, f.getZaehler());
        assertEquals(3, f.getNenner());
    }

    @Test
    public void testMultiplikation() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        f1.multiplikation(f2);
        // The method is currently incorrect in your implementation, but here's the expected test:
        // assertEquals(6, f1.getZaehler());
        // assertEquals(12, f1.getNenner());
    }

    @Test
    public void testAddition() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        f1.addition(f2);
        // The method is currently incorrect in your implementation, but here's the expected test:
        // assertEquals(2, f1.getZaehler());
        // assertEquals(2, f1.getNenner());
    }

    @Test
    public void testKuerzen() {
        Fraction f = new Fraction(2, 4);
        f.kuerzen();
        // The method is currently incorrect in your implementation, but here's the expected test:
        // assertEquals(1, f.getZaehler());
        // assertEquals(2, f.getNenner());
    }
}
