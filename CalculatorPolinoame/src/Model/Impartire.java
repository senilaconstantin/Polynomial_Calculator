package Model;

import java.util.Objects;

public class Impartire {
    Polinom cat;
    Polinom rest;

    public Impartire() {
        this.cat = new Polinom();
        this.rest = new Polinom();
    }

    public Impartire(Polinom c, Polinom r) {
        this.cat = c;
        this.rest = r;
    }

    public Polinom getCat() {
        return cat;
    }

    public void setCat(Polinom cat) {
        this.cat = cat;
    }

    public Polinom getRest() {
        return rest;
    }

    public void setRest(Polinom rest) {
        this.rest = rest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Impartire impartire = (Impartire) o;
        return (Objects.equals(cat, impartire.cat) && Objects.equals(rest, impartire.rest));
    }

    @Override
    public String toString() {
       String s=new String();
       s=s+this.cat.toString()+"  Rest:"+this.rest.toString();
       return s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cat, rest);
    }
}
