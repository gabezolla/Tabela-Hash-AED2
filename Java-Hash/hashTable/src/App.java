import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int m = 97;
        hashMapDivision h1 = new hashMapDivision(m);
        int collisionCounter = 0;   
        Scanner scan = new Scanner(System.in);

        /* Tuple t1 = new Tuple(123, "abc");
        Tuple t2 = new Tuple(223, "abc");
        Tuple t3 = new Tuple(248, "abc");
        Tuple t4 = new Tuple(235, "abc");
        Tuple t5 = new Tuple(642, "abc");

        h1.insertOnHash(t1);
        h1.insertOnHash(t2);
        h1.insertOnHash(t3);
        h1.insertOnHash(t4);
        h1.insertOnHash(t5);
        System.out.println("Chave: " + h1.returnFromHash(123));
        System.out.println("Chave: " + h1.returnFromHash(223));
        System.out.println("Chave: " + h1.returnFromHash(248));
        System.out.println("Chave: " + h1.returnFromHash(235));
        System.out.println("Chave: " + h1.returnFromHash(642)); */        
        
        for(int i = 0; i<10000; i++) {  
            
            // STRING GENERATOR
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz";
            StringBuilder sb = new StringBuilder(7);    

            for (int j = 0; j < 7; j++) {     
                int index = (int)(AlphaNumericString.length() * Math.random()); // generate a random number between 0 to AlphaNumericString variable length 
                sb.append(AlphaNumericString .charAt(index)); // add Character one by one in end of sb 
            } 
            String randomString = sb.toString();
            // END OF STRING GENERATOR

            // NUMBER GENERATOR
            int randomNumber = Math.round((float)Math.random()*100);
            Tuple t = new Tuple(randomNumber, randomString);            
            if(h1.insertOnHash(t) == 1) collisionCounter++;            
        }

        System.out.print("\n\n===== NÚMERO DE COLISÕES: ");
        System.out.print(collisionCounter);
        System.out.println(" =====");


        /* System.out.println("\nDigite uma chave: ");
        int testKey = scan.nextInt();
        while(testKey != -1) {
            try {
                System.out.println("Chave: " + h1.returnFromHash(testKey).getValue());
            } catch(Error e) {
                System.out.println(e);
            }
            System.out.println("Digite uma chave: ");
            testKey = scan.nextInt();            
        } */
    }
}
