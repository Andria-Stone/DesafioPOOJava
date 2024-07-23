package POO;

public class Desafio {
    public static void main(String[] args) {

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java");

        Curso cursoJava = new Curso("Java Fundamentals", "Fundamentos básicos de Java", 40);
        Curso cursoAvancado = new Curso("Java Avançado", "Tópicos avançados de Java", 60);

        bootcampJava.adicionarCurso(cursoJava);
        bootcampJava.adicionarCurso(cursoAvancado);


        Devs dev1 = new Devs("João", 25, "Desenvolvimento Web");
        Devs dev2 = new Devs("Maria", 30, "Mobile Development");

        bootcampJava.adicionarDev(dev1);
        bootcampJava.adicionarDev(dev2);

      
        Mentoria mentoria1 = new Mentoria("Arquitetura de Software", "Segunda-feira, 15h", dev1);

       
        bootcampJava.adicionarMentoria(mentoria1);

      
        System.out.println("Bootcamp: " + bootcampJava.getNome());
        System.out.println("Cursos:");
        for (Curso curso : bootcampJava.getCursos()) {
            System.out.println("- " + curso.getNome() + ": " + curso.getDescricao());
        }
        System.out.println("Devs:");
        for (Devs dev : bootcampJava.getDevs()) {
            System.out.println("- " + dev.getNome() + ", " + dev.getIdade() + " anos, especialidade: " + dev.getEspecialidade());
        }
        System.out.println("Mentorias:");
        for (Mentoria mentoria : bootcampJava.getMentorias()) {
            System.out.println("- " + mentoria.getTema() + ", horário: " + mentoria.getHorario() + ", mentor: " + mentoria.getMentor().getNome());
        }
    }
}