package projeto.codigo

class Curso(val nome: String, val codigoCurso: Int, val qtdMaximaAlunos: Int, val profTitular: ProfTitular, val profAdjunto: ProfAdjunto, val alunosMatriculados: MutableList<Aluno>) {
    override fun equals(other: Any?): Boolean {
        if (other !is Curso) return false
        return codigoCurso == other.codigoCurso
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoCurso=$codigoCurso, qtdMaximaAlunos=$qtdMaximaAlunos, profTitular=$profTitular, profAdjunto=$profAdjunto, alunosMatriculados=$alunosMatriculados)"
    }

    fun adicionarAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.size == qtdMaximaAlunos) return false
        alunosMatriculados.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno) {
        alunosMatriculados.remove(umAluno)
    }
}