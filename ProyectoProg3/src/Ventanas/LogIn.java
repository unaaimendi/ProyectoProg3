package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.*;


public class LogIn extends JFrame {
	
	
	JButton bConfirmar, bRegistrar, bAtras;
	JLabel lCorreo, lContraseña,lLogin,lPelicula, lSala, lHora, lAsiento; 
	JTextField tfCorreo; 
	JPasswordField jpContraseña; 
	//private static JDialog v;
	

	public LogIn() {
		
		setSize(600,400);
		setLocation(300, 200);
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
		bAtras = new JButton("Atras");
	
		pBotonera.add(bAtras); 
		pBotonera.add(bConfirmar); 
		pBotonera.add(bRegistrar); 
		
		
		// Action Events para los botones 
		
		bAtras.addActionListener((ActionEvent e) -> {});
		bRegistrar.addActionListener((ActionEvent e) -> {accedeRegistro();} );
		bConfirmar.addActionListener((ActionEvent e) -> {});
		
	
		
	
	}
	
	
	/** Método que contiene el hilo que nos permite
	 * cambiar de ventana de Login a ventana registro 
	 */
	private void accedeRegistro() {
		Thread t1 = new Thread() {
			public void run() {
				//LogIn.guardaConfig();
				setVisible(false);
				Registro.main(null); 

				dispose();
			}				
		}; 
		t1.start();

	}

//	public static void guardaConfig() {
//		try {
//			PrintStream ps = new PrintStream( "config.txt" );
//			ps.println( v.getWidth() );
//			ps.println( v.getHeight() );
//			ps.println( v.getX() );
//			ps.println( v.getY() );
//
//			ps.close();
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog( null, "Error en creación de fichero config.txt", "Error de configuración", JOptionPane.ERROR_MESSAGE );
//		}
//	}
//
//
//	public static void cargaConfig() {
//		try {
//			Scanner scanner = new Scanner( new File("config.txt") );
//			String linea = scanner.nextLine(); // anchura y altura
//			String linea2 = scanner.nextLine();
//			v.setSize( Integer.parseInt(linea), Integer.parseInt(linea2) );
//			linea = scanner.nextLine(); // x e y
//			linea2 = scanner.nextLine();
//			v.setLocation( Integer.parseInt(linea), Integer.parseInt(linea2) );
//	
//			
//			scanner.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	
	
	public static void main(String[] args) {
		LogIn ventLogin = new LogIn(); 
		ventLogin.setVisible(true);
		
	}
	

}
