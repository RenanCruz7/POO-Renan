import entidades.Anestesista;
import entidades.ResidenteAnestesista;

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
        Anestesista a1 = new Anestesista("Renan","Masculino","123456");
        a1.operar();

        ResidenteAnestesista ra = new ResidenteAnestesista("Renan","Masculino","56789");
        ra.operar();
    }
}