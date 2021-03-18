public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            int m = 17;
            Tuple t1, t2, t3, t4, t5;
            t1 = new Tuple(123, "James");
            t2 = new Tuple(223, "Joans");
            t3 = new Tuple(223, "Jongers");
            t4 = new Tuple(1947, "James");
            t5 = new Tuple(338, "Kleber");

            hashMapDivision h1 = new hashMapDivision(m);
            h1.insertOnHash(t1);
            h1.insertOnHash(t2);
            h1.insertOnHash(t3);
            h1.insertOnHash(t4);
            h1.insertOnHash(t5);

            System.out.println(h1.returnFromHash(123).getValue() + " ");
            System.out.println(h1.returnFromHash(123).getValue() + " ");
            System.out.println(h1.returnFromHash(223).getValue() + " ");
            System.out.println(h1.returnFromHash(228).getValue() + " ");
            System.out.println(h1.returnFromHash(338).getValue() + " ");            
            
        } catch(Error e) {
            System.out.println(e);
        }       
        
    }
}
