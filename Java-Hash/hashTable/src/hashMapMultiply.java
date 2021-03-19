public class hashMapMultiply {

    private Tuple hashArray[];
    private int module;
    private double A_constant;
    
    public hashMapMultiply(int m, double A_constant) {
        hashArray = new Tuple[m];
        this.module = m;
        this.A_constant = A_constant;
    }

    public int insertOnHash(Tuple tuple) {
        int position = (int)Math.floor(module*((tuple.getKey()*A_constant)%1));

        if(hashArray[position] == null) {
            hashArray[position] = tuple;    
            System.out.println("Novo valor inserido. Chave hash: " + position + ". Valor de chave: " +tuple.getValue());      
            // System.out.print(position+", ");  // Linha inserida para o estudo e construção dos gráficos    
            return 0;  
        } 
        
        else {
            Tuple temporaryHead = hashArray[position]; // temporaryHead recebe a cabeça da linked list
            System.out.println("===== Colisão! =====");
            
                        
            if(tuple.getKey() == hashArray[position].getKey()) {
                System.out.println("Chave atualizada. Chave hash: " +position+ ". Valor de chave antiga: " + hashArray[position].getValue());
                System.out.print(position+", "); // Linha inserida para o estudo e construção dos gráficos
                temporaryHead.setValue(tuple.getValue());
                return 1;
            }

            else {                 

                if(temporaryHead.getNext() == null) { // caso de lista com um único elemento
                    temporaryHead.setNext(tuple);
                    return 1;
                }

                else {
                    while(temporaryHead.getNext() != null) { // percorre a lista até o nulo ou se encontrar um elemento de value semelhante.
                        if(temporaryHead.getNext().getKey() == tuple.getKey()) {
                            System.out.println("Chave atualizada. Chave hash: " +position+ ". Valor de chave antiga: " + temporaryHead.getNext().getValue());
                            // System.out.print(position+", "); // Linha inserida para o estudo e construção dos gráficos
                            temporaryHead.setValue(tuple.getValue());
                            return 1;
                        }
                        temporaryHead = temporaryHead.getNext();                 
                    }

                    if (temporaryHead.getKey() == tuple.getKey()){ // caso de último da lista
                        System.out.println("Chave atualizada. Valor de chave antiga: " + temporaryHead.getValue());
                        // System.out.print(position+", ");  // Linha inserida para o estudo e construção dos gráficos    
                        temporaryHead.setValue(tuple.getValue());
                        return 1;
                    }

                    temporaryHead.setNext(tuple);
                    System.out.println("Nova chave inserida na lista. Chave hash: " +position+ ". Valor de Chave: " + temporaryHead.getNext().getValue());
                    // System.out.print(position+", "); // Linha inserida para o estudo e construção dos gráficos
                    return 1;
                }
            }            
        }
    }

    public Tuple returnFromHash(int key) {
        int position = (int)Math.floor(module*((key*A_constant)%1));
        Tuple temporaryHead = hashArray[position];

        if(temporaryHead == null) {
            throw new Error("Chave não encontrada");
        }

        if(temporaryHead != null && temporaryHead.getKey() == key) {
            return temporaryHead;
        }

        else {
            while(temporaryHead.getNext() != null) {

                temporaryHead = temporaryHead.getNext();

                if(temporaryHead != null && temporaryHead.getKey() == key) {
                    return temporaryHead;
                }

                if(temporaryHead.getNext() == null) {
                    throw new Error("Chave não encontrada");
                }                
            }
        }
        throw new Error("Chave não encontrada");
    }
}