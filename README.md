# Sistema Orientado a Objetos - Diagrama UML

Este sistema foi desenvolvido usando Programação Orientada a Objetos (POO) em Java e é estruturado através do uso de classes e interfaces. O diagrama foi criado no site [Gleek.io](https://app.gleek.io/), e o código segue os 4 pilares da POO:

1. **Abstração**: Representa as características essenciais sem mostrar detalhes complexos.
2. **Encapsulamento**: Controla o acesso às propriedades e métodos usando modificadores de acesso como `private` e `public`.
3. **Herança**: As classes herdam propriedades e métodos de outras classes, como visto na classe `iPhone`.
4. **Polimorfismo**: A capacidade de um método ter diferentes comportamentos é implementada através de métodos como `iniciarConexao()` que pode ser sobreposto nas subclasses.

## Estrutura do Sistema

O sistema se baseia em uma classe abstrata `iPhone` que serve como base para três componentes principais:

1. **Reprodutor Musical**: Gerencia a reprodução de músicas no dispositivo.
2. **Navegador de Internet**: Controla o acesso à navegação web.
3. **Aplicativo Telefônico**: Lida com as funções de chamadas e contatos.

Cada componente é descrito abaixo com suas funções e modificadores de acesso.

---

## Classe Abstrata - `iPhone`

A classe abstrata `iPhone` é a base para os três componentes. Ela define métodos essenciais que serão implementados ou sobrepostos nas subclasses.

### Métodos:
- `private ligarAparelho()`: Método privado responsável por ligar o aparelho.
- `private iniciarConexao()`: Método que estabelece a conexão.
- `private verificarConexao()`: Método para verificar se a conexão está ativa.

---

## Classe - `ReprodutorMusical`

Esta classe cuida das funções relacionadas à reprodução de músicas.

### Métodos:
- `public selecionarMusica()`: Permite ao usuário selecionar uma música.
- `public nomeMusica(String musica)`: Define o nome da música selecionada.
- `public nomeArtista(String artista)`: Define o nome do artista da música.
- `public duracao(double tempo)`: Define a duração da música.
- `public tocarMusica()`: Inicia a reprodução da música selecionada.
- `public pausar()`: Pausa a reprodução da música.

---

## Classe - `NavegadorInternet`

Esta classe controla a navegação na internet.

### Métodos:
- `public abrirNavegador()`: Abre o navegador de internet.
- `public exibirNavegador()`: Exibe a interface do navegador ao usuário.
- `public abrirNovaAba()`: Abre uma nova aba no navegador.
- `public atualizarPagina()`: Atualiza a página atual no navegador.
- `public fecharAba()`: Fecha uma aba específica do navegador.
- `public fecharNavegador()`: Fecha completamente o navegador.

---

## Classe - `AplicativoTelefonico`

Esta classe lida com funcionalidades relacionadas a chamadas telefônicas e gerenciamento de contatos.

### Métodos:
- `public adicionarContato(String nome)`: Adiciona um novo contato na lista telefônica.
- `public removerContato(String nome)`: Remove um contato da lista telefônica.
- `public selecionarContato(String nome)`: Seleciona um contato para realizar uma ação.
- `public iniciarChamada()`: Inicia uma chamada telefônica para o contato selecionado.
- `public encerrarChamada()`: Encerra a chamada telefônica em andamento.

---

## Considerações sobre os 4 Pilares da POO

1. **Abstração**:
   A classe `iPhone` abstrai o comportamento de um dispositivo smartphone, escondendo detalhes complexos em métodos como `ligarAparelho()` e `iniciarConexao()`.

2. **Encapsulamento**:
   Os métodos críticos são definidos como `private`, como `ligarAparelho()` e `verificarConexao()`, garantindo que essas funções não sejam acessíveis diretamente fora do contexto apropriado.

3. **Herança**:
   As classes `ReprodutorMusical`, `NavegadorInternet` e `AplicativoTelefonico` herdam da classe abstrata `iPhone`, reutilizando métodos e características comuns.

4. **Polimorfismo**:
   Métodos como `iniciarConexao()` podem ser sobrepostos em subclasses específicas para atender a diferentes necessidades, como uma conexão específica para chamadas ou navegação web.

---

## Diagrama UML

![Captura de tela 2024-09-30 223418](https://github.com/user-attachments/assets/bdea6640-cf77-480e-a1b0-c412124de697)


*O diagrama acima foi criado com [Gleek.io](https://app.gleek.io/) e representa a estrutura das classes e seus métodos de forma visual.*

---

## Conclusão

Este sistema simula um smartphone com três funcionalidades principais: um reprodutor de músicas, um navegador de internet e um aplicativo telefônico. Utilizando os quatro pilares da POO, este projeto encapsula as funcionalidades dentro de classes, promovendo a reutilização de código, abstração de complexidade, e extensibilidade através de herança e polimorfismo.

