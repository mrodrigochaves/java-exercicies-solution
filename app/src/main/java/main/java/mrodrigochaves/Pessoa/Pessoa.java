package main.java.mrodrigochaves.Pessoa;

import java.util.Calendar;


public class Pessoa {

    private String nome;
    private Calendar dataNascimento;
    private double altura;

    public Pessoa( String nome, Calendar dataNascimento, double altura){
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
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
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

    public int calculaIdade() {
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int anoNascimento = dataNascimento.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }
}
