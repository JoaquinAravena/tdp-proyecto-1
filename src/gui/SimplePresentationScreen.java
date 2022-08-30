package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEMail;
	private JTextField textFieldUrl;
	
	private JFrame frame;
	
	
	
	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
				
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setVisible(true);
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.getContentPane().add(contentPane);
		frame.setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00f3n");
		frame.setSize(new Dimension(615, 250));
		frame.setResizable(false);
		
		
		init();		
	}
	
	private void init() {
		
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 187);
		
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informaci\u00f3n del alumno", null, tabInformation, "Muestra la informaci\u00f3n declarada por el alumno");
		
		
		JLabel lblLU = new JLabel("LU");
		lblLU.setToolTipText("Numero de legajo de la libreta universitaria del alumno.");
		lblLU.setFont(lblLU.getFont().deriveFont(lblLU.getFont().getStyle() | Font.BOLD));
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(lblApellido.getFont().deriveFont(lblApellido.getFont().getStyle() | Font.BOLD));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(lblNombre.getFont().deriveFont(lblNombre.getFont().getStyle() | Font.BOLD));
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(lblEmail.getFont().deriveFont(lblEmail.getFont().getStyle() | Font.BOLD));
		
		JLabel lblGitUrl = new JLabel("GitHub URL");
		lblGitUrl.setFont(lblGitUrl.getFont().deriveFont(lblGitUrl.getFont().getStyle() | Font.BOLD));
		
		textFieldLU = new JTextField();
		textFieldLU.setEditable(false);
		textFieldLU.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldLU.setText(""+studentData.getId());
		textFieldLU.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setEditable(false);
		textFieldApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldApellido.setText(studentData.getLastName());
		textFieldApellido.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldNombre.setText(studentData.getFirstName());
		textFieldNombre.setColumns(10);
		
		textFieldEMail = new JTextField();
		textFieldEMail.setEditable(false);
		textFieldEMail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldEMail.setText(studentData.getMail());
		textFieldEMail.setColumns(10);
		
		textFieldUrl = new JTextField();
		textFieldUrl.setEditable(false);
		textFieldUrl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldUrl.setText(studentData.getGithubURL());
		textFieldUrl.setColumns(10);
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLU)
						.addComponent(lblApellido)
						.addComponent(lblNombre)
						.addComponent(lblEmail)
						.addComponent(lblGitUrl))
					.addGap(32)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldLU, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(textFieldApellido, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(textFieldEMail, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(textFieldUrl, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLU, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldEMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGitUrl, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldUrl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		String fecha = timeStamp.substring(0, 10);
		String hora = timeStamp.substring(11);
        	JLabel lblFechaHora = new JLabel("Esta ventana fue generada el "+fecha+" a las: "+hora);
        	lblFechaHora.setBounds(5, 192, 589, 14);
		lblFechaHora.setFont(lblFechaHora.getFont().deriveFont(lblFechaHora.getFont().getStyle() | Font.BOLD));
		contentPane.add(lblFechaHora);
				
		
		
		JLabel lblImg = new JLabel();
		lblImg.setBounds(457, 44, 117, 113);
		ImageIcon img = new ImageIcon(SimplePresentationScreen.class.getResource("/images/foto.jpg"));
		ImageIcon imagen = new ImageIcon(img.getImage().getScaledInstance(100, 100, DO_NOTHING_ON_CLOSE));
		lblImg.setIcon(imagen);		
		contentPane.add(lblImg);
		
	}
}
