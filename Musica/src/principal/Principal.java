package principal;

import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
            Musica minhaMusica = new Musica();
            minhaMusica.setTitulo("McRick");
            minhaMusica.setCantor("Rick");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PODPAH");
        meuPodcast.setApresentador("Mitico jovem");


        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();

        }
        for (int i = 0; i < 500; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);




        }
    }
