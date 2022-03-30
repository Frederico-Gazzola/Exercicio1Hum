package espm.poo.Ex1;

public class Cliente {

    String nome;
    String cpf;
    CartaoDeCredito cartao = new CartaoDeCredito();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + 
               " cpf: " + cpf + "}";
    }

    public String retornarDados() {
        return  "{nome: " + nome +
                "cpf: " + cpf + "numero: "
                + cartao.numero + "saldo: "
                + cartao.saldo + "}";
        
    }

}