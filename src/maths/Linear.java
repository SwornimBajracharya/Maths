package maths;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Linear extends JInternalFrame {
	private JLabel lblFirstEquation;
	private JLabel lblXcoffiecient;
	private JLabel lblYcoffiecient;
	private JLabel lblZcoffiecient;
	private JLabel lblSecondEquation;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField pField;
	private JTextField qField;
	private JTextField rField;
	private JLabel lblConstant;
	private JTextField sField;
	private JLabel label;
	private JTextField p1Field;
	private JTextField q1Field;
	private JTextField r1Field;
	private JTextField s1Field;
	private JLabel lblThirdEquation;
	private JLabel label_5;
	private JTextField p2Field;
	private JLabel label_6;
	private JTextField q2Field;
	private JLabel label_7;
	private JTextField r2Field;
	private JLabel label_8;
	private JTextField s2Field;
	private JPanel panel;
	private JButton btnCalculate;
	private JButton btnClear;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblZ;
	private JTextField xField;
	private JTextField yField;
	private JTextField zField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Linear frame = new Linear();
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
	public Linear() {
		setTitle("Linear Equations");
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 540, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblFirstEquation());
		getContentPane().add(getLblXcoffiecient());
		getContentPane().add(getLblYcoffiecient());
		getContentPane().add(getLblZcoffiecient());
		getContentPane().add(getLblSecondEquation());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getPField());
		getContentPane().add(getQField());
		getContentPane().add(getRField());
		getContentPane().add(getLabel_4());
		getContentPane().add(getSField());
		getContentPane().add(getLabel());
		getContentPane().add(getP1Field());
		getContentPane().add(getQ1Field());
		getContentPane().add(getR1Field());
		getContentPane().add(getS1Field());
		getContentPane().add(getLabel_4_1());
		getContentPane().add(getLabel_5());
		getContentPane().add(getP2Field());
		getContentPane().add(getLabel_6());
		getContentPane().add(getQ2Field());
		getContentPane().add(getLabel_7());
		getContentPane().add(getR2Field());
		getContentPane().add(getLabel_8());
		getContentPane().add(getS2Field());
		getContentPane().add(getPanel());
		getContentPane().add(getBtnCalculate());
		getContentPane().add(getBtnClear());
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getPField(), getQField(), getRField(), getSField(), getP1Field(), getQ1Field(), getR1Field(), getS1Field(), getP2Field(), getQ2Field(), getR2Field(), getS2Field(), getBtnCalculate(), getBtnClear(), getContentPane(), getLblFirstEquation(), getLblXcoffiecient(), getLblYcoffiecient(), getLblZcoffiecient(), getLabel_4(), getLblSecondEquation(), getLabel_1(), getLabel_2(), getLabel_3(), getLabel(), getLabel_4_1(), getLabel_5(), getLabel_6(), getLabel_7(), getLabel_8(), getPanel(), getLabel_4_3(), getLabel_4_4(), getLblZ(), getTextField_4(), getTextField_5(), getTextField_1_1()}));

	}
	private JLabel getLblFirstEquation() {
		if (lblFirstEquation == null) {
			lblFirstEquation = new JLabel("First Equation");
			lblFirstEquation.setBounds(17, 6, 91, 16);
		}
		return lblFirstEquation;
	}
	private JLabel getLblXcoffiecient() {
		if (lblXcoffiecient == null) {
			lblXcoffiecient = new JLabel("x-coffiecient: ");
			lblXcoffiecient.setBounds(17, 34, 78, 16);
		}
		return lblXcoffiecient;
	}
	private JLabel getLblYcoffiecient() {
		if (lblYcoffiecient == null) {
			lblYcoffiecient = new JLabel("y-coffiecient: ");
			lblYcoffiecient.setBounds(17, 62, 78, 16);
		}
		return lblYcoffiecient;
	}
	private JLabel getLblZcoffiecient() {
		if (lblZcoffiecient == null) {
			lblZcoffiecient = new JLabel("z-coffiecient: ");
			lblZcoffiecient.setBounds(17, 90, 78, 16);
		}
		return lblZcoffiecient;
	}
	private JLabel getLblSecondEquation() {
		if (lblSecondEquation == null) {
			lblSecondEquation = new JLabel("Second Equation");
			lblSecondEquation.setBounds(181, 6, 94, 16);
		}
		return lblSecondEquation;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("x-coffiecient: ");
			label_1.setBounds(181, 34, 82, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("y-coffiecient: ");
			label_2.setBounds(181, 62, 82, 16);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("z-coffiecient: ");
			label_3.setBounds(181, 90, 82, 16);
		}
		return label_3;
	}
	private JTextField getPField() {
		if (pField == null) {
			pField = new JTextField();
			pField.setBounds(99, 28, 70, 28);
			pField.setColumns(10);
		}
		return pField;
	}
	private JTextField getQField() {
		if (qField == null) {
			qField = new JTextField();
			qField.setBounds(99, 56, 70, 28);
			qField.setColumns(10);
		}
		return qField;
	}
	private JTextField getRField() {
		if (rField == null) {
			rField = new JTextField();
			rField.setColumns(10);
			rField.setBounds(99, 84, 70, 28);
		}
		return rField;
	}
	private JLabel getLabel_4() {
		if (lblConstant == null) {
			lblConstant = new JLabel("constant:");
			lblConstant.setBounds(17, 118, 78, 16);
		}
		return lblConstant;
	}
	private JTextField getSField() {
		if (sField == null) {
			sField = new JTextField();
			sField.setColumns(10);
			sField.setBounds(99, 112, 70, 28);
		}
		return sField;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("constant:");
			label.setBounds(181, 118, 82, 16);
		}
		return label;
	}
	private JTextField getP1Field() {
		if (p1Field == null) {
			p1Field = new JTextField();
			p1Field.setColumns(10);
			p1Field.setBounds(263, 28, 70, 28);
		}
		return p1Field;
	}
	private JTextField getQ1Field() {
		if (q1Field == null) {
			q1Field = new JTextField();
			q1Field.setColumns(10);
			q1Field.setBounds(263, 56, 70, 28);
		}
		return q1Field;
	}
	private JTextField getR1Field() {
		if (r1Field == null) {
			r1Field = new JTextField();
			r1Field.setColumns(10);
			r1Field.setBounds(263, 84, 70, 28);
		}
		return r1Field;
	}
	private JTextField getS1Field() {
		if (s1Field == null) {
			s1Field = new JTextField();
			s1Field.setColumns(10);
			s1Field.setBounds(263, 112, 70, 28);
		}
		return s1Field;
	}
	private JLabel getLabel_4_1() {
		if (lblThirdEquation == null) {
			lblThirdEquation = new JLabel("Third Equation");
			lblThirdEquation.setBounds(345, 6, 94, 16);
		}
		return lblThirdEquation;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("x-coffiecient: ");
			label_5.setBounds(345, 34, 81, 16);
		}
		return label_5;
	}
	private JTextField getP2Field() {
		if (p2Field == null) {
			p2Field = new JTextField();
			p2Field.setColumns(10);
			p2Field.setBounds(427, 28, 70, 28);
		}
		return p2Field;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("y-coffiecient: ");
			label_6.setBounds(345, 62, 81, 16);
		}
		return label_6;
	}
	private JTextField getQ2Field() {
		if (q2Field == null) {
			q2Field = new JTextField();
			q2Field.setColumns(10);
			q2Field.setBounds(427, 56, 70, 28);
		}
		return q2Field;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("z-coffiecient: ");
			label_7.setBounds(345, 90, 81, 16);
		}
		return label_7;
	}
	private JTextField getR2Field() {
		if (r2Field == null) {
			r2Field = new JTextField();
			r2Field.setColumns(10);
			r2Field.setBounds(427, 84, 70, 28);
		}
		return r2Field;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("constant:");
			label_8.setBounds(345, 118, 81, 16);
		}
		return label_8;
	}
	private JTextField getS2Field() {
		if (s2Field == null) {
			s2Field = new JTextField();
			s2Field.setColumns(10);
			s2Field.setBounds(427, 112, 70, 28);
		}
		return s2Field;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Values", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(6, 183, 517, 80);
			panel.setLayout(null);
			panel.add(getLabel_4_3());
			panel.add(getLabel_4_4());
			panel.add(getLblZ());
			panel.add(getTextField_4());
			panel.add(getTextField_5());
			panel.add(getTextField_1_1());
		}
		return panel;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double p = Double.parseDouble(pField.getText());
					double q = Double.parseDouble(qField.getText());
					double r = Double.parseDouble(rField.getText());
					double s = Double.parseDouble(sField.getText());
					
					double p1 = Double.parseDouble(p1Field.getText());
					double q1 = Double.parseDouble(q1Field.getText());
					double r1 = Double.parseDouble(r1Field.getText());
					double s1 = Double.parseDouble(s1Field.getText());
					
					double p2 = Double.parseDouble(p2Field.getText());
					double q2 = Double.parseDouble(q2Field.getText());
					double r2 = Double.parseDouble(r2Field.getText());
					double s2 = Double.parseDouble(s2Field.getText());
					
					double d = (p*q1*r2+q*p2*r1+r*p1*q2) - (p*r1*q2+q*p1*r2+r*q1*p2);
					
					if (d == 0) {
						JOptionPane.showMessageDialog(null, "No solution");
					}
					else {
						double x= ((q*r2*s1+r*q1*s2+s*r1*q2) - (q*r1*s2+r*q2*s1+s*q1*r2))/d; 
						double y=((p*r1*s2+r*p2*s1+s*p1*r2) - (p*r2*s1+r*p1*s2+s*r1*p2))/d;
						double z = ((p*q2*s1+q*p1*s2+s*q1*p2) - (p*q1*s2+q*p2*s1+s*p1*q2))/d;
						
						System.out.println(x);
						System.out.println(y);
						System.out.println(z);
						
						xField.setText(String.valueOf(x));
						yField.setText(String.valueOf(y));
						zField.setText(String.valueOf(z));
					}
				}
			});
			btnCalculate.setBounds(433, 152, 90, 28);
		}
		return btnCalculate;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pField.setText("");
					qField.setText("");
					rField.setText("");
					sField.setText("");
					
					p1Field.setText("");
					q1Field.setText("");
					r1Field.setText("");
					s1Field.setText("");
					
					p2Field.setText("");
					q2Field.setText("");
					r2Field.setText("");
					s2Field.setText("");
				}
			});
			btnClear.setBounds(331, 152, 90, 28);
		}
		return btnClear;
	}
	private JLabel getLabel_4_3() {
		if (lblX == null) {
			lblX = new JLabel("x: ");
			lblX.setFont(new Font("SansSerif", Font.PLAIN, 18));
			lblX.setBounds(10, 34, 18, 24);
		}
		return lblX;
	}
	private JLabel getLabel_4_4() {
		if (lblY == null) {
			lblY = new JLabel("y: ");
			lblY.setFont(new Font("SansSerif", Font.PLAIN, 18));
			lblY.setBounds(169, 34, 19, 24);
		}
		return lblY;
	}
	private JLabel getLblZ() {
		if (lblZ == null) {
			lblZ = new JLabel("z: ");
			lblZ.setFont(new Font("SansSerif", Font.PLAIN, 18));
			lblZ.setBounds(347, 34, 18, 24);
		}
		return lblZ;
	}
	private JTextField getTextField_4() {
		if (xField == null) {
			xField = new JTextField();
			xField.setFont(new Font("SansSerif", Font.PLAIN, 18));
			xField.setEnabled(false);
			xField.setBounds(35, 34, 122, 28);
			xField.setColumns(10);
		}
		return xField;
	}
	private JTextField getTextField_5() {
		if (yField == null) {
			yField = new JTextField();
			yField.setFont(new Font("SansSerif", Font.PLAIN, 18));
			yField.setEnabled(false);
			yField.setColumns(10);
			yField.setBounds(200, 34, 122, 28);
		}
		return yField;
	}
	private JTextField getTextField_1_1() {
		if (zField == null) {
			zField = new JTextField();
			zField.setFont(new Font("SansSerif", Font.PLAIN, 18));
			zField.setEnabled(false);
			zField.setColumns(10);
			zField.setBounds(377, 34, 122, 28);
		}
		return zField;
	}
}
