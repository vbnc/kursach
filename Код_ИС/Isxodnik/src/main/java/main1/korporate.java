/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package main1;

/**
*����������� �����, ������� ��������� ���� �� �����,��������, ��������, ��������� � ����������� �������  
*/
import java.awt.BorderLayout; 
/**
*����������� ����� ��� ������� ����� �� ������ ������� 
*/
import java.awt.EventQueue; 
import Calc.korporateCalc; // ����������� �����, ������� ������������ ����������� �����


/**
*����������� ����� ��� �������� ������ 
*/
import javax.swing.JFrame; 
/**
*����������� ����� ��� �������� ������ 
*/
import javax.swing.JPanel; 
/**
*����������� ����� ��� �������� ������ �����, ������� ��������� ������� ������� ������ ������ 
*/
import javax.swing.border.EmptyBorder; 

/**
*����������� ����� ��� ���������� ���� � ������������ ���������� ������ 
*/
import javax.swing.JTextArea; 
/**
* ����������� ����� ��� ������������� ������ 
*/
import javax.swing.JLabel; 
/**
* ����������� ����� ���  ���������� ���� 
*/
import javax.swing.JTextField; 
/**
* ����������� ����� ��� ����������� ������ � ���� ������ 
*/
import javax.swing.JList; 
/**
* ����������� ����� ����������� ������ 
*/
import javax.swing.JComboBox; 
 /**
*����������� ����� �������� �� ��������� ��� ����������� ������ 
*/
import javax.swing.DefaultComboBoxModel;
/**
* ����������� ����� ��� ���-����� 
*/
import javax.swing.JRadioButton; 
/**
* ����������� ����� ��� ������ 
*/
import javax.swing.JButton; 
/**
* ����������� ����� ������� 
*/
import java.awt.Font; 
/**
* ����������� ����� ��� ��������� ������� �� ������ 
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� 
*/
import java.awt.event.ActionEvent; 
/**
* ����������� ����� ��������� ����� 
*/
import java.awt.TextField; 
/**
* ����������� ����� ��������� ������� 
*/
import javax.swing.JTextPane; 
/**
* ����������� ����� ������ 
*/
import java.awt.Button; 
/**
* ����������� ����� ������� ����� 
*/
import java.awt.Color; 
/**
* ����������� ����� ������� ���������� ����� 
*/
import java.awt.SystemColor; 
/**
* ����������� ����� � ���������� 
*/
import javax.swing.SwingConstants; 
/**
* ����������� ����� ��������������� ����� 
*/
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;  

public class korporate extends JFrame {
	/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField_1; 
	/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField_2; 
	private JTextField textField;

	public korporate() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ��������� ��� ������ 
*/
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432 \u0434\u043B\u044F \u044E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0445 \u043B\u0438\u0446");
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� ����� 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ��������� ���������� 
*/
		setBounds(100, 100, 877, 583);
	/**
*  ������������� �������� ���������� 
*/
		getContentPane().setLayout(null);  
		
