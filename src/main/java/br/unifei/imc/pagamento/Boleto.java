package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;
import java.util.List;

public class Boleto implements Pagamento {
    @Override
    public double calcularTotal(List<Produto> produtos) {
        double total = produtos.stream().mapToDouble(produto -> { return produto.getPreco(); }).sum();
        return total * 0.90;
    }
}
