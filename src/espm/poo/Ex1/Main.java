package espm.poo.Ex1;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Cliente cl1 = new Cliente();
        System.out.print("Nome: ");
        cl1.nome = scan.nextLine();
        System.out.print("CPF: ");
        cl1.cpf = scan.nextLine();

        Conta conta = new Conta();
        System.out.print("Número: ");
        conta.numero = scan.nextInt();
        System.out.print("Limite: ");
        conta.limite = scan.nextInt();
        System.out.print("Saldo: ");
        conta.saldo = scan.nextInt();

        CartaoDeCredito cartao = new CartaoDeCredito();
        System.out.print("Número: ");
        cartao.numero = scan.nextInt();
        System.out.print("Saldo: ");
        cartao.totalFatura = scan.nextInt();

        cl1.cartao = cartao;
        cl1.conta = conta;
        System.out.println(cl1.retornarDados());
    }
    
}
