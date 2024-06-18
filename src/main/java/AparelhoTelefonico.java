public class AparelhoTelefonico
  {
  String Usuario;

  public AparelhoTelefonico(String usuario) 
    {
    Usuario = usuario;
    }

  public void Ligar() 
    {
    System.out.println(Usuario + " está ligando...");
    }

  public void Atender() 
    {
    System.out.println("Chamada Atendida");
    }

  public void Desligar() 
    {
    System.out.println("Desligando ...");
    }

  public void IniciarCorrerioVoz() 
    {
    System.out.println("Iniciando Correrio de Voz...");
    }
}