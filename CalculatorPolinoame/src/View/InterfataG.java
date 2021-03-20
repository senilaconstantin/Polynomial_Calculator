package View;

import Controller.Control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class InterfataG {

    private JFrame frame;
    JLabel lblCalc = new JLabel("Calculator Polinoame");
    JLabel lblP1 = new JLabel("Polinom 1:");
    JLabel lblP2 = new JLabel("Polinom 2:");
    JLabel lblRez = new JLabel("Rezultat:");
    JLabel lblIndicatie = new JLabel("Polinomul se da de forma: ax^n+bx^(n-1)+.......+cx^1+dx^0");

    public JTextField txtP1 = new JTextField();
    public final JTextField txtP2 = new JTextField();
    public final JTextField txtRezultat = new JTextField();

    private JButton btnAdun = new JButton("+");
    private JButton btnScad = new JButton("-");
    private JButton btnProdus = new JButton("*");
    private JButton btnDiv = new JButton("/");
    private JButton btnDeriveazaP = new JButton("Deriveaza P1");
    private JButton btnIntegreazaP = new JButton("Integreaza P1");

    public InterfataG() {
        frame = new JFrame("Calculator Polinoame");
        frame.setVisible(true);
        frame.setBounds(100, 100, 1199, 468);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        butoane();
        initialize();
        initializeTxt();
        adg();
//		event();

    }

    private void butoane() {
        getBtnAdun().setForeground(Color.BLACK);
        getBtnAdun().setFont(new Font("Times New Roman", Font.BOLD, 18));
        getBtnAdun().setBounds(476, 202, 49, 32);

        getBtnScad().setForeground(Color.BLACK);
        getBtnScad().setFont(new Font("Times New Roman", Font.BOLD, 18));
        getBtnScad().setBounds(535, 202, 49, 32);

        getBtnProdus().setForeground(Color.BLACK);
        getBtnProdus().setFont(new Font("Times New Roman", Font.BOLD, 18));
        getBtnProdus().setBounds(594, 202, 49, 32);

        getBtnDiv().setForeground(Color.BLACK);
        getBtnDiv().setFont(new Font("Times New Roman", Font.BOLD, 18));
        getBtnDiv().setBounds(652, 202, 49, 32);

        getBtnDeriveazaP().setForeground(Color.BLACK);
        getBtnDeriveazaP().setFont(new Font("Times New Roman", Font.BOLD, 18));
        getBtnDeriveazaP().setBounds(503, 244, 172, 32);

        getBtnIntegreazaP().setForeground(Color.BLACK);
        getBtnIntegreazaP().setFont(new Font("Times New Roman", Font.BOLD, 18));
        getBtnIntegreazaP().setBounds(503, 286, 172, 32);
    }

    private void initialize() {
        lblCalc.setForeground(Color.BLACK);
        lblCalc.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        lblCalc.setHorizontalAlignment(SwingConstants.CENTER);
        lblCalc.setBounds(10, 10, 1165, 32);

        lblP1.setForeground(Color.BLACK);
        lblP1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblP1.setBounds(10, 75, 77, 32);

        lblP2.setForeground(Color.BLACK);
        lblP2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblP2.setBounds(10, 150, 77, 32);

        lblRez.setHorizontalAlignment(SwingConstants.CENTER);
        lblRez.setForeground(Color.BLACK);
        lblRez.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblRez.setBounds(10, 341, 1165, 24);

        lblIndicatie.setFont(new Font("Times New Roman", Font.ITALIC, 13));
        lblIndicatie.setForeground(Color.BLACK);
        lblIndicatie.setVerticalAlignment(SwingConstants.TOP);
        lblIndicatie.setBounds(10, 49, 515, 16);
    }

    private void initializeTxt() {
        try {
            txtP1.setForeground(Color.BLACK);
            txtP1.setFont(new Font("Times New Roman", Font.BOLD, 15));
            txtP1.setBounds(89, 75, 1086, 32);
            txtP1.setColumns(10);

            txtP2.setForeground(Color.BLACK);
            txtP2.setFont(new Font("Times New Roman", Font.BOLD, 15));
            txtP2.setColumns(10);
            txtP2.setBounds(89, 150, 1086, 32);
            txtRezultat.setBackground(Color.WHITE);
            txtRezultat.setEditable(false);

            txtRezultat.setForeground(Color.BLACK);
            txtRezultat.setFont(new Font("Times New Roman", Font.BOLD, 15));
            txtRezultat.setColumns(10);
            txtRezultat.setBounds(10, 362, 1165, 32);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void adg() {
        frame.getContentPane().add(lblCalc);
        frame.getContentPane().add(lblP1);
        frame.getContentPane().add(lblP2);
        frame.getContentPane().add(lblRez);
        frame.getContentPane().add(txtP1);
        frame.getContentPane().add(txtP2);
        frame.getContentPane().add(txtRezultat);
        frame.getContentPane().add(getBtnAdun());
        frame.getContentPane().add(getBtnScad());
        frame.getContentPane().add(getBtnProdus());
        frame.getContentPane().add(getBtnDiv());
        frame.getContentPane().add(lblIndicatie);
        frame.getContentPane().add(getBtnDeriveazaP());
        frame.getContentPane().add(getBtnIntegreazaP());
    }

    public JButton getBtnAdun() {
        return btnAdun;
    }

    public void setBtnAdun(JButton btnAdun) {
        this.btnAdun = btnAdun;
    }

    public JButton getBtnScad() {
        return btnScad;
    }

    public void setBtnScad(JButton btnScad) {
        this.btnScad = btnScad;
    }

    public JButton getBtnProdus() {
        return btnProdus;
    }

    public void setBtnProdus(JButton btnProdus) {
        this.btnProdus = btnProdus;
    }

    public JButton getBtnDiv() {
        return btnDiv;
    }

    public void setBtnDiv(JButton btnDiv) {
        this.btnDiv = btnDiv;
    }

    public JButton getBtnDeriveazaP() {
        return btnDeriveazaP;
    }

    public void setBtnDeriveazaP(JButton btnDeriveazaP) {
        this.btnDeriveazaP = btnDeriveazaP;
    }

    public JButton getBtnIntegreazaP() {
        return btnIntegreazaP;
    }

    public void setBtnIntegreazaP(JButton btnIntegreazaP) {
        this.btnIntegreazaP = btnIntegreazaP;
    }

//	private void event() {
//		btnAdun.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				adunare();
//			}
//		});
//		btnScad.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				scadere();
//			}
//		});
//		btnProdus.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				prod();
//			}
//		});
//		btnDiv.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				imparte();
//			}
//		});
//		btnDeriveazaP.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				deriv();
//			}
//		});
//		btnIntegreazaP.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				integr();
//			}
//		});
//	}
//
//	private void adunare() {
//		RegEx re = new RegEx();
//		Polinom x = new Polinom();
//		x = re.transInt(txtP1.getText());
//		Polinom y = new Polinom();
//		y = re.transInt(txtP2.getText());
//		txtRezultat.setText(x.adunare(y).toString());
//
//	}
//
//	private void scadere() {
//		RegEx re = new RegEx();
//		Polinom x = new Polinom();
//		x = re.transInt(txtP1.getText());
//		Polinom y = new Polinom();
//		y = re.transInt(txtP2.getText());
//		txtRezultat.setText(x.scadere(y).toString());
//	}
//
//	private void prod() {
//		RegEx re = new RegEx();
//		Polinom x = new Polinom();
//		x = re.transInt(txtP1.getText());
//		Polinom y = new Polinom();
//		y = re.transInt(txtP2.getText());
//		txtRezultat.setText(x.produs(y).toString());
//	}
//
//	private void imparte() {
//		RegEx re = new RegEx();
//		Polinom x = new Polinom();
//		x = re.transDouble(txtP1.getText());
//		Polinom y = new Polinom();
//		y = re.transDouble(txtP2.getText());
//		txtRezultat.setText(x.imparte(y).cat.toString() + "  Rest: " + x.imparte(y).rest.toString());
//
//	}
//
//	private void deriv() {
//		RegEx re = new RegEx();
//		Polinom x = new Polinom();
//		x = re.transInt(txtP1.getText());
//		txtRezultat.setText(x.derivare().toString());
//	}
//
//	private void integr() {
//		RegEx re = new RegEx();
//		Polinom x = new Polinom();
//		x = re.transDouble(txtP1.getText());
//		txtRezultat.setText(x.integrare().toString()+"+C");
//	}

}
