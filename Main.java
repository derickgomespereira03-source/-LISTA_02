import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String resultado = "";
        for (int i = 1; i <= 20; i++) {
            resultado = resultado + i + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}