package práctica;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class Menus_Emergentes extends JFrame {
	
	public Menus_Emergentes() {
		setTitle("Menus Emergentes");
		setDefaultCloseOperation(3);
		setBounds(550,100,400,400);
		
		add(new panel_menus_emergentes());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menus_Emergentes vent1= new Menus_Emergentes();
		vent1.setVisible(true);

	}

}

class panel_menus_emergentes extends JPanel {
	
	public panel_menus_emergentes() {
		setBackground(Color.yellow);
		
		setLayout(new BorderLayout());
		
		pn= new JPanel();
		
		br= new JMenuBar();
		
		m1= new JMenu("Fuente");
		m2= new JMenu("Estilo");
		m3= new JMenu("Tamaño");
		m4= new JMenu("Color");
		
		br.add(m1);
		br.add(m2);
		br.add(m3);
		br.add(m4);
		
		pn.add(br);
		add(pn,BorderLayout.NORTH);
		
		text1= new JTextPane();
		add(text1,BorderLayout.CENTER);
		
		pop= new JPopupMenu();
		
		
		it1= new JMenuItem("Negrita");
		it2= new JMenuItem("Cursiva");
		it3= new JMenuItem("Subrayada");
		it4= new JMenuItem("Color Red");
		it5= new JMenuItem("Color Azul");
		it6= new JMenuItem("Color Green");
		it7= new JMenuItem("Color Yellow");
		it8= new JMenuItem("Color Black");
		it9= new JMenuItem("Color White");
		it10= new JMenuItem("Tamaño 12");
		it11= new JMenuItem("Tamaño 14");
		it12= new JMenuItem("Tamaño 16");
		it13= new JMenuItem("Tamaño 18");
		it14= new JMenuItem("Tamaño 20");
		
		pop.add(it1);
		pop.addSeparator();
		pop.add(it2);
		pop.addSeparator();
		pop.add(it3);
		pop.addSeparator();
		pop.add(it4);
		pop.addSeparator();
		pop.add(it5);
		pop.addSeparator();
		pop.add(it6);
		pop.addSeparator();
		pop.add(it7);
		pop.addSeparator();
		pop.add(it8);
		pop.addSeparator();
		pop.add(it9);
		pop.addSeparator();
		pop.add(it10);
		pop.addSeparator();
		pop.add(it11);
		pop.addSeparator();
		pop.add(it12);
		pop.addSeparator();
		pop.add(it13);
		pop.addSeparator();
		pop.add(it14);
		
		
		JLabel l= new JLabel("texto");
		add(l,BorderLayout.SOUTH);
		
		it1.addActionListener(new StyledEditorKit.BoldAction());
		it2.addActionListener(new StyledEditorKit.ItalicAction());
		it3.addActionListener(new StyledEditorKit.UnderlineAction());
		it4.addActionListener(new StyledEditorKit.ForegroundAction("RED", Color.red));
		it5.addActionListener(new StyledEditorKit.ForegroundAction("RED", Color.blue));
		it6.addActionListener(new StyledEditorKit.ForegroundAction("RED", Color.green));
		it7.addActionListener(new StyledEditorKit.ForegroundAction("RED", Color.yellow));
		it8.addActionListener(new StyledEditorKit.ForegroundAction("RED", Color.black));
		it9.addActionListener(new StyledEditorKit.ForegroundAction("RED", Color.white));
		it10.addActionListener(new StyledEditorKit.FontSizeAction("12", 12));
		it11.addActionListener(new StyledEditorKit.FontSizeAction("14", 14));
		it12.addActionListener(new StyledEditorKit.FontSizeAction("16", 16));
		it13.addActionListener(new StyledEditorKit.FontSizeAction("18", 18));
		it14.addActionListener(new StyledEditorKit.FontSizeAction("20", 20));
		
		t1= new JCheckBoxMenuItem("12");
		t2= new JCheckBoxMenuItem("14");
		t3= new JCheckBoxMenuItem("16");
		t4= new JCheckBoxMenuItem("18");
		t5= new JCheckBoxMenuItem("20");
		
		m3.add(t1);
		m3.add(t2);
		m3.add(t3);
		m3.add(t4);
		m3.add(t5);
		
		l1= new JRadioButtonMenuItem("Negrita");
		l2= new JRadioButtonMenuItem("Cursiva");
		l3= new JRadioButtonMenuItem("Subrayada");

		m2.add(l1);
		m2.add(l2);
		m2.add(l3);
		
		le1= new JMenuItem("Arial");
		le2= new JMenuItem("Chiller");
		le3= new JMenuItem("Algerian");
		le4= new JMenuItem("Calibri");
		le5= new JMenuItem("Bauhaus 93");
		le6= new JMenuItem("Bell MT");
		le7= new JMenuItem("Berlin Sans FB");
		le8= new JMenuItem("Bradley Hand ITC");
		le9= new JMenuItem("Broadway");
		le10= new JMenuItem("Brush Script MT");
		le11= new JMenuItem("Colonna MT");
		le12= new JMenuItem("Curlz MT");
		le13= new JMenuItem("Times New Roman");
		le14= new JMenuItem("Verdana");
		le15= new JMenuItem("Tahoma");
		le16= new JMenuItem("Script MT Bold");
		le17= new JMenuItem("Ravie");
		le18= new JMenuItem("Old English Text MT");
		le19= new JMenuItem("Monotype Corsiva");
		le20= new JMenuItem("Mistral");
		
		
		m1.add(le1);
		m1.add(le3);
		m1.add(le4);
		m1.add(le5);
		m1.add(le6);
		m1.add(le7);
		m1.add(le8);
		m1.add(le9);
		m1.add(le10);
		m1.add(le11);
		m1.add(le12);
		m1.add(le13);
		m1.add(le14);
		m1.add(le15);
		m1.add(le16);
		m1.add(le17);
		m1.add(le18);
		m1.add(le19);
		m1.add(le20);
		
		le1.addActionListener(new StyledEditorKit.FontFamilyAction("","Arial"));
		le2.addActionListener(new StyledEditorKit.FontFamilyAction("","Chiller"));
		le3.addActionListener(new StyledEditorKit.FontFamilyAction("","Algerian"));
		le4.addActionListener(new StyledEditorKit.FontFamilyAction("","Calibri"));
		le5.addActionListener(new StyledEditorKit.FontFamilyAction("","Bauhaus 93"));
		le6.addActionListener(new StyledEditorKit.FontFamilyAction("","Bell MT"));
		le7.addActionListener(new StyledEditorKit.FontFamilyAction("","Berlin Sans FB"));
		le8.addActionListener(new StyledEditorKit.FontFamilyAction("","Bradley Hand ITC"));
		le9.addActionListener(new StyledEditorKit.FontFamilyAction("","Broadway"));
		le10.addActionListener(new StyledEditorKit.FontFamilyAction("","Brush Script MT"));
		le11.addActionListener(new StyledEditorKit.FontFamilyAction("","Colonna MT"));
		le12.addActionListener(new StyledEditorKit.FontFamilyAction("","Curlz MT"));
		le13.addActionListener(new StyledEditorKit.FontFamilyAction("","Times New Roman"));
		le14.addActionListener(new StyledEditorKit.FontFamilyAction("","Verdana"));
		le15.addActionListener(new StyledEditorKit.FontFamilyAction("","Tahoma"));
		le16.addActionListener(new StyledEditorKit.FontFamilyAction("","Script MT Bold"));
		le17.addActionListener(new StyledEditorKit.FontFamilyAction("","Ravie"));
		le18.addActionListener(new StyledEditorKit.FontFamilyAction("","Old English Text MT"));
		le19.addActionListener(new StyledEditorKit.FontFamilyAction("","Monotype Corsiva"));
		le20.addActionListener(new StyledEditorKit.FontFamilyAction("","Mistral"));
		
		
		l1.addActionListener(new StyledEditorKit.BoldAction());
		l2.addActionListener(new StyledEditorKit.ItalicAction());
		l3.addActionListener(new StyledEditorKit.UnderlineAction());
		
		t1.addActionListener(new StyledEditorKit.FontSizeAction("12", 12));
		t2.addActionListener(new StyledEditorKit.FontSizeAction("14", 14));
		t3.addActionListener(new StyledEditorKit.FontSizeAction("16", 16));
		t4.addActionListener(new StyledEditorKit.FontSizeAction("18", 18));
		t5.addActionListener(new StyledEditorKit.FontSizeAction("20", 20));
		
		c1= new JMenuItem("Red"   , new ImageIcon("D:\\Imagenes\\png\\\\boton_rojo1.png"));
		c2= new JMenuItem("Blue"  , new ImageIcon("D:\\Imagenes\\png\\\\boton_azul.png"));
		c3= new JMenuItem("Green" , new ImageIcon("D:\\Imagenes\\png\\\\boton_verde.png"));
		c4= new JMenuItem("Yellow", new ImageIcon("D:\\Imagenes\\png\\\\boton_amarillo.png"));
		c5= new JMenuItem("Black" , new ImageIcon("D:\\Imagenes\\png\\\\boton_negro.png"));
		c6= new JMenuItem("White" , new ImageIcon("D:\\Imagenes\\png\\\\boton_blanco_y_rojo.png"));
		
		m4.add(c1);
		m4.add(c2);
		m4.add(c3);
		m4.add(c4);
		m4.add(c5);
		m4.add(c6);
		
		c1.addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.red));
		c2.addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.BLUE));
		c3.addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.GREEN));
		c4.addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.yellow));
		c5.addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.black));
		c6.addActionListener(new StyledEditorKit.ForegroundAction("Red", Color.white));
		
		
		l.setComponentPopupMenu(pop);
		
		text1.setComponentPopupMenu(pop);
		
	}
	JPanel pn;
	JMenuBar br;
	JMenu m1,m2,m3, m4;
	
	JTextPane text1;
	JMenuItem le1, le2 , le3, le4, le5, le6, le7, le8, le9, le10, le11, le12, le13, le14, le15, le16, le17, le18, le19, le20;
	JMenuItem c1, c2, c3, c4, c5, c6;
	JRadioButtonMenuItem l1, l2, l3;
	JCheckBoxMenuItem t1, t2, t3, t4, t5;
	JMenuItem it1, it2, it3, it4, it5, it6, it7, it8, it9, it10, it11, it12, it13, it14; 
	JPopupMenu pop;
	
}
