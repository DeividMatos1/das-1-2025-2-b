Deivid Matos

https://github.com/DeividMatos1/das-1-2025-2-b

# Aula – 31/07

# Tema: Abstração

A abstração é uma representação simplificada de uma entidade,
permitindo que possamos interagir com ela e tirar proveito de suas funcionalidades
sem a necessidade de compreender todos os seus detalhes internos.
Nas linguagens de programação, a abstração é viabilizada por meio de diversos recursos
clássicos, como classes, interfaces, pacotes e bibliotecas.
Esses instrumentos possibilitam a criação de estruturas mais organizadas,
reutilizáveis e de fácil manutenção, promovendo o desenvolvimento de sistemas
mais eficientes e compreensíveis.

# Tema: complexidade

A complexidade em engenharia de software refere-se à dificuldade de entender,
modificar e manter um sistema à medida que ele cresce. Para lidar com isso,
utilizamos abstrações como classes, interfaces, pacotes e bibliotecas,
que ajudam a organizar o código e tornar o sistema mais compreensível e reutilizável.
Este projeto busca minimizar a complexidade por meio de uma arquitetura modular
e boas práticas de desenvolvimento, facilitando a manutenção e evolução contínua do software.

# Tema: Orientação a objetos

A orientação a objetos (OO) é um paradigma de programação que organiza o software em torno de objetos,
que são instâncias de classes. Cada objeto representa uma entidade do mundo real,
contendo atributos (dados) e métodos (comportamentos).
Esse modelo facilita o desenvolvimento de sistemas mais organizados, reutilizáveis e fáceis de manter,
por meio de quatro pilares principais:

```bash
Abstração: foca nos aspectos essenciais de um objeto, ocultando detalhes desnecessários.
Encapsulamento: protege os dados internos do objeto, permitindo acesso controlado.
Herança: permite que uma classe herde características de outra.
Polimorfismo: possibilita que diferentes objetos respondam de maneira distinta a uma mesma ação.
```

# Tema: Frameworks

Frameworks são estruturas de código reutilizáveis que fornecem uma base para o desenvolvimento de aplicações. Eles oferecem um conjunto de ferramentas, bibliotecas e boas práticas que ajudam a acelerar
o desenvolvimento, padronizar o código e reduzir erros.

Ao utilizar um framework, o desenvolvedor segue uma arquitetura pré-definida, focando mais na lógica do negócio do que na infraestrutura do sistema.

# Aula dia 04/08

# Tema: Desenvolvimento em Paralelo

Esse princípio está ligado à decomposição de problemas. Ao dividir um sistema em módulos ou componentes independentes, diferentes partes podem ser desenvolvidas simultaneamente por equipes distintas. Isso acelera o desenvolvimento e melhora a produtividade. A independência entre os módulos é essencial para evitar conflitos e facilitar a integração posterior.

# Tema: Flexibilidade a Mudanças

Sistemas bem projetados devem ser modulares e de baixo acoplamento, o que facilita alterações em partes específicas sem afetar o restante do sistema. Isso é importante porque mudanças são inevitáveis durante o ciclo de vida do software. Princípios como aberto/fechado (o sistema deve estar aberto para extensão, mas fechado para modificação) ajudam a garantir essa flexibilidade.

# Tema: Facilidade de Entendimento

Um bom projeto deve ser simples e claro, permitindo que outros desenvolvedores compreendam rapidamente o funcionamento do sistema. Isso é alcançado por meio de abstrações bem definidas, nomes significativos, coesão nos módulos e ocultamento de informação (expor apenas o necessário). Quanto mais fácil for entender o sistema, mais fácil será mantê-lo e evoluí-lo.

# Tema: Getter e Setters
Getters e setters são métodos usados para acessar e modificar os atributos (variáveis) de um objeto de forma controlada. Eles fazem parte do princípio de encapsulamento, que visa proteger os dados internos de uma classe e expor apenas o necessário.

# Tema: Coesão
Refere-se ao quanto os elementos de um módulo estão focados em uma única tarefa. Alta coesão torna o código mais fácil de entender, manter e reutilizar.

# Tema: Acoplamento

Acoplamento é o grau de dependência entre módulos ou classes de um sistema. Quanto mais uma classe depende de outra para funcionar, maior o acoplamento. Isso dificulta a manutenção, testes e reutilização do código.

