package modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassicacao() >= 9){
            System.out.println(audio.getTitulo() + "é considerado um sucesso absoluto");
        }else {
            System.out.println(audio.getTitulo() + "Tambem é um dos que todo mundo esta curtindo");
        }
    }

}
