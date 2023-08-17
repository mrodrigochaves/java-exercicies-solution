# Perguntas sobre Java

#### 1 - Explique JDK, JRE e JVM:
JDK   | JRE | JVMName
--------- | ------ | ------
Significa Java Development Kit.|Significa Java Runtime Environment.| Significa Java Virtual Machine. 
É a ferramenta necessária para compilar, documentar e empacotar programas Java. JRE refere-se a um ambiente de tempo de execução no qual o bytecode Java pode ser executado. | É uma máquina abstrata. É uma especificação que fornece um ambiente de tempo de execução no qual o bytecode Java pode ser executado. Ele contém ferramentas de desenvolvimento JRE +. | É uma implementação da JVM que existe fisicamente. A JVM segue três notações: Especificação, Implementação e  Instância de tempo de execução .

#### 2 - Explique public static void main(String args[]) em Java.
-  main() em Java é o ponto de entrada para qualquer programa Java. É sempre escrito como public static void main(String[] args). 
- public : Public é um modificador de acesso, que é usado para especificar quem pode acessar este método. Público significa que este Método será acessível por qualquer Classe.
- static : É uma palavra-chave em java que identifica que é baseado em classe. main() é feito estático em Java para que possa ser acessado sem criar a instância de uma classe. No caso de main não se tornar estático, o compilador lançará um erro, pois main () é chamado pela JVM antes de qualquer objeto ser criado e apenas métodos estáticos podem ser invocados diretamente por meio da classe. 
- void : é o tipo de retorno do método. Void define o método que não retornará nenhum valor. 
- main : É o nome do método que é pesquisado pela JVM como ponto de partida para um aplicativo apenas com uma assinatura específica. É o método onde ocorre a execução principal.
- String args[] : É o parâmetro passado para o método principal.

#### 3 - Por que Java é independente de plataforma?
Java é chamado de independente de plataforma por causa de seus códigos de byte que podem ser executados em qualquer sistema, independentemente de seu sistema operacional subjacente.

#### 4 - Por que Java não é 100% orientado a objetos?

Java não é 100% orientado a objetos porque faz uso de oito tipos de dados primitivos, como boolean, byte, char, int, float, double, long, short, que não são objetos.

#### 5 - O que são classes wrapper em Java?
As classes wrapper convertem os primitivos Java nos tipos de referência (objetos). Todo tipo de dado primitivo tem uma classe dedicada a ele. Elas são conhecidas como classes wrapper porque “envolvem” o tipo de dado primitivo em um objeto dessa classe. Consulte a imagem abaixo que exibe diferentes tipos primitivos, classe wrapper e argumento do construtor.

#### 6 - O que são construtores em Java?
Em Java, construtor refere-se a um bloco de código usado para inicializar um objeto. Deve ter o mesmo nome da classe. Além disso, não possui tipo de retorno e é chamado automaticamente quando um objeto é criado.
 Existem dois tipos de construtores:
- Construtor Padrão: Em Java, um construtor padrão é aquele que não recebe nenhuma entrada. Em outras palavras, os construtores padrão são os construtores sem argumento que serão criados por padrão caso nenhum outro construtor seja definido pelo usuário. Seu principal objetivo é inicializar as variáveis ​​de instância com os valores padrão. Além disso, é usado principalmente para a criação de objetos. 

- Construtor Parametrizado: O construtor parametrizado em Java é o construtor capaz de inicializar as variáveis ​​de instância com os valores fornecidos. Em outras palavras, os construtores que recebem os argumentos são chamados de construtores parametrizados.

#### 7 - O que é classe singleton em Java e como podemos criar uma classe singleton?
A classe Singleton é uma classe cuja única instância pode ser criada a qualquer momento, em uma JVM. Uma classe pode se tornar singleton tornando seu construtor privado.

#### 8 - Qual é a diferença entre lista de array e vetor em Java?

ArrayList | Vetor
------    | ------
A lista de matrizes não está sincronizada. | O vetor é sincronizado.
Array List é rápido, pois não é sincronizado. | O vetor é lento, pois é thread-safe.
Se um elemento for inserido na Lista de Array, ele aumenta seu tamanho de Array em 50%. | O padrão do vetor é dobrar o tamanho de sua matriz.
Array List não define o tamanho do incremento. | Vector define o tamanho do incremento.
A lista de matrizes só pode usar o Iterator para percorrer uma lista de matrizes. | Vector pode usar Enumeração e Iterator para percorrer.

