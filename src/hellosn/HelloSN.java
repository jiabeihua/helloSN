/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellosn;

/**
 *
 * @author Beihua.Jia
 */
public class HelloSN {
    private String sUser;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void setUser(String vUser) {
        sUser = vUser;
    }
    
    public String helloSN() {
        return "Hello " + sUser + ", welcome to ServiceNow!";
    }
}
