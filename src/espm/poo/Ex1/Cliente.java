package espm.poo.Ex1;

public class Cliente {

    public String nome;
    public String cpf;
    public CartaoDeCredito cartao = new CartaoDeCredito();
    public Conta conta = new Conta();

    public String retornarDados() {
        return  "{nome: " + nome +
                " cpf: " + cpf + " número cartão: "
                + cartao.numero + " saldo cartão: "
                + cartao.totalFatura + " número conta: " +
                conta.numero + " saldo conta: " +
                conta.saldo + " limite conta: " + 
                conta.limite + "}";
        
    }

}