package maths;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VectorAS extends JInternalFrame {
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblAddition;
	private JTextField addField;
	private JLabel lblSubtraction;
	private JTextField subField;
	private JLabel lblFirstVector;
	private JLabel lblSecondVector;
	private JLabel lblFirstCoefficient;
	private JLabel lblSecondCoefficient;
	private JLabel lblThirdCoefficient;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField a1Field;
	private JTextField a2Field;
	private JTextField a3Field;
	private JTextField b1Field;
	private JTextField b2Field;
	private JTextField b3Field;
	private JButton btnCalculate;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VectorAS frame = new VectorAS();
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
	public VectorAS() {
		setTitle("Add and Subtract");
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
			panel.setBounds(6, 6, 516, 164);
			panel.setLayout(null);
			panel.add(getLblFirstVector());
			panel.add(getLblSecondVector());
			panel.add(getLblFirstCoefficient());
			panel.add(getLblSecondCoefficient());
			panel.add(getLblThirdCoefficient());
			panel.add(getLabel());
			panel.add(getLabel_1());
			panel.add(getLabel_2());
			panel.add(getA1Field());
			panel.add(getA2Field());
			panel.add(getA3Field());
			panel.add(getB1Field());
			panel.add(getB2Field());
			panel.add(getB3Field());
			panel.add(getBtnCalculate());
			panel.add(getBtnClear());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Result", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(6, 171, 516, 92);
			panel_1.setLayout(null);
			panel_1.add(getLblAddition());
			panel_1.add(getAddField());
			panel_1.add(getLblSubtraction());
			panel_1.add(getSubField());
		}
		return panel_1;
	}
	private JLabel getLblAddition() {
		if (lblAddition == null) {
			lblAddition = new JLabel("Addition: ");
			lblAddition.setFont(new Font("SansSerif", Font.PLAIN, 18));
			lblAddition.setBounds(21, 45, 90, 24);
		}
		return lblAddition;
	}
	private JTextField getAddField() {
		if (addField == null) {
			addField = new JTextField();
			addField.setEnabled(false);
			addField.setFont(new Font("SansSerif", Font.PLAIN, 18));
			addField.setBounds(99, 43, 122, 28);
			addField.setColumns(10);
		}
		return addField;
	}
	private JLabel getLblSubtraction() {
		if (lblSubtraction == null) {
			lblSubtraction = new JLabel("Subtraction: ");
			lblSubtraction.setFont(new Font("SansSerif", Font.PLAIN, 18));
			lblSubtraction.setBounds(250, 45, 122, 24);
		}
		return lblSubtraction;
	}
	private JTextField getSubField() {
		if (subField == null) {
			subField = new JTextField();
			subField.setEnabled(false);
			subField.setFont(new Font("SansSerif", Font.PLAIN, 18));
			subField.setBounds(356, 43, 122, 28);
			subField.setColumns(10);
		}
		return subField;
	}
	private JLabel getLblFirstVector() {
		if (lblFirstVector == null) {
			lblFirstVector = new JLabel("First Vector");
			lblFirstVector.setBounds(6, 6, 81, 16);
		}
		return lblFirstVector;
	}
	private JLabel getLblSecondVector() {
		if (lblSecondVector == null) {
			lblSecondVector = new JLabel("Second Vector");
			lblSecondVector.setBounds(259, 6, 92, 16);
		}
		return lblSecondVector;
	}
	private JLabel getLblFirstCoefficient() {
		if (lblFirstCoefficient == null) {
			lblFirstCoefficient = new JLabel("First Coefficient: ");
			lblFirstCoefficient.setBounds(16, 34, 122, 16);
		}
		return lblFirstCoefficient;
	}
	private JLabel getLblSecondCoefficient() {
		if (lblSecondCoefficient == null) {
			lblSecondCoefficient = new JLabel("Second Coefficient: ");
			lblSecondCoefficient.setBounds(16, 62, 122, 16);
		}
		return lblSecondCoefficient;
	}
	private JLabel getLblThirdCoefficient() {
		if (lblThirdCoefficient == null) {
			lblThirdCoefficient = new JLabel("Third Coefficient: ");
			lblThirdCoefficient.setBounds(16, 90, 122, 16);
		}
		return lblThirdCoefficient;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("First Coefficient: ");
			label.setBounds(269, 34, 116, 16);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Second Coefficient: ");
			label_1.setBounds(269, 62, 116, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Third Coefficient: ");
			label_2.setBounds(269, 90, 116, 16);
		}
		return label_2;
	}
	private JTextField getA1Field() {
		if (a1Field == null) {
			a1Field = new JTextField();
			a1Field.setBounds(135, 28, 122, 28);
			a1Field.setColumns(10);
		}
		return a1Field;
	}
	private JTextField getA2Field() {
		if (a2Field == null) {
			a2Field = new JTextField();
			a2Field.setColumns(10);
			a2Field.setBounds(135, 56, 122, 28);
		}
		return a2Field;
	}
	private JTextField getA3Field() {
		if (a3Field == null) {
			a3Field = new JTextField();
			a3Field.setColumns(10);
			a3Field.setBounds(135, 84, 122, 28);
		}
		return a3Field;
	}
	private JTextField getB1Field() {
		if (b1Field == null) {
			b1Field = new JTextField();
			b1Field.setColumns(10);
			b1Field.setBounds(388, 28, 122, 28);
		}
		return b1Field;
	}
	private JTextField getB2Field() {
		if (b2Field == null) {
			b2Field = new JTextField();
			b2Field.setColumns(10);
			b2Field.setBounds(388, 56, 122, 28);
		}
		return b2Field;
	}
	private JTextField getB3Field() {
		if (b3Field == null) {
			b3Field = new JTextField();
			b3Field.setColumns(10);
			b3Field.setBounds(388, 84, 122, 28);
		}
		return b3Field;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double a1, a2, a3, b1, b2, b3;
					
					a1 = Double.parseDouble(a1Field.getText());
					a2 = Double.parseDouble(a2Field.getText());
					a3 = Double.parseDouble(a3Field.getText());
					
					b1 = Double.parseDouble(b1Field.getText());
					b2 = Double.parseDouble(b2Field.getText());
					b3 = Double.parseDouble(b3Field.getText());
					
					addField.setText((a1 + b1) + ", " + (a2 + b2) + ", " + (a3 + b3));
					subField.setText((a1 - b1) + ", " + (a2 - b2) + ", " + (a3 - b3));
					
				}
			});
			btnCalculate.setBounds(420, 130, 90, 28);
		}
		return btnCalculate;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					a1Field.setText("");
					a2Field.setText("");
					a3Field.setText("");
					
					b1Field.setText("");
					b2Field.setText("");
					b3Field.setText("");
					
					addField.setText("");
					subField.setText("");
					
				}
			});
			btnClear.setBounds(318, 130, 90, 28);
		}
		return btnClear;
	}
}
