package projeto.codigo

class Aluno (val nome: String,
             val sobrenome: String,
             val codigoAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (other !is Aluno) return false

        return codigoAluno == other.codigoAluno
    }

    override fun toString(): String {
        return "Aluno(nome='$nome', sobrenome='$sobrenome', codigoAluno=$codigoAluno)"
    }


}