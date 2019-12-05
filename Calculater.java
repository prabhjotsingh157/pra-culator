
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculator {

	private JFrame Praculator;
	private JLabel jLabel;
	private JTextField displayBox;
	private JRadioButton radioOn, radioOff;
	private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonClear, buttonDecimal, buttonEraseText, buttonEqualTo;
	private double ans, num;
	private int calculation, counter;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.Praculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
		radioOn.setEnabled(false);
		
		
	}
	
	
	private void arithmeticOpertion() {
		switch(calculation) {
		case 1:     //Addition
			ans = num + Double.parseDouble(displayBox.getText());
			displayBox.setText(Double.toString(ans));
			break;
		case 2:    // Subtraction
			ans = num - Double.parseDouble(displayBox.getText());
			displayBox.setText(Double.toString(ans));
			break;
		case 3:    // Multiplication
			ans = num * Double.parseDouble(displayBox.getText());
			displayBox.setText(Double.toString(ans));
			break;
		case 4:    // Division 
			ans = num / Double.parseDouble(displayBox.getText());
			displayBox.setText(Double.toString(ans));
			break;
		}
	}
	//to enable the  calculator
	private void enabled(){
		displayBox.setEnabled(true);
		radioOn.setEnabled(false);
		radioOn.setSelected(true);
		radioOff.setEnabled(true);
		radioOff.setSelected(false);
		button0.setEnabled(true);
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button7.setEnabled(true);
		button8.setEnabled(true);
		button9.setEnabled(true);
		buttonPlus.setEnabled(true);
		buttonMinus.setEnabled(true);
		buttonMultiply.setEnabled(true);
		buttonDivide.setEnabled(true);
		buttonClear.setEnabled(true);
		buttonDecimal.setEnabled(true);
		buttonEraseText.setEnabled(true);
		buttonEqualTo.setEnabled(true);
	}
	
	//to disable the  calculator
	private void disabled() {
		displayBox.setEnabled(false);
		radioOn.setEnabled(true);
		radioOn.setSelected(false);
		radioOff.setEnabled(false);
		radioOff.setSelected(true);
		button0.setEnabled(false);
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button8.setEnabled(false);
		button9.setEnabled(false);
		buttonPlus.setEnabled(false);
		buttonMinus.setEnabled(false);
		buttonMultiply.setEnabled(false);
		buttonDivide.setEnabled(false);
		buttonClear.setEnabled(false);
		buttonDecimal.setEnabled(false);
		buttonEraseText.setEnabled(false);
		buttonEqualTo.setEnabled(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		Praculator = new JFrame();
		Praculator.setTitle("Praculator");
		Praculator.setResizable(false);
		Praculator.setBounds(100, 100, 280, 425);
		Praculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Praculator.getContentPane().setLayout(null);
		
		displayBox = new JTextField();
		displayBox.setEditable(false);
		displayBox.setHorizontalAlignment(SwingConstants.RIGHT);
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 45));
		displayBox.setBounds(10, 37, 255, 50);
		Praculator.getContentPane().add(displayBox);
		displayBox.setColumns(10);
		
		jLabel = new JLabel("");
		jLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		jLabel.setLabelFor(displayBox);
		jLabel.setForeground(Color.RED);
		jLabel.setBounds(184, 15, 80, 20);
		Praculator.getContentPane().add(jLabel);
		
		radioOn = new JRadioButton("ON");
		radioOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled();
			}
		});
		radioOn.setFont(new Font("Tahoma", Font.BOLD, 11));
		radioOn.setBounds(10, 98, 50, 23);
		Praculator.getContentPane().add(radioOn);
		
		radioOff = new JRadioButton("OFF");
		radioOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disabled();
			}
		});
		radioOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		radioOff.setBounds(10, 124, 50, 23);
		Praculator.getContentPane().add(radioOff);
		
		button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "0");
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 23));
		button0.setBounds(10, 337, 60, 50);
		Praculator.getContentPane().add(button0);
		
		button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayBox.setText(displayBox.getText() + "1");
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 23));
		button1.setBounds(10, 276, 60, 50);
		Praculator.getContentPane().add(button1);
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "2");
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 23));
		button2.setBounds(76, 276, 60, 50);
		Praculator.getContentPane().add(button2);
		
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "3");
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 23));
		button3.setBounds(139, 276, 60, 50);
		Praculator.getContentPane().add(button3);
		
		button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "4");
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 23));
		button4.setBounds(10, 215, 60, 50);
		Praculator.getContentPane().add(button4);
		
		button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "5");
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 23));
		button5.setBounds(76, 215, 60, 50);
		Praculator.getContentPane().add(button5);
		
		button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "6");
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 23));
		button6.setBounds(139, 215, 60, 50);
		Praculator.getContentPane().add(button6);
		
		button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "7");
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 23));
		button7.setBounds(10, 154, 60, 50);
		Praculator.getContentPane().add(button7);
		
		button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "8");
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 23));
		button8.setBounds(76, 154, 60, 50);
		Praculator.getContentPane().add(button8);
		
		button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText(displayBox.getText() + "9");
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 23));
		button9.setBounds(139, 154, 60, 50);
		Praculator.getContentPane().add(button9);
		
		buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(displayBox.getText());
				calculation = 1;
				counter = 0;
				displayBox.setText("");
				jLabel.setText(num + "+");
			}
		});
		buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonPlus.setBounds(205, 98, 60, 50);
		Praculator.getContentPane().add(buttonPlus);
		
		buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(displayBox.getText());
				calculation = 2;
				counter = 0;
				displayBox.setText("");
				jLabel.setText(num + "-");
			}
		});
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonMinus.setBounds(205, 154, 60, 50);
		Praculator.getContentPane().add(buttonMinus);
		
	    buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(displayBox.getText());
				calculation = 3;
				counter = 0;
				displayBox.setText("");
				jLabel.setText(num + "*");
			}
		});
		buttonMultiply.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonMultiply.setBounds(205, 215, 60, 50);
		Praculator.getContentPane().add(buttonMultiply);
		
	    buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(displayBox.getText());
				calculation = 4;
				counter = 0;
				displayBox.setText("");
				jLabel.setText(num + "/");
			}
		});
		buttonDivide.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonDivide.setBounds(205, 276, 60, 50);
		Praculator.getContentPane().add(buttonDivide);
		
		buttonEraseText = new JButton("->");
		buttonEraseText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = displayBox.getText().length();
				int number = displayBox.getText().length() - 1;
				String store;
				counter = 0;
				if(length > 0) {
					StringBuilder back = new StringBuilder(displayBox.getText());
					back.deleteCharAt(number);
					store = back.toString();
					displayBox.setText(store);
				}
			}
		});
		buttonEraseText.setFont(new Font("Tahoma", Font.BOLD, 21));
		buttonEraseText.setBounds(76, 98, 60, 50);
		Praculator.getContentPane().add(buttonEraseText);
		
		buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBox.setText("");
			}
		});
		buttonClear.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonClear.setBounds(139, 98, 60, 50);
		Praculator.getContentPane().add(buttonClear);
		
		
		buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(counter++ < 1) {
					displayBox.setText(displayBox.getText() + ".");
				}
				
			}
		});
		buttonDecimal.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonDecimal.setBounds(76, 337, 60, 50);
		Praculator.getContentPane().add(buttonDecimal);
		
		buttonEqualTo = new JButton("=");
		buttonEqualTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arithmeticOpertion();
				jLabel.setText("");
				counter = 0;
			}
		});
		buttonEqualTo.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonEqualTo.setBounds(139, 337, 126, 50);
		Praculator.getContentPane().add(buttonEqualTo);
	}
}
