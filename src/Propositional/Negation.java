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

public class Negation extends JInternalFrame {
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblFirstStatement;
	private JTextField pField;
	private JButton btnCalculate;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Negation frame = new Negation();
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
	public Negation() {
		setTitle("Negation");
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 540, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getScrollPane());
		

	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Values", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(6, 0, 516, 134);
			panel.setLayout(null);
			panel.add(getLblFirstStatement());
			panel.add(getPField());
			panel.add(getBtnCalculate());
			panel.add(getBtnClear());
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 133, 516, 126);
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
					"First Statement", "Result"
				}
			));
		}
		return table;
	}
	private JLabel getLblFirstStatement() {
		if (lblFirstStatement == null) {
			lblFirstStatement = new JLabel("Statement: ");
			lblFirstStatement.setBounds(10, 25, 90, 16);
		}
		return lblFirstStatement;
	}
	private JTextField getPField() {
		if (pField == null) {
			pField = new JTextField();
			pField.setBounds(110, 19, 122, 28);
			pField.setColumns(10);
		}
		return pField;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String p = pField.getText();
					JTextField result = new JTextField();
					
					switch (p) {
					case "t" :
					case "T" : 
						result.setText("F");
						break;
					
					case "f" :
					case "F" :
						result.setText("T");
						break;
					default :
						result.setText("Enter valid input (t/f)");
					}
					
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.addRow(new Object[] {
							pField.getText(), result.getText()
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
					
					pField.setText("");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.setRowCount(0);
					
				}
			});
			btnClear.setBounds(306, 100, 90, 28);
		}
		return btnClear;
	}
}
