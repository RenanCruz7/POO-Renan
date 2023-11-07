class Personagem{
    String nome;
    String cor;
    int quantidadeDeCogumelos;
    float altura;
    String tipoFisico;
    boolean possuiBigode;

    Personagem() {
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.setNome("Renan");

        System.out.println(p1.nome);

        Quadrilatero q1 = new Quadrilatero(5);
        Quadrilatero q2 = new Quadrilatero(5);

        System.out.println(q1.equals(q2));
    }
}