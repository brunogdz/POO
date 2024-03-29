package exercicio24;

import java.util.TreeSet;

public class NumerosSorteados {
	
	static final public int DEFAULT_QTS_NUM_SORTEADOS = 4; 
	static final public int DEFAULT_LIM_INFER = 1; 
	static final public int DEFAULT_LIM_SUPER = 99;
	static  public int qtd_num_sorteado = NumerosSorteados.DEFAULT_QTS_NUM_SORTEADOS;
	static  public int limit_inferior = NumerosSorteados.DEFAULT_LIM_INFER;
	static  public int limit_super = NumerosSorteados.DEFAULT_LIM_SUPER;

	TreeSet<Integer> tree = new TreeSet<Integer>();

	public NumerosSorteados() {
		while(tree.size()< NumerosSorteados.qtd_num_sorteado) {
			int valor = (int) (Math.random() * NumerosSorteados.DEFAULT_LIM_SUPER)+NumerosSorteados.limit_inferior;
			tree.add(new Integer(valor));
		}
	}
	
	public static double getQtd_num_sorteado() {
		return qtd_num_sorteado;
	}

	public static void setQtd_num_sorteado(int qtd_num_sorteado) {
		NumerosSorteados.qtd_num_sorteado = qtd_num_sorteado;
	}

	public static double getLimit_inferior() {
		return limit_inferior;
	}

	public static void setLimit_inferior(int limit_inferior) {
		NumerosSorteados.limit_inferior = limit_inferior;
	}

	public static double getLimit_super() {
		return limit_super;
	}

	public static void setLimit_super(int limit_super) {
		NumerosSorteados.limit_super = limit_super;
	}
	public TreeSet<Integer> getTree() {
		return tree;
	}

	public void setTree(TreeSet<Integer> tree) {
		this.tree = tree;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getTree().toString());
		return dados.toString();
	}
	
	
	
}