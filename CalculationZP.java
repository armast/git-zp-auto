package ZarplataA;
import javax.swing.JFrame;

public class CalculationZP {
	public static void main(String[] args){
		Zp z = new Zp("Расчет заработной платы за месяц");
		z.setVisible(true);
		z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		z.setSize(350, 350);
		z.setResizable(false);
		z.setLocationRelativeTo(null);
	}
}
