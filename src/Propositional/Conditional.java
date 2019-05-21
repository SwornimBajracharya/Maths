package Propositional;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Conditional extends JInternalFrame {
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblFirstStatement;
	private JLabel lblSecondStatement;
	private JButton btnCalculate;
	private JButton btnClear;
	private JRadioButton rdbtnTrue1;
	private JRadioButton rdbtnFalse1;
	private JRadioButton radioTrue2;
	private JRadioButton radioFalse2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	String p, q;
	JTextField s1 = new JTextField();
	JTextField s2 = new JTextField();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conditional frame = new Conditional();
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
	public Conditional() {
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Conditional");
		setBounds(100, 100, 540, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getScrollPane());
		

	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Values", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 0, 504, 134);
			panel.setLayout(null);
			panel.add(getLblFirstStatement());
			panel.add(getLblSecondStatement());
			panel.add(getBtnCalculate());
			panel.add(getBtnClear());
			panel.add(getRdbtnTrue1());
			panel.add(getRdbtnFalse1());
			panel.add(getRadioTrue2());
			panel.add(getRadioFalse2());
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 133, 504, 126);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFont(new Font("SansSerif", Font.PLAIN, 18));
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"First Statement", "Second Statement", "Result"
				}
			));
		}
		return table;
	}
	private JLabel getLblFirstStatement() {
		if (lblFirstStatement == null) {
			lblFirstStatement = new JLabel("First Statement: ");
			lblFirstStatement.setBounds(10, 25, 121, 16);
		}
		return lblFirstStatement;
	}
	private JLabel getLblSecondStatement() {
		if (lblSecondStatement == null) {
			lblSecondStatement = new JLabel("Second Statement: ");
			lblSecondStatement.setBounds(10, 50, 121, 16);
		}
		return lblSecondStatement;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JTextField result = new JTextField();
					
					if ( q == "T") {
						result.setText("True");
					}
					
					else if (q =="F" && p == "F") {
						result.setText("True");
					}
					else {
						result.setText("False");
					}
					
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.addRow(new Object[] {
						s1.getText(), s2.getText(), result.getText()	
					});
				}
			});
			btnCalculate.setBounds(408, 100, 90, 28);
		}
		return btnCalculate;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.setRowCount(0);
				}
			});
			btnClear.setBounds(306, 100, 90, 28);
		}
		return btnClear;
	}
	private JRadioButton getRdbtnTrue1() {
		if (rdbtnTrue1 == null) {
			rdbtnTrue1 = new JRadioButton("True");
			rdbtnTrue1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					p = "T";
					
					s1.setText(rdbtnTrue1.getText());
				}
			});
			buttonGroup_1.add(rdbtnTrue1);
			rdbtnTrue1.setBounds(123, 24, 115, 18);
		}
		return rdbtnTrue1;
	}
	private JRadioButton getRdbtnFalse1() {
		if (rdbtnFalse1 == null) {
			rdbtnFalse1 = new JRadioButton("False");
			rdbtnFalse1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					p = "F";
					
					s1.setText(rdbtnFalse1.getText());
				}
			});
			buttonGroup_1.add(rdbtnFalse1);
			rdbtnFalse1.setBounds(250, 24, 115, 18);
		}
		return rdbtnFalse1;
	}
	private JRadioButton getRadioTrue2() {
		if (radioTrue2 == null) {
			radioTrue2 = new JRadioButton("True");
			radioTrue2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					q = "T";
					
					s2.setText(radioTrue2.getText());
				}
			});
			buttonGroup.add(radioTrue2);
			radioTrue2.setBounds(123, 50, 115, 18);
		}
		return radioTrue2;
	}
	private JRadioButton getRadioFalse2() {
		if (radioFalse2 == null) {
			radioFalse2 = new JRadioButton("False");
			radioFalse2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					q = "F";
					
					s2.setText(radioFalse2.getText());
				}
			});
			buttonGroup.add(radioFalse2);
			radioFalse2.setBounds(250, 50, 115, 18);
		}
		return radioFalse2;
	}
}
