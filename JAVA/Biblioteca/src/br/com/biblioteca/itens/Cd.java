package br.com.biblioteca.itens;

public class Cd  extends Itens{
    private String artista;
    private int numeroFaixa;
    private String gravadora;
    
        
    
    public Cd(){
        
    }
    
    
    
    
     public Cd( int codigo, String titulo, String artista, int numeroFaixa, String gravadora){
      super(codigo,titulo);
      this.artista = artista;
      this.numeroFaixa= numeroFaixa;
      this.gravadora= gravadora;
         
    }
     
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
        
    }
    public int getNumeroFaixa(){
        return numeroFaixa;
    }
    public void setNumeroFaixa(int numeroFaixa){
        this.numeroFaixa=numeroFaixa;
     }
    public String getGravadora(){
        return gravadora;
    }
    public void setGravadora(String gravadora){
       this.gravadora=gravadora; 
    }
    public String toString(){
        return super.toString() +"\n Artista:" +getArtista() + "\n numero de faixa: "+ getNumeroFaixa() + "\n a sua Gravadora é:" + getGravadora()+"";
    }
}
