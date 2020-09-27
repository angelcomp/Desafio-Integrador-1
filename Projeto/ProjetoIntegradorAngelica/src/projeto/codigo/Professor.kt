package projeto.codigo

open class Professor(val nome: String, val sobrenome: String, val tempoDeCasa: Int, val codigoProfessor: Int) {
    override fun equals(other: Any?): Boolean {
        if (other !is Professor) return false
        return codigoProfessor != other.codigoProfessor
    }

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', tempoDeCasa=$tempoDeCasa, codigoProfessor=$codigoProfessor)"
    }
}