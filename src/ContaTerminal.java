import java.util.Scanner;

public class ContaTerminal {
   
public static void main(String[] args) {
    String Nome, Agencia;
    int Saldo, Numero;


    Scanner DadosCliente = new Scanner(System.in);

    System.out.println("qual é seu nome? :   ");
    Nome = DadosCliente.nextLine();

    
   System.out.println("digite numero de Usurario:  ");
   Numero = DadosCliente.nextInt();

   System.out.println("qual saldo inicial:  ");
   Saldo = DadosCliente.nextInt();

     DadosCliente.nextLine();
    System.out.println("digite o numero da agencia:   ");
    Agencia =  DadosCliente.nextLine();


    System.out.println("Olá "+Nome+", Obrigado por criar sua conta em nosso banco, sua agencia é "+Agencia+ ", conta "+Numero+" e seu saldo inicial de "+Saldo+"$ Já está disponivel para saque");

}
    

}
