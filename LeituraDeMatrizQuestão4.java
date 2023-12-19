
package leituradematriz.questão4;

import javax.swing.JOptionPane;


public class LeituraDeMatrizQuestão4 {

    
    public static void main(String[] args) {
        int[][] A = new int[3][2];
        int[][] B = new int[2][3];       
        int[][] C = new int[3][3];
                
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento da matriz A na posição " + i + ", " + j + ":"));
            }
        }
              
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento da matriz B na posição " + i + ", " + j + ":"));
            }
        }
             
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {               
                C[i][j] = 0;             
                for (int k = 0; k < 2; k++) 
                {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
                
        JOptionPane.showMessageDialog(null, "A matriz da multiplicação é:");
        for (int i = 0; i < 3; i++) 
        {           
            String linha = "";
            for (int j = 0; j < 3; j++) 
            {               
                linha = linha + C[i][j] + " ";
            }          
            JOptionPane.showMessageDialog(null, linha);
        }
    }
}