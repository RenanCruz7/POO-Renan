abstract public class Medico extends Funcionario {
    int	CRM;
    public Medico(String nome, String sexo, String matricula) {
        super(nome, sexo, matricula);
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    abstract void operar();
}
