package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * DISPONER DOS OBJETOS DE CLASE JBUTTON CON LAS ETIQUETAS "PILOTO"
 * "DIRECCION", AL PRESIONARSE MOSTRAR EN LA BARRA DEL TITULO DEL
 * JFRAME LA ETIQUETA DEL BOTON PRESIONADO
 */
@SuppressWarnings("serial")
public class ejercicio3 extends JFrame implements ActionListener{

	private JButton btn1,btn2;
	
	public ejercicio3() {
		setLayout(null);
		btn1=new JButton("PILOTO");
		btn1.setBounds(30,150,90,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("DIRECCION");
		btn2.setBounds(150,150,120,30);
		add(btn2);	
		btn2.addActionListener(this);
	}
	
	public static void main(String[] args){
		ejercicio3 fm=new ejercicio3();
		fm.setBounds(0,0,400,400);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			String cad=btn1.getText();
			setTitle(cad);
		}
		if(e.getSource()==btn2) {
			String cad=btn2.getText();
			setTitle(cad);
		}
	}

}
