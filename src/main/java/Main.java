
public class Main {
  public static void main(String[] args) {

    Iphone meuIphone = new Iphone("Apple", "Iphone 13", "Branco");
    System.out.println("O meu " + meuIphone.Modelo + " " + meuIphone.Cor);
 
    ReprodutorMusica meuReprodutorMusica = new   
    ReprodutorMusica("Razões e Emoções","NxZero","Rock Nacional");
    meuReprodutorMusica.TocarMusica();
    System.out.println("---------------------------");
    meuReprodutorMusica.PausarMusica();
    System.out.println("---------------------------");
    meuReprodutorMusica.SelecionarMusica();
    System.out.println("---------------------------");

    AparelhoTelefonico meuAparelhoTefonico = new AparelhoTelefonico 
    ("Suzana");
    meuAparelhoTefonico.Ligar();
    System.out.println("---------------------------");
    meuAparelhoTefonico.Atender();
    System.out.println("---------------------------");
    meuAparelhoTefonico.Desligar();
    System.out.println("---------------------------");
    meuAparelhoTefonico.IniciarCorrerioVoz();
    System.out.println("---------------------------");

    NavegadorWeb meuNavegadorWeb = new NavegadorWeb();
    meuNavegadorWeb.ExibirPagina();
    System.out.println("---------------------------");
    meuNavegadorWeb.AdicionarNovaAba();
    System.out.println("---------------------------");
    meuNavegadorWeb.AtualizarPagina();
    
    

    
  }


}