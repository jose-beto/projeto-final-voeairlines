package br.com.voeairlines.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;

import br.com.voeairlines.controller.UsuarioController;


import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class TelaLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField pwSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		class Imagem extends JFrame {

			ImageIcon imagem = new ImageIcon(getClass().getResource("Azul-E195-E2-.jpg"));
			JLabel label = new JLabel(imagem);

			public Imagem() {

				add(label);
			}
		}

		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(71, 81, 57, 20);
		lblLogin.setForeground(new Color(0, 139, 139));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(71, 132, 57, 14);
		lblSenha.setForeground(new Color(0, 139, 139));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblSenha);

		txtLogin = new JTextField();
		txtLogin.setBounds(126, 83, 173, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		pwSenha = new JPasswordField();
		pwSenha.setBounds(126, 131, 173, 20);
		frame.getContentPane().add(pwSenha);

		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setBounds(71, 207, 108, 23);
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String senha = new String(pwSenha.getPassword());

				if (txtLogin.getText().equals("") && senha.equals("")) {

					JOptionPane.showMessageDialog(null, "Verifique os campos digitados!!");

				}else {
					
					UsuarioController userC = new 	UsuarioController();
					
					userC.validarUsuario(txtLogin.getText(), senha);
					
				}

			}
		});
		btnAcessar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAcessar.setForeground(new Color(0, 139, 139));
		frame.getContentPane().add(btnAcessar);

		JButton btnLimpar = new JButton("Cancelar");
		btnLimpar.setBounds(236, 207, 108, 23);
		btnLimpar.setBackground(new Color(240, 240, 240));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpar.setForeground(new Color(0, 139, 139));
		frame.getContentPane().add(btnLimpar);

		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 0, 10, 10);
		panel_1.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel_1);
		
		JLabel lblTitulo = new JLabel("VoeAirlines");
		lblTitulo.setForeground(new Color(0, 128, 128));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(191, 11, 108, 14);
		frame.getContentPane().add(lblTitulo);
	}

	protected void dispose() {

	}
}
