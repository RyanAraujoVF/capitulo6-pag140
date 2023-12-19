
package notamaisalta.questão9;

import javax.swing.JOptionPane;

public class NotaMaisAltaQuestão9 {

    public static void main(String[] args) {
  
        int d = 5;
        int n = 4;
 
        double[][] notas = new double[d][n];  
        double notaMaisAlta = 0;
        int disciplinaMaisAlta = 0;
        
        
        for (int i = 0; i < d; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " da disciplina " + (i + 1) + ":"));
                if (notas[i][j] > notaMaisAlta) 
                {
                    notaMaisAlta = notas[i][j];
                    disciplinaMaisAlta = i + 1;
                }
            }
        }             
        JOptionPane.showMessageDialog(null, "A nota mais alta foi " + notaMaisAlta + " e foi a disciplina " + disciplinaMaisAlta);
    }
}