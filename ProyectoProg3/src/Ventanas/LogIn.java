package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class LogIn extends JFrame {
	
	
	JButton bConfirmar, bRegistrar, bAtras;
	JLabel lCorreo, lContraseña,lLogin,lPelicula, lSala, lHora, lAsiento; 
	JTextField tfCorreo; 
	JPasswordField jpContraseña; 
	

	public LogIn() {
	
		setSize(600,400);
		setTitle("LOG IN");
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		
		
		// EDITAR PARA QUE SE VEA 
		
		JPanel pSuperior = new JPanel();
		getContentPane().add(pSuperior, BorderLayout.NORTH);
		lLogin = new JLabel("LOG IN");
		lLogin.setFont(new java.awt.Font("Tahoma", 1, 18));
		pSuperior.add(lLogin);
		
		
		JPanel pInfoCompra = new JPanel(); 
		
		// Definir más adelante 
		// tenemos que meter en un panel la información de compra
		// fecha, hora , asientos ... 
		
		lPelicula = new JLabel("Pelicula: "); 
		lHora = new JLabel("Hora: "  ); 
		lSala = new JLabel("Sala: "); 
		lAsiento = new JLabel("Asiento/s: "); 
		
		pInfoCompra.add(lPelicula); 
		pInfoCompra.add( lHora);
		pInfoCompra.add( lSala );
		pInfoCompra.add(lAsiento);
		
		
		pInfoCompra.setBackground(Color.white);
		getContentPane().add(pInfoCompra, BorderLayout.NORTH);
		
		JPanel pCentral = new JPanel(); 
		
		getContentPane().add(pCentral, BorderLayout.CENTER);
	
		
		lCorreo = new JLabel("Correo :"); 
		lContraseña = new JLabel("Contraseña :");
		
		tfCorreo = new JTextField(10); 
		jpContraseña = new JPasswordField(10);
	
		
		pCentral.add(lCorreo);
		pCentral.add(tfCorreo);
		
		pCentral.add(lContraseña);
		pCentral.add(jpContraseña); 
		

	
		JPanel pBotonera = new JPanel(); 
		getContentPane().add(pBotonera, BorderLayout.SOUTH);
		
		bConfirmar = new JButton("Confirmar"); 
		
			//bConfirmar.setBackground(Color.cyan);
		bRegistrar = new JButton("Registrar"); 
		bAtras = new JButton("Registrar");
	
		pBotonera.add(bAtras); 
		pBotonera.add(bConfirmar); 
		pBotonera.add(bRegistrar); 
		
		
		// Action Events para los botones 
		
		bAtras.addActionListener((ActionEvent e) -> {});
		bRegistrar.addActionListener((ActionEvent e) -> {} );
		bConfirmar.addActionListener((ActionEvent e) -> {});

	}
	
	
	
	public static void main(String[] args) {
		LogIn ventLogin = new LogIn(); 
		ventLogin.setVisible(true);
	}
	

}
