
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author mflim
 */
public class Util {
    public static void habilitar (boolean valor, JComponent... comp) {
        for (int i = 0; i <comp.length; i++){
            comp[i].setEnabled(valor);
        }
    }
   
public static void limpar(JComponent... comp){
    for(int i=0; i<comp.length; i++){
        if (comp[i] instanceof JTextField) {
            ((JTextField) comp[i]).setText("");
            //limpa textfield setText("")
        }
        if (comp[i] instanceof JComboBox){
            ((JComboBox) comp[i]).setSelectedIndex(-1);
            //limpa combobox setSelectedIndex(-1)
        }
         if (comp[i] instanceof JCheckBox) {
                ((JCheckBox) comp[i]).setSelected(false);
            }
    }
}
    public static void mostrar(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean perguntar(String mensagem) {
        JOptionPane.showConfirmDialog(null, mensagem);
        return false;
    }

        public static int strToInt(String cad){
        return Integer.parseInt(cad);
    }
    public static String intToStr(int num){
        return String.valueOf(num);
    }
    public static double strToDouble(String cad){
        return Double.parseDouble(cad);
    }
    public static String doubleToStr(double num){
        return String.valueOf(num);
    }

    public static Date strToDate(String cad) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(cad);
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(data);
    }

    public static boolean strToBool(String cad) {
        return Boolean.parseBoolean(cad);
    }

    public static String boolToStr(boolean value) {
        return String.valueOf(value);
    }


    
}
