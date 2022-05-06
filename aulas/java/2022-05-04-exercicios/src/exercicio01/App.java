package exercicio01;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Aluno teste = new Aluno("Alpha", 10.0f, 2.0f);
        System.out.println(teste.getName());
        System.out.println(teste.media());
    }
}
