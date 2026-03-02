import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.LinkedList;

// Ramatheledza ADZISANI 4484298
public class OpenHash {

    private KeyValuePair[] table ;
    private int p;
    private int P;

    public OpenHash(int m){
        this.p = p;
        this.table = new KeyValuePair[m + 1];
    }

    private int hash( String key ){
        int h = key.hashCode()& 0x7ffffff;
        return ( h % p) + 1;
    }
    // create am insert method
    static void insert(String  key , String value){
        int i = hash(key);
        int start = i ;
        while ( table[i] != null) {
            if (table[i].key.equals(key)) {
                table[i].value = value;
                return;
            }
            i = (i % p) + 1;
            if (i == start) return;
        }
        table[i] = new KeyValuePair(key , value);
    }


    // create a method for String lookup
    static void Lookup ( int key){
        int i = hash(key);
        int start = i;
        int start = index ;
        while ( table[i] != null){
            if (table[i].key.equals(key){
                    return table[i].value;

            }
            i = (i % p) + 1;
            if (i == start) break;

        }
        return null;
    }

    public boolean isInTable(String key){
        return Lookup(key) != null;

    // let's stsrt the open hash
    static int N = 20;
    static LinkedList <String> [] table = new LinkedList[N];

    public static void main(String[] args){
        // we need to initialise the linked list
        for(int i = 1 ; i < N ; i++){
            table[i] = new LinkedList<>();
        }
    }

}
