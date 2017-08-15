package Earlier;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adatb.AdatbGUI;

public class EarlierGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4071038783002729652L;

	private JPanel contentPane;

	private static int a=-1;
	
	//lauch app
	public static int popEGUI() {
			
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EarlierGUI frame = new EarlierGUI();
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
	public EarlierGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
