package main.java.mrodrigochaves.ContaCorrente;

public class ContaCorrente {
    
    private Long id;
    private String nomeCliente;
    private double saldo;

    public ContaCorrente(Long id, String nomeCliente, double saldo) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nomeCliente = novoNome;
    }

    
}
