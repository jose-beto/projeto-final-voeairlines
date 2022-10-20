package br.com.voeairlines.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.voeairlines.controller.AeronaveController;
import br.com.voeairlines.controller.UsuarioController;
import br.com.voeairlines.dao.AeronaveDAO;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CadastroAeronave extends JFrame {

	private JPanel contentPane;
	private JTextField txtFabricante;
	private JTextField txtModelo;
	private JTextField txtCodigo;
	private JTextField txtId;
	private JTextField txtTipoAeronave;
	private JTable dbDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAeronave frame = new CadastroAeronave();
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
	public CadastroAeronave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 377);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JList list = new JList();
		list.setBounds(325, 170, -35, -52);
		contentPane.add(list);

		JLabel lblCadastro = new JLabel("Cadastro  de Aeronaves");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setForeground(new Color(0, 128, 128));
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastro.setBounds(140, 0, 218, 25);
		contentPane.add(lblCadastro);

		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setForeground(new Color(0, 128, 128));
		lblFabricante.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFabricante.setBounds(10, 73, 79, 14);
		contentPane.add(lblFabricante);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(0, 128, 128));
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModelo.setBounds(10, 104, 79, 14);
		contentPane.add(lblModelo);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(new Color(0, 128, 128));
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodigo.setBounds(10, 127, 79, 25);
		contentPane.add(lblCodigo);

		txtFabricante = new JTextField();
		txtFabricante.setBounds(127, 71, 148, 20);
		contentPane.add(txtFabricante);
		txtFabricante.setColumns(10);

		txtModelo = new JTextField();
		txtModelo.setBounds(127, 102, 148, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(127, 130, 68, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (txtFabricante.getText().equals("") && txtModelo.getText().equals("") && txtCodigo.getText().equals("") ) {

					JOptionPane.showMessageDialog(null, "Verifique os campos digitados!!");

				}else {
					
					AeronaveController aeroC = new 	AeronaveController();
					
					aeroC.inserirAeronave(txtFabricante.getText(), txtModelo.getText(),txtCodigo.getText());
					
				}
			
			}
		});
		btnCadastrar.setForeground(new Color(0, 128, 128));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.setBounds(10, 304, 98, 23);
		contentPane.add(btnCadastrar);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*	try {
					
					Statement stm = new Statement();
					
					stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
					rs =  stm.executeQuery(sql);
					
				}catch(SQLException ex) {
					
					JOptionPane.showMessageDialog(null,"Erro ao executar pesquisa" + ex.getMessage());
				}
				
			*/
			}
		});
		btnPesquisar.setForeground(new Color(0, 128, 128));
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPesquisar.setBounds(118, 304, 98, 23);
		contentPane.add(btnPesquisar);

		JLabel lblId = new JLabel("id");
		lblId.setForeground(new Color(0, 139, 139));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(10, 42, 46, 14);
		contentPane.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(127, 40, 68, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(0, 128, 128));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExcluir.setBounds(325, 304, 99, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(new Color(0, 128, 128));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBounds(226, 304, 89, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblTipoAeronave = new JLabel("Tipo Aeronave");
		lblTipoAeronave.setForeground(new Color(0, 128, 128));
		lblTipoAeronave.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipoAeronave.setBounds(10, 163, 98, 14);
		contentPane.add(lblTipoAeronave);
		
		txtTipoAeronave = new JTextField();
		txtTipoAeronave.setBounds(127, 161, 145, 20);
		contentPane.add(txtTipoAeronave);
		txtTipoAeronave.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 207, 414, 86);
		contentPane.add(scrollPane);
		
		dbDados = new JTable();
		dbDados.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Fabricante", "Modelo", "Codigo", "Tipo Aeronave"
			}
		));
		dbDados.setForeground(new Color(0, 128, 128));
		dbDados.setFont(new Font("Tahoma", Font.BOLD, 12));
		scrollPane.setViewportView(dbDados);
	}
}
