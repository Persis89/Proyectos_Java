package interfaces_gráficas; // Package of Class

// Libraries
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Eventos extends JFrame { // Class Principal inheritance of Class Father
	
	
//	Attributes
	private JButton Color_verde, Color_rojo, Color_azul;
	private Toolkit tk;
	
	public Eventos() { // Constructor
	
//		Create Image o Icon
		tk= Toolkit.getDefaultToolkit();
		setIconImage(tk.getImage("Estilo1.png"));
		
//		Methods 
		setTitle("EVENTOS");
		setDefaultCloseOperation(3);
		setExtendedState(6);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
//		Create Buttons
		Color_verde= new JButton("VERDE");
		Color_rojo = new JButton("ROJO");
		Color_azul = new JButton("AZUL");
		
//		Colors Buttons
		Color_verde.setBackground(Color.green);
		Color_rojo.setBackground(Color.red);
		Color_azul.setBackground(Color.blue);
		
//		Border Buttons
		Color_verde.setBorder(new LineBorder(Color.black,5));
		Color_rojo.setBorder(new LineBorder(Color.black,5));
		Color_azul.setBorder(new LineBorder(Color.black,5));
		
//		Add Buttons at the Frame
		add(Color_verde);
		add(Color_rojo);
		add(Color_azul);
		
//		Buttons Events
		Color_verde.addActionListener(new evento_botones());
		Color_rojo.addActionListener(new evento_botones());
		Color_azul.addActionListener(new evento_botones());
		
	}
	
//	Derived Class or subclass implements Class ActionListener
	private class evento_botones implements ActionListener {

//		Method of Class implemented
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(Color_verde == e.getSource()) {
				
				getContentPane().setBackground(Color.green);
				
			} else if(Color_rojo == e.getSource()) {
				
				getContentPane().setBackground(Color.red);
				
			} else if(Color_azul == e.getSource()) {
				
				getContentPane().setBackground(Color.blue);
				
			} else {
			
			JOptionPane.showMessageDialog(null,"Presionaste otro lugar", "Mensaje",0);
			
			}
		}
	
	}

	public static void main(String[] args) { // Method Main
		// TODO Auto-generated method stub

//		instance of Class
		Eventos eventos= new Eventos();
		
//		Use Method of Class
		eventos.setVisible(true);
		
	}

}
