package mrodrigochaves;

import java.util.Calendar;
import java.util.GregorianCalendar;

import mrodrigochaves.ContaCorrente.ContaCorrente;
import mrodrigochaves.Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
    
        Calendar dataNascimento = new GregorianCalendar(1990, Calendar.JANUARY, 1); 
        Pessoa pessoa = new Pessoa("Alice", dataNascimento, 1.65);
        
   
        pessoa.imprimeDados();
        int idade = pessoa.calculaIdade();
        System.out.println("A idade é: " + idade + " anos");


        ContaCorrente contaCorrente = new ContaCorrente(1L, "João", 250.00);
        
        contaCorrente.saque(100.00);
        contaCorrente.deposito(50.00);
        contaCorrente.saldo();
        
        contaCorrente.save();

    }
}
