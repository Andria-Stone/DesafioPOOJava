package POO;

public class Curso {
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public Curso(String nome, String descricao, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        throw new UnsupportedOperationException("Unimplemented method 'getDescricao'");
    }
}

