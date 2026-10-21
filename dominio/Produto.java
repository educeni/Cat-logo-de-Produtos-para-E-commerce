package controle;

import java.util.Objects;
import java.util.InputMismatchException;

public class Produto implements Comparable<Produto> {
    private String codigo;
    private String descricao;
    private double preco;
    private int quantidade;


    public Produto(String codigo, String descricao, double preco, int quantidade){
        if((quantidade<0)||(preco<0)){
            throw new IllegalArgumentException("Forneca uma quantidade valida. ");
        }
            this.codigo = codigo;
            this.descricao = descricao;
            this.preco = preco;
            this.quantidade = quantidade;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    // Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            throw new IllegalArgumentException("forneca uma quantidade valida. ");
        }
        else{
            this.quantidade = quantidade;
        }
    }

    // metodos
    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto outra = (Produto) obj;
        return Objects.equals(this.codigo, outra.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public int compareTo(Produto outra) {
        return Double.Compare(this.preco, outra.preco);
    }

    public String toString(){
        return String.format("preco: R$%.2f || codigo: %s || quantidade: %d || descricao: %s ", preco, codigo, quantidade, descricao);
    }

}