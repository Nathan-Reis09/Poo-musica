package modelos;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private int classicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassicacao() {
        return classicacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducao++;
    }


}
