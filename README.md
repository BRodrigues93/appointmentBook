<p align="center">
	<img src="http://media.breitbart.com/media/2016/02/github-logo.jpg" alt="ROR Resources Cover" style="max-width:1%;">
</p>

<h1 align="center">Appointment Book</h1>

<p align="center">Projeto de reposit em Eng. Software</p>

## :mortar_board: Integrante

<a id="user-content-Índice" class="anchor" href="#Índice" aria-hidden="true"></a>
<p align="center">
	<a href="https://github.com/BRodrigues93" target="_blank">• Bruno Rodrigues</a> • 
</p>

## :computer: Métodos
Developer | Method | @Test | Descrição
:-- | :-- | :-- | :--
[ Bruno Rodrigues  ] | GET | 'Bem Vindo'              | Tela de entrada;
[ Bruno Rodrigues  ] | POST/:id | OK              | Insere Contato;
[ Bruno Rodrigues  ] | GET/:id | OK              | Retorna Contato;

## :beginner: Requisitos 
* Um servidor REST de Agenda
  - A agenda é composta por contatos, cada contato tem um nome e um telefone
  - Implementar dois métodos:
		* POST /:id
		         : Passando no corpo do request o JSON com nome e telefone do contato;
		         : Retorna o JSON do contato adicionado.
		* GET /:id
		         : Não passa nada no corpo do request;
		         : Retorna o JSON do contato adicionado.

## :circus_tent: Criação do projeto - MVN
Comando | Funcionalidade
:-- | :-- 
mvn arquétipo: gerar -B -DgroupId = com.mycompany -DartifactId = my-app -Dversion = 1.0 INSTANTÂNEO -DarchetypeArtifactId = jooby-arquétipo -DarchetypeGroupId = org.jooby -DarchetypeVersion = 1.0.0.CR2 | Cria um novo projeto a partir do local onde esta sendo executado;
mvn jooby: run | Inicia o servidor local;

## :fallen_leaf: Comandos de entrada
Comando | Funcionalidade
:-- | :-- 
git init | Inicia o Git;
git add . | Adiciona  todos os documentos locais ao GitHub;
git commit -m "mensagem de commit" | Efetua o commit;
git push nomedoSeuProjeto | Confirma o commit, em seguida solicita o usuario e senha;
git pull nomedoSeuProjeto master | Trás todas as modificações do GitHub para o computador local;
git config --global user.email seuEmail | Seta um email global para o computador;
git config --global user.name seuNome | Seta um nome global para o computador;

## :book: Métodos
* GET: Retorna "Primeira tela";
* GET/ID: Retorna contatos por ID;
* POST/ID: Adiciona novo contato com os dados Nome e telefone(obrigatórios).

