package one;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import adatb.AdatbGUI;
import adatb.db_lista;
import Earlier.JSon;

import javax.swing.JButton;
import java.awt.Label;
import java.awt.TextField;
import one.index;
import java.io.IOException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;

import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class GUI extends JFrame {
/**
	 * 
	 */
	private String[] keresett = new String[12];
	private static String[][] db = new String [9][1000];
	static String keszfile;
	private static final long serialVersionUID = 1L;
	private static String[] s = new String[150];
	
	
	private static TextField nev = new TextField();
	private static TextField cim = new TextField();
	private static TextField vevokod = new TextField();
	private static TextField Telefon = new TextField();
	private static TextField Rendszam = new TextField();
	private static TextField Tipus = new TextField();
	private static TextField evjarat = new TextField();
	private static TextField Motorszam = new TextField();
	private static TextField hengeru = new TextField();
	private static TextField alvaz = new TextField();
	public static int nyitva = 0;
	protected JPanel contentPane;
	private Label label_20;
	private int eKesz;
	String indes=index.getI();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setResizable(false);
		eKesz = 0;
		setTitle("DA 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 1, 675, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i3=19; i3<36; i3++)
			s[i3]="0";
		
		
		Label label_1 = new Label("Arx Patakiensis Munkalap");
		label_1.setBounds(209, 0, 158, 22);
		label_1.setAlignment(Label.CENTER);
		contentPane.add(label_1);
		nev.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				keresett = adatb.Db_keres.db_read(nev.getText());
				if(keresett[0] != null) {
					nev.setText(keresett[1]);
					cim.setText(keresett[2]);
					Telefon.setText(keresett[3]);
					vevokod.setText(keresett[4]);
					Rendszam.setText(keresett[5]);
					Tipus.setText(keresett[6]);
					Motorszam.setText(keresett[8]);
					hengeru.setText(keresett[10]);
					alvaz.setText(keresett[9]);
					evjarat.setText(keresett[7]);
				}
			}
		});
		
	  
		nev.setBounds(60, 49, 148, 22);
		contentPane.add(nev);
		

		cim.setBounds(60, 77, 148, 22);
		contentPane.add(cim);
		
		Label label_2 = new Label("N\u00E9v:");
		label_2.setBounds(25, 49, 29, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("C\u00EDm:");
		label_3.setBounds(25, 77, 29, 22);
		contentPane.add(label_3);
		
		Label label_5 = new Label("\u00DCgyf\u00E9l adatai");
		label_5.setBounds(25, 27, 77, 22);
		contentPane.add(label_5);
		
		Label label_6 = new Label("No.");
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(25, 382, 30, 22);
		contentPane.add(label_6);
		
		Label label_7 = new Label("Megrendel\u00E9s");
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(60, 382, 76, 22);
		contentPane.add(label_7);
		
		evjarat.setBounds(128, 160, 75, 22);
		contentPane.add(evjarat);
		
		Tipus.setBounds(128, 132, 75, 22);
		contentPane.add(Tipus);
		
		
		Rendszam.setBounds(128, 105, 75, 22);
		contentPane.add(Rendszam);
		
		JLabel sorszam = new JLabel("sorsz\u00E1m:  "+index.getI());
		sorszam.setBounds(505, 35, 102, 14);
		contentPane.add(sorszam);
		
		Label label = new Label("Rendsz\u00E1m");
		label.setBounds(25, 105, 65, 22);
		contentPane.add(label);
		
		Label label_10 = new Label("J\u00E1rm\u0171 T\u00EDpus");
		label_10.setBounds(25, 132, 77, 22);
		contentPane.add(label_10);
		
		Label label_11 = new Label("\u00C9vj\u00E1rat");
		label_11.setBounds(25, 160, 67, 22);
		contentPane.add(label_11);
		
		TextField n0_1 = new TextField();
		n0_1.setText("02");
		n0_1.setEditable(false);
		n0_1.setBounds(25, 436, 36, 22);
		contentPane.add(n0_1);
		
		Label label_12 = new Label("Hiba");
		label_12.setAlignment(Label.CENTER);
		label_12.setBounds(316, 382, 42, 22);
		contentPane.add(label_12);
		
		
		Choice fizmod = new Choice();
		fizmod.setBounds(316, 246, 88, 20);
		fizmod.add("Készpénz");
		fizmod.add("Átutalás");
		
		contentPane.add(fizmod);
		//JMenu menu1 = new JMenu("menu");
		//menu1.setBounds(219, 244, 79, 22);
		
		//contentPane.add(menu1);
		
		
		
		
		Label label_4 = new Label("Motorsz\u00E1m");
		label_4.setBounds(25, 188, 67, 22);
		contentPane.add(label_4);
		
		Label label_14 = new Label("Henger\u0171rtartalom");
		label_14.setBounds(25, 242, 97, 22);
		contentPane.add(label_14);
		
		Label label_15 = new Label("Km \u00F3ra \u00E1ll\u00E1sa");
		label_15.setBounds(25, 270, 97, 22);
		contentPane.add(label_15);
		
		Label label_16 = new Label("Motorolaj");
		label_16.setBounds(25, 298, 97, 22);
		contentPane.add(label_16);
		
		
		Motorszam.setBounds(128, 188, 75, 22);
		contentPane.add(Motorszam);
		
		hengeru.setBounds(128, 242, 75, 22);
		contentPane.add(hengeru);
		
		TextField kmO = new TextField();
		kmO.setBounds(128, 270, 75, 22);
		contentPane.add(kmO);
		
		TextField Molaj = new TextField();
		Molaj.setBounds(128, 298, 75, 22);
		contentPane.add(Molaj);
		
		Label label_17 = new Label("Hajt\u00F3m\u0171olaj");
		label_17.setBounds(25, 326, 97, 22);
		contentPane.add(label_17);
		
		TextField hajtmuolaj = new TextField();
		hajtmuolaj.setBounds(128, 326, 75, 22);
		contentPane.add(hajtmuolaj);
		
		Label label_18 = new Label("Sz\u0171r\u0151");
		label_18.setBounds(25, 354, 97, 22);
		contentPane.add(label_18);
		
		TextField szuro = new TextField();
		szuro.setBounds(128, 354, 75, 22);
		contentPane.add(szuro);
		
		Label label_19 = new Label("Megrendel\u00E9s D\u00E1tuma");
		label_19.setBounds(209, 105, 115, 22);
		contentPane.add(label_19);
		
		TextField meg_date = new TextField();
		meg_date.setBounds(329, 105, 75, 22);
		contentPane.add(meg_date);
		
		label_20 = new Label("Kezd\u00E9s D\u00E1tuma");
		label_20.setBounds(209, 132, 115, 22);
		contentPane.add(label_20);
		
		Label label_21 = new Label("Elk\u00E9sz. V\u00E1rhat\u00F3 D\u00E1tuma");
		label_21.setBounds(209, 160, 116, 22);
		contentPane.add(label_21);
		
		TextField kezd_date = new TextField();
		kezd_date.setBounds(329, 132, 75, 22);
		contentPane.add(kezd_date);
		
		TextField elkesz_v_date = new TextField();
		elkesz_v_date.setBounds(329, 160, 75, 22);
		contentPane.add(elkesz_v_date);
		
		Label label_23 = new Label("Forg. enged\u00E9ly");
		label_23.setBounds(410, 105, 77, 12);
		contentPane.add(label_23);
		
		Label label_24 = new Label("Csekkf\u00FCzet");
		label_24.setBounds(410, 120, 61, 12);
		contentPane.add(label_24);
		
		Label label_25 = new Label("R\u00E1di\u00F3+Antenna");
		label_25.setBounds(410, 135, 78, 12);
		contentPane.add(label_25);
		
		Label label_26 = new Label("P\u00F3tker\u00E9k");
		label_26.setBounds(410, 150, 58, 12);
		contentPane.add(label_26);
		
		Label label_27 = new Label("Szersz\u00E1m");
		label_27.setBounds(410, 165, 77, 12);
		contentPane.add(label_27);
		
		Label label_28 = new Label("Emel\u0151");
		label_28.setBounds(410, 180, 78, 14);
		contentPane.add(label_28);
		
		Label label_29 = new Label("K\u00E9zi l\u00E9gpumpa");
		label_29.setBounds(410, 195, 75, 14);
		contentPane.add(label_29);
		
		Label label_30 = new Label("Biztos\u00EDt\u00E9kok");
		label_30.setBounds(410, 300, 77, 14);
		contentPane.add(label_30);
		
		Label label_31 = new Label("D\u00EDszt\u00E1rcsa");
		label_31.setBounds(410, 210, 77, 14);
		contentPane.add(label_31);
		
		Label label_32 = new Label("T\u00FCk\u00F6r");
		label_32.setBounds(410, 225, 78, 14);
		contentPane.add(label_32);
		
		Label label_33 = new Label("Biztons\u00E1gi \u00F6v");
		label_33.setBounds(410, 240, 78, 14);
		contentPane.add(label_33);
		
		Label label_34 = new Label("Elakad\u00E1sjelz\u0151");
		label_34.setBounds(410, 255, 77, 14);
		contentPane.add(label_34);
		
		Label label_35 = new Label("E\u00FC. doboz");
		label_35.setBounds(410, 270, 65, 14);
		contentPane.add(label_35);
		
		Label label_36 = new Label("Izz\u00F3k\u00E9szlet");
		label_36.setBounds(410, 285, 75, 14);
		contentPane.add(label_36);
		
		JCheckBox forg_eng = new JCheckBox("");
		forg_eng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[22]=="1")
					s[22]="0";
				else
					s[22]="1";
			}
		});
		forg_eng.setFont(new Font("Tahoma", Font.PLAIN, 9));
		forg_eng.setBounds(505, 105, 29, 14);
		contentPane.add(forg_eng);
		
		JCheckBox csekkfuz = new JCheckBox("");
		csekkfuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[23]=="1")
					s[23]="0";
				else
					s[23]="1";
			}
		});
		csekkfuz.setFont(new Font("Tahoma", Font.PLAIN, 9));
		csekkfuz.setBounds(505, 120, 29, 14);
		contentPane.add(csekkfuz);
		
		JCheckBox radio = new JCheckBox("");
		radio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[24]=="1")
					s[24]="0";
				else
					s[24]="1";
			}
		});
		radio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		radio.setBounds(505, 135, 29, 14);
		contentPane.add(radio);
		
		JCheckBox potkerek = new JCheckBox("");
		potkerek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[25]=="1")
					s[25]="0";
				else
					s[25]="1";
			}
		});
		potkerek.setFont(new Font("Tahoma", Font.PLAIN, 9));
		potkerek.setBounds(505, 150, 29, 14);
		contentPane.add(potkerek);
		
		JCheckBox szerszam = new JCheckBox("");
		szerszam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[26]=="1")
					s[26]="0";
				else
					s[26]="1";
			}
		});
		szerszam.setFont(new Font("Tahoma", Font.PLAIN, 9));
		szerszam.setBounds(505, 165, 29, 14);
		contentPane.add(szerszam);
		
		JCheckBox emelo = new JCheckBox("");
		emelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[27]=="1")
					s[27]="0";
				else
					s[27]="1";
			}
		});
		emelo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		emelo.setBounds(505, 180, 29, 14);
		contentPane.add(emelo);
		
		JCheckBox pumpa = new JCheckBox("");
		pumpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[28]=="1")
					s[28]="0";
				else
					s[28]="1";
			}
		});
		pumpa.setFont(new Font("Tahoma", Font.PLAIN, 9));
		pumpa.setBounds(505, 195, 29, 14);
		contentPane.add(pumpa);
		
		JCheckBox disztarcsa = new JCheckBox("");
		disztarcsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[29]=="1")
					s[29]="0";
				else
					s[29]="1";
			}
		});
		disztarcsa.setFont(new Font("Tahoma", Font.PLAIN, 9));
		disztarcsa.setBounds(505, 210, 29, 14);
		contentPane.add(disztarcsa);
		
		JCheckBox tukor = new JCheckBox("");
		tukor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[30]=="1")
					s[30]="0";
				else
					s[30]="1";
			}
		});
		tukor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		tukor.setBounds(505, 225, 29, 14);
		contentPane.add(tukor);
		
		JCheckBox ov = new JCheckBox("");
		ov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[31]=="1")
					s[31]="0";
				else
					s[31]="1";
			}
		});
		ov.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ov.setBounds(505, 240, 29, 14);
		contentPane.add(ov);
		
		JCheckBox elakadasjelzo = new JCheckBox("");
		elakadasjelzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[32]=="1")
					s[32]="0";
				else
					s[32]="1";
			}
		});
		elakadasjelzo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		elakadasjelzo.setBounds(505, 255, 29, 14);
		contentPane.add(elakadasjelzo);
		
		JCheckBox eudoboz = new JCheckBox("");
		eudoboz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[33]=="1")
					s[33]="0";
				else
					s[33]="1";
			}
		});
		eudoboz.setFont(new Font("Tahoma", Font.PLAIN, 9));
		eudoboz.setBounds(505, 270, 29, 14);
		contentPane.add(eudoboz);
		
		JCheckBox izzokeszlet = new JCheckBox("");
		izzokeszlet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[34]=="1")
					s[34]="0";
				else
					s[34]="1";
			}
		});
		izzokeszlet.setFont(new Font("Tahoma", Font.PLAIN, 9));
		izzokeszlet.setBounds(505, 285, 29, 14);
		contentPane.add(izzokeszlet);
		
		JCheckBox biztositek = new JCheckBox("");
		biztositek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[35]=="1")
					s[35]="0";
				else
					s[35]="1";
			}
		});
		biztositek.setFont(new Font("Tahoma", Font.PLAIN, 9));
		biztositek.setBounds(505, 300, 29, 14);
		contentPane.add(biztositek);
		
		Label label_8 = new Label("Jav\u00EDtva/Be\u00E9p\u00EDtve");
		label_8.setAlignment(Label.CENTER);
		label_8.setBounds(352, 382, 93, 22);
		contentPane.add(label_8);
		
		Label label_37 = new Label("Rendben");
		label_37.setAlignment(Label.CENTER);
		label_37.setBounds(266, 382, 57, 22);
		contentPane.add(label_37);
		
		JCheckBox rendben_1 = new JCheckBox("");
		rendben_1.setBounds(281, 410, 21, 21);
		contentPane.add(rendben_1);
		
		JCheckBox hiba_1 = new JCheckBox("");
		hiba_1.setBounds(328, 410, 21, 21);
		contentPane.add(hiba_1);
		
		JCheckBox jav_1 = new JCheckBox("");
		jav_1.setBounds(376, 410, 21, 21);
		contentPane.add(jav_1);
		
		Label label_9 = new Label("Megjegyz\u00E9s, \u00E9szrev\u00E9tel");
		label_9.setAlignment(Label.CENTER);
		label_9.setBounds(457, 382, 129, 22);
		contentPane.add(label_9);
		
		TextField megj_1 = new TextField();
		megj_1.setBounds(433, 410, 205, 22);
		contentPane.add(megj_1);
		
		TextField textField_2 = new TextField();
		textField_2.setText("01");
		textField_2.setEditable(false);
		textField_2.setBounds(25, 410, 36, 22);
		contentPane.add(textField_2);
		
		TextField textField_4 = new TextField();
		textField_4.setText("03");
		textField_4.setEditable(false);
		textField_4.setBounds(25, 464, 36, 22);
		contentPane.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setText("04");
		textField_5.setEditable(false);
		textField_5.setBounds(25, 492, 36, 22);
		contentPane.add(textField_5);
		
		TextField textField_6 = new TextField();
		textField_6.setText("05");
		textField_6.setEditable(false);
		textField_6.setBounds(25, 520, 36, 22);
		contentPane.add(textField_6);
		
		TextField textField_7 = new TextField();
		textField_7.setText("06");
		textField_7.setEditable(false);
		textField_7.setBounds(25, 548, 36, 22);
		contentPane.add(textField_7);
		
		TextField textField_8 = new TextField();
		textField_8.setText("07");
		textField_8.setEditable(false);
		textField_8.setBounds(25, 576, 36, 22);
		contentPane.add(textField_8);
		
		TextField textField_9 = new TextField();
		textField_9.setText("08");
		textField_9.setEditable(false);
		textField_9.setBounds(25, 604, 36, 22);
		contentPane.add(textField_9);
		
		TextField textField_10 = new TextField();
		textField_10.setText("09");
		textField_10.setEditable(false);
		textField_10.setBounds(25, 632, 36, 22);
		contentPane.add(textField_10);
		
		TextField textField_11 = new TextField();
		textField_11.setText("10");
		textField_11.setEditable(false);
		textField_11.setBounds(25, 659, 36, 22);
		contentPane.add(textField_11);
		
		TextField meg2 = new TextField();
		meg2.setBounds(60, 436, 205, 22);
		contentPane.add(meg2);
		
		TextField meg3 = new TextField();
		meg3.setBounds(60, 464, 205, 22);
		contentPane.add(meg3);
		
		TextField meg4 = new TextField();
		meg4.setBounds(60, 492, 205, 22);
		contentPane.add(meg4);
		
		TextField meg5 = new TextField();
		meg5.setBounds(60, 520, 205, 22);
		contentPane.add(meg5);
		
		TextField meg6 = new TextField();
		meg6.setBounds(60, 548, 205, 22);
		contentPane.add(meg6);
		
		TextField meg7 = new TextField();
		meg7.setBounds(60, 576, 205, 22);
		contentPane.add(meg7);
		
		TextField meg8 = new TextField();
		meg8.setBounds(60, 604, 205, 22);
		contentPane.add(meg8);
		
		TextField meg9 = new TextField();
		meg9.setBounds(60, 632, 205, 22);
		contentPane.add(meg9);
		
		TextField meg10 = new TextField();
		meg10.setBounds(60, 659, 205, 22);
		contentPane.add(meg10);
		
		TextField meg1 = new TextField();
		meg1.setBounds(60, 410, 205, 22);
		contentPane.add(meg1);
		
		TextField megj_2 = new TextField();
		megj_2.setBounds(433, 436, 205, 22);
		contentPane.add(megj_2);
		
		TextField megj_3 = new TextField();
		megj_3.setBounds(433, 464, 205, 22);
		contentPane.add(megj_3);
		
		TextField megj_4 = new TextField();
		megj_4.setBounds(433, 492, 205, 22);
		contentPane.add(megj_4);
		
		TextField megj_5 = new TextField();
		megj_5.setBounds(433, 520, 205, 22);
		contentPane.add(megj_5);
		
		TextField megj_6 = new TextField();
		megj_6.setBounds(433, 548, 205, 22);
		contentPane.add(megj_6);
		
		TextField megj_7 = new TextField();
		megj_7.setBounds(433, 576, 205, 22);
		contentPane.add(megj_7);
		
		TextField megj_8 = new TextField();
		megj_8.setBounds(433, 604, 205, 22);
		contentPane.add(megj_8);
		
		TextField megj_9 = new TextField();
		megj_9.setBounds(433, 632, 205, 22);
		contentPane.add(megj_9);
		
		TextField megj_10 = new TextField();
		megj_10.setBounds(433, 659, 205, 22);
		contentPane.add(megj_10);
		
		JCheckBox rendben_2 = new JCheckBox("");
		rendben_2.setBounds(281, 436, 21, 21);
		contentPane.add(rendben_2);
		
		JCheckBox hiba_2 = new JCheckBox("");
		hiba_2.setBounds(328, 436, 21, 21);
		contentPane.add(hiba_2);
		
		JCheckBox jav_2 = new JCheckBox("");
		jav_2.setBounds(376, 436, 21, 21);
		contentPane.add(jav_2);
		
		JCheckBox rendben_3 = new JCheckBox("");
		rendben_3.setBounds(281, 464, 21, 21);
		contentPane.add(rendben_3);
		
		JCheckBox hiba_3 = new JCheckBox("");
		hiba_3.setBounds(328, 464, 21, 21);
		contentPane.add(hiba_3);
		
		JCheckBox jav_3 = new JCheckBox("");
		jav_3.setBounds(376, 464, 21, 21);
		contentPane.add(jav_3);
		
		JCheckBox rendben_4 = new JCheckBox("");
		rendben_4.setBounds(281, 492, 21, 21);
		contentPane.add(rendben_4);
		
		JCheckBox hiba_4 = new JCheckBox("");
		hiba_4.setBounds(328, 492, 21, 21);
		contentPane.add(hiba_4);
		
		JCheckBox jav_4 = new JCheckBox("");
		jav_4.setBounds(376, 492, 21, 21);
		contentPane.add(jav_4);
		
		JCheckBox rendben_5 = new JCheckBox("");
		rendben_5.setBounds(281, 520, 21, 21);
		contentPane.add(rendben_5);
		
		JCheckBox hiba_5 = new JCheckBox("");
		hiba_5.setBounds(328, 520, 21, 21);
		contentPane.add(hiba_5);
		
		JCheckBox jav_5 = new JCheckBox("");
		jav_5.setBounds(376, 520, 21, 21);
		contentPane.add(jav_5);
		
		JCheckBox rendben_6 = new JCheckBox("");
		rendben_6.setBounds(281, 548, 21, 21);
		contentPane.add(rendben_6);
		
		JCheckBox hiba_6 = new JCheckBox("");
		hiba_6.setBounds(328, 548, 21, 21);
		contentPane.add(hiba_6);
		
		JCheckBox jav_6 = new JCheckBox("");
		jav_6.setBounds(376, 548, 21, 21);
		contentPane.add(jav_6);
		
		JCheckBox rendben_7 = new JCheckBox("");
		rendben_7.setBounds(281, 577, 21, 21);
		contentPane.add(rendben_7);
		
		JCheckBox hiba_7 = new JCheckBox("");
		hiba_7.setBounds(328, 577, 21, 21);
		contentPane.add(hiba_7);
		
		JCheckBox jav_7 = new JCheckBox("");
		jav_7.setBounds(376, 577, 21, 21);
		contentPane.add(jav_7);
		
		JCheckBox rendben_8 = new JCheckBox("");
		rendben_8.setBounds(281, 605, 21, 21);
		contentPane.add(rendben_8);
		
		JCheckBox hiba_8 = new JCheckBox("");
		hiba_8.setBounds(328, 605, 21, 21);
		contentPane.add(hiba_8);
		
		JCheckBox jav_8 = new JCheckBox("");
		jav_8.setBounds(376, 605, 21, 21);
		contentPane.add(jav_8);
		
		JCheckBox rendben_9 = new JCheckBox("");
		rendben_9.setBounds(281, 632, 21, 21);
		contentPane.add(rendben_9);
		
		JCheckBox hiba_9 = new JCheckBox("");
		hiba_9.setBounds(328, 632, 21, 21);
		contentPane.add(hiba_9);
		
		JCheckBox jav_9 = new JCheckBox("");
		jav_9.setBounds(376, 632, 21, 21);
		contentPane.add(jav_9);
		
		JCheckBox rendben_10 = new JCheckBox("");
		rendben_10.setBounds(281, 659, 21, 21);
		contentPane.add(rendben_10);
		
		JCheckBox hiba_10 = new JCheckBox("");
		hiba_10.setBounds(328, 659, 21, 21);
		contentPane.add(hiba_10);
		
		JCheckBox jav_10 = new JCheckBox("");
		jav_10.setBounds(376, 659, 21, 21);
		contentPane.add(jav_10);
		
		Label label_13 = new Label("Fizet\u00E9si m\u00F3d");
		label_13.setBounds(209, 244, 77, 22);
		contentPane.add(label_13);
		

		Label telefon22 = new Label("Telefon:");
		telefon22.setBounds(212, 49, 53, 22);
		contentPane.add(telefon22);
		
		
		Telefon.setText("+36");
		Telefon.setBounds(266, 49, 148, 22);
		contentPane.add(Telefon);
		
		Label label_38 = new Label("Vev\u0151k\u00F3d:");
		label_38.setBounds(212, 77, 53, 22);
		contentPane.add(label_38);
		
		
		vevokod.setBounds(266, 77, 148, 22);
		contentPane.add(vevokod);		
		
		JCheckBox molajcsere = new JCheckBox("Csere");
		molajcsere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(s[19]=="1")
					s[19]="0";
				else
					s[19]="1";
			}
		});
		molajcsere.setBounds(205, 298, 97, 23);
		contentPane.add(molajcsere);
		
		JCheckBox hocsere = new JCheckBox("Csere");
		hocsere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[20]=="1")
					s[20]="0";
				else
					s[20]="1";
			}
		});
		hocsere.setBounds(205, 326, 97, 23);
		contentPane.add(hocsere);
		
		JCheckBox szurocsere = new JCheckBox("Csere");
		szurocsere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s[21]=="1")
					s[21]="0";
				else
					s[21]="1";
			}
		});
		szurocsere.setBounds(205, 353, 97, 23);
		contentPane.add(szurocsere);
		
		Label label_39 = new Label("V\u00E1rhat\u00F3 jav. k\u00F6lts\u00E9g");
		label_39.setBounds(209, 188, 116, 22);
		contentPane.add(label_39);
		
		Label label_40 = new Label("Elk\u00E9sz. D\u00E1tuma");
		label_40.setBounds(209, 216, 116, 22);
		contentPane.add(label_40);
		
		TextField jav_kolt = new TextField();
		jav_kolt.setBounds(329, 188, 75, 22);
		contentPane.add(jav_kolt);
		
		TextField elkesz_date = new TextField();
		elkesz_date.setBounds(329, 216, 75, 22);
		contentPane.add(elkesz_date);
		Label label_41 = new Label("\u00DCa. menny.");
		label_41.setBounds(410, 315, 77, 14);
		contentPane.add(label_41);
		
		Label label_42 = new Label("H\u0171t\u0151folyad\u00E9k");
		label_42.setBounds(410, 330, 77, 14);
		contentPane.add(label_42);
		
		TextField uamenny = new TextField();
		uamenny.setFont(new Font("Dialog", Font.PLAIN, 7));
		uamenny.setBounds(500, 315, 40, 15);
		contentPane.add(uamenny);
		
		TextField huto = new TextField();
		huto.setFont(new Font("Dialog", Font.PLAIN, 7));
		huto.setBounds(500, 330, 40, 15);
		contentPane.add(huto);
		
		
		alvaz.setBounds(128, 216, 75, 22);
		contentPane.add(alvaz);
		
		
		JButton Kesz = new JButton("Ment\u00E9s");
		Kesz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adatlekérdezési struktúra:
				
				s[0]=nev.getText();
				s[1]=cim.getText();
				s[2]=Telefon.getText();
				s[3]=vevokod.getText();
				s[4]=Rendszam.getText();
				s[5]=Tipus.getText();
				s[6]=evjarat.getText();
				s[7]=Motorszam.getText();
				s[8]=hengeru.getText();
				s[9]=kmO.getText();
				s[10]=Molaj.getText();
				s[11]=hajtmuolaj.getText();
				s[12]=szuro.getText();
				s[13]=meg_date.getText();
				s[14]=kezd_date.getText();
				s[15]=elkesz_v_date.getText();
				s[16]=jav_kolt.getText();
				s[17]=elkesz_date.getText();
				s[18]=fizmod.getSelectedItem();
				s[36]=uamenny.getText();
				s[37]=huto.getText();
				//megr
				s[38]=meg1.getText();
				s[39]=meg2.getText();
				s[40]=meg3.getText();
				s[41]=meg4.getText();
				s[42]=meg5.getText();
				s[43]=meg6.getText();
				s[44]=meg7.getText();
				s[45]=meg8.getText();
				s[46]=meg9.getText();
				s[47]=meg10.getText();
		//		//rendben
				s[48]=Boolean.toString(rendben_1.isSelected());
				s[49]=Boolean.toString(rendben_2.isSelected());
				s[50]=Boolean.toString(rendben_3.isSelected());
				s[51]=Boolean.toString(rendben_4.isSelected());
				s[52]=Boolean.toString(rendben_5.isSelected());
				s[53]=Boolean.toString(rendben_6.isSelected());
				s[54]=Boolean.toString(rendben_7.isSelected());
				s[55]=Boolean.toString(rendben_8.isSelected());
				s[56]=Boolean.toString(rendben_9.isSelected());
				s[57]=Boolean.toString(rendben_10.isSelected());
				// hiba
				s[58]=Boolean.toString(hiba_1.isSelected());
				s[59]=Boolean.toString(hiba_2.isSelected());
				s[60]=Boolean.toString(hiba_3.isSelected());
				s[61]=Boolean.toString(hiba_4.isSelected());
				s[62]=Boolean.toString(hiba_5.isSelected());
				s[63]=Boolean.toString(hiba_6.isSelected());
				s[64]=Boolean.toString(hiba_7.isSelected());
				s[65]=Boolean.toString(hiba_8.isSelected());
				s[66]=Boolean.toString(hiba_9.isSelected());
				s[67]=Boolean.toString(hiba_10.isSelected());
				//javitva
				s[68]=Boolean.toString(jav_1.isSelected());
				s[69]=Boolean.toString(jav_2.isSelected());
				s[70]=Boolean.toString(jav_3.isSelected());
				s[71]=Boolean.toString(jav_4.isSelected());
				s[72]=Boolean.toString(jav_5.isSelected());
				s[73]=Boolean.toString(jav_6.isSelected());
				s[74]=Boolean.toString(jav_7.isSelected());
				s[75]=Boolean.toString(jav_8.isSelected());
				s[76]=Boolean.toString(jav_9.isSelected());
				s[77]=Boolean.toString(jav_10.isSelected());
				//megjegyzes
				s[78]=megj_1.getText();
				s[79]=megj_2.getText();
				s[80]=megj_3.getText();
				s[81]=megj_4.getText();
				s[82]=megj_5.getText();
				s[83]=megj_6.getText();
				s[84]=megj_7.getText();
				s[85]=megj_8.getText();
				s[86]=megj_9.getText();
				s[87]=megj_10.getText();
				s[88]=alvaz.getText();
			//	System.out.println(s[40]);
			//	s[19]=molajcsere.isSelected();
				//s[20]
				//s[21]	
				keszfile = index.getI();
				
				if (keresett[0]==null) {
					String[] irni=new String[11];
					irni[1]= nev.getText();
					irni[2]= cim.getText();
					irni[3]= Telefon.getText();
					irni[4]= vevokod.getText();
					irni[5]= Rendszam.getText();
					irni[6]= Tipus.getText();
					irni[7]= evjarat.getText();
					irni[8]= Motorszam.getText();
					irni[9]= alvaz.getText();
					irni[10]= hengeru.getText();
					adatb.dbir.db_ir(irni);
				}
				 
				//JSON Store data w/ index
				
				JSon execJS = new JSon(s);
				try {
					execJS.JStore();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				indes=index.getI();
				sorszam.setText("sorsz\u00E1m:  "+indes);
			}
		});
		
		Kesz.setBounds(447, 354, 89, 22);
		contentPane.add(Kesz);
		
		Label label_43 = new Label("Alv\u00E1zsz\u00E1m");
		label_43.setBounds(25, 216, 67, 22);
		contentPane.add(label_43);
		
		JButton nevsor = new JButton("Kor\u00E1bbi \u00FCgyfelek");
		nevsor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db = db_lista.db_list();
				if(nyitva==0) {
					nyitva=AdatbGUI.popdb(db);
				}
				nyitva=1;
				
				
				
			}
		});
		
		
		nevsor.setBounds(433, 60, 139, 23);
		contentPane.add(nevsor);
		
		JButton megnyitas = new JButton("Megnyit\u00E1s");
		megnyitas.setBounds(344, 354, 97, 23);
		contentPane.add(megnyitas);
		
		JButton nyomtatas = new JButton("Nyomtat\u00E1s");
		nyomtatas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s[0]=nev.getText();
				s[1]=cim.getText();
				s[2]=Telefon.getText();
				s[3]=vevokod.getText();
				s[4]=Rendszam.getText();
				s[5]=Tipus.getText();
				s[6]=evjarat.getText();
				s[7]=Motorszam.getText();
				s[8]=hengeru.getText();
				s[9]=kmO.getText();
				s[10]=Molaj.getText();
				s[11]=hajtmuolaj.getText();
				s[12]=szuro.getText();
				s[13]=meg_date.getText();
				s[14]=kezd_date.getText();
				s[15]=elkesz_v_date.getText();
				s[16]=jav_kolt.getText();
				s[17]=elkesz_date.getText();
				s[18]=fizmod.getSelectedItem();
				s[36]=uamenny.getText();
				s[37]=huto.getText();
				//megr
				s[38]=meg1.getText();
				s[39]=meg2.getText();
				s[40]=meg3.getText();
				s[41]=meg4.getText();
				s[42]=meg5.getText();
				s[43]=meg6.getText();
				s[44]=meg7.getText();
				s[45]=meg8.getText();
				s[46]=meg9.getText();
				s[47]=meg10.getText();
		//		//rendben
				s[48]=Boolean.toString(rendben_1.isSelected());
				s[49]=Boolean.toString(rendben_2.isSelected());
				s[50]=Boolean.toString(rendben_3.isSelected());
				s[51]=Boolean.toString(rendben_4.isSelected());
				s[52]=Boolean.toString(rendben_5.isSelected());
				s[53]=Boolean.toString(rendben_6.isSelected());
				s[54]=Boolean.toString(rendben_7.isSelected());
				s[55]=Boolean.toString(rendben_8.isSelected());
				s[56]=Boolean.toString(rendben_9.isSelected());
				s[57]=Boolean.toString(rendben_10.isSelected());
				// hiba
				s[58]=Boolean.toString(hiba_1.isSelected());
				s[59]=Boolean.toString(hiba_2.isSelected());
				s[60]=Boolean.toString(hiba_3.isSelected());
				s[61]=Boolean.toString(hiba_4.isSelected());
				s[62]=Boolean.toString(hiba_5.isSelected());
				s[63]=Boolean.toString(hiba_6.isSelected());
				s[64]=Boolean.toString(hiba_7.isSelected());
				s[65]=Boolean.toString(hiba_8.isSelected());
				s[66]=Boolean.toString(hiba_9.isSelected());
				s[67]=Boolean.toString(hiba_10.isSelected());
				//javitva
				s[68]=Boolean.toString(jav_1.isSelected());
				s[69]=Boolean.toString(jav_2.isSelected());
				s[70]=Boolean.toString(jav_3.isSelected());
				s[71]=Boolean.toString(jav_4.isSelected());
				s[72]=Boolean.toString(jav_5.isSelected());
				s[73]=Boolean.toString(jav_6.isSelected());
				s[74]=Boolean.toString(jav_7.isSelected());
				s[75]=Boolean.toString(jav_8.isSelected());
				s[76]=Boolean.toString(jav_9.isSelected());
				s[77]=Boolean.toString(jav_10.isSelected());
				//megjegyzes
				s[78]=megj_1.getText();
				s[79]=megj_2.getText();
				s[80]=megj_3.getText();
				s[81]=megj_4.getText();
				s[82]=megj_5.getText();
				s[83]=megj_6.getText();
				s[84]=megj_7.getText();
				s[85]=megj_8.getText();
				s[86]=megj_9.getText();
				s[87]=megj_10.getText();
				s[88]=alvaz.getText();
			//	System.out.println(s[40]);
			//	s[19]=molajcsere.isSelected();
				//s[20]
				//s[21]	
				keszfile = index.getI();
				
				if (keresett[0]==null) {
					String[] irni=new String[11];
					irni[1]= nev.getText();
					irni[2]= cim.getText();
					irni[3]= Telefon.getText();
					irni[4]= vevokod.getText();
					irni[5]= Rendszam.getText();
					irni[6]= Tipus.getText();
					irni[7]= evjarat.getText();
					irni[8]= Motorszam.getText();
					irni[9]= alvaz.getText();
					irni[10]= hengeru.getText();
					adatb.dbir.db_ir(irni);
				}
				 
				//JSON Store data w/ index
				
				JSon execJS = new JSon(s);
				try {
					execJS.JStore();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				indes=index.getI();
				sorszam.setText("sorsz\u00E1m:  "+indes);
				 try {
						one.Copy.copyFile(keszfile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			
			
				
				//filebairas
				try {
					eKesz = ODT.output(keszfile);

			//	indexSetI.setI();	// léptetni az indexet.
				} catch (EncryptedDocumentException | InvalidFormatException | IOException e2) {
					
				}
				//nyomtatas:
				if( eKesz==1 )  
					elkeszult.ePopup(keszfile);
				
				
				indes=index.getI();
				sorszam.setText("sorsz\u00E1m:  "+indes);
				
			}
		});
		nyomtatas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				

			}
		});
		nyomtatas.setBounds(546, 326, 92, 51);
		contentPane.add(nyomtatas);
		
		
		
		
		
		

		
	}
	
	
	public static String[] getS() {
		return s;
	}

	
	

	public JPanel getContentPane() {
		return contentPane;
	}
	public static void setGUI(int a) {
		nev.setText(db[a][0]);
		cim.setText(db[a][1]);
		Telefon.setText(db[a][2]);
		vevokod.setText(db[a][9]);
		Rendszam.setText(db[a][4]);
		Tipus.setText(db[a][3]);
		evjarat.setText(db[a][5]);
		Motorszam.setText(db[a][6]);
		hengeru.setText(db[a][8]);
		alvaz.setText(db[a][7]);
	}

	class HintTextField extends JTextField implements FocusListener {

		  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private final String hint;
		  private boolean showingHint;

		  public HintTextField(final String hint) {
		    super(hint);
		    this.hint = hint;
		    this.showingHint = true;
		    super.addFocusListener(this);
		  }

		  @Override
		  public void focusGained(FocusEvent e) {
		    if(this.getText().isEmpty()) {
		      super.setText("");
		      showingHint = false;
		    }
		  }
		  @Override
		  public void focusLost(FocusEvent e) {
		    if(this.getText().isEmpty()) {
		      super.setText(hint);
		      showingHint = true;
		    }
		  }

		  @Override
		  public String getText() {
		    return showingHint ? "" : super.getText();
		  }
		  
		}
}

