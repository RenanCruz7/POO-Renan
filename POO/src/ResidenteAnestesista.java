public class ResidenteAnestesista extends Anestesista {
    String matriculaFaculdade;

    public ResidenteAnestesista(String nome, String sexo, String matricula) {
        super(nome, sexo, matricula);
    }

    public String getMatriculaFaculdade() {
        return matriculaFaculdade;
    }

    public void setMatriculaFaculdade(String matriculaFaculdade) {
        this.matriculaFaculdade = matriculaFaculdade;
    }

    //Sobrescrita sendo aplicada aqui, estou reescrevendo o meto operar explicação no caderno
    @Override
    void operar() {
        System.out.println("realizando operação sendo um residente");
    }

}
