public class SimuladorSistema {
    public static void main(String[] args) {


        
        ReprodutorMusical appleMusic = new ReprodutorMusical();
        System.out.println("REPRODUTOR DE MÚSICA");
        appleMusic.ligarAparelho();
        appleMusic.iniciarConexao();
        appleMusic.verificandoConexao();
        appleMusic.selecionarMusica();
        appleMusic.nomeArtista("Tom Jonbim");
        appleMusic.nomeMusica("Garota de Ipanema");
        appleMusic.duracao(4.30);
        appleMusic.tocarMusica();
        appleMusic.pausarMusica();
        System.out.println("\n");

        NavegadorInternet safari = new NavegadorInternet();
        System.out.println("NAVEGADOR DE INTERNET");
        safari.ligarAparelho();
        safari.iniciarConexao();
        safari.verificandoConexao();
        safari.abrirNavegador();
        safari.abrirNovaAba();
        safari.exibirNavegador();
        safari.atualizarPagina();
        safari.fecharAba();
        safari.fecharNavegador();
        System.out.println("\n");
        
        AplicativoTelefonico telefone = new AplicativoTelefonico();
        System.out.println("APLICATIVO DE CHAMADA");
        telefone.ligarAparelho();
        telefone.iniciarConexao();
        telefone.verificandoConexao();
        telefone.adicionarContato("Érica");
        telefone.selecionarContato("Érica");
        telefone.iniciarChamada();
        telefone.encerrarChamada();
        telefone.removerContato("Érica");


    }
}
