import java.util.*;

public class Model {
    String nmb = "";
    String snmb = "";
    String operators = "";
    double fsum = 0;
    double ssum = 0;
    double totalsum = 0;
    boolean z1 = false;
    int firstparentheses = 0;
    int secoundparentheses = 0;
    boolean parentheses = false;
    
    public void btnclick(String btn) {
    	/*
    	 * Can't write parenthesis
    	 * 
    	 */
    	
    	//Handles the button value the user has clicked
        if(btn.equals("=")) {
        	Calculatesum(operators);
        } else if(btn.equals("*")) {
        	btninfoclick(btn);
        } else if(btn.equals("+")) {
        	btninfoclick(btn);
        } else if(btn.equals("-")) {
        	btninfoclick(btn);
        } else if(btn.equals("/")) { //Make sure that you cant divide with 0
        	btninfoclick(btn);
        } else if(btn.equals(".")) {
        	//nmb = nmb + btn;
        } else if(btn.equals("AC")) {
        		//fnmb = "";
        		snmb = "";
        	    operators = "";
        	    //sum = 0;
        	    //n1 = 0;
        	    firstparentheses = 0;
        	    secoundparentheses = 0;
        } else if(btn.equals("%")) {        		
        	
        	
        } else if(btn.equals("(")) {

        } else if(btn.equals(")")) {

        } else if(btn.equals("0")) {
        	nmb = nmb + btn;
            /*if(fnmb.equals("0")) {
            	z1 = true;
            } else {
            	z1 = false;
            	//nmb = nmb + btn;
            }*/
        } else {
        	nmb = nmb + btn;
        }
    }
    
    public void btninfoclick(String btn) {
    	try {
    		if(operators == "") {
        		fsum = Double.parseDouble(nmb);
        		operators = btn;
        		nmb = "";
    		} else {
    			ssum = Double.parseDouble(nmb);
    			Calculatesum(operators);
    			nmb = "";
    		}

    	} catch (NumberFormatException e){
    		System.out.println(e);
    	}
    }
    
    public void Calculatesum(String operator) {
    	//btninfoclick(operator);
    	if(operator == "+") {
    		fsum = fsum + ssum;
    		totalsum = fsum;
    	} else if(operator == "-") {
    		fsum = fsum - ssum;
    		totalsum = fsum;
    	} else if(operator == "*") {
    		fsum = fsum * ssum;
    		totalsum = fsum;
    	} else if(operator == "/") {
    		fsum = fsum / ssum;
    		totalsum = fsum;
    	}
    	
    	System.out.println(totalsum);
    }

	public String value() {
        return "";//nmb;
    }
    
    public boolean z1value() {
    	return z1;
    }
    
    public boolean parentheses() {
    	return parentheses;
    }
    
}
