package entidades;

import java.util.Date;

abstract public class Funcionario extends Pessoa {

    Date dataAdmimissao;
    String matricula;

    public Funcionario(String nome, String sexo, String matricula) {
        super(nome, sexo);
        this.matricula = matricula;
    }

    public Date getDataAdmimissao() {
        return dataAdmimissao;
    }

    public void setDataAdmimissao(Date dataAdmimissao) {
        this.dataAdmimissao = dataAdmimissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
