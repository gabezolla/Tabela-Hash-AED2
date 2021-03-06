# Tabela-Hash-AED2

A arquitetura da aplicação é simples: as tuplas da tabela Hash baseiam-se na classe Tuple, que consiste em um objeto que contém três parâmetros: a chave (key), o valor (value), e a variável next, que servirá para apontar para o endereço de memória do próximo valor, estabelecendo a lista ligada. As funções hashMapMultiply e hashMapDivision, por sua vez, implementam os dois métodos de multiplicação e divisão, respectivamente, bem como contêm o array que armazenará as tuplas que serão recebidas. O App.java, por fim, possui a aplicação propriamente dita, e envolve um trecho de código gerador de números aleatórios (a partir das funções da biblioteca Math, .random() e .round()), para gerar chaves inteiras aleatórias e assim estudarmos o comportamento da função, bem como um gerador de Strings para fazer o papel do valor na tupla. Existe, também, uma interatividade com o usuário, caso ele queira construir a sua tabela Hash, se localiza no código comentado dentro do laço for. Por fim, há um método de busca de chaves na tabela a partir de entradas do usuário, também comentado a princípio, tendo em vista que não será necessário para o estudo em questão.
O repositório em questão pode ser encontrado no seguinte link: https://github.com/gabezolla/Tabela-Hash-AED2. Para utilizar a aplicação, basta colocar na pasta o arquivo (uma public class) desejado e utilizar as classes Tuple e hashMap da forma descrita anteriormente (bem como mostrada em App.java), ou fazer a importação do pacote manualmente por meio do import do Java.

Caso queira apenas os valores do array para cada valor de chave, basta comentar as linhas que correspondem à:

System.out.println("Chave atualizada. Valor de chave antiga: " + temporaryHead.getValue());
System.out.println("===== Colisão! =====");  
E SIMILARES.

E descomentar as linhas: 

// System.out.print(position+", "); // Linha inserida para o estudo e construção dos gráficos
