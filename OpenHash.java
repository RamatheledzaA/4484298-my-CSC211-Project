import java.util.LinkedList;

// Ramatheledza ADZISANI 4484298
public class OpenHash {

    static class Node {
         String value , key;
        Node next;

        Node ( String key ,String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }

    // let's stsrt the open hash
    static int N = 20;
    static LinkedList <String> [] table = new LinkedList[N];

    public static void main(String[] args){
        // we need to initialise the linked list
        for(int i = 1 ; i < N ; i++){
            table[i] = new LinkedList<>();

        }
        insert ( "1 " , "ben");
    }

    // create am insert method
    static void insert(String key , String value){
        int index = key % N;
        table[index].add(key);

    }

    // create a method for String lookup





}
