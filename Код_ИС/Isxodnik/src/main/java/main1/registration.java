/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package main1; 
/**
* ����������� ����� ��� ������� ����� �� ������ �������
*/
import java.awt.EventQueue; 

/**
* ����������� ����� ��� �������� ������
*/
import javax.swing.JFrame; 
/**
* ����������� ����� ��� �������� ������
*/
import javax.swing.JPanel; 
/**
* ����������� ����� ��� �������� ������ �����, ������� ��������� ������� ������� ������ ������
*/
import javax.swing.border.EmptyBorder; 
/**
* ����������� ����� � ������ �� ������
*/
import main1.error; 
/**
* ����������� ����� � �������� ���� ���������
*/
import main1.main2; 
/**
* ����������� ����� ��� ���������� ���� � ������������ ���������� ������
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
* ����������� �����-��������� ��� �������� ���������� � �������
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� �� ������
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
* ����������� ����� ������� ���������� �����
*/
import java.awt.SystemColor; 
/**
* ����������� ����� ������
*/
import javax.swing.JEditorPane; 
/**
* ����������� ����� ������� �����
*/
import java.awt.Color; 
/**
* ����������� ����� ��������������� �����
*/
import javax.swing.JFormattedTextField;
import javax.swing.JMenuItem; 

public class registration extends JFrame {
	/**
* ������ �����, ������� ����� �����������
*/
	public static void main(String[] args) { 
		/**
* ��������� ����� �� ������� �������
*/
		EventQueue.invokeLater(new Runnable() { 
		 /**
* ������
*/
			public void run() {
			
				try {
				/**
* ������ ���������� ��� ����� �����������
*/
					registration frame = new registration(); 
					/**
* ����� ��������� ��� ������
*/
					frame.setVisible(true); 
				/**
* �������� �� ����������
*/
				} catch (Exception e) { 
				/**
* ���������� ����������� �����
*/
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
**
	 * Create the frame.
	 
*/
	public registration () {
		/**
* ����� ��������� ��� ������
*/
		setTitle("\u041E\u043A\u043D\u043E \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u0438 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� �����
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ����� ���������� � ������� ������. � ������ ������ ����������: 100 �� � � 100 �� � ���������� ����� ����� ������� ����� ����������; 450 �������� - ������ 273 ������
*/
		setBounds(100, 100, 513, 361);  
		/**
*  ������������� �������� ����������
*/
		getContentPane().setLayout(null); 
		
		/**
* ������ ��������� ������
*/
		JTextPane textPane = new JTextPane(); 
		textPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		/**
* ����� ����
*/
		textPane.setBackground(SystemColor.control); 
		/**
* ����� �����
*/
		textPane.setText("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F:"); 
		/**
* ����� ����������
*/
		textPane.setBounds(135, 22, 216, 31); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(textPane);
		
		 /**
* ������ ��������� ������
*/
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		/**
* ����� ����
*/
		textPane_2.setBackground(SystemColor.control); 
		/**
* ����� �����
*/
		textPane_2.setText("\u041B\u043E\u0433\u0438\u043D"); 
		/**
* ����� ����������
*/
		textPane_2.setBounds(63, 102, 101, 30); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(textPane_2); 
		
		/**
* ������ ��������� ������
*/
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		/**
* ����� �����
*/
		textPane_3.setText("\u041F\u0430\u0440\u043E\u043B\u044C"); 
		/**
* ����� ����
*/
		textPane_3.setBackground(SystemColor.menu);
		/**
* ����� ����������
*/
		textPane_3.setBounds(63, 174, 97, 36); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(textPane_3); 
		
		/**
* ������ ���� ��� ����� ������
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		/**
* ����� ����������
*/
		formattedTextField.setBounds(377, 69, 106, 20); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(formattedTextField);
		
		/**
* ������ ���� ��� ����� ������
*/
		final JFormattedTextField formattedTextField_1 = new JFormattedTextField(); 
		formattedTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����������
*/
		formattedTextField_1.setBounds(253, 182, 102, 28); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(formattedTextField_1); 
		/**
* ������ ������ ��� �����������
*/
		JButton btnNewButton_1 = new JButton("\u0412\u0445\u043E\u0434"); 
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ������ ������� �� ������
*/
		btnNewButton_1.addActionListener(new ActionListener() { 
		
			public void actionPerformed(ActionEvent e) {
			/**
* ����� ���������� ��� ������
*/
				int L = 0; 
				/**
* ����� ���������� ��� ������
*/
				int P = 0; 
				
				/**
* ��������� �����
*/
				L=Integer.parseInt(formattedTextField.getText()); 
				/**
* 	��������� ������
*/
				P=Integer.parseInt(formattedTextField_1.getText());	
						/**
* �������� �������� ������ � ������
*  
*/
				
				
				
				if ((L == 1) && (P == 1)){ 
				/**
* � ������ ����������, ��������� ���� � �������� ���� ���������
*/
					main2 nc = new main2(); 
					/**
* ����� ���������
*/
					nc.setVisible(true); 
				
				}else{
				/**
* ���� ����� ������ ��������, �� ����� ��������� �� ������
*/
					error bc = new error(); 
				/**
* ����� ���������
*/
					bc.setVisible(true);  
				}
				
			}
		});
		/**
* ����� ����������
*/
		btnNewButton_1.setBounds(103, 278, 89, 23); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(btnNewButton_1); 
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0410\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440", "\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E", "\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E"}));
		comboBox.setToolTipText("\r\n");
		comboBox.setBounds(253, 102, 192, 30);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("\u0412\u044B\u0445\u043E\u0434");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
				*����� �� �������� ���� 
				*/
								setVisible(false); 
			}
		});
		btnNewButton.setBounds(295, 276, 97, 25);
		getContentPane().add(btnNewButton);
	}
}
