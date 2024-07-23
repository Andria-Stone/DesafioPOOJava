package POO;

public class Mentoria {
    private String tema;
    private String horario;
    private Devs mentor;

    // Construtor
    public Mentoria(String tema, String horario, Devs mentor) {
        this.tema = tema;
        this.horario = horario;
        this.mentor = mentor;
    }
    public String getTema() {
        return tema;
    }

    public String getHorario() {
        throw new UnsupportedOperationException("Unimplemented method 'getHorario'");
    }

    public Bootcamp getMentor() {
        throw new UnsupportedOperationException("Unimplemented method 'getMentor'");
    }
}

