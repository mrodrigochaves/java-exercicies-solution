package main.java.mrodrigochaves;

import java.util.Calendar;
import java.util.GregorianCalendar;
import main.java.mrodrigochaves.Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
    
        Calendar dataNascimento = new GregorianCalendar(1990, Calendar.JANUARY, 1); 
        Pessoa pessoa = new Pessoa("Alice", dataNascimento, 1.65);
        
   
        pessoa.imprimeDados();
        int idade = pessoa.calculaIdade();
        System.out.println("A idade é: " + idade + " anos");
    }
}
