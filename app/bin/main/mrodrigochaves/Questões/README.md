Explique JDK, JRE e JVM:

JDK
JRE
JVMName
Significa Java Development Kit.
Significa Java Runtime Environment.
Significa Java Virtual Machine.
É a ferramenta necessária para compilar, documentar e empacotar programas Java.
JRE refere-se a um ambiente de tempo de execução no qual o bytecode Java pode ser executado.
É uma máquina abstrata. É uma especificação que fornece um ambiente de tempo de execução no qual o bytecode Java pode ser executado.
Ele contém ferramentas de desenvolvimento JRE +.
É uma implementação da JVM que existe fisicamente.
A JVM segue três notações: Especificação, Implementação e  Instância de tempo de execução .

2 - Explique public static void main(String args[]) em Java.
main() em Java é o ponto de entrada para qualquer programa Java. É sempre escrito como public static void main(String[] args) .
public : Public é um modificador de acesso, que é usado para especificar quem pode acessar este método. Público significa que este Método será acessível por qualquer Classe.
static : É uma palavra-chave em java que identifica que é baseado em classe. main() é feito estático em Java para que possa ser acessado sem criar a instância de uma classe. No caso de main não se tornar estático, o compilador lançará um erro, pois main () é chamado pela JVM antes de qualquer objeto ser criado e apenas métodos estáticos podem ser invocados diretamente por meio da classe. 
void : é o tipo de retorno do método. Void define o método que não retornará nenhum valor.
main : É o nome do método que é pesquisado pela JVM como ponto de partida para um aplicativo apenas com uma assinatura específica. É o método onde ocorre a execução principal.
String args[] : É o parâmetro passado para o método principal.

3 - Por que Java é independente de plataforma?
Java é chamado de independente de plataforma por causa de seus códigos de byte que podem ser executados em qualquer sistema, independentemente de seu sistema operacional subjacente.

4 - Por que Java não é 100% orientado a objetos?

Java não é 100% orientado a objetos porque faz uso de oito tipos de dados primitivos, como boolean, byte, char, int, float, double, long, short, que não são objetos.


5 - O que são classes wrapper em Java?
As classes wrapper convertem os primitivos Java nos tipos de referência (objetos). Todo tipo de dado primitivo tem uma classe dedicada a ele. Elas são conhecidas como classes wrapper porque “envolvem” o tipo de dado primitivo em um objeto dessa classe. Consulte a imagem abaixo que exibe diferentes tipos primitivos, classe wrapper e argumento do construtor.
