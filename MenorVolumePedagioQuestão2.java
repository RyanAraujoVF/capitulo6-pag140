
package menorvolumepedagio.questão2;

import javax.swing.JOptionPane;

public class MenorVolumePedagioQuestão2 {

    public static void main(String[] args) {
        int maiorVolume = 0;
        int diaMaiorVolume = 0;
        int menorVolume = Integer.MAX_VALUE;
        int diaMenorVolume = 0;
        int volumeAtual;
        
        for (int dia = 1; dia <= 30; dia++) {
            volumeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume de carros do dia " + dia + ":"));
           
            if (volumeAtual > maiorVolume) 
            {
                maiorVolume = volumeAtual;
                diaMaiorVolume = dia;
            }
            
            if (volumeAtual < menorVolume) 
            {               
                menorVolume = volumeAtual;
                diaMenorVolume = dia;
            }
        }       
        JOptionPane.showMessageDialog(null, "O maior volume ocorreu no dia " + diaMaiorVolume + " e foi de " + maiorVolume + " carros.");
        JOptionPane.showMessageDialog(null, "O menor volume ocorreu no dia " + diaMenorVolume + " e foi de " + menorVolume + " carros.");
    }
}