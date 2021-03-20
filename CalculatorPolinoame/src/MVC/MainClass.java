package MVC;

import Controller.Control;
import Model.Polinom;
import View.InterfataG;

public class MainClass {
    public static void main(String[] args) {
//		Polinom p1 = new Polinom();
//		Polinom p2 = new Polinom();
//		MonomDouble[] m = new MonomDouble[5];
//		m[0] = new MonomDouble(4, 2);
//		m[1] = new MonomDouble(1, 3);
//		m[2] = new MonomDouble(1, 0);
//		m[3] = new MonomDouble(2, 2);
//		m[4] = new MonomDouble(5, 0);
//
//		p1.polinom.add(m[1]);
//		p1.polinom.add(m[3]);
//		p1.polinom.add(m[4]);
//
//		p2.polinom.add(m[0]);
//		p2.polinom.add(m[2]);
//
//		Polinom p3 = new Polinom();
//		Polinom p4 = new Polinom();
//		MonomInt[] m1 = new MonomInt[5];
//		m1[0] = new MonomInt(4, 2);
//		m1[1] = new MonomInt(1, 3);
//		m1[2] = new MonomInt(1, 0);
//		m1[3] = new MonomInt(2, 2);
//		m1[4] = new MonomInt(5, 0);
//
//		p3.polinom.add(m1[1]);
//		p3.polinom.add(m1[3]);
//		p3.polinom.add(m1[4]);
//
//		p4.polinom.add(m1[0]);
//		p4.polinom.add(m1[2]);
//
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//
//		System.out.println("\nSuma celor doua polinoame este:\n" + p3.adunare(p4).toString());
//		System.out.println("\nDiferenta celor doua polinoame este:\n" + p3.scadere(p4).toString());
//		System.out.println("\nProdusul celor doua polinoame este:\n" + p3.produs(p4).toString());
//		System.out.println("\nImpartirea celor doua polinoame este:\n" + "cat:" + p1.imparte(p2).cat.toString()
//				+ "\nrest:" + p1.imparte(p2).rest.toString());
//		System.out.println("derivarea lui p1: " + p3.derivare().toString());
        ///////////////////////////////////////////////////////////////////////////////// ---------------------------------------------------------------------

        InterfataG view = new InterfataG();
        Polinom pp1 = new Polinom();
        Polinom pp2 = new Polinom();
        try {
            Control contr = new Control(view, pp1, pp2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
