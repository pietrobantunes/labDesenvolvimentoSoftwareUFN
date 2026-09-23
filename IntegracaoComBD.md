# MySQL - BDAula01
```
create database BDAula01;
show databases;
use BDAula01;

create table pessoa(
	id int auto_increment PRIMARY KEY,
	nome varchar(50) NOT NULL,
	sexo varchar(1) NOT NULL,
	idioma varchar(10) NOT NULL
);

show tables;
desc pessoa;

insert into pessoa(nome, sexo, idioma)
values
("Albert", "M", "Alemão"),
("Michael", "M", "Português"),
("Dominic", "M", "Italiano"),
("Tom", "M", "Português");

select * from pessoa;

/**********************************************/

create database Escola;
use Escola;

create table Aluno(
	id int auto_increment PRIMARY KEY,
	nome varchar(50) NOT NULL,
	idade int NOT NULL,
	curso varchar(50) NOT NULL
);

create table Professor(
	id int auto_increment PRIMARY KEY,
	nome varchar(50) NOT NULL,
	idade int NOT NULL,
	disciplina varchar(50) NOT NULL
);

create table Matricula(
	id int auto_increment PRIMARY KEY,
    id_aluno int,
    id_professor int,
    data_matricula date,
    
    FOREIGN KEY (id_aluno) REFERENCES aluno(id),
    FOREIGN KEY (id_professor) REFERENCES professor(id)
);

show tables;
desc Aluno;
desc Professor;
desc Matricula;

insert into Aluno(nome, idade, curso)
values
("Zato", 20, "Geografia"),
("Manuela", 19, "Química"),
("Carlos", 15, "História"),
("Thomas", 17, "Matemática");

insert into Professor(nome, idade, disciplina)
values
("Ricardo", 41, "Laboratório de Desenvolvimento de Software"),
("Alexandre", 52, "Pesquisa e Ordenação"),
("Ana", 40, "Experiência do Usuário"),
("José", 23, "Comunicação de Dados");

insert into Matricula(id_aluno, id_professor, data_matricula)
values
(1,1, "2023-01-15"),
(2,2, "2023-02-20"),
(3,3, "2023-03-07"),
(4,1, "2023-04-05");
    
select * from Aluno;
select * from Professor;
select * from Matricula;

select nome, curso
from aluno;

select nome, disciplina
from professor;
```