```bash
 "Maximize a coesão das classes e minimize o acoplamento entre elas"
```

# Tema: @Autowired
No Spring Framework, a anotação @Autowired permite a injeção automática de dependências. Ou seja, o Spring cria e fornece os objetos necessários para uma classe, sem que ela precise instanciá-los diretamente.

```bash
"Isso promove o baixo acoplamento, pois:
A classe depende de interfaces ou abstrações, não de implementações concretas.
O controle da criação dos objetos fica com o container do Spring, não com a classe."
```

# Tema: SOLID

O que é SOLID?
SOLID é um conjunto de cinco princípios de design de software orientado a objetos que ajudam a criar sistemas mais flexíveis, compreensíveis e fáceis de manter. Cada letra representa um princípio:

```bash
S – Single Responsibility Principle (Princípio da Responsabilidade Única)
    Uma classe deve ter apenas uma razão para mudar, ou seja, uma única responsabilidade. Isso torna o código mais organizado e fácil de manter.

O – Open/Closed Principle (Princípio Aberto/Fechado)
    O software deve estar aberto para extensão, mas fechado para modificação. Você pode adicionar novas funcionalidades sem alterar o código existente.

L – Liskov Substitution Principle (Princípio da Substituição de Liskov)
    Objetos de uma classe derivada devem poder substituir objetos da classe base sem alterar o comportamento do programa.

I – Interface Segregation Principle (Princípio da Segregação de Interface)
    Uma classe não deve ser forçada a implementar interfaces que não usa. É melhor ter várias interfaces específicas do que uma única interface genérica.

D – Dependency Inversion Principle (Princípio da Inversão de Dependência)
    As classes devem depender de abstrações (interfaces), não de implementações concretas. Isso reduz o acoplamento e aumenta a flexibilidade.
```
# Aula dia 07/08

# Tema Princípio da Responsabilidade Única 

O Princípio da Responsabilidade Única (SRP) afirma que cada classe deve ter apenas uma responsabilidade, ou seja, um único motivo para mudar. Na prática, isso significa separar bem as funções de cada camada da aplicação:

```bash
Entity - representa os dados e regras básicas de negócio, como um modelo de usuário com validações.
Repository - cuida da persistência, sendo responsável por salvar, buscar e atualizar dados no banco.
Service - concentra as regras de negócio mais complexas, coordenando entidades e repositórios.
Controller - recebe as requisições (como de uma API), chama os serviços e retorna as respostas.

# Essa separação torna o código mais organizado, fácil de manter e testar.

```
# Tema Herança

Na programação orientada a objetos e em diagramas UML, a seta de herança representa que uma classe herda de outra, ou seja, ela é um tipo da classe pai. Essa seta é vazada e contínua, apontando da subclasse para a superclasse.

# Tema Associação

A associação indica que uma classe usa ou se relaciona com outra, como quando uma Pessoa tem um Endereco. Essa relação é mostrada com uma linha simples, podendo ter setas para indicar direção e multiplicidade (como 1 ou muitos).

# Tema Interface

Já a interface define um contrato de métodos que uma classe deve implementar. A seta que representa a implementação de uma interface é pontilhada e com ponta vazada, apontando da classe que implementa para a interface.

# Tema Princípio da Segregação de Interfaces

O Princípio da Segregação de Interfaces afirma que uma classe não deve ser forçada a implementar métodos que não utiliza. Ou seja, é melhor ter várias interfaces pequenas e específicas do que uma única interface grande e genérica. Isso evita que classes fiquem sobrecarregadas com responsabilidades que não fazem sentido para elas.




# Aula dia 01/09

# Expectativas de um Arquiteto

```bash
"Tomar decisoes de arquitetura,
Analisar continuamente a arquitetura,
Manter-se atualizado com as ultimas tendências,
Assegurar a conformidade com as decisoes,
Exposicão diversificadas,
Ter conhecimento sobre o dominio do negocio,
Ter habilidades interpessoais, 

Orientacão é a palavra de ordem nessa primeira expectativa,
framework reativo para o desenvolvimento web front-end"
```
# DevOps ∞

> **Função – Entregar valor**

