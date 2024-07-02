
<h1>Challenge LiterAlura Spring Boot</h1>


# desafioLiterAlura Challenge LiterAlura Spring Boot
<h2>Sobre</h2>
<p>Spring Boot Challenge LiterAlura - Catálogo de Livros que oferece interação textual (via console) com os usuários, proporcionando no mínimo 5 opções de interação. Os livros serão buscados através de uma API específica.</p>
<p>Esta aplicação permite buscar livros, listar livros registrados, listar autores, e muitas outras funcionalidades relacionadas à leitura e organização de livros.</p>

## Tecnologias
<ul>
<li>Java 17v
<li>Spring Boot 2.7</li>
<li>Hibernate</li>
<li>PostgreSQL</li>
<li>Gutendex API</li>
<li>Maven</li>
</ul>

![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![Markdown](https://img.shields.io/badge/markdown-%23000000.svg?style=for-the-badge&logo=markdown&logoColor=white)

## Configuração do Projeto

<ul>
<li>Pré-requisitos</li>
<li>Java 17 ou superior</li>
<li>Maven</li>
<li>PostgreSQL</li>


### Instalação
1. Clone o repositório:

<pre>
git clone https://github.com/seu-usuario/literalura.git
cd literalura
</pre>

2. Configure o banco de dados no arquivo application.properties:

<pre>
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Execute o projeto:
</pre>

3. Execute o projeto:
<pre>mvn spring-boot:run</pre>

## Estrutura do Projeto

* cloud.shaick.literalura: Pacote principal do projeto.
- main: Contém a classe Principal, que gerencia a execução da aplicação.
- model: Contém as classes de modelo (Livro, Autor, LivroDTO, AutorDTO).
- repository: Contém as interfaces de repositório Spring Data JPA.
- service: Contém as classes de serviço (ConsumoAPI, ConverteDados).

## Uso
<p>Ao iniciar a aplicação, o menu principal será exibido com as opções disponíveis. Basta seguir as instruções na tela para navegar pelas funcionalidades.</p>

## LinkedIn 
![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white) [LinkedIn Wilson Cardoso: Shaick](https://www.linkedin.com/in/shaick/)

## Youtube
![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white) [Meu Canal](https://www.youtube.com/channel/UCkmng9THj4jMxrk8963ZxLg)
