package test1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WinProductos {

	private JFrame frmCrudProductos;
	private JTextField txtId;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;
	private JTextField txtProveedor;
	private JTextField txtCantidad;
	private JButton btnInsertar;
	private JButton btnCargar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	Productos p=new Productos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinProductos window = new WinProductos();
					window.frmCrudProductos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinProductos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudProductos = new JFrame();
		frmCrudProductos.getContentPane().setBackground(SystemColor.controlShadow);
		frmCrudProductos.setTitle("CRUD Productos");
		frmCrudProductos.setBounds(100, 100, 600, 300);
		frmCrudProductos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrudProductos.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(SystemColor.text);
		lblId.setBounds(78, 22, 46, 14);
		frmCrudProductos.getContentPane().add(lblId);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(78, 45, 69, 14);
		frmCrudProductos.getContentPane().add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBounds(78, 70, 69, 14);
		frmCrudProductos.getContentPane().add(lblPrecio);
		
		JLabel lblProveedor = new JLabel("PROVEEDOR");
		lblProveedor.setForeground(Color.WHITE);
		lblProveedor.setBounds(78, 95, 69, 14);
		frmCrudProductos.getContentPane().add(lblProveedor);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBounds(78, 120, 69, 14);
		frmCrudProductos.getContentPane().add(lblCantidad);
		
		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtId.getText().length()>=3) {
					e.consume();
					}
			}
		});
		txtId.setBounds(318, 19, 160, 20);
		frmCrudProductos.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDescripcion.getText().length()>=100) {
					e.consume();
					}
			}
		});
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(318, 42, 160, 20);
		frmCrudProductos.getContentPane().add(txtDescripcion);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPrecio.getText().length()>=10.2) {
					e.consume();
					}
			}
		});
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(318, 67, 160, 20);
		frmCrudProductos.getContentPane().add(txtPrecio);
		
		txtProveedor = new JTextField();
		txtProveedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtProveedor.getText().length()>=100) {
					e.consume();
					}
			}
		});
		txtProveedor.setColumns(10);
		txtProveedor.setBounds(318, 92, 160, 20);
		frmCrudProductos.getContentPane().add(txtProveedor);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCantidad.getText().length()>=3) {
					e.consume();
					}
			}
		});
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(318, 117, 160, 20);
		frmCrudProductos.getContentPane().add(txtCantidad);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Productos np = new Productos();
					np.setId(Integer.parseInt(txtId.getText()));
					np.setDescripcion(txtDescripcion.getText());
					np.setPrecio(Double.parseDouble(txtPrecio.getText()));
					np.setProveedor(txtProveedor.getText());
					np.setCantidad(Integer.parseInt(txtCantidad.getText()));
					if (np.insertarProductos()) {
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
		btnInsertar.setBounds(37, 176, 89, 23);
		frmCrudProductos.getContentPane().add(btnInsertar);
		
		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					String id = JOptionPane.showInputDialog("ID a Cargar");
					p.setId(Integer.parseInt(id));
					if (p.cargarProductos()) {
					txtId.setText(""+p.getId());
					txtDescripcion.setText(p.getDescripcion());
					txtPrecio.setText(""+p.getPrecio());
					txtProveedor.setText(p.getProveedor());
					txtCantidad.setText(""+p.getCantidad());
					JOptionPane.showMessageDialog(null, "Producto encontrado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					}
					});
		btnCargar.setBounds(176, 176, 89, 23);
		frmCrudProductos.getContentPane().add(btnCargar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id = JOptionPane.showInputDialog("ID a Eliminar");
					Productos np = new Productos();
					np.setId(Integer.parseInt(id));
					if (np.eliminarProductos()) {
					JOptionPane.showMessageDialog(null, "Proucto eliminado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnEliminar.setBounds(304, 176, 89, 23);
		frmCrudProductos.getContentPane().add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Productos p= new Productos();
					p.setId(Integer.parseInt(txtId.getText()));
					p.setDescripcion(txtDescripcion.getText());
					p.setPrecio(Double.parseDouble(txtPrecio.getText()));
					p.setProveedor(txtProveedor.getText());
					p.setCantidad(Integer.parseInt(txtCantidad.getText()));
					if (p.actualizarProductos()) {
					limpiar();
					JOptionPane.showMessageDialog(null, "Producto actualizado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnActualizar.setBounds(453, 176, 89, 23);
		frmCrudProductos.getContentPane().add(btnActualizar);
	}
	
	public void limpiar() {
		txtId.setText("");
		txtDescripcion.setText("");
		txtPrecio.setText("");
		txtProveedor.setText("");
		txtCantidad.setText("");
		}

	
}
