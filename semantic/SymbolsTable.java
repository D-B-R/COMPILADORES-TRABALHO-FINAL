//tabela de simbolo é onde vc guarda as variáveis
package semantic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class SymbolsTable {
    
    private HashMap<String, Object[]> symbols;
    
    @Override
    public String toString() { 

    return symbols.values().toString();
 
        
        
    }
    
    protected SymbolsTable(){
        symbols = new HashMap<>();
    }
    
    private static SymbolsTable INSTANCE;
    
    public static SymbolsTable getInstance(){
        if (INSTANCE == null)
            INSTANCE = new SymbolsTable();
        return INSTANCE;
    }
    
    public void addSymbol(String symbol, Object[] value){
        symbols.put(symbol, value);
    }
    
    public Object[] getSymbol(String symbol){
        if (symbols.containsKey(symbol)){
            return symbols.get(symbol);
        }
        return null;
    }
        public String getType(String symbol) {
        if (symbols.containsKey(symbol)) {

            Object data[] = symbols.get(symbol);
            return (String) data[0];

        }
        return "";
    }

    public Object getValue(String symbol) {
        if (symbols.containsKey(symbol)) {

            Object data[] = symbols.get(symbol);
            return data[1];

        }
        return "";
    }

    
}
