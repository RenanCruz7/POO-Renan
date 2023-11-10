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

    public void setQuantidadeDeCogumelos(int cogumelos){this.quantidadeDeCogumelos = cogumelos;}

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPossuiBigode(boolean possuiBigode) {
        this.possuiBigode = possuiBigode;
    }

    public void setTipoFisico(String tipoFisico) {
        this.tipoFisico = tipoFisico;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

        p1.setNome("Renan");
        p1.setCor("Vermelho");
        p1.setAltura(1.8F);
        p1.setPossuiBigode(false);
        p1.setTipoFisico("Magro");

        System.out.println(p1.nome);
        System.out.println(p1.cor);
        System.out.println(p1.altura);
        System.out.println(p1.possuiBigode);
        System.out.println(p1.tipoFisico);

        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
    }
}