#### 9 - Qual é a diferença entre equals () e == em Java?
O método Equals() é definido na classe Object em Java e usado para verificar a igualdade de dois objetos definidos pela lógica de negócios.
“==” ou operador de igualdade em Java é um operador binário fornecido pela linguagem de programação Java e usado para comparar primitivos e objetos. public boolean equals(Object o) é o método fornecido pela classe Object. A implementação padrão usa o operador == para comparar dois objetos. Por exemplo: o método pode ser substituído como a classe String. equals() é usado para comparar os valores de dois objetos.

#### 10 - Quando você pode usar a palavra-chave super? 
Em Java, a palavra-chave super é uma variável de referência que se refere a um objeto de classe pai imediato.
Ao criar uma instância de subclasse, você também está criando uma instância da classe pai, que é referenciada pela variável de super referência.
Os usos da super palavra-chave Java são: 
- Para se referir a uma variável de instância de classe pai imediata, use super.
- A palavra-chave super pode ser usada para chamar o método de uma classe pai imediata.
- Super() pode ser usado para chamar o construtor da classe pai imediata.
- 
#### 11 - O que torna um HashSet diferente de um TreeSet?
HashSet | TreeSet
------  | ------
É implementado através de uma tabela hash. | TreeSet implementa a interface SortedSet que usa árvores para armazenar dados.
Ele permite o objeto nulo. | Não permite o objeto nulo.
É mais rápido que o TreeSet, especialmente para operações de pesquisa, inserção e exclusão. | É mais lento que o HashSet para essas operações.
Não mantém os elementos de forma ordenada. | Os elementos são mantidos em uma ordem classificada. 
Ele usa o método equals() para comparar dois objetos. | Ele usa o método compareTo() para comparar dois objetos.
Não permite um objeto heterogêneo. | Permite um objeto heterogêneo.

#### 12 - Quais são as diferenças entre HashMap e HashTable em Java?
HashMap | Hashtable
------  | ------
Não é sincronizado. Ele não pode ser compartilhado entre muitos threads sem o código de sincronização adequado. | Está sincronizado. É thread-safe e pode ser compartilhado com muitos threads.
Ele permite uma chave nula e vários valores nulos. | Ele não permite nenhuma chave ou valor nulo.
é uma nova classe introduzida no JDK 1.2. | Ele também estava presente em versões anteriores do java.
É mais rápido. | É mais lento.
Ele é percorrido pelo iterador. | Ele é percorrido por Enumerator e Iterator.
Ele usa um iterador rápido de falha. | Ele usa um enumerador que não falha rapidamente.
Ele herda a classe AbstractMap. | Ele herda a classe Dictionary.

#### 13 - Qual é a importância da Reflection em Java?
Reflection é uma API de tempo de execução para inspecionar e alterar o comportamento de métodos, classes e interfaces. O Java Reflection é uma ferramenta poderosa que pode ser realmente benéfica. O Java Reflection permite analisar classes, interfaces, campos e métodos durante o tempo de execução sem saber como eles são chamados no tempo de compilação. A reflexão também pode ser usada para criar novos objetos, chamar métodos e obter/definir valores de campo. Classes externas definidas pelo usuário podem ser usadas criando instâncias de objetos de extensibilidade com seus nomes totalmente qualificados. Os depuradores também podem usar a reflexão para examinar membros privados de classes.

### 14 - Como não permitir a serialização de atributos de uma classe em Java?
O atributo Non-Serialized pode ser usado para impedir que as variáveis ​​de membro sejam serializadas.
Você também deve tornar um objeto que potencialmente contém dados confidenciais de segurança não serializáveis, se possível. Aplique o atributo Não serializado a determinados campos que armazenam dados confidenciais se o objeto precisar ser serializado. Se você não excluir esses campos da serialização, os dados que eles armazenam ficarão visíveis para qualquer programa com permissão de serialização.

