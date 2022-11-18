import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InterfazGUI extends JFrame implements ActionListener {
	
	Conectar con;

	Calculos comparador = new Calculos();
	private JPanel panelPrincipal;
	private JTextField tFNombre;
	private JTextField tFEdad;
	private JTextField tFDpi;
	private JTextField tFHabitantes;
	private JTextField tFDineroAportado;
	private JTextField tFAlimentos;
	private JTextField tFDomicilio;
	private JTextField tFSalario;
	private JTextField tFMarca;
	private JTextField tFModelo;
	private JTextField tFLinea;
	private JTextField tFGasolina;
	private JTextField tFEducacion;
	private JTextField tFConsulta;
	private JTextField tFMedicina;
	private JTextField tFOcio;
	private JTextField tFHigiene;
	private JTextField tFTransporte;
	private ButtonGroup mf = new ButtonGroup();
	private ButtonGroup comparteGasto = new ButtonGroup();
	private ButtonGroup alquiler = new ButtonGroup();
	private ButtonGroup trabajo = new ButtonGroup();
	private ButtonGroup vehiculo = new ButtonGroup();
	JButton btnCrearInforme;
	JRadioButton rdbtnMasculino,rdbtnFemenino,rdbtnSiComparte,rdbtnNoComparte,rdbtnSiAlquiler,rdbtnNoAlquiler,rdbtnSiVehiculo,rdbtnNoVehiculo,rdbtnSiTrabajo,rdbtnNoTrabajo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGUI frame = new InterfazGUI();
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
	public InterfazGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 561);
		panelPrincipal = new JPanel();
		panelPrincipal.setForeground(Color.BLACK);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblTitulo = new JLabel("OPES+");
		lblTitulo.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setBounds(10, 10, 83, 42);
		panelPrincipal.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 62, 54, 13);
		panelPrincipal.add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(84, 59, 96, 19);
		panelPrincipal.add(tFNombre);
		tFNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 85, 45, 13);
		panelPrincipal.add(lblEdad);
		
		tFEdad = new JTextField();
		tFEdad.setBounds(84, 82, 96, 19);
		panelPrincipal.add(tFEdad);
		tFEdad.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 108, 45, 13);
		panelPrincipal.add(lblSexo);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(48, 104, 93, 21);
		panelPrincipal.add(rdbtnMasculino);
		
		rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(145, 104, 103, 21);
		panelPrincipal.add(rdbtnFemenino);
		
		mf.add(rdbtnFemenino);
		mf.add(rdbtnMasculino);
		
		JLabel lblDpi = new JLabel("DPI:");
		lblDpi.setBounds(10, 131, 45, 13);
		panelPrincipal.add(lblDpi);
		
		tFDpi = new JTextField();
		tFDpi.setBounds(58, 128, 96, 19);
		panelPrincipal.add(tFDpi);
		tFDpi.setColumns(10);
		
		JLabel lblAcompañantes = new JLabel("Habitantes en tu vivienda:");
		lblAcompañantes.setBounds(10, 163, 186, 13);
		panelPrincipal.add(lblAcompañantes);
		
		tFHabitantes = new JTextField();
		tFHabitantes.setBounds(10, 179, 96, 19);
		panelPrincipal.add(tFHabitantes);
		tFHabitantes.setColumns(10);
		
		JLabel lblGastoCompartido = new JLabel("¿Comparte gastos?");
		lblGastoCompartido.setBounds(19, 207, 122, 13);
		panelPrincipal.add(lblGastoCompartido);
		
		tFDineroAportado = new JTextField();
		tFDineroAportado.setBounds(169, 226, 96, 19);
		panelPrincipal.add(tFDineroAportado);
		tFDineroAportado.setColumns(10);
		
		rdbtnSiComparte = new JRadioButton("Sí");
		rdbtnSiComparte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tFDineroAportado.setText("");
				tFDineroAportado.setEnabled(true);
			}
		});
		rdbtnSiComparte.setBounds(135, 203, 61, 21);
		panelPrincipal.add(rdbtnSiComparte);
		
		rdbtnNoComparte = new JRadioButton("No");
		rdbtnNoComparte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tFDineroAportado.setText("0");
				tFDineroAportado.setEnabled(false);
			}
		});
		rdbtnNoComparte.setBounds(198, 203, 103, 21);
		panelPrincipal.add(rdbtnNoComparte);
		
		comparteGasto.add(rdbtnNoComparte);
		comparteGasto.add(rdbtnSiComparte);
		
		JLabel lblDineroAportado = new JLabel("Dinero aportado (ajeno):");
		lblDineroAportado.setBounds(10, 229, 152, 13);
		panelPrincipal.add(lblDineroAportado);
		
		JLabel lblAlimentacion = new JLabel("Gastos en alimentación: ");
		lblAlimentacion.setBounds(307, 299, 170, 13);
		panelPrincipal.add(lblAlimentacion);
		
		tFAlimentos = new JTextField();
		tFAlimentos.setBounds(465, 296, 96, 19);
		panelPrincipal.add(tFAlimentos);
		tFAlimentos.setColumns(10);
		
		JLabel lblAlquiler = new JLabel("¿Su vivienda es de alquiler?");
		lblAlquiler.setBounds(10, 268, 170, 13);
		panelPrincipal.add(lblAlquiler);
		
		rdbtnSiAlquiler = new JRadioButton("Sí");
		rdbtnSiAlquiler.setBounds(186, 264, 62, 21);
		panelPrincipal.add(rdbtnSiAlquiler);
		
		JRadioButton rdbtnNoAlquiler = new JRadioButton("No");
		rdbtnNoAlquiler.setBounds(246, 264, 54, 21);
		panelPrincipal.add(rdbtnNoAlquiler);
		
		alquiler.add(rdbtnNoAlquiler);
		alquiler.add(rdbtnSiAlquiler);
		
		JLabel lblGastoDomicilio = new JLabel("Gasto en domicilio:");
		lblGastoDomicilio.setBounds(10, 290, 131, 13);
		panelPrincipal.add(lblGastoDomicilio);
		
		tFDomicilio = new JTextField();
		tFDomicilio.setBounds(135, 287, 96, 19);
		panelPrincipal.add(tFDomicilio);
		tFDomicilio.setColumns(10);
		
		JLabel lblTrabajo = new JLabel("¿Tiene trabajo?");
		lblTrabajo.setBounds(10, 322, 96, 13);
		panelPrincipal.add(lblTrabajo);
		
		tFSalario = new JTextField();
		tFSalario.setBounds(122, 351, 96, 19);
		panelPrincipal.add(tFSalario);
		tFSalario.setColumns(10);
		
		rdbtnSiTrabajo = new JRadioButton("Sí");
		rdbtnSiTrabajo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tFSalario.setText("");
				tFSalario.setEnabled(true);
			}
		});
		rdbtnSiTrabajo.setBounds(116, 318, 61, 21);
		panelPrincipal.add(rdbtnSiTrabajo);
		
		rdbtnNoTrabajo = new JRadioButton("No");
		rdbtnNoTrabajo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tFSalario.setText("0");
				tFSalario.setEnabled(false);
			}
		});
		rdbtnNoTrabajo.setBounds(179, 318, 103, 21);
		panelPrincipal.add(rdbtnNoTrabajo);
		
		trabajo.add(rdbtnNoTrabajo);
		trabajo.add(rdbtnSiTrabajo);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(48, 354, 45, 13);
		panelPrincipal.add(lblSalario);
		
		JLabel lblVehiculo = new JLabel("¿Tiene vehículo propio?");
		lblVehiculo.setBounds(306, 62, 131, 13);
		panelPrincipal.add(lblVehiculo);
		
		tFMarca = new JTextField();
		tFMarca.setBounds(420, 82, 96, 19);
		panelPrincipal.add(tFMarca);
		tFMarca.setColumns(10);
		
		tFModelo = new JTextField();
		tFModelo.setBounds(420, 105, 96, 19);
		panelPrincipal.add(tFModelo);
		tFModelo.setColumns(10);
		
		tFLinea = new JTextField();
		tFLinea.setBounds(420, 128, 96, 19);
		panelPrincipal.add(tFLinea);
		tFLinea.setColumns(10);
		
		tFGasolina = new JTextField();
		tFGasolina.setBounds(465, 151, 96, 19);
		panelPrincipal.add(tFGasolina);
		tFGasolina.setColumns(10);
		
		rdbtnSiVehiculo = new JRadioButton("Sí");
		rdbtnSiVehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tFMarca.setEnabled(true);
				tFModelo.setEnabled(true);
				tFLinea.setEnabled(true);
				tFGasolina.setEnabled(true);
			}
		});
		rdbtnSiVehiculo.setBounds(450, 58, 71, 21);
		panelPrincipal.add(rdbtnSiVehiculo);
		
		rdbtnNoVehiculo = new JRadioButton("No");
		rdbtnNoVehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tFMarca.setText("N/A");
				tFMarca.setEnabled(false);
				tFModelo.setText("N/A");
				tFModelo.setEnabled(false);
				tFLinea.setText("N/A");
				tFLinea.setEnabled(false);
				tFGasolina.setText("0");
				tFGasolina.setEnabled(false);
			}
		});
		rdbtnNoVehiculo.setBounds(523, 58, 103, 21);
		panelPrincipal.add(rdbtnNoVehiculo);
		
		vehiculo.add(rdbtnNoVehiculo);
		vehiculo.add(rdbtnSiVehiculo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(356, 85, 54, 13);
		panelPrincipal.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(356, 108, 54, 13);
		panelPrincipal.add(lblModelo);
		
		JLabel lblLinea = new JLabel("Línea:");
		lblLinea.setBounds(356, 131, 45, 13);
		panelPrincipal.add(lblLinea);
		
		JLabel lblGasolina = new JLabel("Gasto en gasolina:");
		lblGasolina.setBounds(356, 154, 121, 13);
		panelPrincipal.add(lblGasolina);
		
		tFGasolina = new JTextField();
		tFGasolina.setBounds(465, 151, 96, 19);
		panelPrincipal.add(tFGasolina);
		tFGasolina.setColumns(10);
		
		JLabel lblEducacion = new JLabel("Gasto en educación:");
		lblEducacion.setBounds(332, 207, 123, 13);
		panelPrincipal.add(lblEducacion);
		
		tFEducacion = new JTextField();
		tFEducacion.setBounds(465, 204, 96, 19);
		panelPrincipal.add(tFEducacion);
		tFEducacion.setColumns(10);
		
		JLabel lblGastoConsulta = new JLabel("Gasto en consulta médica: ");
		lblGastoConsulta.setBounds(294, 229, 170, 13);
		panelPrincipal.add(lblGastoConsulta);
		
		tFConsulta = new JTextField();
		tFConsulta.setBounds(465, 226, 96, 19);
		panelPrincipal.add(tFConsulta);
		tFConsulta.setColumns(10);
		
		JLabel lblMedicina = new JLabel("Gasto en medicina:");
		lblMedicina.setBounds(332, 250, 124, 13);
		panelPrincipal.add(lblMedicina);
		
		tFMedicina = new JTextField();
		tFMedicina.setBounds(465, 247, 96, 19);
		panelPrincipal.add(tFMedicina);
		tFMedicina.setColumns(10);
		
		JLabel lblOcio = new JLabel("Gasto en ocio:");
		lblOcio.setBounds(360, 268, 95, 13);
		panelPrincipal.add(lblOcio);
		
		tFOcio = new JTextField();
		tFOcio.setBounds(465, 270, 96, 19);
		panelPrincipal.add(tFOcio);
		tFOcio.setColumns(10);
		
		JLabel lblHigiene = new JLabel("Gasto en higiene:");
		lblHigiene.setBounds(346, 322, 131, 13);
		panelPrincipal.add(lblHigiene);
		
		tFHigiene = new JTextField();
		tFHigiene.setBounds(465, 319, 96, 19);
		panelPrincipal.add(tFHigiene);
		tFHigiene.setColumns(10);
		
		JLabel lblTransporte = new JLabel("Gasto en transporte:");
		lblTransporte.setBounds(332, 343, 152, 13);
		panelPrincipal.add(lblTransporte);
		
		tFTransporte = new JTextField();
		tFTransporte.setBounds(465, 340, 96, 19);
		panelPrincipal.add(tFTransporte);
		tFTransporte.setColumns(10);
		
		btnCrearInforme = new JButton("Generar Informe");
		btnCrearInforme.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnCrearInforme.setBounds(275, 405, 162, 31);
		btnCrearInforme.addActionListener(this);
		panelPrincipal.add(btnCrearInforme);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCrearInforme == e.getSource() ) {
			try {
				String nombre = tFNombre.getText();
				int edad = Integer.parseInt(tFEdad.getText());
				String sexo = validarSexo();
				long dpi = Long.parseLong(tFDpi.getText());
				int habitantes = Integer.parseInt(tFHabitantes.getText());
				boolean gastoCompartido = gastoCompartir();
				double aporteDin = Float.parseFloat(tFDineroAportado.getText());
				double alimentacion = Float.parseFloat(tFAlimentos.getText());
				boolean alquiler = existenciaAlquiler();
				double domicilio = Float.parseFloat(tFDomicilio.getText());
				boolean trabajo = verificarTrabajo();
				double salario = Float.parseFloat(tFSalario.getText());
				boolean vehiculo = verificarVehiculo();
				String marca = tFMarca.getText();
				String modelo = tFModelo.getText();
				String linea = tFLinea.getText();
				double gasolina = Float.parseFloat(tFTransporte.getText());
				double educacion = Float.parseFloat(tFEducacion.getText());
				double consultaMedica = Float.parseFloat(tFConsulta.getText());
				double medicina = Float.parseFloat(tFMedicina.getText());
				double ocio = Float.parseFloat(tFOcio.getText());
				double higiene = Float.parseFloat(tFHigiene.getText());
				double transporte = Float.parseFloat(tFTransporte.getText());
				String informe = comparador.crearInforme(nombre, edad, sexo, dpi, habitantes, gastoCompartido, aporteDin, alimentacion, alquiler, domicilio, trabajo, salario, vehiculo, marca, modelo, linea, gasolina, educacion, consultaMedica, medicina, ocio, higiene, transporte);
				JOptionPane.showMessageDialog(null, "Informe de usuario: " + informe);
				
				
				con = new Conectar();
				Connection reg = con.getConnection();
							
				
				try {
					
					String query = "INSERT INTO usuario values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = reg.prepareStatement(query);
					pst.setString(1, nombre);
					pst.setInt(2, edad);
					pst.setLong(3, dpi);
					pst.setInt(4, habitantes);
					pst.setDouble(5, aporteDin);
					pst.setDouble(6, alimentacion);
					pst.setDouble(7, domicilio);
					pst.setDouble(8, salario);
					pst.setString(9, marca);
					pst.setString(10, modelo);
					pst.setString(11, linea);
					pst.setDouble(12, gasolina);
					pst.setDouble(13, educacion);
					pst.setDouble(14, consultaMedica);
					pst.setDouble(15, medicina);
					pst.setDouble(16, ocio);
					pst.setDouble(17, higiene);
					pst.setDouble(18, transporte);
					
					pst.executeUpdate();
					
					System.out.println("Registro exitoso..");
					
					pst.close();
					
				}catch(Exception e1) {
					System.out.println("Error en el registro.. "+e1);
				}
								
			} catch (Exception o) {
				JOptionPane.showMessageDialog(null, "Debe de llenar todas las casillas");
			}
		}
		
	}
	
	
	
	private boolean verificarVehiculo() {
		boolean vehiculo = false;
		if (rdbtnSiVehiculo.isSelected()) {
			vehiculo = true;
		}
		return vehiculo;
	}
	private boolean verificarTrabajo() {
		boolean trabajo = false;
		if (rdbtnSiTrabajo.isSelected()) {
			trabajo = true;
		}
		return trabajo;
	}
	private String validarSexo() {
		String sexo = "";
		
		if (rdbtnMasculino.isSelected()) {
			sexo = "masculino";
		} 
		if (rdbtnFemenino.isSelected()) {
			sexo = "femenino";
		}
		return sexo;
	}
	
	private boolean gastoCompartir() {
		boolean compartido = false;
		if (rdbtnSiComparte.isSelected()) {
			compartido = true;
		}
		return compartido;
	}
	
	private boolean existenciaAlquiler() {
		boolean alquiler = false;
		if (rdbtnSiAlquiler.isSelected()) {
			alquiler = true;
		}
		return alquiler;
	}
}