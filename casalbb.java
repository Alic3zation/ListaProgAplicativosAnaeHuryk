import java.net.SocketTimeoutException;
import java.util.Scanner;
public class casalbb {

        Scanner scan = new Scanner(System.in);
         public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int aluguel, trans, alimento, agua, luz, gas, net, medica, parcelap, fralda, total, vezes;
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
       System.out.println("digite o valor das parcelas do parto: ");
       parcelap = scan.nextInt();
       System.out.println("digite o valor das fraldas: ");
       fralda= scan.nextInt();
       total= aluguel + trans + alimento + agua + luz + gas + net + medica + parcelap + fralda;
vezes= (total * 2);

       System.out.println("A soma dos gastos totais equivale a: "+ vezes);}
   }
 

       