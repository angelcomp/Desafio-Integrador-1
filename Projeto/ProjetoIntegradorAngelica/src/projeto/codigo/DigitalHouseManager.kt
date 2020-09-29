package projeto.codigo

class DigitalHouseManager(val listaAlunos: MutableList<Aluno>,
                          val listaProfs: MutableList<Professor>,
                          val listaCursos: MutableList<Curso>,
                          val listaMatriculas: MutableList<Matricula>) {

    fun registarCurso(nome: String, codigoCurso: Int, qtdMaximaAlunos: Int) {
        val cursoNovo = Curso(nome, codigoCurso, qtdMaximaAlunos)
        listaCursos.add(cursoNovo)

        println("  O curso '${cursoNovo.nome}' foi adicionado! :)")
    }

    fun excluirCurso(codigoCurso: Int) {
        val procurandoCurso = listaCursos.first { it.codigoCurso == codigoCurso }
        listaCursos.remove(procurandoCurso)

        println("  O curso '${procurandoCurso.nome}' foi excluído! (x_x)")
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qtdHorasMonitoria: Int) {
        val novoPA = ProfAdjunto(nome, sobrenome, 0, codigoProfessor, qtdHorasMonitoria)

        listaProfs.add(novoPA)
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val novoPT = ProfTitular(nome, sobrenome, 0, codigoProfessor, especialidade)

        listaProfs.add(novoPT)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val procurandoProf = listaProfs.first { it.codigoProfessor == codigoProfessor }

        listaProfs.remove(procurandoProf)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)

        listaAlunos.add(novoAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val procurandoCurso = listaCursos.first { it.codigoCurso == codigoCurso }
        val procurandoAluno = listaAlunos.first { it.codigoAluno == codigoAluno }

        val alunoMatriculado = procurandoCurso.adicionarAluno(procurandoAluno)

        if(alunoMatriculado) {
            val novaMatricula = Matricula(procurandoAluno, procurandoCurso)

            listaMatriculas.add(novaMatricula)
            println("A matricula do aluno ${procurandoAluno.nome} no curso ${procurandoCurso.nome} foi realizada com sucesso!")
        }  else {
            println("não foi possível realizar a matrícula porque não há vagas")
        }
    }
}