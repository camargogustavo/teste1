import javax.swing.JOptionPane;
public class Main5 {
    public static void main (String [] args){
        float nota1, nota2, nota3, nota4, calculaMedia;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3: "));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4: "));
        calculaMedia = ((nota1+nota2+nota3+nota4)/4);
        if ((calculaMedia > 7) || (calculaMedia == 7)){
            System.out.println("Aprovado!!\n");
        } else {
            System.out.println("Reprovado!!\n");
        }
        JOptionPane.showMessageDialog(null, "Média Final:" + calculaMedia, "Média", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
