package main.java.mrodrigochaves;

import java.util.Date;

import main.java.mrodrigochaves.Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
    
        Date dataNascimento = new Date(90, 0, 1); 
        Pessoa pessoa = new Pessoa("Alice", dataNascimento, 1.65);
        
   
        pessoa.imprimeDados();
        int idade = pessoa.calculaIdade();
        System.out.println("A idade é: " + idade + " anos");
    }

}
