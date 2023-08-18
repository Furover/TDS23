import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.biblioteca.DAOs.CdDAO;
import br.com.biblioteca.DAOs.LivroDao;
import br.com.biblioteca.itens.Cd;
import br.com.biblioteca.itens.Livro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3113.343
 */
public class Principal {
    public static void main(String[]args){
        //System.out.println();
        Scanner en = new Scanner(System.in);
        Cd cd;
        CdDAO cddao;
        Livro livro;
        LivroDao livrodao;
        boolean menu = true;
        int op = 0;
        do{
            System.out.println(" BIBLIOTECA USANDO bANCO sql SERVER ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            op = en.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Cadastro de Itens");
                    System.out.println("1 - Cds");
                    System.out.println("2 - Livros");
                    System.out.println("Digite a opção desejada");
                    op = en.nextInt();
                    
                    if(op==1){
                        cd = new Cd();
                        cddao = new CdDAO();
                        System.out.println("Cadastro de CD");
                        System.out.println("Digite o Titulo do Cd");
                        cd.setTitulo(en.next());
                        System.out.println("Digite o artista do Cd");
                        cd.setArtista(en.next());
                        System.out.println("Digite o numero da faixa");
                        cd.setNumeroFaixa(en.nextInt());
                        System.out.println("Digite o nome da Gravadora");
                        cd.setGravadora(en.next());
                        
                        cddao.inserirCd(cd);
                    }else if(op==2){
                        livro = new Livro();
                        livrodao = new LivroDao();
                        System.out.println("Cadastro de Livro");
                        System.out.println("Digite o titulo do Livro");
                        livro.setTitulo(en.next());
                        System.out.println("Digite o Nome do Autor do Livro");
                        livro.setAutor(en.next());
                        System.out.println("Digite o nome da Editora do Livro");
                        livro.setEditora(en.next());
                        System.out.println("Digite o numero de paginas do livro");
                        livro.setNumeroPaginas(en.nextInt());
                        livrodao.inserirLivro(livro);   
                    }else{
                        System.out.println("Opção invalida");
                        break;
                    }
                break;
                case 2:
                    System.out.println("Listar itens Cadastrados");
                    System.out.println("1 - CD");
                    System.out.println("2 - Livros");
                    System.out.println("Digite a Opção desejada");
                    op = en.nextInt();
                    if(op==1){
                        cd = new Cd();
                        cddao = new CdDAO();
                        List<Cd> cds = new ArrayList<Cd>();
                        cds = cddao.listarCds();
                        System.out.println("Alterar Cds Cadastrados");
                        System.out.println("\n Listando CdsCadastrados");
                        for (int i = 0; i <cds.size();i++){
                            System.out.println("\n"+cds.get(i).toString());
                        } 
                 }else if(op==2){
                	 livro = new Livro();
                     livrodao = new LivroDao();
                     List<Livro> livros = new ArrayList<Livro>();
                     livros = livrodao.listarLivros();
                     System.out.println("Alterar Livros Cadastrados");
                     System.out.println("\n Listando LivrosCadastrados");
                     for (int i = 0; i <livros.size();i++){
                         System.out.println("\n"+livros.get(i).toString());
                     } 
                 	
                 }
                    else{
                        System.out.println("opção invalida");
                        break;
                    }
                    break;
                case 3:
                	System.out.println("Alterar Itens");
                    System.out.println("1 - Cds");
                    System.out.println("2 - Livros");
                    System.out.println("Digite a opção desejada");
                    op = en.nextInt();
                    
                    if(op==1){
                        cd = new Cd();
                        cddao = new CdDAO();
                        System.out.println("Alteração de CD");
                        System.out.println("Digite o Código do Cd");
                        cd.setCodigo(en.nextInt());
                        System.out.println("Digite o Titulo do Cd");
                        cd.setTitulo(en.next());
                        System.out.println("Digite o artista do Cd");
                        cd.setArtista(en.next());
                        System.out.println("Digite o numero da faixa");
                        cd.setNumeroFaixa(en.nextInt());
                        System.out.println("Digite o nome da Gravadora");
                        cd.setGravadora(en.next());
                        
                        cddao.atualizaCd(cd);
                    }else if(op==2){
                        livro = new Livro();
                        livrodao = new LivroDao();
                        System.out.println("Alteração de Livro");
                        System.out.println("Digite o Código do Livro");
                        livro.setCodigo(en.nextInt());
                        System.out.println("Digite o titulo do Livro");
                        livro.setTitulo(en.next());
                        System.out.println("Digite o Nome do Autor do Livro");
                        livro.setAutor(en.next());
                        System.out.println("Digite o nome da Editora do Livro");
                        livro.setEditora(en.next());
                        System.out.println("Digite o numero de paginas do livro");
                        livro.setNumeroPaginas(en.nextInt());
                        livrodao.atualizarLivro(livro);   
                    }else{
                        System.out.println("Opção invalida");
                        break;
                    }
                    break;
                case 4:
                	System.out.println("\n==Excluir Itens Cadastrados==");
                	System.out.println("1 - Cds ");
                	System.out.println("2 - Livros");
                	System.out.print("Digite a Opção : ");
                	op = en.nextInt();

                	if (op == 1) {
                	cd = new Cd();
                	cddao = new CdDAO();
                	List<Cd> cds = new ArrayList<Cd>();
                	cds = cddao.listarCds();
                	System.out.println("\n==Excluir Cds Cadastrados==");
                	System.out.print("Digite o Código do Cd : ");
                	cd.setCodigo(en.nextInt());

                	if (cds.contains(cd)) {
                	cddao.deleteCd(cd);
                	} else {
                	System.out
                	.println("\nNão foi possível encontrar um cd com esse código\ntente outro.\n");
                	}

                	} else if (op == 2) {
                	livro = new Livro();
                	livrodao = new LivroDao();
                	List<Livro> livros = new ArrayList<Livro>();
                	livros = livrodao.listarLivros();
                	System.out.println("\n==Excluir Livros Cadastrados==");
                	System.out.print("Digite o Código do Livro : ");
                	livro.setCodigo(en.nextInt());

                	if (livros.contains(livro)) {
                	livrodao.deletarLivro(livro);
                	} else {
                	System.out
                	.println("\nNão foi possível encontrar um Livro com esse código\ntente outro.\n");
                	}

                	} else {
                	System.out.println("Opção Invalida!");
                	break;
                	}
                	break;
                case 5:
                	System.out.println("Até logo !");
                	menu = false;
                	break;
                	default:
                	System.out.println("Digite uma Opção Valida!");
                	break;
                }
            
            
            
        }while(menu);
        

    
    }
 
}