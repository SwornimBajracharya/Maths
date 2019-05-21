package maths;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Quad extends JInternalFrame {
	private JPanel panel;
	private JLabel lblFirstCoffiecient;
	private JLabel lblSecondCofficient;
	private JLabel lblThirdCofficient;
	private JTextField aField;
	private JTextField bField;
	private JTextField cField;
	private JPanel panel_1;
	private JLabel lblRoot1;
	private JLabel lblRoot2;
	private JTextField root1Field;
	private JTextField root2Field;
	private JButton btnCalculate;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quad frame = new Quad();
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
	public Quad() {
		setTitle("Quadradic Equation");
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
			panel.setBorder(new TitledBorder(null, "Enter", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(59, 59, 59)));
			panel.setBounds(6, 6, 516, 166);
			panel.setLayout(null);
			panel.add(getLblFirstCoffiecient());
			panel.add(getLblSecondCofficient());
			panel.add(getLblThirdCofficient());
			panel.add(getAField());
			panel.add(getBField());
			panel.add(getCField());
			panel.add(getBtnCalculate());
			panel.add(getBtnClear());
		}
		return panel;
	}
	private JLabel getLblFirstCoffiecient() {
		if (lblFirstCoffiecient == null) {
			lblFirstCoffiecient = new JLabel("First Cofficient: ");
			lblFirstCoffiecient.setBounds(132, 33, 115, 16);
		}
		return lblFirstCoffiecient;
	}
	private JLabel getLblSecondCofficient() {
		if (lblSecondCofficient == null) {
			lblSecondCofficient = new JLabel("Second Cofficient: ");
			lblSecondCofficient.setBounds(132, 61, 115, 16);
		}
		return lblSecondCofficient;
	}
	private JLabel getLblThirdCofficient() {
		if (lblThirdCofficient == null) {
			lblThirdCofficient = new JLabel("Third Cofficient: ");
			lblThirdCofficient.setBounds(132, 91, 115, 16);
		}
		return lblThirdCofficient;
	}
	private JTextField getAField() {
		if (aField == null) {
			aField = new JTextField();
			aField.setBounds(259, 27, 122, 28);
			aField.setColumns(10);
		}
		return aField;
	}
	private JTextField getBField() {
		if (bField == null) {
			bField = new JTextField();
			bField.setColumns(10);
			bField.setBounds(259, 55, 122, 28);
		}
		return bField;
	}
	private JTextField getCField() {
		if (cField == null) {
			cField = new JTextField();
			cField.setColumns(10);
			cField.setBounds(259, 85, 122, 28);
		}
		return cField;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Result", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_1.setBounds(6, 184, 516, 79);
			panel_1.setLayout(null);
			panel_1.add(getLblRoot1());
			panel_1.add(getLblRoot2());
			panel_1.add(getRoot1Field());
			panel_1.add(getRoot2Field());
		}
		return panel_1;
	}
	private JLabel getLblRoot1() {
		if (lblRoot1 == null) {
			lblRoot1 = new JLabel("Root1: ");
			lblRoot1.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblRoot1.setBounds(22, 34, 81, 16);
		}
		return lblRoot1;
	}
	private JLabel getLblRoot2() {
		if (lblRoot2 == null) {
			lblRoot2 = new JLabel("Root2: ");
			lblRoot2.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblRoot2.setBounds(291, 34, 71, 16);
		}
		return lblRoot2;
	}
	private JTextField getRoot1Field() {
		if (root1Field == null) {
			root1Field = new JTextField();
			root1Field.setFont(new Font("Dialog", Font.PLAIN, 18));
			root1Field.setEnabled(false);
			root1Field.setBounds(90, 28, 122, 28);
			root1Field.setColumns(10);
		}
		return root1Field;
	}
	private JTextField getRoot2Field() {
		if (root2Field == null) {
			root2Field = new JTextField();
			root2Field.setFont(new Font("Dialog", Font.PLAIN, 18));
			root2Field.setEnabled(false);
			root2Field.setColumns(10);
			root2Field.setBounds(374, 28, 122, 28);
		}
		return root2Field;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = Integer.parseInt(aField.getText());
					int b = Integer.parseInt(bField.getText());
					int c = Integer.parseInt(cField.getText());
					
					double des = b * b - 4 *a * c;
					double root1 = 0, root2 = 0;
					
					if (des == 0) {
						root1 = root2 = -b/ (2*a);	
					}
					else if(des > 0) {
						root1 = (-b + Math.sqrt(des))/ (2*a);
						root2 = (-b- Math.sqrt(des))/ (2*a);
					}
					else {
						JOptionPane.showMessageDialog(null, "No roots, des < 0");
					}
					
					root1Field.setText(String.valueOf(root1));
					root2Field.setText(String.valueOf(root2));
				}
			});
			btnCalculate.setBounds(291, 125, 90, 28);
		}
		return btnCalculate;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					aField.setText("");
					bField.setText("");
					cField.setText("");
					root1Field.setText("");
					root2Field.setText("");
				}
			});
			btnClear.setBounds(132, 125, 90, 28);
		}
		return btnClear;
	}
}
