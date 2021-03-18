public class Tuple {
    private int key;
    private String value;
    private Tuple next;
 

    public Tuple(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Tuple() {
        this.next = null;        
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setNext(Tuple next) {
        this.next = next;
    }

    public Tuple getNext() {
        return this.next;
    }
   
}
