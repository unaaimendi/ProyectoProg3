package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.*;



public class LogIn extends JFrame {
	
	
	JButton bConfirmar, bRegistrar, bAtras;
	JLabel lCorreo, lContraseña,lLogin; 
	JTextField tfCorreo, tfContraseña; 
	JPasswordField jpContraseña; 
	

	public LogIn() {
		
		setSize(600,400);
		setTitle("LOG IN");
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		
		JPanel pSuperior = new JPanel();
		getContentPane().add(pSuperior, BorderLayout.NORTH);
		lLogin = new JLabel("LOG IN");
		lLogin.setFont(new java.awt.Font("Tahoma", 1, 18));
		pSuperior.add(lLogin);
		
		
		JPanel pInfoCompra = new JPanel(); 
		// Definir más adelante 
		// tenemos que meter en un panel la información de compra
		// fecha, hora , asientos ... 
		
		
		JPanel pCentral = new JPanel(); 
		
		getContentPane().add(pCentral, BorderLayout.CENTER);
		// BorderLAYOUT??
		
		lCorreo = new JLabel("Correo :"); 
		lContraseña = new JLabel("Contraseña :");
		
		tfCorreo = new JTextField(10); 
		tfContraseña = new JPasswordField(10);
	
		
		pCentral.add(lCorreo);
		pCentral.add(tfCorreo);
		
		pCentral.add(lContraseña);
		pCentral.add(tfContraseña); 
		

	
		JPanel pBotonera = new JPanel(); 
		getContentPane().add(pBotonera, BorderLayout.SOUTH);
		
		bConfirmar = new JButton("Confirmar"); 
		
			//bConfirmar.setBackground(Color.cyan);
		bRegistrar = new JButton("Registrar"); 
		bAtras = new JButton("Registrar");
	
		pBotonera.add(bAtras); 
		pBotonera.add(bConfirmar); 
		pBotonera.add(bRegistrar); 
		
		
	}
	
	
	
	public static void main(String[] args) {
		LogIn ventLogin = new LogIn(); 
		ventLogin.setVisible(true);
	}
	

}
