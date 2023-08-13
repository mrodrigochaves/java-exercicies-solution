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

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    
}
