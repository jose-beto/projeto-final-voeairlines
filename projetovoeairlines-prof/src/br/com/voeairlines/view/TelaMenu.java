package br.com.voeairlines.view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaMenu extends JFrame {
	
	public static void main (String [] args) {
	}

	JMenuBar barra = new JMenuBar();
	
	JMenu menu1 =  new JMenu("Cadastrar Aeronave");
	JMenu menu2 =  new JMenu("Cadastrar Tipo Aeronave");
	
	JMenuItem item1 = new JMenuItem("");
	
	public void Menu() {
		
		setJMenuBar (barra);
		barra.add(menu1);
		barra.add(menu2);
		
		menu2.add(item1);
		
		item1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("Menu");
	}

}
