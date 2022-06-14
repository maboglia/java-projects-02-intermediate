import java.util.ArrayList;

/**
 * Created by mauro on 16/02/16.
 *
 * Testo:
 Un'assicurazione desidera creare un archivio elettronico in grado di raccogliere informazioni sulle automobili e sui loro proprietari.

 Si implementi una classe Cliente, avente il nominativo (stringa) come variabile d'istanza;

 una classe Automobile avente come variabili d'istanza il numero di targa della vettura (intero) e un riferimento al proprietario della classe Cliente.

 Si implementi, infine, la classe Archivio.

 *
 *
 */
public class Archivio {

    private ArrayList<Cliente> clienti;
    private ArrayList<Automobile> automobili;

    public Archivio() {

        this.clienti = new ArrayList<Cliente>();
        this.automobili = new ArrayList<Automobile>();

    }

    public Archivio(ArrayList<Cliente> clienti, ArrayList<Automobile> automobili) {
        this.clienti = clienti;
        this.automobili = automobili;
    }
    //1 restituisce, se esiste, l'indice del cliente nell'arraylist clienti
    private int indiceCliente(String unNome){
        for (int i = 0; i < clienti.size(); i++) {
            if(clienti.get(i).getNome().equalsIgnoreCase(unNome))
                return i;
        }
        return -1;
    }

    //2 restituisce, se esiste, l'indice della targa nell'arraylist automobili
    private int indiceTarga(int unaTarga){
        for (int i = 0; i < automobili.size(); i++) {
            if(automobili.get(i).getTarga() == unaTarga)
                return i;

        }
        return -1;
    }

    //3 aggiunge un nuovo cliente all'arraylist clienti

        public void addCliente(String unNome){
            //qui metti un controllo per cliente
            clienti.add(new Cliente(unNome));
        }

    //4 aggiunge una nuova auto all'arraylist automobile

        public void addAutomobile(int unaTarga, String unNome){

            //qui farò i controlli prima di inserire
            if (indiceTarga(unaTarga) != -1 ) return;
            addCliente(unNome);
            int index = indiceCliente(unNome);
            automobili.add(new Automobile(unaTarga, clienti.get(index)));
        }


    /*5 restituisce le targhe delle automobili aventi unNome come
    proprietario*/

        public ArrayList<Integer> returnTarga (String unNome){

            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < automobili.size(); i++) {
                if(automobili.get(i).getProprietario().getNome().equalsIgnoreCase(unNome))
                    temp.add(automobili.get(i).getTarga());
            }
                return temp;
        }


    //6 restituisce il nome del proprietario di una targa

        public String clienteTarga(int unaTarga){
            for (Automobile auto : automobili) {
                if(auto.getTarga() == unaTarga)
                    return auto.getProprietario().getNome();
            }
            return null;
        }


    /*7 data una targa di un automobile, se presente, la rimuove
    dall'arraylist*/

        public void removeAutomobile(int unaTarga){
            if(indiceTarga(unaTarga) != -1){
                automobili.remove(indiceTarga(unaTarga));
            }
        }

    /*8 toglie unNome dall'arraylist clienti e le sue eventuali auto da
automobili*/
        public void removeCliente (String unNome){
            if(indiceCliente(unNome) == -1 ) return;
                boolean hoFinito = false;
                while (!hoFinito){
                    for (int i = 0; i < automobili.size(); i++) {
                            hoFinito = true;
                        if(automobili.get(i).getProprietario().getNome().equalsIgnoreCase(unNome)){
                            automobili.remove(i);
                            hoFinito = false;
                        }
                    }
                    clienti.remove(indiceCliente(unNome));
                }
        }


        //9 conta quante automobili ha un cliente
        public int contaAuto(String unNome){
            int temp = 0;
            for (Automobile auto: automobili) {
                if(auto.getProprietario().getNome().equalsIgnoreCase(unNome))
                    temp++;
            }
            return temp;
        }


    //10 ritorna un array con il numero di auto possedute da ogni cliente

        private int[] listaAutoClienti(){

            int[] temp = new int[clienti.size()];

            int i = 0;

            for(Cliente c : clienti){
                temp[i] = contaAuto(c.getNome());
                i++;
            }

            return temp;

        }


    //11 ritorna il Cliente con il maggior numero di auto

        public Cliente maxAuto(){

            int indexMax = 0;
            int max = 0;
            int[] temp = listaAutoClienti();

            for (int i = 0; i < clienti.size(); i++) {

                if(temp[i] > max){
                    indexMax = i;
                    max = temp[i];
                }
            }
            return clienti.get(indexMax);
        }
}
