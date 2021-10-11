package práctica;


import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Crear_Cursor_Nuevo extends JFrame {
	
	public Crear_Cursor_Nuevo() {
		
		setTitle("Cursor Nuevo");
		setDefaultCloseOperation(3);
		setBounds(300,200,400,400);
	
//		Crear Cursor Nuevo
		Toolkit tk= Toolkit.getDefaultToolkit();
	
		Image img= tk.getImage("E:\\MEMORIA BLANCA - 32 GB\\ARCHIVOS\\IMAGENES - JAVA\\png 32px\\DVD1.png");
		Cursor nuevo= tk.createCustomCursor(img, new Point(0,0), "Cursor Nuevo");
		setCursor(nuevo); 
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Crear_Cursor_Nuevo invocar_Cursor= new Crear_Cursor_Nuevo();
		invocar_Cursor.setVisible(true);
		
		
	}

}
