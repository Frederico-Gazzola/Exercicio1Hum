package espm.poo.Ex1;

public class Cliente {

    String nome;
    String cpf;
    CartaoDeCredito cartao = new CartaoDeCredito();

    public String retornarDados() {
        return  "{nome: " + nome +
                "cpf: " + cpf + "numero: "
                + cartao.numero + "saldo: "
                + cartao.totalFatura + "}";
        
    }

}