package Model;

import java.util.Objects;

public class MonomInt extends Monom{
	int coeficient;
	public MonomInt(){ }
	public MonomInt(int coeficient, int exponent){
		super(exponent);
		this.coeficient=coeficient;
	}
	public int getCoeficient() {
		return coeficient;
	}
	public void setCoeficient(int coeficient) {
		this.coeficient = coeficient;
	}
	public MonomInt adunare(MonomInt x) {
		MonomInt rez=new MonomInt();
		rez.setCoeficient((x.coeficient)+this.coeficient);
		rez.setExponent(x.exponent);
		return rez;
	}
	public MonomInt scadere(MonomInt x) {
		MonomInt rez=new MonomInt();
		rez.setCoeficient(this.coeficient-x.coeficient);
		rez.setExponent(x.exponent);
		return rez;
	}
	
	public MonomInt inmultire(MonomInt x) {
		MonomInt rez=new MonomInt();
		rez.setCoeficient(x.coeficient*this.coeficient);
		rez.setExponent(x.exponent+this.exponent);
		return rez;
	}
	
	public MonomInt derivare() {
		MonomInt rez=new MonomInt();
		rez.setCoeficient(this.coeficient*this.exponent);
		rez.setExponent(this.exponent-1);

		return rez;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MonomInt monomInt = (MonomInt) o;
		return coeficient == monomInt.coeficient;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coeficient);
	}

	public String toString() {
		if(this.coeficient<0)
			return this.coeficient+"X^"+this.exponent;
		else
			return "+"+this.coeficient+"X^"+this.exponent;
	}
}
