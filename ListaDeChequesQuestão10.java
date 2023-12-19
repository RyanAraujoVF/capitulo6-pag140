
package listadecheques.questão10;

import javax.swing.JOptionPane;


public class ListaDeChequesQuestão10 {

    
    public static void main(String[] args) {
        int n;
        int max = 100;               
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cheques usados no mês:"));

        if (n > 0 && n <= max) 
        {   
            double[] cheques = new double[n];                       
            double maior = 0;
            double menor = Double.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                cheques[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":"));
                if (cheques[i] > maior) 
                {
                    maior = cheques[i];
                }
                if (cheques[i] < menor) 
                {
                    menor = cheques[i];
                }
            }

            JOptionPane.showMessageDialog(null, "A lista com todos os valores dos cheques é:");
            for (int i = 0; i < n; i++) 
            {
                String chequeFormatado = String.format("%.2f", cheques[i]);
                JOptionPane.showMessageDialog(null, chequeFormatado);
            }   
            JOptionPane.showMessageDialog(null, "O maior valor dos cheques foi: " + maior);
            JOptionPane.showMessageDialog(null, "O menor valor dos cheques foi: " + menor);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O número de cheques deve ser maior que zero e menor ou igual a " + max);
        }
    }
}