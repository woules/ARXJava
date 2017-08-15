package one;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class elkeszult extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int a=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @param keszfile 
	 */
	
	public static int ePopup(String keszfile) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elkeszult frame = new elkeszult();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		return a;
	}

	/**
	 * Create the frame.
	 */
	public elkeszult() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 400, 178, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		Label label = new Label("A Munkalap elk\u00E9sz\u00FClt");
		panel.add(label);
		
		Button nyomat = new Button("Nyomtat\u00E1s");
		contentPane.add(nyomat, BorderLayout.WEST);
		nyomat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Print.p(GUI.keszfile);
   				} catch (IOException e1) {
   					e1.printStackTrace();
   				}   
				dispose();
			}
		});
		Button kilepes = new Button("Kil\u00E9p\u00E9s");
		contentPane.add(kilepes, BorderLayout.EAST);
		kilepes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	protected static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