#### 15- Você pode chamar um construtor de uma classe dentro de outro construtor?
Sim, podemos chamar um construtor de uma classe dentro de outro construtor. Isso também é chamado de encadeamento de construtores. O encadeamento do construtor pode ser feito de 2 maneiras:
- Dentro da mesma classe: Para construtores da mesma classe, a palavra-chave this() pode ser usada.
- Da classe base: A palavra-chave super() é usada para chamar o construtor da classe base.O encadeamento do construtor segue o processo de herança. O construtor da subclasse primeiro chama o construtor da superclasse. Devido a isso, a criação do objeto da subclasse começa com a inicialização dos membros de dados da superclasse. O encadeamento do construtor funciona de maneira semelhante com qualquer número de classes. Cada construtor continua chamando a cadeia até o topo da cadeia.

#### 16. Locais de memória contíguos geralmente são usados ​​para armazenar valores reais em uma matriz, mas não em ArrayList. Explicar.
Uma matriz geralmente contém elementos dos tipos de dados primitivos, como int, float, etc. Nesses casos, a matriz armazena diretamente esses elementos em locais de memória contíguos. Enquanto um ArrayList não contém tipos de dados primitivos. Um arrayList contém a referência dos objetos em diferentes locais de memória em vez do próprio objeto. É por isso que os objetos não são armazenados em locais de memória contíguos.

#### 17. Como a criação de uma String usando new() é diferente da criação de um literal?
Quando criamos uma string usando new(), um novo objeto é criado. Considerando que, se criarmos uma string usando a sintaxe literal de string, ela pode retornar um objeto já existente com o mesmo nome.

#### 18. Por que a sincronização é necessária? Explique com a ajuda de um exemplo relevante.
Java permite que vários threads sejam executados. Eles podem estar acessando a mesma variável ou objeto. A sincronização ajuda a executar threads um após o outro.
É importante porque ajuda a executar todos os threads simultâneos enquanto está em sincronia. Evita erros de consistência de memória devido ao acesso à memória compartilhada. Um exemplo de código de sincronização é:

public synchronized void increment()
{
a++;
}

Como sincronizamos esta função, este thread só pode usar o objeto depois que o thread anterior o tiver usado.

#### 19. Explique o termo “Inicialização de chaves duplas” em Java?
Double Brace Initialization é um termo Java que se refere à combinação de dois processos independentes. Existem duas chaves usadas nisso. A primeira chave cria uma classe interna anônima. A segunda chave é um bloco de inicialização. Quando ambos são usados ​​juntos, é conhecido como inicialização de chave dupla. A classe interna tem uma referência à classe externa envolvente, geralmente usando o ponteiro 'this'. Ele é usado para criar e inicializar em uma única instrução. Geralmente é usado para inicializar coleções. Reduz o código e também o torna mais legível.


#### 20. Por que é dito que o método length() da classe String não retorna resultados precisos?
O método length() da classe String não retorna resultados precisos porque
simplesmente leva em consideração o número de caracteres dentro da String. Em outras palavras, pontos de código fora do BMP (Basic Multilingual Plane), ou seja, pontos de código com valor de U+10000 ou superior, serão ignorados.
A razão para isso é histórica. Um dos objetivos originais de Java era considerar todo o texto como Unicode; ainda assim, o Unicode não definia pontos de código fora do BMP na época. Era tarde demais para modificar char quando o Unicode especificou esses pontos de código.

#### 21. Quais são as diferenças entre Heap e Stack Memory em Java?
A principal diferença entre a memória Heap e Stack são:

Características |  Pilha  | pilha
    ------      |  ------ | ------
Memória         | A memória da pilha é usada apenas por um thread de execução. | A memória heap é usada por todas as partes do aplicativo. | 
Acesso          | A memória da pilha não pode ser acessada por outros threads. | Os objetos armazenados no heap são acessíveis globalmente.
Gerenciamento de memória | Segue o modo LIFO para liberar memória. | A gestão da memória baseia-se na geração associada a cada objeto.
Vida | Existe até o final da execução da thread. | A memória heap vive desde o início até o final da execução do aplicativo.
Uso | A memória da pilha contém apenas primitivas locais e variáveis ​​de referência para objetos no espaço de heap. | Sempre que um objeto é criado, ele sempre é armazenado no espaço Heap.


