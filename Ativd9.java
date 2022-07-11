import java.util.Scanner;
import javax.swing.*;
public class Ativd9 {

    Scanner scan = new Scanner(System.in);
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println( "Digite sua idade: ");
        idade = scan.nextInt();

        if (idade<=3){
            JOptionPane.showMessageDialog(null, "Você é um bebê!");
        }

            if ((idade >=4) && (idade<=9)){
                JOptionPane.showMessageDialog(null,"Você é uma criança!");
            }

                if ((idade >=10) && (idade<=13)){
                    JOptionPane.showMessageDialog(null, "Você é um pré-adolescente!");
                }

                    if ((idade >=14) && (idade<=17)){
                        JOptionPane.showMessageDialog(null, "Você é um adolescente!");
                    }

                        if ((idade >=18) && (idade<=25)){
                            JOptionPane.showMessageDialog(null, "Você é um jovem adulto!");
                        }

                            if ((idade >=26) && (idade<=59)){
                                JOptionPane.showMessageDialog(null, "Você é um adulto!");
                            }

                                if ((idade >=60) && (idade<=100)){
                                    JOptionPane.showMessageDialog(null,"Você é um idoso!");
                                }

            }
    }
    
