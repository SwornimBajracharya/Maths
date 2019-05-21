package maths;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Triangle extends JInternalFrame {
	private JPanel panel;
	private JPanel panel_1;
	private JRadioButton rdbtnSides;
	private JRadioButton rdbtnHeightAndBase;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblHeight;
	private JLabel lblBase;
	private JTextField aField;
	private JTextField bField;
	private JTextField cField;
	private JTextField heightField;
	private JTextField baseField;
	private JButton btnCalculate;
	private JButton btnClear;
	private JLabel lblArea;
	private JTextField areaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangle frame = new Triangle();
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
	public Triangle() {
		setTitle("Triangle");
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 540, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getPanel_1());

	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(6, 6, 516, 170);
			panel.setLayout(null);
			panel.add(getRdbtnSides());
			panel.add(getRdbtnHeightAndBase());
			panel.add(getLblA());
			panel.add(getLblB());
			panel.add(getLblC());
			panel.add(getLblHeight());
			panel.add(getLblBase());
			panel.add(getAField());
			panel.add(getBField());
			panel.add(getCField());
			panel.add(getHeightField());
			panel.add(getBaseField());
			panel.add(getBtnCalculate());
			panel.add(getBtnClear());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Result", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(6, 178, 516, 85);
			panel_1.add(getLblArea());
			panel_1.add(getAreaField());
		}
		return panel_1;
	}
	private JRadioButton getRdbtnSides() {
		if (rdbtnSides == null) {
			rdbtnSides = new JRadioButton("Sides");
			rdbtnSides.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					aField.setEnabled(true);
					bField.setEnabled(true);
					cField.setEnabled(true);
					
					heightField.setEnabled(false);
					baseField.setEnabled(false);
				}
			});
			buttonGroup.add(rdbtnSides);
			rdbtnSides.setBounds(6, 6, 115, 18);
			
			
		}
		return rdbtnSides;
	}
	private JRadioButton getRdbtnHeightAndBase() {
		if (rdbtnHeightAndBase == null) {
			rdbtnHeightAndBase = new JRadioButton("Height and base");
			rdbtnHeightAndBase.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					heightField.setEnabled(true);
					baseField.setEnabled(true);
					
					aField.setEnabled(false);
					bField.setEnabled(false);
					cField.setEnabled(false);
				}
			});
			buttonGroup.add(rdbtnHeightAndBase);
			rdbtnHeightAndBase.setBounds(300, 6, 137, 18);
			
		}
		return rdbtnHeightAndBase;
	}
	private JLabel getLblA() {
		if (lblA == null) {
			lblA = new JLabel("a: ");
			lblA.setBounds(16, 36, 55, 16);
		}
		return lblA;
	}
	private JLabel getLblB() {
		if (lblB == null) {
			lblB = new JLabel("b: ");
			lblB.setBounds(16, 64, 55, 16);
		}
		return lblB;
	}
	private JLabel getLblC() {
		if (lblC == null) {
			lblC = new JLabel("c: ");
			lblC.setBounds(16, 93, 55, 16);
		}
		return lblC;
	}
	private JLabel getLblHeight() {
		if (lblHeight == null) {
			lblHeight = new JLabel("Height:");
			lblHeight.setBounds(310, 36, 55, 16);
		}
		return lblHeight;
	}
	private JLabel getLblBase() {
		if (lblBase == null) {
			lblBase = new JLabel("Base: ");
			lblBase.setBounds(310, 68, 55, 16);
		}
		return lblBase;
	}
	private JTextField getAField() {
		if (aField == null) {
			aField = new JTextField();
			aField.setEnabled(false);
			aField.setBounds(48, 30, 122, 28);
			aField.setColumns(10);
		}
		return aField;
	}
	private JTextField getBField() {
		if (bField == null) {
			bField = new JTextField();
			bField.setEnabled(false);
			bField.setColumns(10);
			bField.setBounds(48, 58, 122, 28);
		}
		return bField;
	}
	private JTextField getCField() {
		if (cField == null) {
			cField = new JTextField();
			cField.setEnabled(false);
			cField.setColumns(10);
			cField.setBounds(48, 87, 122, 28);
		}
		return cField;
	}
	private JTextField getHeightField() {
		if (heightField == null) {
			heightField = new JTextField();
			heightField.setEnabled(false);
			heightField.setColumns(10);
			heightField.setBounds(360, 30, 122, 28);
		}
		return heightField;
	}
	private JTextField getBaseField() {
		if (baseField == null) {
			baseField = new JTextField();
			baseField.setEnabled(false);
			baseField.setColumns(10);
			baseField.setBounds(360, 62, 122, 28);
		}
		return baseField;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (rdbtnSides.isSelected()) {
						double a = Double.parseDouble(aField.getText());
						double b = Double.parseDouble(bField.getText());
						double c = Double.parseDouble(cField.getText());
						
						double s = (a + b + c)/2;
						double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
						
						areaField.setText(String.valueOf(area));
					}
					else if (rdbtnHeightAndBase.isSelected()) {
						double base = Double.parseDouble(baseField.getText());
						double height = Double.parseDouble(heightField.getText());
						
						double area = (height * base)/2;
						
						areaField.setText(String.valueOf(area));
					}
				}
			});
			btnCalculate.setBounds(420, 136, 90, 28);
		}
		return btnCalculate;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					heightField.setText("");
					baseField.setText("");
					
					aField.setText("");
					bField.setText("");
					cField.setText("");
				}
			});
			btnClear.setBounds(300, 136, 90, 28);
		}
		return btnClear;
	}
	private JLabel getLblArea() {
		if (lblArea == null) {
			lblArea = new JLabel("Area: ");
			lblArea.setFont(new Font("SansSerif", Font.PLAIN, 19));
		}
		return lblArea;
	}
	private JTextField getAreaField() {
		if (areaField == null) {
			areaField = new JTextField();
			areaField.setEnabled(false);
			areaField.setFont(new Font("SansSerif", Font.PLAIN, 18));
			areaField.setColumns(10);
		}
		return areaField;
	}
}
