
package TrophyLab;

/**
 *
 * @author elean
 */
public class Entry {
    String username;
    long pos;
    Entry siguiente;

    public Entry(String username, long pos) {
        this.username = username;
        this.pos = pos;
        siguiente = null;
    }
}
