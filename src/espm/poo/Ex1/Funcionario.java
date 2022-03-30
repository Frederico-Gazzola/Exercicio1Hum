package espm.poo.Ex1;

public class Funcionario {
    
    String cpf;
    String nome;
    double salario;
    double valeRefeicao = 550.00;

    public String retornarDado() {
        return "{nome: " + nome +
                " cpf: " + cpf + 
                " salario: " + salario
                + "}";
    }

    public void aumentarSalario(double porcentagem) {
        salario = salario * porcentagem;
    }

    public void ajustarValeRefeicao(double porcentagem) {
        valeRefeicao = salario * porcentagem;
    }
}
