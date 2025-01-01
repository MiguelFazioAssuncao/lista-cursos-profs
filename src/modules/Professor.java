package modules;

public class Professor {
    String nome;
    String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String toString() {
        return "Professor: " + this.nome + ", Disciplina: " + this.disciplina;
    }
}
