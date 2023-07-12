package symbols;

import java.util.HashMap;

public class SymbolTable {
	
	private HashMap<String, Identifier> symbols;
	
	public SymbolTable() {
		this.symbols = new HashMap<String, Identifier>();
	}	
	
	public Identifier get(String key) {
		return this.symbols.get(key);
	}
	
	public void add(String key, Identifier id) {
		this.symbols.put(key, id);
	}
	
	public boolean exists(String key) {
		return this.symbols.containsKey(key);
	}

}
