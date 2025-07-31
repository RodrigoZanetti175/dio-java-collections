package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> listaItens;

    public CarrinhoCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensToRemove = new ArrayList<>();
        for(Item i : listaItens){
            if(i.getNome().equalsIgnoreCase(nome))
                itensToRemove.add(i);
        }
        listaItens.removeAll(itensToRemove);
    }

    public double calcularValorTotal(){
        double soma = 0;
        for(Item i : listaItens){
            soma += i.getPreco();
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.adicionarItem("Maçã", 5, 2);
        carrinhoCompras.adicionarItem("Banana", 3, 4);
        carrinhoCompras.adicionarItem("Laranja", 6, 1);
        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.removerItem("Banana");
        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();
    }
}
