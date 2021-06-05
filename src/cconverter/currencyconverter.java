package cconverter;

import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class currencyconverter {

	private JFrame frmMyProject;
	private JTextField txtamount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyconverter window = new currencyconverter();
					window.frmMyProject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public currencyconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyProject = new JFrame();
		frmMyProject.setTitle("MY FINAL YEAR  JAVA PROJECT 2021.");
		frmMyProject.setBounds(100, 100, 450, 300);
		frmMyProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyProject.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the amount");
		lblNewLabel.setBounds(10, 29, 141, 14);
		frmMyProject.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setBounds(10, 106, 46, 14);
		frmMyProject.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setBounds(10, 194, 56, 14);
		frmMyProject.getContentPane().add(lblNewLabel_2);
		
		txtamount = new JTextField();
		txtamount.setBounds(133, 26, 151, 32);
		frmMyProject.getContentPane().add(txtamount);
		txtamount.setColumns(10);
		
		
		JComboBox<String> txtfrom = new JComboBox<String>();
		txtfrom.setModel(new DefaultComboBoxModel(new String[] {"GHC", "USD"}));
		
		txtfrom.setBounds(133, 88, 151, 46);
		frmMyProject.getContentPane().add(txtfrom);
		
		JComboBox<String> txtto = new JComboBox<String>();
		txtto.setModel(new DefaultComboBoxModel(new String[] {"USD", "GHC"}));
		
		txtto.setBounds(133, 180, 151, 46);
		frmMyProject.getContentPane().add(txtto);
		
		JButton jButton = new JButton("Convert");
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				 Double tot; 
				        Double amount = Double.parseDouble(txtamount.getText());
				        
				        if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "GHC")
				        {
				            tot = amount * 5.50;
				            JOptionPane.showMessageDialog(null, "Your Amount will be " + tot.toString());
				        }
				       else  if(txtfrom.getSelectedItem().toString() == "GHC" && txtto.getSelectedItem().toString() == "USD")
				        {
				            tot = amount / 5.50;
				            JOptionPane.showMessageDialog(null, "Your Amount will be " + tot.toString());
				        }        
				    }


				         
			    


			
		});
		jButton.setBounds(323, 206, 101, 32);
		frmMyProject.getContentPane().add(jButton);
	}
}
