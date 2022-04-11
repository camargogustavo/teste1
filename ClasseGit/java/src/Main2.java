import javax.swing.JOptionPane;
public class Main2 {
    public static void main(String [] argrs){
        String nome = JOptionPane.showInputDialog("Digite o nome: \n");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: \n");
        String nomeCompleto = nome +" "+ sobrenome;
        JOptionPane.showMessageDialog(null, "Nome Completo" + nomeCompleto, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
