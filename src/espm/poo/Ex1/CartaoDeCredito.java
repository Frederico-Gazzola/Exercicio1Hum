package espm.poo.Ex1;

public class CartaoDeCredito {

    int numero;
    double totalFatura;

    public double consultarFatura() {
        return totalFatura;
    }

    public String retornarDados() {
        return "{número: " + numero 
                + " fatura: " + totalFatura
                + "}";
    }

    
}