		/**
* ����� ����� 
*/
		JButton btnNewButton_1 = new JButton("\u041E\u043A"); 
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
*����� �� �������� ���� 
*/
				setVisible(false); 
			}
		});
		/**
* ��������� ���������� 
*/
		btnNewButton_1.setBounds(335, 487, 89, 34);
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(btnNewButton_1); 
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane = new JTextPane();  
		/**
* ����� ����� ��� ������� 
*/
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/**
* ����� ���� 
*/
		textPane.setBackground(SystemColor.control); 
		/**
* ����� ����� 
*/
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432 \u0434\u043B\u044F \u044E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0445 \u043B\u0438\u0446"); 
		/**
* ����� ���������� 
*/
		textPane.setBounds(10, 11, 749, 43); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_1 = new JTextPane();  
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ���� 
*/
		textPane_1.setBackground(SystemColor.control); 
		/**
* ����� ����� 
*/
		textPane_1.setText("\u0420\u0435\u0436\u0438\u043C \u043A\u043E\u043C\u043F\u0440\u0435\u0441\u0441\u0438\u0438"); 
		/**
* ����� ���������� 
*/
		textPane_1.setBounds(10, 98, 180, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_1);
		
		/**
* ������ ���������� ������ 
*/
		final JComboBox comboBox_1 = new JComboBox(); 
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����������� �������� ��� ������������ 
*/
		comboBox_1.setEditable(true); 
		/**
* ����� �������� ��� ����������� ������ 
*/
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"GSM 0610", "G.711 (\u041C\u044E-\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435)", "G.711 (\u0410-\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435)", "PCMGSM 0610"})); 
		/**
* ����� ���������� 
*/
		comboBox_1.setBounds(221, 98, 328, 31); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(comboBox_1); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textPane_3.setText("\u0414\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u0430 (\u0447)"); 
		/**
* ����� ���� 
*/
		textPane_3.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_3.setBounds(10, 145, 164, 51); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_3); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_4 = new JTextPane(); 
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textPane_4.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0444\u0430\u0439\u043B\u043E\u0432 (\u0434\u043D\u0435\u0439)"); 
		/**
* ����� ���� 
*/
		textPane_4.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_4.setBounds(10, 209, 180, 56); 
		 /**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_4);
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_6 = new JTextPane(); 
		textPane_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textPane_6.setText("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u043B\u0438\u043D\u0438\u0439"); 
		/**
* ����� ���� 
*/
		textPane_6.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_6.setBounds(10, 278, 185, 51); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_6); 
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_7 = new JTextPane(); 
		/**
* ����� ����� 
*/
		textPane_7.setText("\u041D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u044B\u0439 \u0440\u0430\u0437\u043C\u0435\u0440 \u043C\u0435\u0441\u0442\u0430 \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F"); 
		/**
* ����� ����� ��� ������ 
*/
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
		/**
* ����� ���� 
*/
		textPane_7.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_7.setBounds(10, 428, 375, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_7); 
		
		/**
* ������ ���� ��� ������ ���������� 
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ��������� ��� �������������� 
*/
		formattedTextField.setEditable(false); 
		 /**
* ����� ����� 
*/
		formattedTextField.setText("1169");
		/**
* ����� ���������� 
*/
		formattedTextField.setBounds(449, 424, 75, 38); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(formattedTextField); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_8 = new JTextPane(); 
		/**
* ����� ����� 
*/
		textPane_8.setText("\u0413\u0411");
		/**
* ����� ����� ��� ������ 
*/
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
		/**
* ����� ���� 
*/
		textPane_8.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_8.setBounds(536, 428, 75, 30); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_8); 
		/**
* ����� ����� 
*/
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
*	������������� ���������� ��� �������� ������������� ������	 
*/
				double f = 0;
				/**
*	������������� ���������� ��� ������� ������ ����� 
*/
				int t = 0;
				/**
*	������������� ���������� ��� ���������� ����� 
*/
				int k = 0;
				/**
*	������������� ���������� ��� ������� �������� ���� 
*/
				int d = 0;
				/**
*	������������� ���������� ��� ���������� �������� � ������ � ����������� �� �������� ������	 
*/
				double q = 0;
				/**
*	������������� ���������� ��� ������ ��������� ���������� 
*/
				double V = 0;
				
				/**
* ��������� �������� ������ 
*/
				int quality = comboBox.getSelectedIndex();
				/**
* ��������� ������ ������ 
*/
				int Format = comboBox_1.getSelectedIndex();
			
				/**
* � ����������� �� �������� ������ ���������� ����� ������ ����� ������ 
*/
				switch(quality){ 
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 0: q = 0.1; break; 
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 1: q = 0.3; break;
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 2: q = 0.7; break;
				/**
* ���� ������� �������� �������� ������, �� ����������� ��������� �������� 
*/
					case 3: q = 0.9; break;
				/**
* ���� ������� ����� �������� ������, �� ����������� ��������� �������� 
*/
					case 4: q = 1.1; break;
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 5: q = 4; break;
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 6: q = 6; break; 
				}
				
				/**
* � ����������� �� ������� ������ ���������� ����������� ������ 
*/
				switch(Format){ 
				/**
* ���� ������ ������ ������ ������ �� ����������� ��������� ����������� 
*/
				case 0: f = 0.9; break;
				/**
* ���� ������ ������ ������ ������ �� ����������� ��������� ����������� 
*/
				case 1: f = 0.8; break; 
				/**
* ���� ������ ������ ������ ������ �� ����������� ��������� ����������� 
*/
				case 2: f = 0.5; break;
				/**
* ���� ������ �������� ������ ������ �� ����������� ��������� ����������� 
*/
				case 3: f = 0.03; break; 
			}
				/**
* ����� ���������� ��� ������� ������ ����� 
*/
				t = Integer.parseInt(textField.getText());
				/**
* ����� ���������� ��� ���������� ����� 
*/
				k = Integer.parseInt(textField_1.getText());
				/**
* ����� ���������� ��� ������� �������� ���� 
*/
				d = Integer.parseInt(textField_2.getText());
				/**
* ������� ����������� ����� ����������� 
*/
				
				/**
* ��������� �� ����� ������� ������ ����������� 
*/
				korporateCalc cc = new korporateCalc();
				
				/**
* ������� ��������� � ��������� ���� � ���������� � ������ ��� ������� ����������� 
*/
				formattedTextField.setText("" + cc.getP(t, k, d, f, q));  
			}
		});
		/**
* ����� ���������� 
*/
		button.setBounds(300, 364, 158, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(button);
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField_1 = new JTextField(); 
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textField_1.setText("14"); 
		/**
* ����� ���������� �������� 
*/
		textField_1.setColumns(10);  
		/**
* ����� ���������� 
*/
		textField_1.setBounds(221, 231, 55, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textField_1);
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField_2 = new JTextField(); 
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textField_2.setText("3"); 
		/**
* ����� ���������� �������� 
*/
		textField_2.setColumns(10);  
		/**
* ����� ���������� 
*/
		textField_2.setBounds(221, 295, 55, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textField_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u043F\u043E \u0443\u043C\u043E\u043B\u0447\u0430\u043D\u0438\u044E");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(221, 167, 164, 25);
		getContentPane().add(chckbxNewCheckBox);
		
		JLabel label = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435\r\n \u0434\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u0430");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(403, 162, 312, 34);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(727, 168, 48, 28);
		getContentPane().add(textField);
	}
}
