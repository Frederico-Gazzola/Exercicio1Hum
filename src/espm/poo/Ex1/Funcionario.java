package espm.poo.Ex1;

public class Funcionario {
    
    public String cpf;
    public String nome;
    public double salario;
    public double valeRefeicao = 550.00;

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
        valeRefeicao = valeRefeicao * porcentagem;
    }
}
