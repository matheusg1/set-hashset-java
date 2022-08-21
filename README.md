


#  Set / HashSet - Java

Exercício do curso "**Java COMPLETO Programação Orientada a Objetos + Projetos**" pela Udemy, com o professor **Nélio Alves**.

> Em um portal de cursos online, cada usuário possui um código único,
> representado por um número inteiro. Cada instrutor do portal pode ter
> vários cursos, sendo que um mesmo aluno pode se matricular em quantos
> cursos quiser. Assim, o número total de alunos de um instrutor não é
> simplesmente a soma dos alunos de todos os cursos que ele possui, pois
> pode haver alunos repetidos em mais de um curso. O instrutor Alex
> possui três cursos A, B e C, e deseja saber seu número total de
> alunos. Seu programa deve ler os alunos dos cursos A, B e C do
> instrutor Alex, depois mostrar a quantidade total e alunos dele,
> conforme exemplo.

**Exemplo:**

    How many students for course A? 3
    21 
    35 
    22 
    How many students for course B? 2
    21 
    50
    How many students for course C? 3
    42
    35
    13
    Total students: 6

---
*Fiz o primeiro código, porém percebi que continha muita repetição, então criei outra versão aprimorada e que facilitaria mudanças. Criei um HashSet que não aceita valores repetidos no Set para receber apenas os valores únicos e um vetor que recebe o nome dos cursos "A, B, C".*


### Resultado:

    Quantos estudantes no curso A? 3
    21
    35
    22
    Quantos estudantes no curso B? 2
    21
    50
    Quantos estudantes no curso C? 3
    42
    35
    13
    Total de alunos 6

---
Ferramentas utilizadas: 
<p align="left">
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> 
 <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/>
