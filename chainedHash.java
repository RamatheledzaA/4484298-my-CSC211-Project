//ramatheledza ADZisani 4484298

public class chainedHash {

    class Node {
        String key, value ;
        Node next;

        Node(String key ,String value){
            this.key = key;
            this.value = value;
            this.next = null;

        }
    }

    public class chainedHash{
        private Node [] table;
        private int p;

        public chainedHash( int p){
            this.p = p;
            this.table = new Node[p + 1];
        }

        public int hash (String key){
            int h = key.hashCode()& 0x7ffffff;
            return ( h % p) + 1;
        }
        // create am insert method
        static void insert(String  key , String value) {
            int i = hash(key);

            if (table[i] == null) {
                table[i] = new Node(key, value);
                return;
            }
            Node current = table[i];
            Node prev = null;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = new Node(key, value);
        }

        // create a method for String lookup
        static void Lookup ( int key){
            int i = hash(key);
            Node current = table[i;]
            while ( current != null){
                if (current.key.equals(key){
                    return current.value;

                }
                current = current.next;
            }
            return null;
        }

        public boolean isInTable(String key){
            return Lookup(key) != null;
    }


}
