import javax.swing.JOptionPane;
public class Main4 {
    public static void main (String [] args){
        float nota1, nota2, calculaMedia;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
        calculaMedia = ((nota1+nota2)/2);
        JOptionPane.showMessageDialog(null, "Média Final:" + calculaMedia, "Média", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
