package statistics;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Stats extends JInternalFrame {
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnMean;
	private JButton btnMedian;
	private JButton btnMode;
	private JLabel lblResult;
	private JTextField ageField;
	private JLabel lblIncome;
	private JTextField incomeField;
	private JTextField sdField;
	private JLabel lblSd;
	private JTextField varField;
	private JLabel lblVariance;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stats frame = new Stats();
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
	public Stats() {
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 563, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getScrollPane());
		displayData();

	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(6, 6, 539, 110);
			panel.setLayout(null);
			panel.add(getBtnMean());
			panel.add(getBtnMedian());
			panel.add(getBtnMode());
			panel.add(getLblResult());
			panel.add(getAgeField());
			panel.add(getLblIncome());
			panel.add(getIncomeField());
			panel.add(getSdField());
			panel.add(getLblSd());
			panel.add(getVarField());
			panel.add(getLblVariance());
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 116, 539, 147);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"id", "FirstName", "LastName", "Age", "Religion", "AnnualIncome"
				}
			));
		}
		return table;
	}
	private JButton getBtnMean() {
		if (btnMean == null) {
			btnMean = new JButton("Mean");
			btnMean.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mean();
				}
			});
			btnMean.setBounds(6, 6, 90, 28);
		}
		return btnMean;
	}
	private JButton getBtnMedian() {
		if (btnMedian == null) {
			btnMedian = new JButton("Median");
			btnMedian.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					median();
				}
			});
			btnMedian.setBounds(227, 6, 90, 28);
		}
		return btnMedian;
	}
	private JButton getBtnMode() {
		if (btnMode == null) {
			btnMode = new JButton("Mode");
			btnMode.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mode();
				}
			});
			btnMode.setBounds(443, 6, 90, 28);
		}
		return btnMode;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("Age: ");
			lblResult.setBounds(6, 82, 55, 16);
		}
		return lblResult;
	}
	private JTextField getAgeField() {
		if (ageField == null) {
			ageField = new JTextField();
			ageField.setFont(new Font("Tahoma", Font.BOLD, 11));
			ageField.setEnabled(false);
			ageField.setBounds(51, 76, 122, 28);
			ageField.setColumns(10);
		}
		return ageField;
	}
	
	private void displayData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stats", "root", "");
			
			List<Emps> emplist = new ArrayList();
			String sql = "Select * from data";
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Emps e = new Emps();
				
				e.setId(rs.getInt("id"));
				e.setFirstName(rs.getString("firstName"));
				e.setLastName(rs.getString("lastName"));
				e.setAge(rs.getInt("age"));
				e.setReligion(rs.getString("religion"));
				e.setAnnualIncome(rs.getDouble("annualIncome"));
				
				emplist.add(e);
			}
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			
			for (Emps e : emplist) {
				model.addRow(new Object[] {
						e.getId(), e.getFirstName(), e.getLastName(), e.getAge(), e.getReligion(), e.getAnnualIncome()
				});
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private JLabel getLblIncome() {
		if (lblIncome == null) {
			lblIncome = new JLabel("Income: ");
			lblIncome.setBounds(316, 82, 55, 16);
		}
		return lblIncome;
	}
	private JTextField getIncomeField() {
		if (incomeField == null) {
			incomeField = new JTextField();
			incomeField.setFont(new Font("Tahoma", Font.BOLD, 11));
			incomeField.setEnabled(false);
			incomeField.setColumns(10);
			incomeField.setBounds(411, 76, 122, 28);
		}
		return incomeField;
	}
	private void mean(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stats", "root", "");
			String sql = "select meanage, meanincome,varincome,sdincome from work";
	           PreparedStatement pst = con.prepareStatement(sql);
	           ResultSet rs = pst.executeQuery();
	           
	           if (rs.next()){
	             String ai = rs.getString("meanincome");
	             String age = rs.getString("meanage");
	             String var = rs.getString("varincome");
	             String sd = rs.getString("sdincome");
	             incomeField.setText(ai);
	             ageField.setText(age);
	             varField.setText(var);
	             sdField.setText(sd);
	           }          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }       
	
	private void median(){
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stats", "root", "");
            String sql = "  SELECT AVG(dd.annualIncome) as median_income\r\n" + 
            		"FROM (\r\n" + 
            		"SELECT d.annualIncome, @rownum:=@rownum+1 as `row_number`, @total_rows:=@rownum\r\n" + 
            		"  FROM data d, (SELECT @rownum:=0) r\r\n" + 
            		"  WHERE d.annualIncome is NOT NULL\r\n" + 
            		"  -- put some where clause here\r\n" + 
            		"  ORDER BY d.annualIncome\r\n" + 
            		") as dd\r\n" + 
            		"WHERE dd.row_number IN ( FLOOR((@total_rows+1)/2), FLOOR((@total_rows+2)/2) )";           
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
                String mn = rs.getString("median_income");
                incomeField.setText(mn);  
              }
            
            String sql1 = "SELECT AVG(dd.age) as median_age FROM ( SELECT d.age, @rownum:=@rownum+1 "
            		+ "as `row_number`, @total_rows:=@rownum FROM data d, (SELECT @rownum:=0) r "
            		+ "WHERE d.age is NOT NULL ORDER BY d.age ) as dd WHERE dd.row_number "
            		+ "IN ( FLOOR((@total_rows+1)/2), FLOOR((@total_rows+2)/2) )";
            
            PreparedStatement pst1 = con.prepareStatement(sql1);
            ResultSet rs1 = pst1.executeQuery();
            
            if (rs1.next()){
                String mn = rs1.getString("median_age");
                ageField.setText(mn);  
              }
            
            
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	private void mode(){
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stats", "root", "");
            String sql = "select annualIncome, occurs from (select annualIncome, count(*) as "
            		+ "occurs from data group by `annualIncome`)t1"
                    + " where occurs = (select max(occurs) from (select `annualIncome`, count(*) as occurs"
                    + " from data group by `annualIncome` ) t );";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
              String mn = rs.getString("annualIncome");
              incomeField.setText(mn);  
            }
            String sql1 = "select age, occurs from (select age, count(*) as occurs "
            		+ "from data group by `age`)t1"
                    + " where occurs = (select max(occurs) from (select `age`, count(*) as occurs"
                    + " from data group by `age` ) t );";
            PreparedStatement pst1 = con.prepareStatement(sql1);
            ResultSet rs1 = pst1.executeQuery();
            if (rs1.next()){
              String mn = rs1.getString("age");
              ageField.setText(mn);  
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	private JTextField getSdField() {
		if (sdField == null) {
			sdField = new JTextField();
			sdField.setFont(new Font("Tahoma", Font.BOLD, 11));
			sdField.setEnabled(false);
			sdField.setColumns(10);
			sdField.setBounds(51, 48, 122, 28);
		}
		return sdField;
	}
	
	private JLabel getLblSd() {
		if (lblSd == null) {
			lblSd = new JLabel("SD: ");
			lblSd.setBounds(6, 54, 55, 16);
		}
		return lblSd;
	}
	
	private JTextField getVarField() {
		if (varField == null) {
			varField = new JTextField();
			varField.setFont(new Font("Tahoma", Font.BOLD, 11));
			varField.setEnabled(false);
			varField.setColumns(10);
			varField.setBounds(411, 46, 122, 28);
		}
		return varField;
	}
	
	private JLabel getLblVariance() {
		if (lblVariance == null) {
			lblVariance = new JLabel("Variance: ");
			lblVariance.setBounds(316, 54, 83, 16);
		}
		return lblVariance;
	}
	
}
