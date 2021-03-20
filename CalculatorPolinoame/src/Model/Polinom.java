package Model;

import java.util.ArrayList;
import java.util.Objects;

public class Polinom {
    public ArrayList<Monom> polinom = new ArrayList<Monom>();

    public Polinom() {
    }

    ////ADUNARE
    public Polinom adunare(Polinom p) {
        Polinom rez = new Polinom();
        MonomInt x = new MonomInt();
        MonomInt y;
        int n = this.polinom.size(), m = p.polinom.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            x = (MonomInt) this.polinom.get(i);
            y = (MonomInt) p.polinom.get(j);
            if (x.exponent > y.exponent) {
                rez.polinom.add(x);
                i++;
            } else if (x.exponent < y.exponent) {
                rez.polinom.add(y);
                j++;
            } else {
                if (x.adunare(y).coeficient != 0)
                    rez.polinom.add(x.adunare(y));
                i++;
                j++;
            }
        }
        if (i < n) {
            while (i < n) {
                rez.polinom.add(this.polinom.get(i));
                i++;
            }
        } else {
            while (j < m) {
                rez.polinom.add(p.polinom.get(j));
                j++;
            }
        }
        return rez;
    }

    //// SCADERE
    public Polinom scadere(Polinom p) {
        Polinom rez = new Polinom();
        MonomInt x = new MonomInt();
        MonomInt y = new MonomInt();
        MonomInt aux = new MonomInt();
        int n = this.polinom.size(), m = p.polinom.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            x = (MonomInt) this.polinom.get(i);
            y = (MonomInt) p.polinom.get(j);
            if (x.exponent > y.exponent) {
                rez.polinom.add(x);
                i++;
            } else if (x.exponent < y.exponent) {
                rez.polinom.add(new MonomInt(-y.getCoeficient(), y.exponent));
                j++;
            } else {
                if (x.scadere(y).coeficient != 0)
                    rez.polinom.add(x.scadere(y));
                i++;
                j++;
            }
        }
        while (i < n) {
            rez.polinom.add(this.polinom.get(i));
            i++;
        }
        while (j < m) {
            rez.polinom
                    .add(new MonomInt((-1) * ((MonomInt) p.polinom.get(j)).getCoeficient(), p.polinom.get(j).exponent));
            j++;
        }
        return rez;
    }

    /////// PRODUS
    public Polinom produs(Polinom p) {
        Polinom x = new Polinom();
        Polinom y;
        MonomInt aux = new MonomInt();
        for (Monom i : this.polinom) {
            y = new Polinom();
            for (Monom j : p.polinom) {
                aux = ((MonomInt) i).inmultire((MonomInt) j);
                y.polinom.add(aux);
            }
            x = x.adunare(y);
        }
        return x;
    }// 3x^4+2x^1 ///2x^2+1x^0

    //// ADUNARE Double
    public Polinom adunareD(Polinom p) {
        Polinom rez = new Polinom();
        MonomDouble aux = new MonomDouble(0, 0);
        MonomDouble x = new MonomDouble();
        MonomDouble y = new MonomDouble();
        int n = this.polinom.size(), m = p.polinom.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            x = (MonomDouble) this.polinom.get(i);
            y = (MonomDouble) p.polinom.get(j);
            if (x.exponent > y.exponent) {
                rez.polinom.add(x);
                i++;
            } else if (x.exponent < y.exponent) {
                rez.polinom.add(y);
                j++;
            } else {
                if (x.adunare(y).coeficient != 0)
                    rez.polinom.add(x.adunare(y));
                i++;
                j++;
            }
        }
        if (i < n) {
            while (i < n) {
                rez.polinom.add(this.polinom.get(i));
                i++;
            }
        } else {
            while (j < m) {
                rez.polinom.add(p.polinom.get(j));
                j++;
            }
        }
        return rez;
    }

    //// SCADERE DOUBLE
    public Polinom scadereD(Polinom p) {
        Polinom rez = new Polinom();
        MonomDouble x = new MonomDouble();
        MonomDouble y = new MonomDouble();
        MonomDouble aux = new MonomDouble();
        int n = this.polinom.size(), m = p.polinom.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            x = (MonomDouble) this.polinom.get(i);
            y = (MonomDouble) p.polinom.get(j);
            if (x.exponent > y.exponent) {
                rez.polinom.add(x);
                i++;
            } else if (x.exponent < y.exponent) {
                rez.polinom.add(new MonomDouble(-y.getCoeficient(), y.exponent));
                j++;
            } else {
                if (x.scadere(y).coeficient != 0)
                    rez.polinom.add(x.scadere(y));
                i++;
                j++;
            }
        }
        while (i < n) {
            rez.polinom.add(this.polinom.get(i));
            i++;
        }
        while (j < m) {
            rez.polinom.add(new MonomDouble((-1) * ((MonomDouble) p.polinom.get(j)).getCoeficient(),
                    p.polinom.get(j).exponent));
            j++;
        }
        return rez;
    }

    /////// PRODUS DOUBLE
    public Polinom produsD(Polinom p) {
        Polinom x = new Polinom();
        Polinom y;
        MonomDouble aux = new MonomDouble();
        for (Monom i : this.polinom) {
            y = new Polinom();
            for (Monom j : p.polinom) {
                aux = ((MonomDouble) i).inmultire((MonomDouble) j);
                y.polinom.add(aux);
            }
            x = x.adunareD(y);
        }
        return x;
    }// 3x^4+2x^1 ///2x^2+1x^0

    ///// IMPARTIRE
    public Impartire imparte(Polinom p) {
        Impartire rez = new Impartire();
        rez.rest = this;

        int i = 0, n = this.polinom.size();

        while (i < n && rez.rest.polinom.size() != 0) {
            if (!(rez.rest.polinom.get(0).exponent >= p.polinom.get(0).exponent))
                break;
            MonomDouble y = ((MonomDouble) rez.rest.polinom.get(0)).impartire((MonomDouble) p.polinom.get(0));

            rez.cat.polinom.add(y);

            Polinom pm = new Polinom();
            pm.polinom.add(y);
            Polinom x = new Polinom();
            x = p.produsD(pm);

            rez.rest = rez.rest.scadereD(x);
            i++;
        } // 4x^2+3x^1+2x^0

        return rez;
    }

    /////// Derivare
    public Polinom derivare() {
        Polinom rez = new Polinom();
        for (Monom m : this.polinom) {
            MonomInt mon = new MonomInt();
            mon = ((MonomInt) m).derivare();
            if (mon.coeficient != 0)
                rez.polinom.add(mon);
        }
        return rez;
    }

    //////////INTEGRARE
    public Polinom integrare() {
        Polinom rez = new Polinom();
        for (Monom m : this.polinom) {
            MonomDouble mon = new MonomDouble();
            mon = ((MonomDouble) m).integrare();
            rez.polinom.add(mon);
        }
        return rez;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polinom polinom1 = (Polinom) o;
        return Objects.equals(polinom, polinom1.polinom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polinom);
    }

    public String toString() {
        String strPol = "";
        for (Monom p : this.polinom)
            strPol += p.toString();
        if (strPol.length() == 0)
            strPol = "0";
        if (strPol.charAt(0) == '+')
            strPol = strPol.substring(1);
        return strPol;
    }

}
