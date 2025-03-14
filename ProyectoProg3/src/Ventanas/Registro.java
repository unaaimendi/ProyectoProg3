package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Registro extends JFrame {

		JButton  bRegistrar, bAtras;
		JLabel lCorreo, lContraseña, lNombre, lApellido, lNumero_tarjeta, lRegistro; 
		JTextField tfCorreo,tfNombre, tfApellido, tfNumero_tarjeta; 
		JPasswordField jpContraseña; 
		

		public Registro() {
		
			setSize(600,400);
			setLocation(300, 200);

			setTitle("Registro");
			setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
			
			
			// EDITAR PARA QUE SE VEA 
			
			JPanel pSuperior = new JPanel();
			getContentPane().add(pSuperior, BorderLayout.NORTH);
			lRegistro = new JLabel("Registro de nuevo usuario");
			lRegistro.setFont(new java.awt.Font("Tahoma", 1, 18));
			pSuperior.add(lRegistro);
			

			JPanel pCentral = new JPanel(); 
			
			// COnseguir que se pongan en fila 
			
			getContentPane().add(pCentral, BorderLayout.CENTER);
			FlowLayout lay = new FlowLayout(); 
			lay.setAlignOnBaseline(true);
			pCentral.setLayout(lay);

			
			lCorreo = new JLabel("Correo :"); 
			lContraseña = new JLabel("Contraseña :");
			lNombre = new JLabel("Nombre: "); 
			lApellido = new JLabel("Apellido: "); 
			lNumero_tarjeta = new JLabel("Num tarjeta: "); 
			
			
			tfNombre = new JTextField(10);
			tfApellido = new JTextField(10); 
			tfCorreo = new JTextField(20); 
			jpContraseña = new JPasswordField(10);
			tfNumero_tarjeta = new JTextField(15);
			
			pCentral.add(lNombre); 
			pCentral.add(tfNombre);
			
			pCentral.add(lApellido); 
			pCentral.add(tfApellido);
			

			pCentral.add(lCorreo);
			pCentral.add(tfCorreo);
			
			pCentral.add(lContraseña);
			pCentral.add(jpContraseña); 
			
			pCentral.add(lNumero_tarjeta); 
			pCentral.add(tfNumero_tarjeta);
	
			
			JPanel pBotonera = new JPanel(); 
			getContentPane().add(pBotonera, BorderLayout.SOUTH);
			
			
			bRegistrar = new JButton("Registrar"); 
			bAtras = new JButton("Atras");
		
			pBotonera.add(bAtras); 
	
			pBotonera.add(bRegistrar); 
			
			
			// Action Events para los botones 
			
			bAtras.addActionListener((ActionEvent e) -> {volverAtras();}); // Vuelve a la de LOGIN
			
			bRegistrar.addActionListener((ActionEvent e) -> {} ); // Procede a registrar el usuario 
			// si es correcto el registo JOptionPanel de Bienvenido y pantalla de fin de compra o login ??
		

		}
		
		public void volverAtras() {
			Thread t1 = new Thread() {
				public void run() {
					setVisible(false);
					LogIn.main(null); 

					dispose();
				}				
			}; 
			t1.start();
		
		}
		
		
		public static void main(String[] args) {
			Registro ventRegistrar = new Registro(); 
			ventRegistrar.setVisible(true);
		}
		

	}

	

