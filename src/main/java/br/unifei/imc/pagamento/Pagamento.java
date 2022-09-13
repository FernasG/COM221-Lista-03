package br.unifei.imc.pagamento;

import java.util.List;
import br.unifei.imc.produto.Produto;

public interface Pagamento {
    public double calcularTotal(List<Produto> produtos);
}
