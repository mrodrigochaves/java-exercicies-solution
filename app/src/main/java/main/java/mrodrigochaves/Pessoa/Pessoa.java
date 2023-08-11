package main.java.mrodrigochaves.Pessoa;

import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private double altura;

    public Pessoa( String nome, Date dataNascimento, double altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void imprimeDados(){
        System.out.println("O nome é: " + nome);
        System.out.println("A data de nascimento é: " + dataNascimento);
        System.out.println("A altura é: " + altura);
    }

    public int calculaIdade(){
        Date dataAtual = new Date();
        int anoAtual = dataAtual.getYear() + 1900;
        int anoNascimento = dataNascimento.getYear() + 1900;
        return anoAtual - anoNascimento;
    }
}
