package Test;

import Model.Impartire;
import Model.MonomDouble;
import Model.Polinom;
import Model.RegEx;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClasaTest {

    @Test
    public void adunare() {
        Polinom p1 = RegEx.transInt("4x^4+3x^2+5X^0");
        Polinom p2 = RegEx.transInt("3x^4+3x^2+5X^1+4x^0");
        Polinom rez = RegEx.transInt("7x^4+6x^2+5x^1+9x^0");
        Polinom rezMet = p1.adunare(p2);
        assertEquals(rez, rezMet);

    }

    @Test
    public void scadere() {
        Polinom p1 = RegEx.transInt("4x^4+3x^2+5X^0");
        Polinom p2 = RegEx.transInt("3x^4+3x^2+5X^1+4x^0");
        Polinom rez = RegEx.transInt("1x^4-5x^1+1x^0");
        Polinom rezMet = p1.scadere(p2);
        assertEquals(rez, rezMet);
    }

    @Test
    public void inmultire() {
        Polinom p1 = RegEx.transInt("3x^2-1X^1+1x^0");
        Polinom p2 = RegEx.transInt("1x^1-2x^0");
        Polinom rez = RegEx.transInt("3x^3-7x^2+3x^1-2x^0");
        Polinom rezMet = p1.produs(p2);
        assertEquals(rez, rezMet);
    }

    @Test
    public void impartire() {
        Polinom p1 = RegEx.transDouble("1x^3-2X^2+6x^1-5x^0");
        Polinom p2 = RegEx.transDouble("1x^2-1x^0");

        Impartire rezMet = p1.imparte(p2);
        assertEquals("1.00X^1-2.00X^0  Rest:7.00X^1-7.00X^0", rezMet.toString());
    }

    @Test
    public void derivare() {
        Polinom p1 = RegEx.transInt("1x^3-2X^2+6x^1-5x^0");
        Polinom rez = RegEx.transInt("3x^2-4x^1+6x^0");
        Polinom rezMet = p1.derivare();
        assertEquals(rez, rezMet);
    }

    @Test
    public void integrare() {
        Polinom p1 = RegEx.transDouble("4x^3+1X^1+5x^0");

        Polinom rezMet = p1.integrare();
        assertEquals("1.00X^4+0.50X^2+5.00X^1", rezMet.toString());
    }
}
