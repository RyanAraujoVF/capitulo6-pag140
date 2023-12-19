
package seriedesaldos.questão3;

import javax.swing.JOptionPane;


public class SerieDeSaldosQuestão3 {

    
    public static void main(String[] args) {
        int n = 20;       
        double[] saldos = new double[n];
        
        for (int i = 0; i < n; i++) 
        {
            saldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente " + (i + 1) + ":"));
        }               
        JOptionPane.showMessageDialog(null, "Saldos com parte decimal:");
        for (int i = 0; i < n; i++) {   
            int parteInteira = (int) saldos[i];
            int parteDecimal = (int) ((saldos[i] - parteInteira) * 100);      
            String saldoFormatado = parteInteira + "." + parteDecimal;      
            JOptionPane.showMessageDialog(null, saldoFormatado);
        }
    }
}