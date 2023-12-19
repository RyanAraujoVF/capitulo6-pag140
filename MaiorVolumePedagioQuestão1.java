
package maiorvolumepedagio.questão1;

import javax.swing.JOptionPane;

public class MaiorVolumePedagioQuestão1 {

    public static void main(String[] args) {
       int maiorVolume = 0;
        int diaMaiorVolume = 0;
        int volumeAtual;

        for (int dia = 1; dia <= 30; dia++) {
            volumeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume de carros do dia " + dia + ":"));
            if (volumeAtual > maiorVolume) {              
                maiorVolume = volumeAtual;
                diaMaiorVolume = dia;
            }
        }             
        JOptionPane.showMessageDialog(null, "O maior volume ocorreu no dia " + diaMaiorVolume + " e foi de " + maiorVolume + " carros.");
    }
}