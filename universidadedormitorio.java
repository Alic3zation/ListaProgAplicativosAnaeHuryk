import java.net.SocketTimeoutException;
import java.util.Scanner;
public class universidadedormitorio {

        Scanner scan = new Scanner(System.in);
         public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int aluguel, trans, alimento, agua, luz, gas, net, lazer , medica, total, vezes, dupla;
       System.out.println("digite o valor do aluguel: ");
       aluguel = scan.nextInt();
       System.out.println("digite o valor do transporte: ");
       trans = scan.nextInt();
       System.out.println("digite o valor da alimentação: ");
       alimento = scan.nextInt();
       System.out.println("digite o valor da água: ");
       agua = scan.nextInt();
       System.out.println("digite o valor da luz: ");
       luz = scan.nextInt();
       System.out.println("digite o valor do gás: ");
       gas = scan.nextInt();
       System.out.println("digite o valor da internet: ");
       net = scan.nextInt();
       System.out.println("digite o valor da medicação: ");
       medica = scan.nextInt();
       System.out.println("digite o valor do Lazer: ");
       lazer = scan.nextInt();
      
       total= aluguel+ alimento + agua + luz + gas + net ;
vezes= (total / 3) + medica + trans + lazer;
dupla = (vezes * 3) /3;

       System.out.println("A soma dos gastos totais equivale a: "+ vezes);
       System.out.println("A soma dos salários é igual a: "+ dupla);}

 

        
    
}
