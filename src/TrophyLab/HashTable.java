
package TrophyLab;
/**
 *
 * @author elean
 */
public class HashTable {
    private Entry tabla;

    public HashTable() {
        tabla=null;
    }

    public void add(String username, long pos) {
        Entry newEntry=new Entry(username, pos);
        if (tabla==null) {
            tabla=newEntry;
        } else {
            Entry current=tabla;
            
            while (current.siguiente!=null) {
                current=current.siguiente;
            }
            current.siguiente=newEntry;
        }
    }

    public void remove(String username) {
        if (tabla==null) {
            return;
        }
        
        if (tabla.username.equals(username)) {
            tabla=tabla.siguiente;
            return;
        }
        
        Entry actual=tabla;
        while (actual.siguiente!=null) {
            if (actual.siguiente.username.equals(username)) {
                actual.siguiente=actual.siguiente.siguiente;
                return;
            }
            actual=actual.siguiente;
        }
    }
    
    public long search(String username) {
        Entry actual=tabla;
        
        while (actual!=null) {
            if (actual.username.equals(username)) {
                return actual.pos;
            }
            actual=actual.siguiente;
        }
        return -1;
    }
}
