package projeto.codigo

import java.lang.Exception
import java.util.*

fun main() {
    val aluno = Aluno("Angelica", "Santos", 123)
    val aluno2 = Aluno("Eduarda", "Pádua", 123)
    val aluno3 = Aluno("Adrian", "Almeida", 1234)
    val aluno4 = Aluno("Joice", "Pitanga", 12345)
    val aluninhos = mutableListOf(aluno)
    val aluninhos2 = mutableListOf(aluno2)
    val aluninhos3 = mutableListOf(aluno3)
    val aluninhos4 = mutableListOf(aluno4)

    // println("Comparando alunos diferentes: ${aluno.equals(aluno3)}")
    // println("Comparando alunos iguais: ${aluno.equals(aluno2)}")

    val prof = Professor("Luiz", "Silva", 20, 147)
    val titular = ProfTitular("Luiz", "Silva", 20, 147, "dar aulas divertidas")
    val adjunto = ProfAdjunto("Joao", "Machado", 20, 159, 10)
    val profs = mutableListOf(prof, titular, adjunto)

    //println(titular)
    //println(adjunto)

    val curso1 = Curso("Kotlin", 789, 15, titular, adjunto, aluninhos2)
    val curso2 = Curso("Python", 789, 15, titular, adjunto, aluninhos3)
    val curso3 = Curso("Linguagem C", 456, 15, titular, adjunto, aluninhos4)
    val cursinhos = mutableListOf(curso1, curso2, curso3)

    //println("Nome alunos: ${aluninhos}")
    // curso1.adicionarAluno(aluno4)
    //println("Nome alunos: ${aluninhos}")
    //curso1.excluirAluno(aluno4)
    //println("Nome alunos: ${aluninhos}")

    //println("Comparando dois cursos iguais: ${curso1.equals(curso2)}")
    //println("Comparando dois cursos diferentes: ${curso1.equals(curso3)}")

    val matriula1 = Matricula(aluno, curso1)
    val matriculas = mutableListOf(matriula1)

    //println(matriula1)

    val manager = DigitalHouseManager(aluninhos, profs, cursinhos, matriculas)
    //manager.testeListas()

    manager.registarCurso("blabla", 852, 50)
    //manager.testeListas()

    try {
        manager.excluirCurso(852)
    } catch (e: Exception) {
        println(" Ocorreu erro ao exluir um curso... z_z\n")
        e.printStackTrace()
    }

    val codigoDoAluno = 2707
    manager.registrarProfessorAdjunto("Sabrina", "Carpenter", 963, 10)
    manager.registrarProfessorTitular("Camila", "Cabello", 125, "alskdjlasjd")
    manager.excluirProfessor(963)
    manager.matricularAluno("Lauren", "jauregui", codigoDoAluno)

    manager.testeListas()

    manager.matricularAlunoNoCurso(codigoDoAluno, 789)
    manager.matricularAlunoNoCurso(codigoDoAluno, 789)
    manager.alocarProfessores(789, 125, 963)
    manager.testeListas()
}
