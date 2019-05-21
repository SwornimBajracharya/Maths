package maths;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.beans.PropertyVetoException;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Circle extends JInternalFrame {
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblArea;
	private JTextField aField;
	private JLabel lblRadius;
	private JTextField rField;
	private JLabel lblCircumference;
	private JTextField cField;
	private JRadioButton rdbtnRadius;
	private JRadioButton rdbtnCircumference;
	private JRadioButton rdbtnArea;
	private JTextField radiusField;
	private JTextField circumField;
	private JTextField areaField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnCalculate;
	private JButton btnClear;
	static double pi = 3.14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circle frame = new Circle();
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
	public Circle() {
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Circle");
		setBounds(100, 100, 540, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getPanel_1());

	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(6, 6, 516, 97);
			panel.setLayout(null);
			panel.add(getRdbtnRadius());
			panel.add(getRdbtnCircumference());
			panel.add(getRdbtnArea());
			panel.add(getRadiusField());
			panel.add(getCircumField());
			panel.add(getAreaField());
			panel.add(getBtnCalculate());
			panel.add(getBtnClear());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Result", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(6, 115, 516, 148);
			panel_1.setLayout(null);
			panel_1.add(getLblRadius());
			panel_1.add(getRField());
			panel_1.add(getLblArea());
			panel_1.add(getAField());
			panel_1.add(getLblCircumference());
			panel_1.add(getCField());
		}
		return panel_1;
	}
	private JLabel getLblArea() {
		if (lblArea == null) {
			lblArea = new JLabel("Area: ");
			lblArea.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblArea.setBounds(19, 60, 66, 24);
		}
		return lblArea;
	}
	private JTextField getAField() {
		if (aField == null) {
			aField = new JTextField();
			aField.setEnabled(false);
			aField.setFont(new Font("Dialog", Font.PLAIN, 18));
			aField.setBounds(162, 58, 194, 28);
			aField.setColumns(25);
		}
		return aField;
	}
	private JLabel getLblRadius() {
		if (lblRadius == null) {
			lblRadius = new JLabel("Radius: ");
			lblRadius.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblRadius.setBounds(19, 28, 84, 24);
		}
		return lblRadius;
	}
	private JTextField getRField() {
		if (rField == null) {
			rField = new JTextField();
			rField.setEnabled(false);
			rField.setFont(new Font("Dialog", Font.PLAIN, 18));
			rField.setBounds(162, 26, 194, 28);
			rField.setColumns(25);
		}
		return rField;
	}
	private JLabel getLblCircumference() {
		if (lblCircumference == null) {
			lblCircumference = new JLabel("Circumference: ");
			lblCircumference.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblCircumference.setBounds(19, 88, 136, 24);
		}
		return lblCircumference;
	}
	private JTextField getCField() {
		if (cField == null) {
			cField = new JTextField();
			cField.setEnabled(false);
			cField.setFont(new Font("Dialog", Font.PLAIN, 18));
			cField.setBounds(162, 90, 194, 28);
			cField.setColumns(25);
		}
		return cField;
	}
	private JRadioButton getRdbtnRadius() {
		if (rdbtnRadius == null) {
			rdbtnRadius = new JRadioButton("Radius: ");
			rdbtnRadius.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					radiusField.setEnabled(true);
					circumField.setEnabled(false);
					areaField.setEnabled(false);

					rdbtnCircumference.setSelected(false);
					rdbtnRadius.setSelected(true);
					rdbtnArea.setSelected(false);
					
					circumField.setText("");
					areaField.setText("");
				}
			});
			buttonGroup.add(rdbtnRadius);
			rdbtnRadius.setBounds(6, 6, 115, 18);
		}
		return rdbtnRadius;
	}
	private JRadioButton getRdbtnCircumference() {
		if (rdbtnCircumference == null) {
			rdbtnCircumference = new JRadioButton("Circumference: ");
			rdbtnCircumference.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					radiusField.setEnabled(false);
					circumField.setEnabled(true);
					areaField.setEnabled(false);
					
					rdbtnCircumference.setSelected(true);
					rdbtnRadius.setSelected(false);
					rdbtnArea.setSelected(false);
					
					radiusField.setText("");
					areaField.setText("");
				}
			});
			buttonGroup.add(rdbtnCircumference);
			rdbtnCircumference.setBounds(6, 36, 115, 18);
		}
		return rdbtnCircumference;
	}
	private JRadioButton getRdbtnArea() {
		if (rdbtnArea == null) {
			rdbtnArea = new JRadioButton("Area: ");
			rdbtnArea.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					radiusField.setEnabled(false);
					circumField.setEnabled(false);
					areaField.setEnabled(true);
					
					rdbtnCircumference.setSelected(false);
					rdbtnRadius.setSelected(false);
					rdbtnArea.setSelected(true);
					
					radiusField.setText("");
					circumField.setText("");
					
				}
			});
			buttonGroup.add(rdbtnArea);
			rdbtnArea.setBounds(6, 66, 115, 18);
		}
		return rdbtnArea;
	}
	private JTextField getRadiusField() {
		if (radiusField == null) {
			radiusField = new JTextField();
			radiusField.setEnabled(false);
			radiusField.setBounds(133, 1, 122, 28);
			radiusField.setColumns(10);
		}
		return radiusField;
	}
	private JTextField getCircumField() {
		if (circumField == null) {
			circumField = new JTextField();
			circumField.setEnabled(false);
			circumField.setBounds(133, 31, 122, 28);
			circumField.setColumns(10);
		}
		return circumField;
	}
	private JTextField getAreaField() {
		if (areaField == null) {
			areaField = new JTextField();
			areaField.setEnabled(false);
			areaField.setBounds(133, 61, 122, 28);
			areaField.setColumns(10);
		}
		return areaField;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double area, radius, circum;
					if (rdbtnArea.isSelected()) {
						area = Double.parseDouble(areaField.getText());

						radius = Math.sqrt (area * (1/pi));
						circum = 2 * pi * radius;
						
						aField.setText(String.valueOf(area));
						cField.setText(String.valueOf(circum));
						rField.setText(String.valueOf(radius));
					}
					
					if (rdbtnCircumference.isSelected()) {
						circum = Double.parseDouble(circumField.getText());
						
						radius = (circum * (1/pi))/2;
						area = pi * radius * radius;
						
						aField.setText(String.valueOf(area));
						cField.setText(String.valueOf(circum));
						rField.setText(String.valueOf(radius));
					}
					
					if (rdbtnRadius.isSelected()){
						radius = Double.parseDouble(radiusField.getText());

						circum = 2 * pi * radius;
						area = pi * radius * radius;
						
						aField.setText(String.valueOf(area));
						cField.setText(String.valueOf(circum));
						rField.setText(String.valueOf(radius));
					}
				}
			});
			btnCalculate.setBounds(420, 61, 90, 28);
			
		}
		return btnCalculate;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					radiusField.setText("");
					circumField.setText("");
					areaField.setText("");
					
					rField.setText("");
					cField.setText("");
					aField.setText("");
					
				}
			});
			btnClear.setBounds(420, 18, 90, 28);
		}
		return btnClear;
	}
}
