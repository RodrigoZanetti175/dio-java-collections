package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor))
                    livrosAutor.add(l);
            }
        }
        return livrosAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosAno.add(l);
            }
        }
        return livrosAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo))
                    return l;
            }
        }
        return new Livro("", "", 0);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros =  new CatalogoLivros();
        catalogoLivros.adicionarLivro("Teste1", "Rodrigo", 2015);
        catalogoLivros.adicionarLivro("Teste2", "Rodrigo", 2016);
        catalogoLivros.adicionarLivro("Teste2", "Camila", 2022);
        System.out.println(catalogoLivros.pesquisarPorAutor("Rodrigo"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010,2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Teste2"));
    }
}
