public class hashMapDivision {

    private Tuple hashArray[];
    private int module;

    public hashMapDivision(int m) {
        hashArray = new Tuple[100];
        this.module = m;
    }

    public void insertOnHash(Tuple tuple) {
        int position = (tuple.getKey()%module);

        if(hashArray[position] == null) {
            hashArray[position] = tuple;    
            System.out.println("Novo valor inserido.");      
            return;  
        } 
        
        else {
            Tuple temporaryHead = hashArray[position]; // temporaryHead recebe a cabeça da linked list
            System.out.println("===== Colisão! =====");
                        
            if(tuple.getKey() == hashArray[position].getKey()) {
                System.out.println("Chave atualizada. Chave antiga: " + hashArray[position].getValue());
                temporaryHead.setValue(tuple.getValue());
                return;
            }

            else {                 

                if(temporaryHead.getNext() == null) { // caso de lista com um único elemento
                    temporaryHead.setNext(tuple);
                    return;
                }

                else {
                    while(temporaryHead.getNext() != null) { // percorre a lista até o nulo ou se encontrar um elemento de value semelhante.
                        if(temporaryHead.getNext().getKey() == tuple.getKey()) {
                            System.out.println("Chave atualizada. Chave antiga: " + temporaryHead.getNext().getValue());
                            temporaryHead.setValue(tuple.getValue());
                            return;
                        }
                        temporaryHead = temporaryHead.getNext();                 
                    }

                    if (temporaryHead.getKey() == tuple.getKey()){ // caso de último da lista
                        System.out.println("Chave atualizada. Chave antiga: " + temporaryHead.getValue());
                        temporaryHead.setValue(tuple.getValue());
                        return;
                    }
                    temporaryHead.setNext(tuple);
                    System.out.println("Nova chave inserida no fim da lista.");
                    return;
                }
            }            
        }
    }

    public Tuple returnFromHash(int key) {
        int position = (key%module);
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