package projeto.codigo

class DigitalHouseManager(val listaAlunos: MutableList<Aluno> = mutableListOf(),
                          val listaProfs: MutableList<Professor> = mutableListOf(),
                          val listaCursos: MutableList<Curso> = mutableListOf(),
                          val listaMatriculas: MutableList<Matricula> = mutableListOf()) {

    fun registarCurso(nome: String, codigoCurso: Int, qtdMaximaAlunos: Int) {
        println("\n\t ~~ Registrando um novo Curso ~~")

        val cursoNovo = Curso(nome, codigoCurso, qtdMaximaAlunos)
        listaCursos.add(cursoNovo)

        println("  O curso '${cursoNovo.nome}' foi adicionado!")
    }

    fun excluirCurso(codigoCurso: Int) {
        println("\n\t ~~ Excluindo um novo Curso ~~")

        val curso = listaCursos.first { it.codigoCurso == codigoCurso }
        listaCursos.remove(curso)

        println("  O curso '${curso.nome}' foi excluído!")
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qtdHorasMonitoria: Int) {
        println("\n\t ~~ Registrando um novo Professor Adjunto ~~")

        val novoPA = ProfAdjunto(nome, sobrenome, 0, codigoProfessor, qtdHorasMonitoria)
        listaProfs.add(novoPA)

        println("  O Professor Adjunto '${novoPA.nome}' foi adicionado à lista de professores!")
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String) {
        println("\n\t ~~ Registrando um novo Professor Titular ~~")

        val novoPT = ProfTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaProfs.add(novoPT)

        println("  O professor Titular '${novoPT.nome}' foi adicionado à lista de professores!")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        println("\n\t ~~ Excluindo um Professor ~~")

        val prof = listaProfs.first { it.codigoProfessor == codigoProfessor }
        listaProfs.remove(prof)

        println("  O professor '${prof.nome}' está indo embora.. bye bye")
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        println("\n\t ~~ Matriculando um novo Aluno ~~")

        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(novoAluno)

        println("  Bem-Vindo '${novoAluno.nome}'! Você foi matriculado. ")
    }

    fun matricularAlunoNoCurso(codigoAluno: Int, codigoCurso: Int) {
        println("\n\t ~~ Matriculando um Aluno em um Curso ~~")

        val curso = listaCursos.first { it.codigoCurso == codigoCurso }
        val aluno = listaAlunos.first { it.codigoAluno == codigoAluno }
        val matriculandoAluno = curso.adicionarAluno(aluno)

        if(matriculandoAluno) {
            val novaMatricula = Matricula(aluno, curso)
            listaMatriculas.add(novaMatricula)
            println(novaMatricula)

            println("  A matricula do aluno '${aluno.nome}' no curso '${curso.nome}' foi realizada com sucesso!")
        }  else {
            println("  Não foi possível realizar a matrícula! :c")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        println("\n\t ~~ Alocando Professores ao Curso ~~")

        val pTitular= listaProfs.first { it.codigoProfessor == codigoProfessorTitular }
        val pAdjunto = listaProfs.first { it.codigoProfessor == codigoProfessorAdjunto }
        val curso = listaCursos.first { it.codigoCurso == codigoCurso }

        if(pTitular is ProfTitular) {
            curso.profTitular = pTitular
        }

        if(pAdjunto is ProfAdjunto) {
            curso.profAdjunto = pAdjunto
        }
        println("  Os professores '${pTitular.nome}' e '${pAdjunto.nome}' foram colocados no curso '${curso.nome}'!")
    }
}