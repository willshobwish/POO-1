package exercicio01;

public class Aluno {
    private String name;
    private float nota1;
    private float nota2;

    public Aluno(String name, float nota1, float nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getName() {
        return name;
    }

    public float media() {
        return (nota1 + nota2) / 2;
    }
}
