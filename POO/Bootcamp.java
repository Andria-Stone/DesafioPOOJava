package POO;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Devs> devs;

    // Construtor
    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    // Métodos para adicionar cursos, mentorias e devs
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarDev(Devs dev) {
        devs.add(dev);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public Curso[] getCursos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCursos'");
    }

    public Devs[] getDevs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDevs'");
    }

    public Mentoria[] getMentorias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMentorias'");
    }

}

