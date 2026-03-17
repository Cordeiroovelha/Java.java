package OrientacaoAoObjeto.Data;
import javax.swing.JOptionPane;

public class DataMain {
    private static Data manager = new Data();

    public static void main(String[] args) {
        int day;
        int month;
        int year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));
        manager.changeDate(day, month, year);
        manager.printDate();
        
    }
}
