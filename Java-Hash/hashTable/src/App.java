import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int m = 200;
        double A = 0.61803398875;
        // hashMapDivision h1 = new hashMapDivision(m);
        hashMapMultiply h2 = new hashMapMultiply(m, A);
        int collisionCounter = 0;   
        Scanner scan = new Scanner(System.in);

        // Generate hash table...       
        for(int i = 0; i<10000; i++) {  
            
            // Generate random String...
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz";
            StringBuilder sb = new StringBuilder(7);    

            for (int j = 0; j < 7; j++) {     
                int index = (int)(AlphaNumericString.length() * Math.random()); // generate a random number between 0 to AlphaNumericString variable length 
                sb.append(AlphaNumericString .charAt(index)); // add Character one by one in end of sb 
            } 
            String randomString = sb.toString();
            // End of String Generator

            // Generate a random Integer...
            int randomNumber = Math.round((float)Math.random()*100);
            Tuple t = new Tuple(randomNumber, randomString);  

            // if(h1.insertOnHash(t) == 1) collisionCounter++;  
            if(h2.insertOnHash(t) == 1) collisionCounter++;  
                     
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
