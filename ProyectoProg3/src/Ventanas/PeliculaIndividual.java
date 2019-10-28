package Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PeliculaIndividual extends JFrame{

	public PeliculaIndividual() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		setTitle( "Pelicula Individual" ); //Aqui estaria bien poner el nombre de la pelicula mas adelante con un getName()
		setSize( 800, 600 );
		setLocationRelativeTo( null ); 
		
		JPanel desc = new JPanel();
		JTextArea textDesc = new JTextArea();
		desc.add(textDesc);
		getContentPane().add(desc);
	}

	public static void main(String[] args) {
		PeliculaIndividual v = new PeliculaIndividual();
		v.setVisible( true );
	}



}
