import javax.swing.JOptionPane;
public class exerc10{

    public static void main(String[] args){
        
        String aux = "";
        float imc=0, peso=0, altura=0, altura2=0;
        try{
            aux = JOptionPane.showInputDialog(null, "Peso:");
                 peso=Float.parseFloat(aux);

                 aux = JOptionPane.showInputDialog(null, "Altura (0.0):");
                 altura=Float.parseFloat(aux);

                 altura2 = (altura * altura);
                  imc= peso/altura2;
                 JOptionPane.showMessageDialog(null, "O seu IMC é de: " + imc);


        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Dados incorretos!");
        }
    }
}