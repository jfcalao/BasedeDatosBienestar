/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienestarfamiliardb;

import javax.swing.JOptionPane;

/**
 *
 * @author jfcal
 */
public class BienestarFamiliarDB {

    /**
     * @param args the command line arguments
     */
    static String uu, pp;
    public static void main(String[] args) {
        // TODO code application logic here
        Inicial view = new Inicial();
        view.setVisible(true);
        String user= JOptionPane.showInputDialog("Digite el usuario de la base de datos:");
        String password=JOptionPane.showInputDialog("Digite contraseña de la base de datos:");
         userPass(user, password);
    }
    public static void userPass(String u, String p){
        uu=u;
        pp=p;
    }
    
}
