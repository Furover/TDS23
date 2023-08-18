/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAOs;

import br.com.biblioteca.conexao.ConnectionFactory;
import br.com.biblioteca.itens.Cd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 3113.343
 */
public class CdDAO {
    private Connection con;
    public CdDAO(){
        ConnectionFactory cf = new ConnectionFactory();
      con = cf.getConnection();
    }
    
   public void inserirCd(Cd cd){
       String scriptSql="insert into cd(titulo, artista,numeroFaixa,gravadora)"
               + "values(?,?,?,?)";
       try{
           PreparedStatement stmt = con.prepareStatement(scriptSql);
           stmt.setString(1,cd.getTitulo());
           stmt.setString(2,cd.getArtista());
           stmt.setInt(3, cd.getNumeroFaixa());
           stmt.setString(4, cd.getGravadora());
           stmt.execute();
           stmt.close();
           System.out.println("O Salvo com sucesso ");
           
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       
   }
   // deletenado o conteudo
   public void deleteCd(Cd cd){
       String scriptSql=" delete from cd where codCd=?";
       try{
           PreparedStatement stmt = con.prepareStatement(scriptSql);
           stmt.setInt(1, cd.getCodigo());
           stmt.execute();
           stmt.close();
           System.out.println("O Cd foi excuido ");
           
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       
   }
   // update do CD
   
   public void atualizaCd(Cd cd){
       String scriptSql="update cd set titulo=?,artista=?,numeroFaixa=?, gravadora=? WHERE codCd = ?";
       try{
           PreparedStatement stmt = con.prepareStatement(scriptSql);
           stmt.setString(1, cd.getTitulo());
           stmt.setString(2, cd.getArtista());
           stmt.setInt(3, cd.getNumeroFaixa());
           stmt.setString(4, cd.getGravadora());
           stmt.setInt(5, cd.getCodigo());
           stmt.execute();
           stmt.close();
         System.out.println("\n Cd atualizado com sucesso! \n");
          }catch(SQLException e){
         System.out.println("Erro:"+ e.getMessage());
         }
    }
   
   //listagem de cds
   public List<Cd> listarCds(){
       List<Cd> listaCds = new ArrayList<Cd>();
       String scriptSql="select * from cd ";
       try{
           PreparedStatement stmt = con.prepareStatement(scriptSql);
           ResultSet resultSetCd = stmt.executeQuery();
           while(resultSetCd.next())
           {
               Cd cd = new Cd();
               cd.setCodigo(resultSetCd.getInt("codCd"));
               cd.setTitulo(resultSetCd.getString("titulo"));
               cd.setArtista(resultSetCd.getString("artista"));
               cd.setNumeroFaixa(resultSetCd.getInt("NumeroFaixa"));
               cd.setGravadora(resultSetCd.getString("gravadora"));
               listaCds.add(cd);
             }
           resultSetCd.close();
           stmt.close();
           
       }catch(Exception e){
           System.out.println("Erro :" + e.getMessage());
           
       }
       return listaCds;
   }
    
}
