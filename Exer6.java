import javax.swing.JOptionPane;
public class Exer6 {

	public static void main(String[] args) {
	String sOp, sLibra, sKilo;	
	sOp = JOptionPane.showInputDialog("O que você deseja fazer?\n"
										+ "1 - Converter de libra para kilo.\n"
										+ "2 - Converter de kilo para libra.");
	int op = Integer.parseInt(sOp);
	if(op == 1) {
	sLibra = JOptionPane.showInputDialog("Digite o valor em libra:");	
	double libra = Double.parseDouble(sLibra);
	double kilo = libra / 2.2046;
	JOptionPane.showMessageDialog(null, "O valor em kilo será de: " + kilo + "Kg.");
	}
	else if(op == 2) {
	sKilo = JOptionPane.showInputDialog("Digite o valor em kilo:"); 	
	double kilo = Double.parseDouble(sKilo);
	double libra = kilo * 2.2046;
	JOptionPane.showMessageDialog(null, "O valor em libra será de: " + libra + "£.");
	}
	else{
		JOptionPane.showMessageDialog(null, op + " não é uma opção válida.");
	}
	System.exit(0);
	}
}
