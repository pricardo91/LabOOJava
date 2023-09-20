package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

/**
 * Classe que representa um livro, qual é uma especialização de um produto da
 * loja.
 * 
 * @author ricardo silva
 */
public class Caderno extends Produto {

	/**
	 * Tipo do caderno: M2, M5, M10.
	 */
	private Materias tipo;
	private double preco;

	public Materias getTipo() {
		return tipo;
	}

	public void setTipo(Materias tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double calcularFrete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Caderno{tipo='" + tipo + '\'' + ",codigo='" + getCodigo() + '\'' + ",preço='" + getPreco() + '\''
				+ '}';
	}

}
