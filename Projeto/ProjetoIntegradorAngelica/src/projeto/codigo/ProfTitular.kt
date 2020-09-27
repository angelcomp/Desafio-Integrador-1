package projeto.codigo

class ProfTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, val especialidade: String) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    override fun toString(): String {
        return "${super.toString()}  especialidade='$especialidade')"
    }
}