/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package main1;
/**
* ����������� ����� ��� �������� ������ 
*/
import javax.swing.JFrame; 
/**
* ����������� ����� � ������ ����������� 
*/
import main1.registration; 
/**
* ����������� ����� ��� ������ 
*/
import javax.swing.JButton; 
/**
* ����������� ����� ��� ��������� ������� �� ������ 
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� 
*/
import java.awt.event.ActionEvent; 
/**
* ����������� ����� ��������� ������� 
*/
import javax.swing.JTextPane; 
/**
* ����������� ����� ������� ���������� ����� 
*/
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel; 

public class error extends JFrame {

	public error () {
		/**
* ����� ��������� ��� ������ 
*/
		setTitle("\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F\r\n");
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� ����� 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ����� ���������� 
*/
		setBounds(100, 100, 477, 270); 
		/**
*  ������������� �������� ���������� 
*/
		getContentPane().setLayout(null); 

		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane = new JTextPane(); 
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ���� 
*/
		textPane.setBackground(SystemColor.control); 
		/**
* ����� ����� 
*/
		textPane.setText("\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C \u0441 \u0443\u043A\u0430\u0437\u0430\u043D\u043D\u044B\u043C \u0412\u0430\u043C\u0438 \u043B\u043E\u0433\u0438\u043D\u043E\u043C/\u043F\u0430\u0440\u043E\u043B\u0435\u043C \u043D\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442!");  
		/**
* ����� ���������� 
*/
		textPane.setBounds(78, 90, 315, 56); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane); 
		
		/**
* ����� ����� 
*/
		JButton button = new JButton("\u041E\u043A");  
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button.addActionListener(new ActionListener() {
		/**
* ������ ������� ��� ������� �� ������ 
*/
			public void actionPerformed(ActionEvent e) { 
			/**
* ��������� ���� � ������������ 
*/
				registration nc = new registration(); 
				/**
* ����� ��������� 
*/
				nc.setVisible(true); 
			}
		});
		/**
* ����� ���������� 
*/
		button.setBounds(197, 171, 77, 39); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(button); 
		
		JLabel lblNewLabel = new JLabel("\u0412\u043D\u0438\u043C\u0430\u043D\u0438\u0435, \u043E\u0448\u0438\u0431\u043A\u0430! ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(135, 52, 200, 25);
		getContentPane().add(lblNewLabel);
	}
}
