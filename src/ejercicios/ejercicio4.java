package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/*
 * CREAR UNA INTERFAZ DONDE:
 * INGRESE EL NOMBRE DEL USUARIO Y CLAVE EN CONTROLES DE TIPO JTEXTFIELD.
 * SI SE INGRESA LAS CADENAS LUEGO MOSTRAR JFRAME EL MENSAJE
 * "CORRECTO" EN CASO CONTRARIO MENSAJE INCORRECTO
 */
@SuppressWarnings("serial")
public class ejercicio4 extends JFrame implements ActionListener{

	
	private JButton btn;
	private JLabel lbl,lbl2,lbl3;
	private JTextField txt1;
	private JPasswordField txt2;
	
	public ejercicio4() {
		setLayout(null);
		btn=new JButton("REGISTRAR");
		btn.setBounds(30,150,110,30);
		add(btn);
		btn.addActionListener(this);
		lbl=new JLabel("Usuario");
		lbl.setBounds(30,20,50,30);
		add(lbl);	
		txt1=new JTextField();
		txt1.setBounds(30,50,150,20);
		add(txt1);
		lbl2=new JLabel("Clave");
		lbl2.setBounds(30,80,50,30);
		add(lbl2);	
		txt2=new JPasswordField();
		txt2.setBounds(30,110,150,20);
		add(txt2);
		lbl3=new JLabel();
		lbl3.setBounds(200,40,200,130);
		lbl3.setVisible(false);
		Icon mIcon=new ImageIcon(new ImageIcon(getClass().getResource("/img/correcto.png")).getImage().getScaledInstance(lbl.getWidth(),lbl.getHeight(),0));
		lbl3.setIcon(mIcon);
		add(lbl3);
	}
	
	public static void main(String[] args) {
		ejercicio4 fm=new ejercicio4();
		fm.setBounds(0, 0, 300, 250);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			if(txt1.getText().equals("admin") && txt2.getText().equals("1234")) {
				setTitle("CORRECTO");
				Icon mIcon=new ImageIcon(new ImageIcon(getClass().getResource("/img/correcto.png")).getImage().getScaledInstance(lbl.getWidth(),lbl.getHeight(),0));
				lbl3.setIcon(mIcon);
			}else {
				setTitle("INCORRECTO");
				Icon mIcon=new ImageIcon(new ImageIcon(getClass().getResource("/img/incorrecto.png")).getImage().getScaledInstance(lbl.getWidth(),lbl.getHeight(),0));
				lbl3.setIcon(mIcon);
			}
			lbl3.setVisible(true);
		}
	}

}
