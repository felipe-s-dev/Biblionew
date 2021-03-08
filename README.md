# Biblonew
Este projeto procura da melhor forma possível, uma integração mais eficaz entre os usuários e a biblioteca. Desde a invenção da prensa pelo alemão Johann Gutenberg, a popularização e barateamento de tecnologias de impressão tem permitido uma elevação da produção científica, permitindo que livros estejam mais acessíveis à população. O fomento de políticas públicas voltadas à educação também possibilita a instalação de bibliotecas públicas nas cidades e municípios. 
Todavia, o gerenciamento de acervos bibliográficos não representa uma tarefa de simples realização. existem cursos superiores voltados especificamente para o inequívoco exercício desta atividade. Ainda assim, por mais capacitado que seja o profissional, a utilização de controles realizados em livros, papéis e até mesmo em planilhas pode acarretar em problemas como desorganização do acervo, catalogação complexa, dentre outros. 
Este trabalho se propõe a desenvolver uma ferramenta livre e de código aberto destinada a bibliotecas em geral, com o intuito de melhorar a organização e o acesso para todo tipo de usuário, seja ele especializado ou não na disciplina de biblioteconomia. Por meio dela, também será possível realizar o controle dos seus frequentadores, bem como dos empréstimos de livros por eles realizados. 
A implementação do sistema possibilitará às bibliotecas prestarem seus serviços de forma organizada, centralizando e aperfeiçoando assim a gestão.


## ABRANGÊNCIA DO SISTEMA

Requisitos funcionais: 

Manter usuário: permite cadastrar, efetuar login e logout, salvar, carregar, listar e 
inativar (bibliotecário/chefe de biblioteca).

Manter empréstimo do livro: permite salvar, listar, carregar e excluir um livro do 
sistema.

Manter lista de espera: permite adicionar e remover livros na lista de espera do 
sistema. 

Manter livro: permite salvar, excluir, carregar, listar, reservar, emprestar, devolver, 
renovar um livro do sistema. 

Manter editora: permite salvar, carregar, listar e inativar uma editora do sistema. 

Manter categoria: permite salvar, carregar, listar e inativar uma categoria do sistema. 

Manter estado de conservação: permite salvar, carregar, listar e excluir do sistema. 


##Requisitos não funcionais 

O sistema será compatível com computadores que possuam acesso à internet, 
devendo neles estarem instalados navegador web, bem como o ambiente de 
execução Java (JRE ou JDK). Poderá ser instalado em qualquer sistema operacional, 
desde que este possua compatibilidade com os aplicativos acima. Para a navegação, 
será compatível com todos os navegadores disponíveis no mercado, desde que 
estejam devidamente atualizados em suas últimas versões. 

O sistema possuirá para gerenciar o gerenciamento e permissionamento dos 
usuários um sistema de controle baseado em perfis, ou Role Based Access Control 
(RBAC) no qual os usuários possuirão diferentes níveis de permissões, por meio das 
quais será possível acessar as diferentes funcionalidades disponibilizadas. 


##Metodologia e Tecnologia Utilizada 
Programação Orientada a Objetos (POO): diz respeito as linguagens que utilizam 
objetos em programação. Busca implementar entidades reais como herança, 
ocultação, polimorfismo. Seu maior diferencial é juntar dados e funções para operarem 
em conjunto de modo que é possível que os dados estejam acessíveis somente para 
as funções daquele objeto (GEEKSFORGEEKS, 2019). 

Padrão DAO (Data Access Object): É um padrão estrutural que permite isolar a 
camada de aplicação/negócio da camada de persistência. Permite ocultar da 
aplicação as complexidades inerentes a operações CRUD (BAELDUNG, 2020). 

MVC (Model View Controller): é um padrão de projeto ou padrão de arquitetura 
focado no reuso de classes e separação em três camadas (Modelo, Visão e Controle), 
onde a camada de modelo gerencia e controla como os dados se comportam por meio 
das funções, lógica e regras de negócios estabelecidas; já a camada de controle 
intermedia as requisições enviadas pela visão com as respostas fornecidas pelo 
modelo e o controle, que intermedia as requisições enviadas pela visão com as 
respostas fornecidas pelo model (ZUCHER, 2020). 

MySQL WorkBench: O MySQL Workbench é uma ferramenta visual para design, 
desenvolvimento e administração de base de dados MySQL.

NetBeans: é um ambiente de desenvolvimento integrado e gratuito para 
desenvolvimento de sistemas. Ele oferece aos usuários ferramentas necessárias para 
criar aplicativos web, desktop, mobile e multiplataforma. 

JSP (Java Server Pages): é uma linguagem de script com especificação aberta que 
tem como principal objetivo a geração de conteúdo dinâmico para páginas da Internet.

Servlet: é uma classe da linguagem de programação Java utilizada para estender a 
capacidade de servidores que hospedam aplicações por meio de um modelo de 
programação de requisição-resposta. 
