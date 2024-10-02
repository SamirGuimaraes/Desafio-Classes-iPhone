public class AplicativoTelefonico extends Aparelho{

    public void adicionarContato(String nome){
        System.out.println("Adicionando " +nome+ " aos contatos.");
    }
    
    public void selecionarContato(String nome){
        System.out.println("Contato selecionado - " +nome);
    }

    public void iniciarChamada(){
        System.out.println("Iniciando chamada...");
    }

    public void encerrarChamada(){
        System.out.println("Encerrando chamada.");
    }

    public void removerContato(String nome){
        System.out.println("Removendo " +nome+ " dos contatos.");
    }

}
