package entities;

public class ProfissionaisTi {

    private int id;
    private String nome;
    private String email;
    private double salario;

    public ProfissionaisTi(int id, String nome, String email, double salario) {
        this. id =id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double valor){
        this.salario += valor;
    }
}
