
package preçodoproduto.questão7;

import javax.swing.JOptionPane;


public class PreçoDoProdutoQuestão7 {

    
    public static void main(String[] args) {
        int n = 15;
        double[] preco1 = new double[n];
        double[] preco2 = new double[n];
        double[] media = new double[n];
            
        for (int i = 0; i < n; i++) 
        {
            preco1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no início da semana:"));
        }       
        for (int i = 0; i < n; i++) 
        {
            preco2[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no fim da semana:"));
        }              
        for (int i = 0; i < n; i++) 
        {
            media[i] = (preco1[i] + preco2[i]) / 2;
        }
        
        JOptionPane.showMessageDialog(null, "Preço 1  Preço 2  Media");
        for (int i = 0; i < n; i++) {
            String preco1Formatado = String.format("%.2f", preco1[i]);
            String preco2Formatado = String.format("%.2f", preco2[i]);
            String mediaFormatada = String.format("%.2f", media[i]);           
            JOptionPane.showMessageDialog(null, preco1Formatado + "      " + preco2Formatado + "      " + mediaFormatada);
        }
    }
}