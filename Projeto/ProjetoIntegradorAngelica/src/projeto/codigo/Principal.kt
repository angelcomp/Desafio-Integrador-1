package projeto.codigo

fun main() {
    //GERENCIADOR
    val manager = DigitalHouseManager()

    //CRIANDO PROFESSORES TITULARES
    manager.registrarProfessorTitular("Ada", "Lovelace", 1815, "Doutorado em Ciência da Computação")
    manager.registrarProfessorTitular("Alan", "Turing", 1912, "Engenheiro de Software")

    //CRIANDO PROFESSORES ADJUNTOS
    manager.registrarProfessorAdjunto("John", "Neumann",  1903, 37)
    manager.registrarProfessorAdjunto("Linus", "Torvalds", 1969, 42)

    //CRIANDO CURSOS
    manager.registarCurso("Full Stack", 20001, 3)
    manager.registarCurso("Android", 20002, 2)

    //CRIANDO ALUNOS
    manager.matricularAluno("Angelica", "Santos", 158)
    manager.matricularAluno("Luiza", "Kracke", 108)
    manager.matricularAluno("Eduarda", "Pádua", 602)
    manager.matricularAluno("Layla", "Strauss", 121)

    //ALOCANDO PROFESSORES NO CURSO
    manager.alocarProfessores(20001, 1815, 1903)
    manager.alocarProfessores(20002, 1912, 1969)

    //MATRICULANDO ALUNOS NO CURSO A
    manager.matricularAlunoNoCurso(158, 20001)
    manager.matricularAlunoNoCurso(108, 20001)

    //MATRICULANDO ALUNOS NO CURSO B
    manager.matricularAlunoNoCurso(158, 20002)
    manager.matricularAlunoNoCurso(602, 20002)
    manager.matricularAlunoNoCurso(121, 20002)

    //CONSULTANDO MATRICULAS
    manager.consultarAluno(108)
}
