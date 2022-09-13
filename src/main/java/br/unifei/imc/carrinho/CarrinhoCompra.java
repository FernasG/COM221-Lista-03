package br.unifei.imc.carrinho;

import br.unifei.imc.pagamento.Pagamento;
import br.unifei.imc.pagamento.Boleto;
import br.unifei.imc.produto.Produto;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class CarrinhoCompra {
    @Getter
    private double precoTotal = 0.0;
    @Getter @Setter
    private Pagamento tipoPagamento = new Boleto();
    List<Produto> produtos  = new ArrayList<Produto>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void calcularTotal() {
        this.precoTotal = this.tipoPagamento.calcularTotal(this.produtos);
    }
}
