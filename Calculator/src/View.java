import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener{ //
    int i;
    JFrame frame;
    JPanel panel, txtpanel;
    JTextField txt;
    Font newFont;
    JButton[] funcbtn, nmbbtn;
    Controller ctl;
    String btnclick, value = "";
    String[] buttontext = {"(", ")", "%", "AC", "/", "*", "-", ".", "=", "+"};
    String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    
    public View() {
        ctl = new Controller(this);
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel = new JPanel(new GridLayout(5, 4, 10, 10));
        txtpanel = new JPanel(new BorderLayout());
        
        txt = new JTextField();
        newFont = new Font("Serif", Font.BOLD, 24);
        txt.setFont(newFont);
        txt.setPreferredSize(new Dimension(10, 50));
        txtpanel.add(txt, BorderLayout.CENTER);
        frame.add(txtpanel, BorderLayout.NORTH);
        
        funcbtn = new JButton[10];
        nmbbtn = new JButton[10];

        //Initierar alla knappar
        for(i = 0; i < 10; i++) {
            funcbtn[i] = new JButton(buttontext[i]);
            funcbtn[i].addActionListener(this);
        }

        for(i = 0; i < 10; i++) {
            nmbbtn[i] = new JButton(numbers[i]);
            nmbbtn[i].addActionListener(this);
        }

        //Puts the button the way I want them
        for (i = 0; i < 10; i++) { 
            if(i == 0) {
                for(int j = 0; j < 4; j++) {
                    panel.add(funcbtn[j]);
                }
            } else if(i == 3) {
                panel.add(funcbtn[4]);
            } else if(i == 6) {
                panel.add(funcbtn[5]);
            } else if(i == 9) {
                panel.add(funcbtn[6]);
            }
            panel.add(nmbbtn[i]);
            if(i == 9) {
                for(int j = 7; j < 10; j++) {
                    panel.add(funcbtn[j]);
                }
            }
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
    }
    
	/* 
	 * Skickar vidare knapptryck till controller
	 */
    public void actionPerformed(ActionEvent e) { 
        if(e.getActionCommand() == "1") {
            ctl.actionperformed("1");
        } else if(e.getActionCommand() == "2") {
            ctl.actionperformed("2");            
        } else if(e.getActionCommand() == "3") {
            ctl.actionperformed("3");
        } else if(e.getActionCommand() == "4") {
            ctl.actionperformed("4");      
        } else if(e.getActionCommand() == "5") {     
            ctl.actionperformed("5");      
        } else if(e.getActionCommand() == "6") {    
            ctl.actionperformed("6");      
        } else if(e.getActionCommand() == "7") {
            ctl.actionperformed("7");      
        } else if(e.getActionCommand() == "8") {
            ctl.actionperformed("8");      
        } else if(e.getActionCommand() == "9") {    
            ctl.actionperformed("9");      
        } else if(e.getActionCommand() == "0") {      
            ctl.actionperformed("0");      
        } else if(e.getActionCommand() == ".") {
            ctl.actionperformed(".");      
        } else if(e.getActionCommand() == "=") {
            ctl.actionperformed("=");      
        }else if(e.getActionCommand() == "+") {
            ctl.actionperformed("+");      
        } else if(e.getActionCommand() == "-") {
            ctl.actionperformed("-");      
        } else if(e.getActionCommand() == "*") {
            ctl.actionperformed("*");      
        } else if(e.getActionCommand() == "/") {
            ctl.actionperformed("/");      
        } else if(e.getActionCommand() == "AC") {
            ctl.actionperformed("AC");      
        } else if(e.getActionCommand() == "%") {
            ctl.actionperformed("%");      
        } else if(e.getActionCommand() == "(") {
            ctl.actionperformed("(");      
        } else if(e.getActionCommand() == ")") {
            ctl.actionperformed(")");      
        }
    }

    /*
     * Hanterar knapptryck
     */
    public void btnclick(String x) {
        value = value + x;
        txt.setText(value);
    }
    
    /*
     * Handle the sum that is printed out
     */
    public void btnsum(String x) {
    	value = x;
    	txt.setText(x);
    }
    
    /*
     * Makes sure that not more than multiple 0 is displayed if it is not adding to the value
     */
    public void zeroes(String x, boolean z) {
    	if(z == true) {
    		txt.setText(x);
    	} else {
            value = value + x;
            txt.setText(value);
    	}
    }
    
    public void parentheses(String x, boolean p) {
    	if(p == false) {
    		txt.setText(x);
    	} else {
            value = value + x;
            txt.setText(value);
    	}
    }
}
