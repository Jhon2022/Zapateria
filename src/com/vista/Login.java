package com.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4407576198809797110L;
	private JTextField textField;
	private JPasswordField passwordField;

	public Login() {
		setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(12, 66, 70, 15);
		add(lblUsuario);

		JLabel lblIniciarSesionZapateria = new JLabel("Iniciar Sesion Zapateria");
		lblIniciarSesionZapateria.setBounds(135, 12, 175, 15);
		add(lblIniciarSesionZapateria);

		textField = new JTextField();
		textField.setBounds(97, 58, 242, 25);
		add(textField);
		textField.setColumns(10);

		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(12, 107, 89, 15);
		add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setBounds(97, 95, 242, 29);
		add(passwordField);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(107, 145, 117, 25);
		add(btnEntrar);

		JButton btnRestablecer = new JButton("Restablecer");
		btnRestablecer.setBounds(241, 145, 134, 25);
		add(btnRestablecer);

	}
}
