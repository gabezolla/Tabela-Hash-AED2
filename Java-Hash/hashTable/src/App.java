import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int m = 97; // Constante m.
        int keyRange = 10000; // Constante arbitrária que determina o valor máximo para uma chave.
        double A = 0.61803398875; // Constante A.
        hashMapDivision h1 = new hashMapDivision(m); // Hash Map implementado para o método da divisão.
        hashMapMultiply h2 = new hashMapMultiply(m, A); // Hash Map implementado para o método da multiplicação.
        int collisionCounter = 0; // Contador para colisões.
        Scanner scan = new Scanner(System.in);

        // Gerar a Hash Table...       
        for(int i = 0; i<100; i++) {  
            
            // Gerar uma String aleatória para colocá-la na chave...
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz";
            StringBuilder sb = new StringBuilder(7);    

            for (int j = 0; j < 7; j++) {     
                int index = (int)(AlphaNumericString.length() * Math.random()); // Gera um AlphaNumericString. 
                sb.append(AlphaNumericString .charAt(index)); // Adiciona os caracteres na variável sb.
            } 
            String randomString = sb.toString();
            // Fim da String Generator...

            // Gerar um número aleatório...
            int randomNumber = Math.round((float)Math.random()*keyRange);
            Tuple t = new Tuple(randomNumber, randomString);  
            
            if(h1.insertOnHash(t) == 1) collisionCounter++;  // Roda o método da divisão e faz a contagem das colisões.
            // if(h2.insertOnHash(t) == 1) collisionCounter++;  // Roda o método da multiplicação e faz a contagem das colisões.
            

            /* Caso de interação com o usuário...
            System.out.println("Digite uma chave: ");
            int typedKey = scan.nextInt();
            if(h1.insertOnHash(t) == 1) collisionCounter++;  // Roda o método da divisão e faz a contagem das colisões
            if(h2.insertOnHash(t) == 1) collisionCounter++;  // Roda o método da multiplicação e faz a contagem das colisões            
            */
        }

        System.out.print("\n\n===== NÚMERO DE COLISÕES: ");
        System.out.print(collisionCounter);
        System.out.println(" =====");

        // Trecho de código para a busca de chaves... Descomentar caso for usar.
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
