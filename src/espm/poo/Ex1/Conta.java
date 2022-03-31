package espm.poo.Ex1;

public class Conta {
    
    public int numero;
    public double saldo;
    public double limite;

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        limite = limite + valor;
    }

    public String consultarSaldo() {
        return "{saldo:" + saldo + "}";
    }

    public String gerarExtrato() {
        return "{total de dias: " + " 7 " +
                " saldo: " + saldo + "}";
    }

    public String gerarExtrato(int dias) {
        return "{total de dias: " + dias +
                " saldo: " + saldo + "}";
    }

}
