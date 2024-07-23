package iPhone;

import java.util.ArrayList;
import java.util.List;

public class Interface {
    // Interface para representar um dispositivo eletrônico
interface DispositivoEletronico {
    void ligar();
    void desligar();
}

// Classe principal que representa o dispositivo iPhone
class DispositivoiPhone implements DispositivoEletronico {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public DispositivoiPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    // Métodos de acesso (getters e setters) para os atributos
    // ...

    // Implementação dos métodos da interface DispositivoEletronico
    @Override
    public void ligar() {
        System.out.println("Dispositivo iPhone ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Dispositivo iPhone desligado!");
    }

    // Métodos para interagir com o reprodutor musical
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos para interagir com o aparelho telefônico
    public void ligarTelefone(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atenderChamada() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Métodos para interagir com o navegador de internet
    public void abrirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}

// Classe que representa o reprodutor musical do iPhone
class ReprodutorMusical {

    private String musicaAtual;

    public void tocar() {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }
}

// Classe que representa o aparelho telefônico do iPhone
class AparelhoTelefonico {

    private String numeroDiscado;

    public void ligar(String numero) {
        this.numeroDiscado = numero;
        System.out.println("Ligando para: " + numeroDiscado);
    }

    public void atender() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz.");
    }
}

// Classe que representa o navegador de internet do iPhone
class NavegadorInternet {

    private String urlAtual;
    private List<String> abasAbertas;

    public NavegadorInternet() {
        this.urlAtual = "";
        this.abasAbertas = new ArrayList<>();
    }

    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Abrindo página: " + urlAtual);
    }

    public void adicionarNovaAba() {
        abasAbertas.add("");
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página atual: " + urlAtual);
    }
    
}

} 

