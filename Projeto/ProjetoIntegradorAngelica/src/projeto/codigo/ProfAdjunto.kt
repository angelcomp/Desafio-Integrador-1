package projeto.codigo

class ProfAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, val qtdHorasMonitoria: Int) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    override fun toString(): String {
        return "${super.toString()} qtdHorasMonitoria=$qtdHorasMonitoria)"
    }
}