public class ReprodutorMusica
  {
    String Nome;
    String Artista;
    String Genero;
  
    public ReprodutorMusica(String nome, String artista, String genero)
    {
      Nome = nome;
      Artista = artista;
      Genero = genero;
    }
    
    public void TocarMusica()
    {
      System.out.println("Está tocando a música " + Nome + " do artista " + Artista + " do gênero " + Genero);      
    }
    public void PausarMusica()
    {
      System.out.println("Pausando música");
    }
    public void SelecionarMusica()
    {
      System.out.println("Selecionando música");
    }
    }