package projeto.codigo

import java.util.*

class Matricula(var aluno: Aluno,
                var curso: Curso,
                var dataMatricula: Date) {

    constructor(aluno: Aluno, curso: Curso) : this(aluno, curso, Date())

    override fun toString(): String {
        return "Matricula(aluno=${aluno.nome}, curso=${curso.nome}, dataMatricula=$dataMatricula)"
    }
}