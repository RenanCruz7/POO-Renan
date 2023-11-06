class Personagem{
    String nome;
    /*
    String cor;
    int quantidadeDeCogumelos;
    float altura;
    String tipoFisico;
    boolean possuiBigode;
     **/
    Personagem(String nome) {
    }
}

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Matheus");
        System.out.println(p1.nome);
    }
}