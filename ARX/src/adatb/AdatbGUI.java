package adatb;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import one.GUI;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdatbGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8029719331584153189L;
	/**
	 * Launch the application.
	 */
	private boolean szerkesztheto=true;
	private static Object[][] data = new Object[1000][10];
	private static int a=-1;
	public static int x10=0;
	public static int popdb(String[][] db) {
		
		data = db;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdatbGUI frame = new AdatbGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		a=0;
		return a;
	}

	/**
	 * Create the frame.
	 */
	 static/*
	public AdatbGUI() {
	*/	
		JTable table;
		
		public AdatbGUI() {
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setAlwaysOnTop(true);
			
			
			
			
			setResizable(false);
	//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(400, 1, 780, 740);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			getContentPane().setLayout(new FlowLayout());
			
			String[] columnNames = {
					"Név",
	                "Cím",
	                "Telefonszám",
	                "Auto tipus",
	                "Rendszam",
	                "Evjarat",
	                "Motorkod",
	                "Alvazszam",
	                "Rendszam",
	                "Vevõkód"};
			
			addWindowListener(new WindowAdapter() {
		        @Override
		        public void windowClosing(WindowEvent event) {
		            dispose();
		            one.GUI.nyitva=0;
		        }
		    });
			
			table = new JTable(data, columnNames);
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent mouseEvent) {
					
					if(szerkesztheto==true) {				
						int index = table.getSelectedRow();
						a= index;
						one.GUI.nyitva=0;
						dispose();
						GUI.setGUI(a);
					}
				}
			});
			table.setPreferredScrollableViewportSize(new Dimension(740, 620));
	//		table.setFillsViewportHeight(true);
	/*		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.getColumnModel().getColumn(0).setPreferredWidth(27);
			table.getColumnModel().getColumn(1).setPreferredWidth(120);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(90);
			table.getColumnModel().getColumn(4).setPreferredWidth(90);
			table.getColumnModel().getColumn(5).setPreferredWidth(120);
			table.getColumnModel().getColumn(6).setPreferredWidth(100);
			table.getColumnModel().getColumn(7).setPreferredWidth(95);
			table.getColumnModel().getColumn(8).setPreferredWidth(40);*/
		//	table.setEnabled(false);
			
		//	table.getAutoResizeMode();
			JScrollPane scrollpane = new JScrollPane(table);
			getContentPane().add(scrollpane);
		
			JButton kesz = new JButton("Kész");
			contentPane.add(kesz);
			JButton szerk = new JButton("Szerkesztés");
			
			
			szerk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					szerkesztheto = false;
					contentPane.remove(szerk);
					contentPane.add(kesz);
					repaint();
				}
			});
			
			
			kesz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					szerkesztheto = true;
					contentPane.remove(kesz);
					contentPane.add(szerk);
					dbadatleker(dbhossz());
					db_feltolt.ir(data,x10);
					repaint();
				}
			});
			
			
			
			contentPane.add(szerk);
			
			JButton btnBezrs = new JButton("Bez\u00E1r\u00E1s");
			btnBezrs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					one.GUI.nyitva=0;
					dispose();
				}
			});
			contentPane.add(btnBezrs);
			getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollpane, table}));
			
			
			
		}
/*		private int ABGUIClose() {
			one.GUI.nyitva=0;
			dispose();
			return 0;
		}*/
		public void dbadatleker(int j) {
				for(int i=0; i<j; i++){
					for (int z=0; z<10; z++)
					{
						data[i][z]=table.getModel().getValueAt(i, z);
					}
					
				}
				
		}
		public static int dbhossz() {
			int z=0; 
			int x9 = 0;
			while(table.getModel().getValueAt(x9, z)!=null && table.getModel().getValueAt(x9, z)!="") {
				x10=x9;
				x9++;
			}
			return x9;
			
		}
		
		
		
		
		
	/*	
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				
			}
		});
		
		
		scrollBar.setBounds(427, 0, 17, 271);
		contentPane.add(scrollBar);
		
		
		
		
		JTable table = new JTable(data, columnNames);
		contentPane.add(table);
	}
	*/
}
