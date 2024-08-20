RAQUEL E RAILAN


1. Lista cinco exemplos de exceções comuns.
Em um método que salva um arquivo no disco rígido, pode ocorrer uma falha devido ao disco estar cheio; em um método que lê um número do teclado, pode ocorrer uma falha devido ao usuário digitar letras em vez de números; em método que seta o valor de um atributo, pode ocorrer uma falha se o valor recebido pelos parâmetros forem inconsistentes; uma aplicação robusta é aquela que consegue tratar corretamente as diversas exceções que possam vir a ocorrer.
2. Por que as técnicas de tratamento de exceções não devem ser utilizadas para controle convencional de programação?
O uso excessivo de exceções pode dificultar a manutenção do código, tornando mais difícil e confuso de entender.
3. Se nenhuma exceção for disparada em um bloco try, para onde segue o controle quando o bloco try completa a execução?
Se tiver um bloco finally, o bloco é executado. Se não tiver, ele segue para o próximo método caso não haja algum desvio.
4. O que acontece se ocorrer uma exceção e um tratador de exceções apropriado não puder ser localizado?
Ela é propagada para o nível mais externo. A propagação continua até que algum tratador seja encontrado ou até chegar ao nível da JVM.
5. O que acontece se vários tratadores correspondem ao tipo de objeto disparado?
Quando uma exceção é lançada, o bloco catch que é executado é o primeiro que corresponde ao tipo da exceção lançada. Se houver vários blocos catch que poderiam tratar a mesma exceção, o mais específico é escolhido. A ordem dos blocos catch é importante e deve seguir a hierarquia das exceções, com os blocos mais específicos aparecendo antes dos mais gerais. Caso não haja um bloco catch apropriado, a exceção se propaga para métodos chamadores e pode acabar encerrando o programa se não for tratada em nenhum ponto da pilha de chamadas.
6. Qual é a razão fundamental para utilizar blocos finally?
é utilizado para garantir que um conjunto específico de instruções seja sempre executado, independentemente de uma exceção ter sido lançada ou não. Ele é essencial para realizar operações de limpeza, como liberar recursos, fechar arquivos ou conexões, assegurando que essas ações sejam concluídas mesmo que ocorra um erro durante a execução do bloco try. Em resumo, o finally ajuda a manter a consistência e a segurança do programa ao garantir que o código crítico de liberação e finalização seja sempre executado.
7. O que acontece quando um tratador catch dispara uma Exception?
Quando um bloco catch captura uma Exception, o controle do programa é transferido do bloco try onde a exceção ocorreu para o bloco catch correspondente. Dentro deste bloco, o erro pode ser tratado, por exemplo, registrando uma mensagem, corrigindo o problema ou notificando o usuário. Após a execução do bloco catch, o fluxo de controle volta para a linha de código imediatamente após o bloco try-catch, e o programa continua sua execução normalmente. Se o bloco catch não resolver a exceção ou decidir re-lançá-la, a exceção pode ser propagada para blocos catch externos, se houver, ou, se não houver tratamento adicional, pode causar o término do programa.
8. O que acontece com uma referência local em um bloco try quando esse bloco dispara uma Exception?
Quando uma exceção é lançada dentro de um bloco try, as referências locais desse bloco são destruídas e seus recursos são liberados, pois elas estão limitadas ao escopo do try. O coletor de lixo trata da liberação de memória para essas referências assim que o bloco try termina ou o controle é transferido para fora dele.

