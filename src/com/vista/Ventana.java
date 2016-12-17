package com.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ventana {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu menuVenta, menuCompra, menuCobranza, menuInventario, menuInformes, menuClientes, menuConfiguracion,
			menuHerramientas, menuAcercaDe;
	// items de ventas
	private JMenuItem ventaStock, ventaCredito, corteCaja, cancelarVenta;
	// items de compra
	private JMenuItem nuevo, cancelarCompra;
	// items de cobranza
	private JMenuItem creditos, abonar;
	// items de inventario
	private JMenuItem bimestral, anual;
	// items de informes
	private JMenu menuConsultas, menuReportes;
	// submenus de consultas y reportes
	private JMenuItem consultaVenta, consultaCompra, consultaCliente, consultaProveedor, consultaProducto;

	private JMenuItem reporteVenta, reporteCompra;
	// items de Clientes
	private JMenuItem registrar, baja, modificar;

	// items de Configuración
	private JMenu menuConfiguracionProducto, menuConfiguracionModificar, menuConfiguracionUsuarios;
	// submenu configuracion
	private JMenuItem productoRegistrar, productoModificar, productoDescontinuar;
	private JMenuItem modificarRegistrar, modificarBaja;
	private JMenuItem usuarioRegistrar, usuarioModificar, usuarioBorrar;

	// items de herramientas
	private JMenu menuBD;
	private JMenuItem calculadora;
	// submenu BD
	private JMenuItem bdRespaldar, bdRestaurar;
	// items acerca De
	private JMenuItem spvZapateria, contacto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setTitle("Zapateria");
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
	public Ventana() {
		initialize();
		agregarMenu();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void agregarMenu() {
		menuBar = new JMenuBar();
		// menu venta con los subitems
		menuVenta = new JMenu("Ventas");

		ventaStock = new JMenuItem("Venta Stock");
		menuVenta.add(ventaStock);

		ventaCredito = new JMenuItem("Venta Crédito");
		menuVenta.add(ventaCredito);

		corteCaja = new JMenuItem("Corte De Caja");
		menuVenta.add(corteCaja);

		cancelarVenta = new JMenuItem("Cancelar Venta");
		menuVenta.add(cancelarVenta);
		// menu Compras con los subitems
		menuCompra = new JMenu("Compras");

		nuevo = new JMenuItem("Nuevo");
		menuCompra.add(nuevo);

		cancelarCompra = new JMenuItem("Cancelar Compra");
		menuCompra.add(cancelarCompra);

		// menu cobranza con los subitems
		menuCobranza = new JMenu("Cobranza");

		creditos = new JMenuItem("Creditos");
		menuCobranza.add(creditos);
		abonar = new JMenuItem("Abonar");
		menuCobranza.add(abonar);
		// menu inventario con los subitems
		menuInventario = new JMenu("Inventario");
		bimestral = new JMenuItem("Bimestral");
		menuInventario.add(bimestral);
		anual = new JMenuItem("Anual");
		menuInventario.add(anual);
		// menu informe con los subitems
		menuInformes = new JMenu("Informes");
		menuConsultas = new JMenu("Consultas");

		consultaVenta = new JMenuItem("Venta");
		consultaCompra = new JMenuItem("Compra");
		consultaCliente = new JMenuItem("Cliente");
		consultaProveedor = new JMenuItem("Proveedor");
		consultaProducto = new JMenuItem("Producto");

		menuConsultas.add(consultaVenta);
		menuConsultas.add(consultaCompra);
		menuConsultas.add(consultaCliente);
		menuConsultas.add(consultaProveedor);
		menuConsultas.add(consultaProducto);

		menuReportes = new JMenu("Reportes");

		reporteVenta = new JMenuItem("Venta");
		reporteCompra = new JMenuItem("Compra");
		menuReportes.add(reporteVenta);
		menuReportes.add(reporteCompra);
		menuInformes.add(menuConsultas);
		menuInformes.add(menuReportes);

		// menu clientas con los subitems
		menuClientes = new JMenu("Clientes");
		registrar = new JMenuItem("Registrar");
		baja = new JMenuItem("Baja");
		modificar = new JMenuItem("Modificar");
		menuClientes.add(registrar);
		menuClientes.add(baja);
		menuClientes.add(modificar);
		// menu configuracion con los subitems
		menuConfiguracion = new JMenu("Configuracion");
		menuConfiguracionProducto = new JMenu("Productos");
		productoRegistrar = new JMenuItem("Registrar");
		productoModificar = new JMenuItem("Modificar");
		productoDescontinuar = new JMenuItem("Descontinuar");

		menuConfiguracionProducto.add(productoRegistrar);
		menuConfiguracionProducto.add(productoModificar);
		menuConfiguracionProducto.add(productoDescontinuar);

		menuConfiguracionModificar = new JMenu("Modificar");
		modificarRegistrar = new JMenuItem("Registrar");
		modificarBaja = new JMenuItem("Baja");

		menuConfiguracionModificar.add(modificarRegistrar);
		menuConfiguracionModificar.add(modificarBaja);

		menuConfiguracionUsuarios = new JMenu("Usuarios");
		usuarioRegistrar = new JMenuItem("Registrar");
		usuarioModificar = new JMenuItem("Modificar");
		usuarioBorrar = new JMenuItem("Borrar");

		menuConfiguracionUsuarios.add(usuarioRegistrar);
		menuConfiguracionUsuarios.add(usuarioModificar);
		menuConfiguracionUsuarios.add(usuarioBorrar);

		menuConfiguracion.add(menuConfiguracionProducto);
		menuConfiguracion.add(menuConfiguracionModificar);
		menuConfiguracion.add(menuConfiguracionUsuarios);

		// menu herramientas con los subitems
		menuHerramientas = new JMenu("Herramientas");
		menuBD = new JMenu("BD");
		bdRespaldar = new JMenuItem("Respaladar");
		bdRestaurar = new JMenuItem("Restaurar");
		menuBD.add(bdRespaldar);
		menuBD.add(bdRestaurar);
		calculadora = new JMenuItem("Calculadora");
		menuHerramientas.add(menuBD);
		menuHerramientas.add(calculadora);
		// menu acerca de con sus items
		menuAcercaDe = new JMenu("Acerca De...");
		spvZapateria = new JMenuItem("SPV Zapateria");
		contacto = new JMenuItem("Contacto");
		menuAcercaDe.add(spvZapateria);
		menuAcercaDe.add(contacto);

		menuBar.add(menuVenta);
		menuBar.add(menuCompra);
		menuBar.add(menuCobranza);
		menuBar.add(menuInventario);
		menuBar.add(menuInformes);
		menuBar.add(menuClientes);
		menuBar.add(menuConfiguracion);
		menuBar.add(menuHerramientas);
		menuBar.add(menuAcercaDe);
		frame.setJMenuBar(menuBar);
	}

}
