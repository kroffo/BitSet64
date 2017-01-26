
package bitset;

/**
 *
 * @author kennethroffo
 */
public class BitSet {
    private long set;
    public BitSet() {
        set = 0;
    }
    
    public void addNumber(int x) {
        x = x%64;
        set |= (1L << x);
    }   
    
    public void removeNumber(int x) {
        x = x%64;
        set &= ~(1L << x);
    }
    
    public boolean containsNumber(int x) {
        x = x%64;
        return (set & (1L << x)) != 0;
    }
    
    public String getSetString() {
        String s = Long.toBinaryString(set);
        while(s.length() < 64) {
            s = "0" + s;
        }
        return s;
    }
}
