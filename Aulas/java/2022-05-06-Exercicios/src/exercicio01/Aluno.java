package exercicio01;

public class Aluno {
    private String nome;
    private int ra;
    private float notap1, notap2;
    private float notat1, notat2;

    public void setNotas(float notap1, float notap2, float notat1, float notat2) {
        if (notap1 >= 0 && notap1 <= 10) {
            this.notap1 = notap1;
        }
        if (notap2 >= 0 && notap2 <= 10) {
            this.notap2 = notap2;
        }
        if (notat1 >= 0 && notat1 <= 10) {
            this.notat1 = notat1;
        }
        if (notat2 >= 0 && notat2 <= 10) {
            this.notat2 = notat2;
        }
    }

    public float media() {
        return (notap1 + notap2 + notat1 + notat2) / 4;
    }

}
