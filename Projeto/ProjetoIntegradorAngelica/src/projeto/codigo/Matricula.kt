package projeto.codigo

import java.util.*

class Matricula(val aluno: Aluno, val curso: Curso, val dataMatricula: Date) {
    override fun toString(): String {
        return "Matricula(aluno=${aluno.nome}, curso=${curso.nome}, dataMatricula=$dataMatricula)"
    }
}