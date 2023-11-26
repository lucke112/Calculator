public class Controller {
    private Model m;
    private View v;
    public Controller(View v) {
        this.v = v;
        m = new Model();
    }

    /*
     * Handles the button pressed and navigates what should be done to view and model
     */
    public void actionperformed(String x) {
        if(x == "1") {
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == "2") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "3") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "4") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "5") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "6") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "7") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "8") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "9") {
            v.btnclick(x);
            m.btnclick(x);
        } else if(x == "0") {
            m.btnclick(x);
            v.zeroes(x, m.z1value()); 
        } else if(x == ".") {
            m.btnclick(x);
        	v.btnclick(x);
        } else if(x == "=") {
            m.btnclick(x);
            v.btnsum(m.value());
        } else if(x == "+") {
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == "-") {
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == "*") {
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == "/") {
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == "AC") {
            m.btnclick(x);
            v.btnsum("");
        } else if(x == "%") { // Inte klar
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == "(") { // Inte klar
            m.btnclick(x);
            v.btnclick(x);
        } else if(x == ")") { // Inte klar
            m.btnclick(x);
            v.btnclick(x);
            //v.parentheses(x, m.parentheses());
        }
    }
}
