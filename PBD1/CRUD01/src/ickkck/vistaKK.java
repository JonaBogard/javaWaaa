package ickkck;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaKK {

	private JFrame frmGestorDeProductos;
	private JTextField txtID;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;
	private JTextField txtProveedor;
	private JTextField txtCantidad;
	private JButton btnInsertar;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnShow;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaKK window = new vistaKK();
					window.frmGestorDeProductos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaKK() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void limpiar() {
		txtID.setText("");
		txtDescripcion.setText("");
		txtPrecio.setText("");
		txtProveedor.setText("");
		}
	private void initialize() {
		frmGestorDeProductos = new JFrame();
		frmGestorDeProductos.setTitle("Gestor de Sexo");
		frmGestorDeProductos.setBounds(100, 100, 450, 300);
		frmGestorDeProductos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestorDeProductos.getContentPane().setLayout(null);
		frmGestorDeProductos.setLocationRelativeTo(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(10, 11, 46, 14);
		frmGestorDeProductos.getContentPane().add(lblID);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(10, 35, 64, 14);
		frmGestorDeProductos.getContentPane().add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 58, 46, 14);
		frmGestorDeProductos.getContentPane().add(lblPrecio);
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setBounds(10, 79, 64, 14);
		frmGestorDeProductos.getContentPane().add(lblProveedor);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 104, 46, 14);
		frmGestorDeProductos.getContentPane().add(lblCantidad);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					producto np = new producto();
					np.setDescripcion(txtDescripcion.getText());
					np.setPrecio(Double.parseDouble(txtPrecio.getText()));
					np.setCantidad(Integer.parseInt(txtCantidad.getText()));
					np.setProveedor(txtProveedor.getText());
					if (np.insertarProducto()) {
						limpiar();
						JOptionPane.showMessageDialog(null, "Producto agregado");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnInsertar.setBounds(49, 148, 89, 23);
		frmGestorDeProductos.getContentPane().add(btnInsertar);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(174, 148, 89, 23);
		frmGestorDeProductos.getContentPane().add(btnDelete);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(311, 148, 89, 23);
		frmGestorDeProductos.getContentPane().add(btnUpdate);
		
		btnShow = new JButton("Show");
		btnShow.setBounds(108, 192, 89, 23);
		frmGestorDeProductos.getContentPane().add(btnShow);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		btnLimpiar.setBounds(253, 192, 89, 23);
		frmGestorDeProductos.getContentPane().add(btnLimpiar);
		
		txtID = new JTextField();
		txtID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtID.getText().length()>=11){
					e.consume();
				}
			}
		});
		txtID.setBounds(108, 11, 86, 20);
		frmGestorDeProductos.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDescripcion.getText().length()>=100){
					e.consume();
				}
			}
		});
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(108, 32, 86, 20);
		frmGestorDeProductos.getContentPane().add(txtDescripcion);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPrecio.getText().length()>=11){
					e.consume();
				}
			}
		});
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(108, 55, 86, 20);
		frmGestorDeProductos.getContentPane().add(txtPrecio);
		
		txtProveedor = new JTextField();
		txtProveedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtProveedor.getText().length()>=100){
					e.consume();
				}
			}
		});
		txtProveedor.setColumns(10);
		txtProveedor.setBounds(108, 76, 86, 20);
		frmGestorDeProductos.getContentPane().add(txtProveedor);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCantidad.getText().length()>=3){
					e.consume();
				}
			}
		});
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(108, 101, 86, 20);
		frmGestorDeProductos.getContentPane().add(txtCantidad);
	}
}
