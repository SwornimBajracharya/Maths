package maths;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.DesktopPaneUI;

import Propositional.BiConditional;
import Propositional.Conditional;
import Propositional.Conjunction;
import Propositional.Disjunction;
import Propositional.Negation;
import statistics.Stats;

import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	private JMenu mnFile;
	private JMenuItem mntmClearAll;
	private JMenuItem mntmExit;
	private JDesktopPane desktopPane;
	private JMenu mnVector;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmAddAndSubtract;
	private JMenu mnPropositionalCalculus;
	private JMenuItem mntmNegation;
	private JMenuItem mntmConjunction;
	private JMenuItem mntmDisjunction;
	private JMenuItem mntmConditional;
	private JMenuItem mntmBiconditional;
	private JMenuItem mntmStats;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		menuBar.add(getMnFile());
		
		
		JMenu mnAlgebra = new JMenu("Algebra");
		menuBar.add(mnAlgebra);
		
		JMenuItem mntmLinearEquation = new JMenuItem("Linear equation");
		
		mntmLinearEquation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Linear l = new Linear();
				desktopPane.add(l);
				l.setVisible(true);
				
			}
		});
		
		mnAlgebra.add(mntmLinearEquation);
		
		JMenuItem mntmQuadradicEquation = new JMenuItem("Quadradic equation");
		mntmQuadradicEquation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Quad l = new Quad();
				desktopPane.add(l);
				l.setVisible(true);
			}
		});
		mnAlgebra.add(mntmQuadradicEquation);
		
		JMenu mnNewMenu = new JMenu("Geometry");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmTriangle = new JMenuItem("Triangle");
		mntmTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Triangle tri = new Triangle();
				desktopPane.add(tri);
				tri.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmTriangle);
		
		JMenuItem mntmCircle = new JMenuItem("Circle");
		mntmCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Circle c = new Circle();
				desktopPane.add(c);
				c.setVisible(true);
			}
		});
		mnNewMenu.add(mntmCircle);
		menuBar.add(getMnVector());
		menuBar.add(getMnPropositionalCalculus());
		menuBar.add(getMntmStats());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getDesktopPane());
		
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmClearAll());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenuItem getMntmClearAll() {
		if (mntmClearAll == null) {
			mntmClearAll = new JMenuItem("Clear All");
			mntmClearAll.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (desktopPane.getAllFrames().length != 0) {
						desktopPane.remove(0);
					}
				}
			});
		}
		return mntmClearAll;
	}
	
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
		}
		return mntmExit;
	}
	private JDesktopPane getDesktopPane() {
		if (desktopPane == null) {
			desktopPane = new JDesktopPane();
			desktopPane.setBounds(10, 10, 564, 318);
			desktopPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Welcome To Maths");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 49));
			lblNewLabel.setBounds(69, 11, 443, 60);
			desktopPane.add(lblNewLabel);
			
		}
		return desktopPane;
	}
	private JMenu getMnVector() {
		if (mnVector == null) {
			mnVector = new JMenu("Vector");
			mnVector.add(getMntmAddAndSubtract());
			mnVector.add(getMntmNewMenuItem());
		}
		return mnVector;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Multiplication");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					VectorP vp = new VectorP();
					desktopPane.add(vp);
					vp.setVisible(true);
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmAddAndSubtract() {
		if (mntmAddAndSubtract == null) {
			mntmAddAndSubtract = new JMenuItem("Add and subtract ");
			mntmAddAndSubtract.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					VectorAS vas = new VectorAS();
					desktopPane.add(vas);
					vas.setVisible(true);
				}
			});
		}
		return mntmAddAndSubtract;
	}
	private JMenu getMnPropositionalCalculus() {
		if (mnPropositionalCalculus == null) {
			mnPropositionalCalculus = new JMenu("Propositional Calculus");
			mnPropositionalCalculus.add(getMntmNegation());
			mnPropositionalCalculus.add(getMntmConjunction());
			mnPropositionalCalculus.add(getMntmDisjunction());
			mnPropositionalCalculus.add(getMntmConditional());
			mnPropositionalCalculus.add(getMntmBiconditional());
		}
		return mnPropositionalCalculus;
	}
	private JMenuItem getMntmNegation() {
		if (mntmNegation == null) {
			mntmNegation = new JMenuItem("Negation");
			mntmNegation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Negation n = new Negation();
					desktopPane.add(n);
					n.setVisible(true);
			
				}
			});
		}
		return mntmNegation;
	}
	private JMenuItem getMntmConjunction() {
		if (mntmConjunction == null) {
			mntmConjunction = new JMenuItem("Conjunction");
			mntmConjunction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Conjunction c = new Conjunction();
					desktopPane.add(c);
					c.setVisible(true);
				}
			});
		}
		return mntmConjunction;
	}
	private JMenuItem getMntmDisjunction() {
		if (mntmDisjunction == null) {
			mntmDisjunction = new JMenuItem("Disjunction");
			mntmDisjunction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Disjunction d = new Disjunction();
					desktopPane.add(d);
					d.setVisible(true);
				}
			});
		}
		return mntmDisjunction;
	}
	private JMenuItem getMntmConditional() {
		if (mntmConditional == null) {
			mntmConditional = new JMenuItem("Conditional");
			mntmConditional.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Conditional c = new Conditional();
					desktopPane.add(c);
					c.setVisible(true);
				}
			});
		}
		return mntmConditional;
	}
	private JMenuItem getMntmBiconditional() {
		if (mntmBiconditional == null) {
			mntmBiconditional = new JMenuItem("Bi-Conditional");
			mntmBiconditional.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					BiConditional c = new BiConditional();
					desktopPane.add(c);
					c.setVisible(true);
				}
			});
		}
		return mntmBiconditional;
	}
	private JMenuItem getMntmStats() {
		if (mntmStats == null) {
			mntmStats = new JMenuItem("Stats");
			mntmStats.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Stats s = new Stats();
					desktopPane.add(s);
					s.setVisible(true);
				}
			});
		}
		return mntmStats;
	}
}
