package Model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static Polinom transInt(String pol) {
		Pattern p = Pattern.compile("(-?\\b\\d+)[xX]\\^(-?\\d+\\b)");
		Matcher m = p.matcher(pol);
		Polinom rez = new Polinom();
		while (m.find()) {

			int coef;
			int exp;

			coef = Integer.valueOf(m.group(1));
			exp = Integer.valueOf(m.group(2));
			MonomInt mon=new MonomInt(coef,exp);
			
			rez.polinom.add(mon);
		}

		return rez;
	}
	public static Polinom transDouble(String pol) {
		Pattern p = Pattern.compile("(-?\\b\\d+)[xX]\\^(-?\\d+\\b)");
		Matcher m = p.matcher(pol);
		Polinom rez = new Polinom();
		while (m.find()) {

			Double coef;
			int exp;

			coef = Double.valueOf(m.group(1));
			exp = Integer.valueOf(m.group(2));
			MonomDouble mon=new MonomDouble(coef,exp);
			
			rez.polinom.add(mon);
		}

		return rez;
	}

}
