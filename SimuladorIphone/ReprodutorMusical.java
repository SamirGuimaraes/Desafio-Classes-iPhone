public class ReprodutorMusical extends Aparelho{
    
    public void selecionarMusica(){
        System.out.println("Selecionando música.");
    }

    public void nomeArtista(String artista){
        System.out.println("Artista selecionado: " + artista);
    }

    public void nomeMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public void duracao(double tempo){
        System.out.println("Tempo de múscica: " + tempo+ " minutos");
    }

    public void tocarMusica(){
        System.out.println("Tocando música...");
    }

    public void pausarMusica(){
        System.out.println("Pausando música.");
    }
}

