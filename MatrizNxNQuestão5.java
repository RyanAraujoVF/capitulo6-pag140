
package matriznxn.questão5;

import javax.swing.JOptionPane;

public class MatrizNxNQuestão5 {
 
    public static void main(String[] args) {
        int N;       
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:")); 
        int[][] matriz = new int[N][N];
  
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {              
                matriz[i][j] = Math.min(Math.min(i, j), Math.min(N-i-1, N-j-1)) + 1;
            }
        }     
        JOptionPane.showMessageDialog(null, "A matriz é:");
        for (int i = 0; i < N; i++) 
        {         
            String linha = "";
            for (int j = 0; j < N; j++) {              
                linha = linha + matriz[i][j] + " ";
            }           
            JOptionPane.showMessageDialog(null, linha);
        }
    }
}