package POO;
public class Devs {
    private String nome;
    private int idade;
    private String especialidade;

    public Devs(String nome, int idade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        throw new UnsupportedOperationException("Unimplemented method 'getIdade'");
    }

    public String getEspecialidade() {
        throw new UnsupportedOperationException("Unimplemented method 'getEspecialidade'");
    }
}