1-Planejar
2-Programar/ criar
3-Integracao continua
4-implantar
5-Operar
6-Comentarios Continuos

![alt text](image.png)

"Continuous deployment/delivery"

""Continuous integrations"

# Aula 04/09

# Arquitetura

A arquitetura é como o planejamento da estrutura. É quem decide como tudo vai funcionar por dentro. O arquiteto escolhe as ferramentas, define os caminhos, organiza os componentes e garante que tudo esteja bem conectado e funcionando de forma segura e eficiente.

```bash
Planeja o funcionamento interno.
Escolhe tecnologias e ferramentas.
Lidera tecnicamente o projeto.
```

# Como é a formação do conhecimento de um arquiteto modelo T?

O arquiteto precisa ter um conhecimento em várias áreas, tendo um conhecimento mais amplo, como destacado no livro.

"Como arquiteto, amplitude é mais importante do que profundidade."

![alt text](image-1.png)

"Os arquitetos devem focar a amplitude técnica para que tenham uma aljava maior a partir da qual tiram suas flechas."

# Design

O design cuida da parte visual e da experiência do usuário. Ele pensa em como as coisas vão aparecer na tela, se são fáceis de usar, se estão bonitas e agradáveis. O designer se preocupa com cores, botões, fontes e com a forma como o usuário interage com o sistema.

```bash
"Cuida da aparência e da usabilidade.
Foca na experiência do usuário.
Trabalha com cores, formas e interações.
Torna o uso mais intuitivo e agradável."
```
"Arquitetura pensa na estrutura e funcionamento.
Design pensa na aparência e experiência."

# Aula 08/09 e 11/09

# Tema: Análise de Trade-offs em Arquitetura de Sistemas

Conceito Central
Pensar como arquiteto de software exige a capacidade de identificar e avaliar vantagens e desvantagens (trade-offs) em cada decisão técnica. Em arquitetura, raramente há uma resposta definitiva — a solução ideal depende do contexto, que inclui fatores como:
Ambiente operacional
Orçamento disponível
Cultura organizacional
Prazos estabelecidos
Competências da equipe envolvida
Não existem respostas absolutamente certas ou erradas, mas sim escolhas conscientes entre diferentes trade-offs.
Estudo de Caso: Sistema de Leilão
No exemplo prático apresentado, o serviço denominado “Quem dá o lance” é responsável por enviar lances para três serviços distintos:

Capturar
Rastrear
Analisar

Para viabilizar essa comunicação, foram consideradas duas abordagens de mensageria:
Tópico (publish/subscribe):
Proporciona maior extensibilidade
Favorece o desacoplamento entre os serviços
Fila (point-to-point):
Cada consumidor recebe sua própria fila
Pode ser mais simples de gerenciar em cenários específico
Reflexão Final
O papel do arquiteto vai além da escolha inicial da solução. É essencial realizar uma análise contínua dos impactos relacionados a:
Segurança
Acoplamento entre componentes
Contratos de integração
Escalabilidade da solução

Compreender os benefícios e riscos de cada alternativa é fundamental para tomar decisões técnicas alinhadas aos objetivos do negócio e à realidade da organização.

# Tema: Trade-offs em Tópicos vs Filas

Vantagens do uso de tópicos (publish/subscribe)
Extensibilidade arquitetural: fácil adicionar novos serviços sem alterar o produtor.
Desacoplamento: o produtor não precisa conhecer os consumidores.
Desvantagens do uso de tópicos
Segurança: dados mais expostos, qualquer consumidor pode escutar.
Contrato único: todos os serviços precisam consumir a mesma estrutura de dados.
Monitoramento limitado: mais difícil aplicar autoescalabilidade.
Vantagens do uso de filas (point-to-point)
Segurança: cada fila é consumida por um destinatário específico.
Contratos heterogêneos: cada serviço pode ter seu próprio formato de dados.
Escalabilidade programática: filas podem ser monitoradas individualmente.
Conclusão
Não existe escolha definitiva entre filas e tópicos.
A decisão depende do que é mais importante no contexto:
Extensão e desacoplamento (tópicos)
Segurança, flexibilidade de contrato e monitoramento (filas).


# Tema: Capítulo 4 – Definição das Características da Arquitetura

