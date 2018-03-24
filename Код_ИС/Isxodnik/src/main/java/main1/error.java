/**
* указываем на то, что класс принадлежит пакету 
*/
package main1;
/**
* Импортируем класс для создания фрейма 
*/
import javax.swing.JFrame; 
/**
* импортируем класс с формой авторизации 
*/
import main1.registration; 
/**
* Импортируем класс для кнопки 
*/
import javax.swing.JButton; 
/**
* Импортируем класс для обработки нажатий на кнопки 
*/
import java.awt.event.ActionListener; 
/**
* Импортируем класс для обработки событий 
*/
import java.awt.event.ActionEvent; 
/**
* Импортируем класс текстовых панелей 
*/
import javax.swing.JTextPane; 
/**
* Импортируем класс задания системного цвета 
*/
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel; 

public class error extends JFrame {

	public error () {
		/**
* задаём заголовок для фрейма 
*/
		setTitle("\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F\r\n");
		/**
* указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* Задаём координаты 
*/
		setBounds(100, 100, 477, 270); 
		/**
*  устанавливаем менеджер компоновки 
*/
		getContentPane().setLayout(null); 

		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane = new JTextPane(); 
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* задаём цвет 
*/
		textPane.setBackground(SystemColor.control); 
		/**
* задаём текст 
*/
		textPane.setText("\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C \u0441 \u0443\u043A\u0430\u0437\u0430\u043D\u043D\u044B\u043C \u0412\u0430\u043C\u0438 \u043B\u043E\u0433\u0438\u043D\u043E\u043C/\u043F\u0430\u0440\u043E\u043B\u0435\u043C \u043D\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442!");  
		/**
* Задаём координаты 
*/
		textPane.setBounds(78, 90, 315, 56); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane); 
		
		/**
* задаём текст 
*/
		JButton button = new JButton("\u041E\u043A");  
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button.addActionListener(new ActionListener() {
		/**
* создаём событие при нажатии на кнопку 
*/
			public void actionPerformed(ActionEvent e) { 
			/**
* открываем окно с авторизацией 
*/
				registration nc = new registration(); 
				/**
* задаём видимость 
*/
				nc.setVisible(true); 
			}
		});
		/**
* Задаём координаты 
*/
		button.setBounds(197, 171, 77, 39); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(button); 
		
		JLabel lblNewLabel = new JLabel("\u0412\u043D\u0438\u043C\u0430\u043D\u0438\u0435, \u043E\u0448\u0438\u0431\u043A\u0430! ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(135, 52, 200, 25);
		getContentPane().add(lblNewLabel);
	}
}
