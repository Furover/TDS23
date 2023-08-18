package br.com.biblioteca.itens;

public class Itens {
    private int codigo; //pk
    private String titulo;
    
    public Itens(){
    
    }
    public Itens(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo= titulo;
       
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
       
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
        
    }
    
    public String toString(){
      return "Código:"+getCodigo()+"\nTitulo:"+getTitulo()+"";  
    }
    
    public boolean equals(Object obj){
        Itens i = (Itens) obj;
        if(this.codigo == i.codigo){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
}