O que são Características da Arquitetura?
As características da arquitetura são aspectos críticos não-funcionais que:
Especificam considerações de design fora do domínio do problema;
Influenciam a estrutura do sistema;
São essenciais ou importantes para o sucesso da aplicação.
Três critérios para definir uma característica da arquitetura:
Fora do domínio: Não descreve funcionalidade de negócio.
Impacta a estrutura: Requer decisões específicas de design.
É crítica ao sucesso: Deve ser priorizada intencionalmente.
Categorias com Exemplos Visuais:
Auditoria
Desempenho
Segurança 
Requisitos 
Dados 
Legalidade 
Escalabilidade 
Classificações de Características:
Operacionais
Relacionadas ao comportamento do sistema em produção:
Disponibilidade, Desempenho, Escalabilidade, Elasticidade, Confiabilidade, Robustez, Recuperabilidade, Continuidade
Estruturais
Focadas na organização do código e arquitetura interna:
Modularidade, Reusabilidade, Portabilidade, Manutenibilidade, Instalabilidade, Configurabilidade, Atualização, Suporte técnico
Transversais
Características que atravessam camadas e domínios:
Segurança (autenticação/autorização), Privacidade, Legalidade e Conformidade, Usabilidade, Acessibilidade, Armazenamento, Log/Auditoria, Suporte operacional
Trade-offs e Equilíbrio:
Melhorar uma característica geralmente impacta negativamente outra (exemplo: segurança vs. desempenho).
Arquitetura envolve escolhas e compensações, como pilotar um helicóptero: ajustar um controle afeta os outros.
O ideal não é a "melhor arquitetura", mas sim a "menos pior", adequada ao contexto.
Iteração e Adaptabilidade:
Evite projetar para “todas as possibilidades”.
Características devem ser priorizadas, validadas em ciclos e adaptadas conforme o sistema evolui.
A arquitetura deve permitir mudanças frequentes, seguindo princípios ágeis.

# Segundo Bimestre

# Aula 06/10

# Tema: Características da Arquitetura de Software

1. Conceito de Arquitetura de Software

A arquitetura define as principais decisões estruturais de um sistema.
Abrange tanto requisitos funcionais (o que o sistema faz) quanto características arquiteturais (como o sistema se comporta e se mantém eficiente).
Enquanto design e codificação tratam da implementação detalhada, a arquitetura lida com decisões amplas que afetam desempenho, segurança, escalabilidade e manutenibilidade.

2. Diferença entre Arquitetura, Design e Codificação
Nível	Foco	Escala
Arquitetura	Diretrizes e estrutura global	Sistema inteiro
Design	Estruturação de componentes e classes	Partes específicas
Codificação	Implementação direta em código	Detalhes

3. Características da Arquitetura

Também chamadas de requisitos arquiteturais (ou erroneamente de “requisitos não funcionais”).
Definem como o sistema deve atender suas necessidades, além das funções diretas.
Devem ser cuidadosamente escolhidas, pois aumentam a complexidade do sistema.

4. Critérios de uma Característica Arquitetural

Uma característica é válida quando:
Especifica uma consideração fora do domínio funcional
→ Ex.: desempenho mínimo, segurança, débito técnico.

Influencia a estrutura do design
→ Ex.: processamento de pagamentos exige módulos seguros.

É essencial para o sucesso do sistema
→ Ex.: disponibilidade e confiabilidade são cruciais mesmo sem estarem documentadas.

Esses três critérios formam um triângulo interdependente, o que gera trade-offs (melhorar um pode prejudicar outro).

5. Categorias de Características Arquiteturais
5.1 Operacionais

Afetam o comportamento do sistema em execução.
Exemplos:
Disponibilidade, Continuidade, Desempenho, Escalabilidade, Confiabilidade, Robustez e Recuperabilidade.

 5.2 Estruturais

Relacionadas à qualidade interna e à organização do código.
Exemplos:
Configuração, Extensão, Manutenção, Portabilidade, Reutilização, Atualização.

5.3 Transversais

Atingem todo o sistema.
Exemplos:
Acessibilidade, Autenticação, Autorização, Privacidade, Legalidade (LGPD/GDPR), Segurança, Usabilidade.

6. Caso “Como na Itália” (Italy-ility)

