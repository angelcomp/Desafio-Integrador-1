package projeto.codigo

import java.lang.Exception
import java.util.*

fun main() {
    val aluno = Aluno("Angelica", "Santos", 123)
    val aluno2 = Aluno("Eduarda", "Pádua", 123)
    val aluno3 = Aluno("Adrian", "Almeida", 1234)
    val aluno4 = Aluno("Camilaaaa", "Pitanga", 12345)
    val aluninhos = mutableListOf(aluno,aluno2,aluno3)

   // println("Comparando alunos diferentes: ${aluno.equals(aluno3)}")
   // println("Comparando alunos iguais: ${aluno.equals(aluno2)}")

    val prof = Professor("Luiz", "Silva", 20, 147)
    val titular = ProfTitular("Luiz", "Silva", 20, 147, "dar aulas divertidas")
    val adjunto = ProfAdjunto("Joao", "Machado", 20, 159, 10)
    val profs = mutableListOf(prof, titular, adjunto)

    //println(titular)
    //println(adjunto)

    val curso1 = Curso("Kotlin", 789, 15, titular, adjunto, aluninhos)
    val curso2 = Curso("Python", 789, 15, titular, adjunto, aluninhos)
    val curso3 = Curso("Linguagem C", 456, 15, titular, adjunto, aluninhos)
    val cursinhos = mutableListOf(curso1, curso2, curso3)

    //println("Nome alunos: ${aluninhos}")
    curso1.adicionarAluno(aluno4)
    //println("Nome alunos: ${aluninhos}")
    curso1.excluirAluno(aluno4)
    //println("Nome alunos: ${aluninhos}")

    //println("Comparando dois cursos iguais: ${curso1.equals(curso2)}")
    //println("Comparando dois cursos diferentes: ${curso1.equals(curso3)}")

    val matriula1 = Matricula(aluno, curso1)
    val matriculas = mutableListOf(matriula1)

    println(matriula1)

    val manager = DigitalHouseManager(aluninhos,profs, cursinhos, matriculas)

    manager.registarCurso("blabla", 852, 50)

    try {
        manager.excluirCurso(852)
    } catch (e: Exception) {
        println(" Ocorreu erro ao ecluir um curso... z_z\n")
        e.printStackTrace()
    }

    manager.registrarProfessorAdjunto("Sabrina", "Carpenter", 963, 10)
    manager.registrarProfessorTitular("Camila", "Cabello", 125, "alskdjlasjd")
    manager.excluirProfessor(963)
    manager.matricularAluno("Lauren", "jauregui", 2707)
    manager.matricularAlunoNoCurso(2707, 789)
    manager.matricularAlunoNoCurso(2707, 789)
    manager.alocarProfessores(789,125,963)
    manager.testeListas(aluninhos, profs, cursinhos, matriculas)
}