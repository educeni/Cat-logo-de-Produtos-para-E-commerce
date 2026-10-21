package controle;

import dominio.Produto;


public class CatalogoApp{
    public static void main(String[] args) {
        CatalogoService catalogo = new CatalogoService();

        catalogo.cadastrar(new Produto("P01", "Notebook", 3500.00, 5));
        catalogo.cadastrar(new Produto("P02", "Mouse", 150.00, 20));
        catalogo.cadastrar(new Produto("P03", "Teclado", 250.00, 15));
        catalogo.cadastrar(new Produto("P04", "Monitor", 1200.00, 8));

        // exibicao
        exibirCatalogo(catalogo, 4);

        // exclusao
        catalogo.excluirPorCodigo("P03");

        // ordenando
        catalogo.ordenarPorPreco();

        exibirCatalogo(catalogo, 3);
    }

        private static void exibirCatalogo(CatalogoService catalogo, int totalItens) {
            for (int i = 0; i < totalItens; i++) {
                Produto p = catalogo.obterPorPosicao(i);
                System.out.println("Índice " + i + " -> " + p);
            }

        }
}
