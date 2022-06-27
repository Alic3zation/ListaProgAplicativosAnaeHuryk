package exercicio1;
import java.util.Scanner;
public class exer1 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
    int numero1, numero2, soma;
    System.out.println("Digite o primeiro numero: ");
    numero1 = scan.nextInt();
    System.out.println("Digite o segundo numero: ");
    numero2 = scan.nextInt();
    soma= numero1+numero2;

    System.out.println("A soma dos numeros jerou o seguinte resultado: "+ soma);
}
}