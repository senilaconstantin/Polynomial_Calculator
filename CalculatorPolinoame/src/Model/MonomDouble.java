package Model;

public class MonomDouble extends Monom{
	double coeficient;
	public MonomDouble() {}
	public MonomDouble(double coeficient,int exp) {
		super(exp);
		this.coeficient = coeficient;
	}
	public double getCoeficient() {
		return coeficient;
	}
	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}
	
	public MonomDouble adunare(MonomDouble x) {
		MonomDouble rez=new MonomDouble();
		rez.setCoeficient(x.coeficient+this.coeficient);
		rez.setExponent(x.exponent);
		return rez;
	}
	
	public MonomDouble scadere(MonomDouble x) {
		MonomDouble rez=new MonomDouble();
		rez.setCoeficient(this.coeficient-x.coeficient);
		rez.setExponent(x.exponent);
		return rez;
	}
	public MonomDouble inmultire(MonomDouble x) {
		MonomDouble rez=new MonomDouble();
		rez.setCoeficient(x.coeficient*this.coeficient);
		rez.setExponent(x.exponent+this.exponent);
		return rez;
	}
	public MonomDouble impartire(MonomDouble x) {
		MonomDouble rez=new MonomDouble();
		try{
			rez.setCoeficient(this.coeficient/x.coeficient);
			rez.setExponent(this.exponent-x.exponent);
		}catch(Exception e){
			e.printStackTrace();
		}

		return rez;
	}
	public MonomDouble integrare() {
		MonomDouble rez=new MonomDouble();
		rez.setCoeficient(this.coeficient/(this.exponent+1));
		rez.setExponent(this.exponent+1);
		
		return rez;
	}
	
	public String toString() {
		String s=String.format("%.2f", this.coeficient);
		if(this.coeficient<0)
			return s+"X^"+this.exponent;
		else
			return "+"+s+"X^"+this.exponent;
	}
	
}
