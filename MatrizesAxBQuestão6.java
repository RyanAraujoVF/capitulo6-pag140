
package matrizesaxb.questão6;

import javax.swing.JOptionPane;


public class MatrizesAxBQuestão6 {

    
    public static void main(String[] args) {
        double[][] A = new double[5][5];
        double[][] B = new double[5][5];
        int[][] C = new int[5][5];

        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o elemento da matriz A na posição " + i + ", " + j + ":"));
            }
        }   
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                B[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o elemento da matriz B na posição " + i + ", " + j + ":"));
            }
        }
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {             
                C[i][j] = 0;
                
                for (int k = 0; k < 5; k++) 
                {
                    for (int l = 0; l < 5; l++) 
                    {
                        if (A[i][j] == B[k][l]) 
                        {                         
                            C[i][j] = 1;
                        }
                    }
                }
            }
        }
              
        JOptionPane.showMessageDialog(null, "A matriz C é:");
        for (int i = 0; i < 5; i++) 
        {            
            String linha = "";
            for (int j = 0; j < 5; j++) 
            {               
                linha = linha + C[i][j] + " ";
            }           
            JOptionPane.showMessageDialog(null, linha);
        }
    }
}