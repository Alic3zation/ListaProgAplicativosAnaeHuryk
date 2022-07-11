import javax.swing.JOptionPane;

public class Exer5 {

	public static void main(String[] args) {
		String vHora;
		double Valor=10.25, total=0;
		vHora = JOptionPane.showInputDialog("Digite o valor de horas trabalhadas:");
		double hora = Double.parseDouble(vHora);
		total += hora * Valor;
		if(total > 50) {
		JOptionPane.showMessageDialog(null, "O valor total que o trabalhor vai receber"
												+ "diariamente será de: R$" + total);
		}
		else{
		JOptionPane.showMessageDialog(null, "Atenção, digira-se à direção do hotel.");
		}
		System.exit(0);
	}
}
