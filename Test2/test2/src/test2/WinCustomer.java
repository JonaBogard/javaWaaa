package test2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinCustomer {

	private JFrame frmCrudCustom;
	private JTextField txtId;
	private JTextField txtCustomer;
	private JTextField txtTelefono;
	private JTextField txtFax;
	private JTextField txtEmail;
	private JButton btnAgregar;
	private JButton btnCargar;
	private JButton btnEliminar;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinCustomer window = new WinCustomer();
					window.frmCrudCustom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinCustomer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudCustom = new JFrame();
		frmCrudCustom.setTitle("Customer");
		frmCrudCustom.setBounds(100, 100, 600, 265);
		frmCrudCustom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrudCustom.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 11, 46, 14);
		frmCrudCustom.getContentPane().add(lblId);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setBounds(10, 36, 69, 14);
		frmCrudCustom.getContentPane().add(lblCustomer);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 61, 83, 14);
		frmCrudCustom.getContentPane().add(lblTelefono);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(10, 83, 77, 14);
		frmCrudCustom.getContentPane().add(lblFax);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 108, 69, 14);
		frmCrudCustom.getContentPane().add(lblEmail);
		
		txtId = new JTextField();
		txtId.setBounds(124, 8, 120, 20);
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtId.getText().length()>=3) {
					e.consume();
					}
			}
		});
		frmCrudCustom.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtCustomer = new JTextField();
		txtCustomer.setBounds(124, 33, 120, 20);
		txtCustomer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCustomer.getText().length()>=50) {
					e.consume();
					}
			}
		});
		txtCustomer.setColumns(10);
		frmCrudCustom.getContentPane().add(txtCustomer);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(124, 58, 120, 20);
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTelefono.getText().length()>=10) {
					e.consume();
					}
			}
		});
		txtTelefono.setColumns(10);
		frmCrudCustom.getContentPane().add(txtTelefono);
		
		txtFax = new JTextField();
		txtFax.setBounds(124, 80, 120, 20);
		txtFax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtFax.getText().length()>=15) {
					e.consume();
					}

			}
		});
		txtFax.setColumns(10);
		frmCrudCustom.getContentPane().add(txtFax);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(124, 105, 120, 20);
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtEmail.getText().length()>=40) {
					e.consume();
					}

			}
		});
		txtEmail.setColumns(10);
		frmCrudCustom.getContentPane().add(txtEmail);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(41, 150, 89, 23);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Customer np = new Customer();
					np.setIdCustomer(txtId.getText());
					np.setCustomer(txtCustomer.getText());
					np.setTelefono(txtTelefono.getText());
					np.setFax(txtFax.getText());
					np.setEmail(txtEmail.getText());
					if (np.insertCustomer()) {
					clean();
					JOptionPane.showMessageDialog(null, "Customer Agregado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		frmCrudCustom.getContentPane().add(btnAgregar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(287, 150, 89, 23);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String idCustomer = JOptionPane.showInputDialog("Id del Customer a eliminar");
					Customer np = new Customer();
					np.setIdCustomer(idCustomer);
					if (np.deleteCustomer()) {
					JOptionPane.showMessageDialog(null, "Customer Delete");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		frmCrudCustom.getContentPane().add(btnEliminar);
		
		btnCargar = new JButton("Cargar");
		btnCargar.setBounds(160, 150, 89, 23);
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String idCustomer = JOptionPane.showInputDialog("Customer Id");
					Customer np = new Customer();
					np.setIdCustomer(idCustomer);
					if (np.loadCustomer()) {
					txtId.setText(""+np.getIdCustomer());
					txtCustomer.setText(np.getCustomer());
					txtTelefono.setText(""+np.getTelefono());
					txtFax.setText(np.getFax());
					txtEmail.setText(""+np.getEmail());
					JOptionPane.showMessageDialog(null, "Customer encontrado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
				}
		});
		frmCrudCustom.getContentPane().add(btnCargar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(405, 150, 89, 23);
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Customer np= new Customer();
					np.setIdCustomer(txtId.getText());
					np.setCustomer(txtCustomer.getText());
					np.setTelefono(txtTelefono.getText());
					np.setFax(txtFax.getText());
					np.setEmail(txtEmail.getText());
					if (np.updateCustomer()) {
					clean();
					JOptionPane.showMessageDialog(null, "Customer actualizado");
					} else {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		frmCrudCustom.getContentPane().add(btnActualizar);
	}
	public void clean() {
		txtId.setText("");
		txtCustomer.setText("");
		txtTelefono.setText("");
		txtFax.setText("");
		txtEmail.setText("");
		}
}
