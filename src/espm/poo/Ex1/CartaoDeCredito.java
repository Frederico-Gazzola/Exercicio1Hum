package espm.poo.Ex1;

public class CartaoDeCredito {

    public int numero;
    public double totalFatura;

    public double consultarFatura() {
        return totalFatura;
    }

    public String retornarDados() {
        return "{número: " + numero 
                + " fatura: " + totalFatura
                + "}";
    }

    
}
