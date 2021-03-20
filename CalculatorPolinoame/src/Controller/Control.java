package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Polinom;
import Model.RegEx;
import View.InterfataG;

public class Control {
	private InterfataG vizu;
	private Polinom p1;
	private Polinom p2;
	Control(){	}
	
	public Control(InterfataG i,Polinom p1, Polinom p2){
		this.vizu=i;
		this.p1=p1;
		this.p2=p2;
		event();
	}
	
	private void event() {
		this.vizu.getBtnAdun().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adunare();
			}
		});
		this.vizu.getBtnScad().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scadere();
			}
		});
		this.vizu.getBtnProdus().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prod();
			}
		});
		this.vizu.getBtnDiv().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imparte();
			}
		});
		this.vizu.getBtnDeriveazaP().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deriv();
			}
		});
		this.vizu.getBtnIntegreazaP().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				integr();
			}
		});
	}

	private void adunare() {
		RegEx re = new RegEx();
		this.p1 = re.transInt(this.vizu.txtP1.getText());
		this.p2 = re.transInt(this.vizu.txtP2.getText());
		this.vizu.txtRezultat.setText(p1.adunare(p2).toString());

	}

	private void scadere() {
		RegEx re = new RegEx();
		this.p1 = re.transInt(this.vizu.txtP1.getText());
		this.p2 = re.transInt(this.vizu.txtP2.getText());
		this.vizu.txtRezultat.setText(p1.scadere(p2).toString());
	}

	private void prod() {
		RegEx re = new RegEx();
		this.p1 = re.transInt(this.vizu.txtP1.getText());
		this.p2 = re.transInt(this.vizu.txtP2.getText());
		this.vizu.txtRezultat.setText(p1.produs(p2).toString());
	}

	private void imparte() {
		RegEx re = new RegEx();
		this.p1 = re.transDouble(this.vizu.txtP1.getText());
		this.p2 = re.transDouble(this.vizu.txtP2.getText());
		this.vizu.txtRezultat.setText(p1.imparte(p2).getCat().toString() + "  Rest: " + p1.imparte(p2).getRest().toString());

	}

	private void deriv() {
		RegEx re = new RegEx();
		this.p1 = re.transInt(this.vizu.txtP1.getText());
		this.vizu.txtRezultat.setText(p1.derivare().toString());
	}

	private void integr() {
		RegEx re = new RegEx();
		this.p1 = re.transDouble(this.vizu.txtP1.getText());
		this.vizu.txtRezultat.setText(p1.integrare().toString()+"+C");
	}

}
