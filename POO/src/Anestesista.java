public class Anestesista extends Medico {
    public Anestesista(String nome, String sexo, String matricula) {
        super(nome, sexo, matricula);
    }


    //Polimorfismo sendo aplicado aqui
    @Override
    void operar() {
        System.out.println("realizando operação");
    }
}
