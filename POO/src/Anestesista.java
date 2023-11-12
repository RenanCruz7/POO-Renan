public class Anestesista extends Medico {
    public Anestesista(String nome, String sexo, String matricula) {
        super(nome, sexo, matricula);
    }

    @Override
    void operar() {
        System.out.println("realizando operação");
    }
}
