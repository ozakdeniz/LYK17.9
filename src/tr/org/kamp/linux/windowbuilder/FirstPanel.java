package tr.org.kamp.linux.windowbuilder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class FirstPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Create the panel.
	 */
	public FirstPanel() {
		setBackground(new Color(127, 255, 212));
		
		JLabel lblNewLabel = new JLabel("User Name");
		
		textField = new JTextField();
		textField.setBackground(new Color(64, 224, 208));
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(64, 224, 208));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Select Color");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(64, 224, 208));
		add(comboBox);
		comboBox.addItem("Seçiniz");
		comboBox.addItem("Blue");
		comboBox.addItem("Black");
		comboBox.addItem("Cyan");
		comboBox.addItem("Gray");
		comboBox.addItem("Green0");
		comboBox.addItem("Magenta");
		comboBox.addItem("Orange");
		comboBox.addItem("Pink");
		comboBox.addItem("Red");


		
		JLabel lblNewLabel_3 = new JLabel("Difficulty");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Easy");
		rdbtnNewRadioButton.setBackground(new Color(64, 224, 208));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Normal");
		rdbtnNewRadioButton_1.setBackground(new Color(64, 224, 208));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Hard");
		rdbtnNewRadioButton_2.setBackground(new Color(64, 224, 208));
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//GameLogic gameLogic = new GameLogic();//oyunu farklı proje altında tanımladığımız için hata verdi
				//gameLogic.startApplication();
			}
		});
		btnNewButton.setBackground(new Color(64, 224, 208));
		
		JButton btnNewButton_1 = new JButton("About");
		btnNewButton_1.setBackground(new Color(64, 224, 208));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_3)
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(rdbtnNewRadioButton_1)
											.addComponent(rdbtnNewRadioButton)
											.addComponent(rdbtnNewRadioButton_2)))
									.addComponent(btnNewButton))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton_1))))
					.addGap(72))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(rdbtnNewRadioButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_2)
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(30))
		);
		setLayout(groupLayout);
		
		

	}
}
