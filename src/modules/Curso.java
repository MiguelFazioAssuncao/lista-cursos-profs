package modules;


public class Curso {
    String nome;
    String descricao;

    public Curso(String nomeCurso, String horas) {
        this.nome = nomeCurso;
        this.descricao = horas;
    }

    public String toString() {
        return "Curso: " + this.nome + ", Descrição: " + this.descricao;
    }
}