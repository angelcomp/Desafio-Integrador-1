package projeto.codigo

class Aluno (val nome: String,
             val sobrenome: String,
             val codigoAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (other !is Aluno) return false

        return codigoAluno == other.codigoAluno
    }
}