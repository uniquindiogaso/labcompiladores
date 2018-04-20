
public class TablaSimbolos {

	private String tipo;
	private Object valor;
	private String lexema;
	
	public TablaSimbolos(String tipo, Object valor, String lexema) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.lexema = lexema;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}
	
	
	
	
}
