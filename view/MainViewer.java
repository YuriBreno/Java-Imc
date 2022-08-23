package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import control.ControleImc;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class MainViewer {

	private JFrame appFrame;
	private JTextField NometextField;
	private JTextField IdadetextField;
	private JTextField PesotextField;
	private JTextField AlturatextField;
	private JTextPane ResultadoPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.setAlwaysOnTop(true);
		appFrame.setResizable(false);
		appFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Breno.LAPTOP-5QL5UQB5\\Desktop\\Estudos\\Portifolio-Yuri\\site\\img\\imc.png"));
		appFrame.getContentPane().setBackground(Color.BLUE);
		appFrame.setBackground(Color.WHITE);
		appFrame.getContentPane().setForeground(Color.WHITE);
		appFrame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(264, 10, 306, 42);
		appFrame.getContentPane().add(lblNewLabel);

		JLabel nomeLabel = new JLabel("Nome: ");
		nomeLabel.setForeground(Color.WHITE);
		nomeLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		nomeLabel.setBounds(26, 88, 137, 53);
		appFrame.getContentPane().add(nomeLabel);

		NometextField = new JTextField();
		NometextField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		NometextField.setBackground(Color.WHITE);
		NometextField.setBounds(138, 97, 475, 35);
		appFrame.getContentPane().add(NometextField);
		NometextField.setColumns(10);

		JLabel idadeLabel = new JLabel("Idade: ");
		idadeLabel.setForeground(Color.WHITE);
		idadeLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		idadeLabel.setBounds(26, 254, 137, 53);
		appFrame.getContentPane().add(idadeLabel);

		IdadetextField = new JTextField();
		IdadetextField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		IdadetextField.setBackground(Color.WHITE);
		IdadetextField.setColumns(10);
		IdadetextField.setBounds(138, 263, 239, 35);
		appFrame.getContentPane().add(IdadetextField);

		JLabel generoLabel = new JLabel("G\u00EAnero:");
		generoLabel.setForeground(Color.WHITE);
		generoLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		generoLabel.setBounds(415, 254, 137, 53);
		appFrame.getContentPane().add(generoLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnNewRadioButton.setBounds(532, 265, 137, 35);
		appFrame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBackground(Color.WHITE);
		rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnFeminino.setBounds(681, 265, 138, 35);
		appFrame.getContentPane().add(rdbtnFeminino);

		PesotextField = new JTextField();
		PesotextField.setBackground(Color.WHITE);
		PesotextField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		PesotextField.setHorizontalAlignment(SwingConstants.CENTER);
		PesotextField.setText("0.0");
		PesotextField.setColumns(10);
		PesotextField.setBounds(138, 179, 239, 35);
		appFrame.getContentPane().add(PesotextField);

		JLabel pesoLabel = new JLabel("Peso:");
		pesoLabel.setForeground(Color.WHITE);
		pesoLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		pesoLabel.setBounds(26, 170, 137, 53);
		appFrame.getContentPane().add(pesoLabel);

		AlturatextField = new JTextField();
		AlturatextField.setBackground(Color.WHITE);
		AlturatextField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		AlturatextField.setHorizontalAlignment(SwingConstants.CENTER);
		AlturatextField.setText("0.0");
		AlturatextField.setColumns(10);
		AlturatextField.setBounds(532, 179, 239, 35);
		appFrame.getContentPane().add(AlturatextField);

		JLabel alturaLabel = new JLabel("Altura: ");
		alturaLabel.setForeground(Color.WHITE);
		alturaLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
		alturaLabel.setBounds(415, 170, 137, 53);
		appFrame.getContentPane().add(alturaLabel);

		JButton CalcularBotao = new JButton("Enviar");
		CalcularBotao.setBackground(Color.WHITE);
		CalcularBotao.addActionListener(new ControleImc(this));
		CalcularBotao.setFont(new Font("Tahoma", Font.PLAIN, 26));
		CalcularBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CalcularBotao.setBounds(643, 588, 154, 45);
		appFrame.getContentPane().add(CalcularBotao);

		ResultadoPane = new JTextPane();
		ResultadoPane.setBackground(Color.WHITE);
		ResultadoPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		ResultadoPane.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ResultadoPane.setText("Resultado:");
		ResultadoPane.setBounds(26, 380, 565, 264);
		appFrame.getContentPane().add(ResultadoPane);
		appFrame.setForeground(Color.WHITE);
		appFrame.setTitle("IMC CALCULADORA");
		appFrame.setBounds(100, 100, 839, 691);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getNometextField() {
		return NometextField;
	}

	public void setNometextField(JTextField nometextField) {
		NometextField = nometextField;
	}

	public JTextField getIdadetextField() {
		return IdadetextField;
	}

	public void setIdadetextField(JTextField idadetextField) {
		IdadetextField = idadetextField;
	}

	public JTextField getPesotextField() {
		return PesotextField;
	}

	public void setPesotextField(JTextField pesotextField) {
		PesotextField = pesotextField;
	}

	public JTextField getAlturatextField() {
		return AlturatextField;
	}

	public void setAlturatextField(JTextField alturatextField) {
		AlturatextField = alturatextField;
	}

	public JTextPane getResultadoPane() {
		return ResultadoPane;
	}

	public void setResultadoPane(JTextPane resultadoPane) {
		ResultadoPane = resultadoPane;
	}
}
