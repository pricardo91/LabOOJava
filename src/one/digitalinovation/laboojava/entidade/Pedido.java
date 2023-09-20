package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a entidade pedido, qual é a compra dos produtos por um
 * cliente.
 *
 * @author thiago leite
 */
public class Pedido {

	// TODO Preencher esta classe
	// codigo
	// cliente
	// produtos
	// total
	/**
	 * Código de identificação do PEDIDO.
	 */
	private String codPedido;
	/**
	 * Variavel cliente do tipo Cliente (class)
	 */
	private Cliente cliente;
	/**
	 * Variavel produtos do tipo List<>
	 */
	private List<Produto> produtos;

	double total;

	public Pedido() {
		this.produtos = new ArrayList<>();
	}

	public String getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private String getProdutosComprados() {
		StringBuilder produtos = new StringBuilder();
		produtos.append("[");
		for (Produto produto : getProdutos()) {
			produtos.append(produto.toString());
			produtos.append("Qtd:");
			produtos.append(produto.getQuantidade());
			produtos.append(" ");
		}
		produtos.append("]");

		return produtos.toString();
	}

	@Override
	public String toString() {
		return "Pedidos{" + "codigo='" + codPedido + '\'' + ", " + cliente + ", produto"
				+ getProdutosComprados() + ", total=" + total + '}';
	}
}
