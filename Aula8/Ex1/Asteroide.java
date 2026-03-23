package br.inatel.cdg.inimigo;

public class Asteroide {
  private String nome;
  private String tipoAsteroide;

  public Asteroide(String nome,String tipoAsteroide)
  {
      this.nome=nome;
      this.tipoAsteroide=tipoAsteroide;
  }
  public static void destruir()
  {
      System.out.println("Asteirode destruido!! ");
  }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
}