Uma empresa exigiu resiliência total após perder comunicação com filiais italianas.
Criou o termo “Italy-ility”, combinação de disponibilidade + recuperabilidade + resiliência.
Mostra como o contexto de negócio pode definir novas características arquiteturais.

7. Padrões ISO de Características

A ISO padroniza atributos de qualidade, como:
Eficiência de desempenho, Compatibilidade, Usabilidade, Confiabilidade, Segurança, Manutenibilidade e Portabilidade.
A Adequação Funcional é funcional, portanto, fora da arquitetura.

8. Ambiguidades e Terminologia

Falta de padronização entre empresas causa confusão.
Domain-Driven Design (DDD) ajuda a criar uma linguagem comum entre equipes.

9. Trade-offs e Arquitetura “Menos Pior”

Melhorar uma característica pode piorar outra (ex.: segurança x desempenho).
O arquiteto deve buscar equilíbrio, não perfeição.
Melhor estratégia: arquitetura iterativa e adaptável, ajustável com o tempo — princípio do desenvolvimento ágil.

Conclusão

Muitas características → sistema genérico e difícil de manter.
Melhor criar uma arquitetura flexível e evolutiva, ajustada conforme o aprendizado.
A iteração é fundamental em todos os níveis, inclusive na arquitetura.

# Aula 09/10

# Tema: Retry Pattern
Conceito

O Retry pattern é usado para permitir que uma aplicação lide com falhas transientes (intermitentes) ao se conectar com um serviço remoto ou recurso de rede. 
Microsoft Learn

Exemplos: perda momentânea de conexão, serviço temporariamente indisponível, time-out devido a carga. 
Microsoft Learn

Solução

Introduzir um mecanismo que tente novamente a operação que falhou, com uma política de “número de tentativas” + “intervalos de espera” + possíveis aumentos de atraso entre tentativas. 
Microsoft Learn
A aplicação deve envolver chamadas a serviços remotos em código que aplica essa política de retry. 
Microsoft Learn


Estratégias de retry

Cancelar (fail fast) se o erro for permanente ou improvável de ser eliminado. 
Microsoft Learn
Tentar logo (retry immediately) quando falha for rara ou rápida de resolver. 
Microsoft Learn
Tentar após atraso (retry after delay), possivelmente com atraso crescente (exponencial) para evitar sobrecarregar o serviço. 
Microsoft Learn

Considerações importantes

Verificar se a operação é idempotente (ou seja, se repetir não causa efeitos indesejados) — senão retry pode duplicar efeitos indesejados. 
Microsoft Learn
Ajustar política de retry conforme tipo de exceção/falha. 
Microsoft Learn
Impacto no desempenho: retry demasiadas vezes ou muito seguidas pode degradar o sistema ou serviço remoto. 
Microsoft Learn
Quando a falha for mais duradoura ou sistemática, usar outro padrão como o Circuit Breaker pattern pode ser mais adequado. 
Microsoft Learn

Quando usar

Use o padrão quando se espera que falhas sejam transitórias, e repetir a solicitação possa ter sucesso. 
Microsoft Learn
Evite usar quando a falha é permanente ou repetida, ou quando a política de retry pode introduzir latência excessiva ou carga extra. 
Microsoft Learn

2. Relação com “Definições das Características Arquiteturais”

Usar o Retry pattern está ligado a várias características arquiteturais operacionais, tais como confiabilidade, recuperabilidade (capacidade de se recuperar de falhas), e disponibilidade.
Também afeta desempenho e robustez porque políticas de retry mal desenhadas podem prejudicar o desempenho ou sobrecarregar serviços.
Do ponto de vista estrutural, a implementação de retry exige diretrizes de design (como modularização, tratamento de exceções, etc) — ou seja, a arquitetura precisa suportar esse tipo de comportamento.
Ainda, como parte do equilíbrio de trade-offs: aumentar retry pode melhorar confiabilidade, mas pode prejudicar latência ou throughput, ou desperdiçar recursos. Isso entra no “menos pior” da arquitetura: escolher políticas razoáveis, não extremas.
No contexto de características transversais: se o sistema interage com serviços remotos, o retry pode influenciar política de segurança, de privacidade (se a operação envolve dados sensíveis e for repetida), e de acordo com normas legais se a falha tiver impacto regulatório.
