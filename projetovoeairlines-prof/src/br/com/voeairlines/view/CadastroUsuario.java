package br.com.voeairlines.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.voeairlines.controller.UsuarioController;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroUsuario() {
		setBackground(new Color(0, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroUsuario = new JLabel("Cadastro de Usuário");
		lblCadastroUsuario.setLabelFor(this);
		lblCadastroUsuario.setForeground(new Color(0, 128, 128));
		lblCadastroUsuario.setBackground(new Color(0, 128, 128));
		lblCadastroUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroUsuario.setBounds(199, 0, 182, 14);
		contentPane.add(lblCadastroUsuario);

		JLabel lblId = new JLabel("Id");
		lblId.setForeground(new Color(0, 128, 128));
		lblId.setBackground(new Color(0, 128, 128));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(10, 24, 46, 14);
		contentPane.add(lblId);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(0, 128, 128));
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsuario.setBounds(10, 49, 74, 14);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(0, 128, 128));
		lblSenha.setBackground(new Color(0, 128, 128));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(10, 74, 74, 14);
		contentPane.add(lblSenha);

		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(81, 23, 46, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(81, 48, 114, 20);
		contentPane.add(txtUsuario);

		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(81, 74, 114, 20);
		contentPane.add(txtSenha);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (txtUsuario.getText().equals("") && txtSenha.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Verifique os campos digitados!!");

				}else {
					
					UsuarioController userC = new 	UsuarioController();
					
					userC.inserirUsuario(txtUsuario.getText(), txtSenha.getText());
					
				}

			}
				
			
		});
		btnSalvar.setForeground(new Color(0, 128, 128));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setBounds(10, 227, 117, 23);
		contentPane.add(btnSalvar);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtualizar.setBounds(158, 227, 123, 23);
		contentPane.add(btnAtualizar);

		JList list = new JList();
		list.setBounds(404, 73, 20, -47);
		contentPane.add(list);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 414, 87);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "Id", "Usuario", "Senha" }));
		scrollPane.setViewportView(table);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(0, 128, 128));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExcluir.setBounds(306, 228, 118, 23);
		contentPane.add(btnExcluir);
	}
}
