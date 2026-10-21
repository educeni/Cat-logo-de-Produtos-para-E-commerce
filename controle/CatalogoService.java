package controle;

import dominio.Produto;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CatalogoService{
    private final List<Produto> produtos = new ArrayList<>();

    void cadastrar(Produto p){
        if (p == null) {
            throw new IllegalArgumentException("Não é permitido inserir produtos nulos.");
        }
        if (produtos.contains(p)) {
            throw new IllegalStateException("Já existe um produto cadastrada com o codigo: " + p.getCodigo());
        }
        produtos.add(p);
    }

    Produto obterPorPosicao(int indice){
        if (indice < 0 || indice >= produtos.size()) {
            throw new IndexOutOfBoundsException("Posição solicitada fora do intervalo: " + indice);
        }
        return produtos.get(indice);
    }

    boolean excluirPorCodigo(String codigo){
        return produtos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    void ordenarPorPreco(){
        Collections.sort(produtos);
    }

}